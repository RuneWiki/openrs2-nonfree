import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class10_Sub4_Sub3 extends Class10_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!dd;")
	private Class68 aClass68_7;

	@OriginalMember(owner = "client!th", name = "E", descriptor = "Lclient!wc;")
	public final Class353 aClass353_3;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "Z")
	private final boolean aBoolean607;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIIZIIIIII)V")
	public Class10_Sub4_Sub3(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static149.method3045(arg12, arg11));
		this.aClass353_3 = new Class353(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean607 = arg1.anInt599 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		this.aClass353_3.method7860(arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class9 local24 = this.aClass353_3.method7862(arg1, super.anInt8737, 131072, false, false, super.anInt8732);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class134 local31 = arg1.method6842();
			local31.GA(super.anInt8735 + super.anInt8732, super.anInt8740, super.anInt8737 + super.anInt8729);
			return local24.method4007(arg2, arg0, local31, false);
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aClass353_3.anInt9583;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		this.aClass353_3.method7868(arg0);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aClass353_3.anInt9579;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass68_7;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return this.aClass353_3.anInt9584;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aClass353_3.method7865();
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(B)I")
	@Override
	public int method7188() {
		return this.aClass353_3.method7866();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class9 local16 = this.aClass353_3.method7862(arg0, super.anInt8737, 262144, false, true, super.anInt8732);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8732 >> 9;
		@Pc(28) int local28 = super.anInt8737 >> 9;
		@Pc(31) Class134 local31 = arg0.method6842();
		local31.GA(super.anInt8732, super.anInt8740, super.anInt8737);
		this.aClass353_3.method7858(local31, local28, arg0, false, local16, local23, local28, local23);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		@Pc(18) Class9 local18 = this.aClass353_3.method7862(arg0, super.anInt8737, 2048, false, true, super.anInt8732);
		if (local18 == null) {
			return null;
		}
		@Pc(31) Class134 local31 = arg0.method6842();
		local31.GA(super.anInt8735 + super.anInt8732, super.anInt8740, super.anInt8729 + super.anInt8737);
		@Pc(47) Class26_Sub6 local47 = null;
		if (this.aBoolean607) {
			local47 = Static292.method4579(1);
		}
		@Pc(59) int local59 = super.anInt8732 >> 9;
		@Pc(64) int local64 = super.anInt8737 >> 9;
		this.aClass353_3.method7858(local31, local64, arg0, true, local18, local59, local64, local59);
		if (this.aClass353_3.aClass26_Sub3_8 == null) {
			local18.method4023(local31, local47 == null ? null : local47.aClass26_Sub5Array1[0], 0);
		} else {
			@Pc(85) Class42 local85 = this.aClass353_3.aClass26_Sub3_8.method3658();
			arg0.method6807(local18, local85, local31, local47 == null ? null : local47.aClass26_Sub5Array1[0], 0);
		}
		if (this.aClass68_7 == null) {
			this.aClass68_7 = Static56.method848(super.anInt8740, local18, super.anInt8732, super.anInt8737);
		} else {
			Static514.method7259(super.anInt8737, super.anInt8732, super.anInt8740, this.aClass68_7, local18);
		}
		return local47;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.aClass353_3.method7862(arg0, 0, arg1, false, false, 0);
	}
}
