import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class103 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!se;")
	private final Class180 aClass180_6 = new Class180();

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	private int anInt3266;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	private final int anInt3260;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!dj;")
	private final Class43 aClass43_19;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
	public Class103(@OriginalArg(0) int arg0) {
		this.anInt3266 = arg0;
		this.anInt3260 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass43_19 = new Class43(local14);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public int method2964() {
		return this.anInt3260;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!aa;)V")
	private void method2966(@OriginalArg(1) Interface1 arg0) {
		@Pc(13) long local13 = arg0.method556();
		for (@Pc(22) Class4_Sub4_Sub12 local22 = (Class4_Sub4_Sub12) this.aClass43_19.method1273(local13); local22 != null; local22 = (Class4_Sub4_Sub12) this.aClass43_19.method1279()) {
			if (local22.anInterface1_3.method557(arg0)) {
				local22.method5687();
				local22.method5678();
				this.anInt3266++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
	public int method2967() {
		return this.anInt3266;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public void method2971() {
		if (Static115.aClass130_1 == null) {
			return;
		}
		for (@Pc(13) Class4_Sub4_Sub12 local13 = (Class4_Sub4_Sub12) this.aClass180_6.method4838(); local13 != null; local13 = (Class4_Sub4_Sub12) this.aClass180_6.method4843()) {
			if (local13.method5306()) {
				if (local13.method5307() == null) {
					local13.method5687();
					local13.method5678();
					this.anInt3266++;
				}
			} else if (++local13.aLong222 > (long) 5) {
				@Pc(35) Class4_Sub4_Sub12 local35 = Static115.aClass130_1.method3857(local13);
				this.aClass43_19.method1276(local35, local13.aLong223);
				Static293.method3940(local35, local13);
				local13.method5687();
				local13.method5678();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method2973() {
		this.aClass180_6.method4841();
		this.aClass43_19.method1282();
		this.anInt3266 = this.anInt3260;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V")
	public void method2974() {
		for (@Pc(11) Class4_Sub4_Sub12 local11 = (Class4_Sub4_Sub12) this.aClass180_6.method4838(); local11 != null; local11 = (Class4_Sub4_Sub12) this.aClass180_6.method4843()) {
			if (local11.method5306()) {
				local11.method5687();
				local11.method5678();
				this.anInt3266++;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILclient!aa;)Ljava/lang/Object;")
	public Object method2976(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method556();
		for (@Pc(16) Class4_Sub4_Sub12 local16 = (Class4_Sub4_Sub12) this.aClass43_19.method1273(local9); local16 != null; local16 = (Class4_Sub4_Sub12) this.aClass43_19.method1279()) {
			if (local16.anInterface1_3.method557(arg0)) {
				@Pc(36) Object local36 = local16.method5307();
				if (local36 != null) {
					if (local16.method5306()) {
						@Pc(62) Class4_Sub4_Sub12_Sub1 local62 = new Class4_Sub4_Sub12_Sub1(arg0, local36);
						this.aClass43_19.method1276(local62, local16.aLong223);
						this.aClass180_6.method4840(local62);
						local62.aLong222 = 0L;
						local16.method5687();
						local16.method5678();
					} else {
						this.aClass180_6.method4840(local16);
						local16.aLong222 = 0L;
					}
					return local36;
				}
				local16.method5687();
				local16.method5678();
				this.anInt3266++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!aa;Ljava/lang/Object;)V")
	public void method2977(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Object arg1) {
		this.method2966(arg0);
		if (this.anInt3266 == 0) {
			@Pc(25) Class4_Sub4_Sub12 local25 = (Class4_Sub4_Sub12) this.aClass180_6.method4839();
			local25.method5687();
			local25.method5678();
		} else {
			this.anInt3266--;
		}
		@Pc(37) Class4_Sub4_Sub12_Sub1 local37 = new Class4_Sub4_Sub12_Sub1(arg0, arg1);
		this.aClass43_19.method1276(local37, arg0.method556());
		this.aClass180_6.method4840(local37);
		local37.aLong222 = 0L;
	}
}
