import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!to", name = "s", descriptor = "Lclient!dj;")
	public final Class53 aClass53_2;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIIZIII)V")
	public Class3_Sub2_Sub3(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static82.method1189(arg9, arg8));
		this.aClass53_2 = new Class53(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6426, super.anInt6421, arg7, arg10);
		this.aBoolean459 = arg1.anInt5357 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aClass53_2.anInt1408;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aClass53_2.anInt1413;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		@Pc(16) Class59 local16 = this.aClass53_2.method1093(super.anInt6421, true, arg0, 262144, super.anInt6426, true);
		if (local16 != null) {
			@Pc(29) int local29 = super.anInt6426 >> 7;
			@Pc(34) int local34 = super.anInt6421 >> 7;
			this.aClass53_2.method1088(arg0, local34, local29, local29, false, local16, local34);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return this.aClass53_2.anInt1391;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		this.aClass53_2.method1087(arg0);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aClass53_2.method1090();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(21) Class59 local21 = this.aClass53_2.method1093(super.anInt6421, false, arg2, 131072, super.anInt6426, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class31 local28 = arg2.method5539();
			local28.U(super.anInt6426, super.anInt6424, super.anInt6421);
			return local21.method5748(arg1, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		this.aClass53_2.method1100(arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.aClass53_2.method1093(0, false, arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		@Pc(16) Class59 local16 = this.aClass53_2.method1093(super.anInt6421, false, arg0, 2048, super.anInt6426, true);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class31 local23 = arg0.method5539();
		local23.U(super.anInt6426, super.anInt6424, super.anInt6421);
		@Pc(33) Class21_Sub6 local33 = null;
		if (this.aBoolean459) {
			local33 = Static209.method2805(1);
		}
		if (this.aClass53_2.aClass21_Sub2_2 == null) {
			local16.method5736(local23, local33 == null ? null : local33.aClass21_Sub7Array1[0], 0);
		} else {
			@Pc(49) Class256 local49 = this.aClass53_2.aClass21_Sub2_2.method634();
			arg0.method5551(local16, local49, local23, local33 == null ? null : local33.aClass21_Sub7Array1[0]);
		}
		@Pc(82) int local82 = super.anInt6426 >> 7;
		@Pc(87) int local87 = super.anInt6421 >> 7;
		this.aClass53_2.method1088(arg0, local87, local82, local82, true, local16, local87);
		return local33;
	}
}
