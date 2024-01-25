import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class10_Sub2_Sub3 extends Class10_Sub2 implements Interface17 {

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "Lclient!dd;")
	private Class68 aClass68_6;

	@OriginalMember(owner = "client!sea", name = "p", descriptor = "Lclient!wc;")
	public final Class353 aClass353_2;

	@OriginalMember(owner = "client!sea", name = "y", descriptor = "Z")
	private final boolean aBoolean554;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIIZIII)V")
	public Class10_Sub2_Sub3(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static509.method7222(arg9, arg8));
		this.aClass353_2 = new Class353(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt8055, super.anInt8057, arg7, arg10);
		this.aBoolean554 = arg1.anInt599 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aClass353_2.anInt9583;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		this.aClass353_2.method7868(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aClass353_2.method7865();
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		@Pc(20) Class9 local20 = this.aClass353_2.method7862(arg0, super.anInt8057, 2048, false, true, super.anInt8055);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class134 local27 = arg0.method6842();
		local27.GA(super.anInt8055, super.anInt8052, super.anInt8057);
		@Pc(37) Class26_Sub6 local37 = null;
		if (this.aBoolean554) {
			local37 = Static292.method4579(1);
		}
		@Pc(49) int local49 = super.anInt8055 >> 9;
		@Pc(60) int local60 = super.anInt8057 >> 9;
		this.aClass353_2.method7858(local27, local60, arg0, true, local20, local49, local60, local49);
		if (this.aClass353_2.aClass26_Sub3_8 == null) {
			local20.method4023(local27, local37 == null ? null : local37.aClass26_Sub5Array1[0], 0);
		} else {
			@Pc(81) Class42 local81 = this.aClass353_2.aClass26_Sub3_8.method3658();
			arg0.method6807(local20, local81, local27, local37 == null ? null : local37.aClass26_Sub5Array1[0], 0);
		}
		if (this.aClass68_6 == null) {
			this.aClass68_6 = Static56.method848(super.anInt8052, local20, super.anInt8055, super.anInt8057);
		} else {
			Static514.method7259(super.anInt8057, super.anInt8055, super.anInt8052, this.aClass68_6, local20);
		}
		return local37;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass68_6;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class9 local16 = this.aClass353_2.method7862(arg0, super.anInt8057, 262144, true, true, super.anInt8055);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8055 >> 9;
		@Pc(28) int local28 = super.anInt8057 >> 9;
		@Pc(31) Class134 local31 = arg0.method6842();
		local31.GA(super.anInt8055, super.anInt8052, super.anInt8057);
		this.aClass353_2.method7858(local31, local28, arg0, false, local16, local23, local28, local23);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.aClass353_2.method7862(arg0, 0, arg1, false, false, 0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return this.aClass353_2.anInt9584;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		this.aClass353_2.method7860(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aClass353_2.anInt9579;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class9 local16 = this.aClass353_2.method7862(arg1, super.anInt8057, 131072, false, false, super.anInt8055);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class134 local31 = arg1.method6842();
			local31.GA(super.anInt8055, super.anInt8052, super.anInt8057);
			return local16.method4007(arg2, arg0, local31, false);
		}
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		throw new IllegalStateException();
	}
}
