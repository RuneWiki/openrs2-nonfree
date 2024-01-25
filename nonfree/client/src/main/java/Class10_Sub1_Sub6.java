import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class10_Sub1_Sub6 extends Class10_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "Lclient!dd;")
	private Class68 aClass68_8;

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "Lclient!wc;")
	public final Class353 aClass353_4;

	@OriginalMember(owner = "client!uca", name = "x", descriptor = "Z")
	private final boolean aBoolean619;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIIZIIIIIII)V")
	public Class10_Sub1_Sub6(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt602 == 1, Static511.method836(arg12, arg13));
		this.aClass353_4 = new Class353(arg0, arg1, arg12, arg13, super.aByte101, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean619 = arg1.anInt599 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		this.aClass353_4.method7860(arg0);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return this.aClass353_4.anInt9584;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aClass353_4.method7865();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		@Pc(25) Class9 local25 = this.aClass353_4.method7862(arg0, super.anInt8929, 2048, false, true, super.anInt8934);
		if (local25 == null) {
			return null;
		}
		@Pc(32) Class134 local32 = arg0.method6842();
		local32.GA(super.anInt8934, super.anInt8931, super.anInt8929);
		@Pc(42) Class26_Sub6 local42 = null;
		if (this.aBoolean619) {
			local42 = Static292.method4579(1);
		}
		this.aClass353_4.method7858(local32, super.aShort117, arg0, true, local25, super.aShort118, super.aShort115, super.aShort116);
		if (this.aClass353_4.aClass26_Sub3_8 == null) {
			local25.method4023(local32, local42 == null ? null : local42.aClass26_Sub5Array1[0], 0);
		} else {
			@Pc(74) Class42 local74 = this.aClass353_4.aClass26_Sub3_8.method3658();
			arg0.method6807(local25, local74, local32, local42 == null ? null : local42.aClass26_Sub5Array1[0], 0);
		}
		if (this.aClass68_8 == null) {
			this.aClass68_8 = Static56.method848(super.anInt8931, local25, super.anInt8934, super.anInt8929);
		} else {
			Static514.method7259(super.anInt8929, super.anInt8934, super.anInt8931, this.aClass68_8, local25);
		}
		return local42;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aClass353_4.anInt9579;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aClass353_4.anInt9583;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass68_8;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		@Pc(16) Class9 local16 = this.aClass353_4.method7862(arg0, super.anInt8929, 262144, true, true, super.anInt8934);
		if (local16 != null) {
			@Pc(21) Class134 local21 = arg0.method6842();
			local21.GA(super.anInt8934, super.anInt8931, super.anInt8929);
			this.aClass353_4.method7858(local21, super.aShort117, arg0, false, local16, super.aShort118, super.aShort115, super.aShort116);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.aClass353_4.method7862(arg0, 0, arg1, false, false, 0);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class9 local24 = this.aClass353_4.method7862(arg1, super.anInt8929, 131072, false, false, super.anInt8934);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class134 local31 = arg1.method6842();
			local31.GA(super.anInt8934, super.anInt8931, super.anInt8929);
			return local24.method4007(arg2, arg0, local31, false);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		this.aClass353_4.method7868(arg0);
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(Z)I")
	@Override
	public int method7342() {
		return this.aClass353_4.method7866();
	}
}
