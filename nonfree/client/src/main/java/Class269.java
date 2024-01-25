import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class269 {

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "Lclient!vl;")
	private final Class388 aClass388_7 = new Class388();

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "I")
	private final int anInt7241;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
	private int anInt7224;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Lclient!lba;")
	private final Class218 aClass218_34;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(I)V")
	public Class269(@OriginalArg(0) int arg0) {
		this.anInt7241 = arg0;
		this.anInt7224 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass218_34 = new Class218(local16);
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)I")
	public int method6520() {
		return this.anInt7241;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!tm;)Ljava/lang/Object;")
	public Object method6521(@OriginalArg(1) Interface23 arg0) {
		@Pc(9) long local9 = arg0.method3984();
		for (@Pc(24) Class2_Sub6_Sub5 local24 = (Class2_Sub6_Sub5) this.aClass218_34.method5095(local9, 0); local24 != null; local24 = (Class2_Sub6_Sub5) this.aClass218_34.method5100((byte) 100)) {
			if (local24.anInterface23_3.method3985(arg0)) {
				@Pc(38) Object local38 = local24.method8120();
				if (local38 != null) {
					if (local24.method8119()) {
						@Pc(71) Class2_Sub6_Sub5_Sub1 local71 = new Class2_Sub6_Sub5_Sub1(arg0, local38, local24.anInt9203);
						this.aClass218_34.method5099(local71, local24.aLong352);
						this.aClass388_7.method9215(local71);
						local71.aLong311 = 0L;
						local24.method9872();
						local24.method8698();
					} else {
						this.aClass388_7.method9215(local24);
						local24.aLong311 = 0L;
					}
					return local38;
				}
				local24.method9872();
				local24.method8698();
				this.anInt7224 += local24.anInt9203;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!tm;Ljava/lang/Object;)V")
	public void method6522(@OriginalArg(1) Interface23 arg0, @OriginalArg(2) Object arg1) {
		this.method6525(arg1, arg0);
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(Z)V")
	public void method6523() {
		for (@Pc(7) Class2_Sub6_Sub5 local7 = (Class2_Sub6_Sub5) this.aClass388_7.method9213(); local7 != null; local7 = (Class2_Sub6_Sub5) this.aClass388_7.method9212()) {
			if (local7.method8119()) {
				local7.method9872();
				local7.method8698();
				this.anInt7224 += local7.anInt9203;
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZLjava/lang/Object;ILclient!tm;)V")
	private void method6525(@OriginalArg(1) Object arg0, @OriginalArg(3) Interface23 arg1) {
		if (this.anInt7241 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6531(arg1);
		this.anInt7224--;
		while (this.anInt7224 < 0) {
			@Pc(47) Class2_Sub6_Sub5 local47 = (Class2_Sub6_Sub5) this.aClass388_7.method9216();
			this.method6529(local47);
		}
		@Pc(61) Class2_Sub6_Sub5_Sub1 local61 = new Class2_Sub6_Sub5_Sub1(arg1, arg0, 1);
		this.aClass218_34.method5099(local61, arg1.method3984());
		this.aClass388_7.method9215(local61);
		local61.aLong311 = 0L;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)I")
	public int method6527() {
		return this.anInt7224;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	public void method6528() {
		this.aClass388_7.method9211();
		this.aClass218_34.method5097();
		this.anInt7224 = this.anInt7241;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!gv;)V")
	private void method6529(@OriginalArg(1) Class2_Sub6_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method9872();
			arg0.method8698();
			this.anInt7224 += arg0.anInt9203;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!tm;Z)V")
	private void method6531(@OriginalArg(0) Interface23 arg0) {
		@Pc(14) long local14 = arg0.method3984();
		for (@Pc(21) Class2_Sub6_Sub5 local21 = (Class2_Sub6_Sub5) this.aClass218_34.method5095(local14, 0); local21 != null; local21 = (Class2_Sub6_Sub5) this.aClass218_34.method5100((byte) 89)) {
			if (local21.anInterface23_3.method3985(arg0)) {
				this.method6529(local21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)V")
	public void method6532() {
		if (Static274.aClass342_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub6_Sub5 local9 = (Class2_Sub6_Sub5) this.aClass388_7.method9213(); local9 != null; local9 = (Class2_Sub6_Sub5) this.aClass388_7.method9212()) {
			if (local9.method8119()) {
				if (local9.method8120() == null) {
					local9.method9872();
					local9.method8698();
					this.anInt7224 += local9.anInt9203;
				}
			} else if (++local9.aLong311 > (long) 5) {
				@Pc(58) Class2_Sub6_Sub5 local58 = Static274.aClass342_1.method9464(local9);
				this.aClass218_34.method5099(local58, local9.aLong352);
				Static69.method1064(local9, local58);
				local9.method9872();
				local9.method8698();
			}
		}
	}
}
