import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class122 {

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "Lclient!daa;")
	private Class4_Sub7 aClass4_Sub7_15 = new Class4_Sub7();

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "Lclient!rda;")
	private final Class286 aClass286_4 = new Class286();

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
	private final int anInt3612;

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
	private int anInt3611;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "Lclient!jw;")
	private final Class183 aClass183_15;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V")
	public Class122(@OriginalArg(0) int arg0) {
		this.anInt3612 = arg0;
		this.anInt3611 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass183_15 = new Class183(local19);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V")
	public void method3205() {
		this.aClass286_4.method6411();
		this.aClass183_15.method4287();
		this.aClass4_Sub7_15 = new Class4_Sub7();
		this.anInt3611 = this.anInt3612;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IJ)Lclient!daa;")
	public Class4_Sub7 method3206(@OriginalArg(1) long arg0) {
		@Pc(15) Class4_Sub7 local15 = (Class4_Sub7) this.aClass183_15.method4289(arg0);
		if (local15 != null) {
			this.aClass286_4.method6409(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!daa;IJ)V")
	public void method3207(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3611 == 0) {
			@Pc(17) Class4_Sub7 local17 = this.aClass286_4.method6405();
			local17.method8013();
			local17.method7963();
			if (local17 == this.aClass4_Sub7_15) {
				local17 = this.aClass286_4.method6405();
				local17.method8013();
				local17.method7963();
			}
		} else {
			this.anInt3611--;
		}
		this.aClass183_15.method4282(arg1, arg0);
		this.aClass286_4.method6409(arg0);
	}
}
