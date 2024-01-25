import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class193 {

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Lclient!uj;")
	private final Class244 aClass244_7 = new Class244();

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
	private final int anInt5476;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	private int anInt5482;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Lclient!an;")
	private final Class11 aClass11_33;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(I)V")
	public Class193(@OriginalArg(0) int arg0) {
		this.anInt5476 = arg0;
		this.anInt5482 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass11_33 = new Class11(local16);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BILclient!ue;Ljava/lang/Object;)V")
	private void method4293(@OriginalArg(2) Interface11 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt5476 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4300(arg0);
		this.anInt5482--;
		while (this.anInt5482 < 0) {
			@Pc(37) Class3_Sub4_Sub6 local37 = (Class3_Sub4_Sub6) this.aClass244_7.method5235();
			this.method4298(local37);
		}
		@Pc(51) Class3_Sub4_Sub6_Sub1 local51 = new Class3_Sub4_Sub6_Sub1(arg0, arg1, 1);
		this.aClass11_33.method319(local51, arg0.method774());
		this.aClass244_7.method5234(local51);
		local51.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)I")
	public int method4294() {
		return this.anInt5482;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!ue;I)Ljava/lang/Object;")
	public Object method4296(@OriginalArg(0) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method774();
		for (@Pc(16) Class3_Sub4_Sub6 local16 = (Class3_Sub4_Sub6) this.aClass11_33.method324(local9); local16 != null; local16 = (Class3_Sub4_Sub6) this.aClass11_33.method318()) {
			if (local16.anInterface11_3.method773(arg0)) {
				@Pc(27) Object local27 = local16.method5833();
				if (local27 != null) {
					if (local16.method5832()) {
						@Pc(66) Class3_Sub4_Sub6_Sub1 local66 = new Class3_Sub4_Sub6_Sub1(arg0, local27, local16.anInt7500);
						this.aClass11_33.method319(local66, local16.aLong234);
						this.aClass244_7.method5234(local66);
						local66.aLong233 = 0L;
						local16.method5977();
						local16.method5949();
					} else {
						this.aClass244_7.method5234(local16);
						local16.aLong233 = 0L;
					}
					return local27;
				}
				local16.method5977();
				local16.method5949();
				this.anInt5482 += local16.anInt7500;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)V")
	public void method4297() {
		if (Static268.aClass231_1 == null) {
			return;
		}
		for (@Pc(19) Class3_Sub4_Sub6 local19 = (Class3_Sub4_Sub6) this.aClass244_7.method5240(); local19 != null; local19 = (Class3_Sub4_Sub6) this.aClass244_7.method5232()) {
			if (local19.method5832()) {
				if (local19.method5833() == null) {
					local19.method5977();
					local19.method5949();
					this.anInt5482 += local19.anInt7500;
				}
			} else if ((long) 5 < ++local19.aLong233) {
				@Pc(62) Class3_Sub4_Sub6 local62 = Static268.aClass231_1.method5191(local19);
				this.aClass11_33.method319(local62, local19.aLong234);
				Static183.method3166(local19, local62);
				local19.method5977();
				local19.method5949();
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLclient!wm;)V")
	private void method4298(@OriginalArg(1) Class3_Sub4_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method5977();
			arg0.method5949();
			this.anInt5482 += arg0.anInt7500;
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Lclient!ue;I)V")
	private void method4300(@OriginalArg(0) Interface11 arg0) {
		@Pc(11) long local11 = arg0.method774();
		for (@Pc(18) Class3_Sub4_Sub6 local18 = (Class3_Sub4_Sub6) this.aClass11_33.method324(local11); local18 != null; local18 = (Class3_Sub4_Sub6) this.aClass11_33.method318()) {
			if (local18.anInterface11_3.method773(arg0)) {
				this.method4298(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)I")
	public int method4301() {
		return this.anInt5476;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!ue;BLjava/lang/Object;)V")
	public void method4302(@OriginalArg(0) Interface11 arg0, @OriginalArg(2) Object arg1) {
		this.method4293(arg0, arg1);
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
	public void method4303() {
		for (@Pc(18) Class3_Sub4_Sub6 local18 = (Class3_Sub4_Sub6) this.aClass244_7.method5240(); local18 != null; local18 = (Class3_Sub4_Sub6) this.aClass244_7.method5232()) {
			if (local18.method5832()) {
				local18.method5977();
				local18.method5949();
				this.anInt5482 += local18.anInt7500;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(Z)V")
	public void method4304() {
		this.aClass244_7.method5238();
		this.aClass11_33.method312();
		this.anInt5482 = this.anInt5476;
	}
}
