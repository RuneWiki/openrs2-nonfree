import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class10_Sub5_Sub1 extends Class10_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!ifa", name = "F", descriptor = "Lclient!dd;")
	private Class68 aClass68_3;

	@OriginalMember(owner = "client!ifa", name = "v", descriptor = "Lclient!wc;")
	public final Class353 aClass353_1;

	@OriginalMember(owner = "client!ifa", name = "q", descriptor = "Z")
	private final boolean aBoolean332;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIIZII)V")
	public Class10_Sub5_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt644, arg1.aBoolean63, arg1.aBoolean51);
		this.aClass353_1 = new Class353(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean332 = arg1.anInt599 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aClass353_1.method7865();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		this.aClass353_1.method7868(arg0);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aClass353_1.anInt9579;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		this.aClass353_1.method7860(arg0);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		@Pc(20) Class9 local20 = this.aClass353_1.method7862(arg0, super.anInt9408, 2048, false, true, super.anInt9412);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class134 local27 = arg0.method6842();
		local27.GA(super.anInt9412, super.anInt9409, super.anInt9408);
		@Pc(45) Class26_Sub6 local45 = null;
		if (this.aBoolean332) {
			local45 = Static292.method4579(1);
		}
		@Pc(57) int local57 = super.anInt9412 >> 9;
		@Pc(62) int local62 = super.anInt9408 >> 9;
		this.aClass353_1.method7858(local27, local62, arg0, true, local20, local57, local62, local57);
		if (this.aClass353_1.aClass26_Sub3_8 == null) {
			local20.method4023(local27, local45 == null ? null : local45.aClass26_Sub5Array1[0], 0);
		} else {
			@Pc(97) Class42 local97 = this.aClass353_1.aClass26_Sub3_8.method3658();
			arg0.method6807(local20, local97, local27, local45 == null ? null : local45.aClass26_Sub5Array1[0], 0);
		}
		if (this.aClass68_3 == null) {
			this.aClass68_3 = Static56.method848(super.anInt9409, local20, super.anInt9412, super.anInt9408);
		} else {
			Static514.method7259(super.anInt9408, super.anInt9412, super.anInt9409, this.aClass68_3, local20);
		}
		return local45;
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aClass353_1.anInt9583;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.aClass353_1.method7862(arg0, 0, arg1, false, false, 0);
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return this.aClass353_1.anInt9584;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass68_3;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class9 local16 = this.aClass353_1.method7862(arg0, super.anInt9408, 262144, true, true, super.anInt9412);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9412 >> 9;
		@Pc(28) int local28 = super.anInt9408 >> 9;
		@Pc(31) Class134 local31 = arg0.method6842();
		local31.GA(super.anInt9412, super.anInt9409, super.anInt9408);
		this.aClass353_1.method7858(local31, local28, arg0, false, local16, local23, local28, local23);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class9 local24 = this.aClass353_1.method7862(arg1, super.anInt9408, 131072, false, false, super.anInt9412);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class134 local31 = arg1.method6842();
			local31.GA(super.anInt9412, super.anInt9409, super.anInt9408);
			return local24.method4007(arg2, arg0, local31, false);
		}
	}
}
