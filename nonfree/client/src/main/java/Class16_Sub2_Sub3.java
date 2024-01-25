import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class16_Sub2_Sub3 extends Class16_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!mj", name = "V", descriptor = "Lclient!bi;")
	public final Class23 aClass23_3;

	@OriginalMember(owner = "client!mj", name = "J", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!ya;Lclient!rd;IIIIIZIIIIII)V")
	public Class16_Sub2_Sub3(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static328.method4425(arg12, arg11));
		this.aClass23_3 = new Class23(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean421 = arg1.anInt5813 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	@Override
	public void method5353() {
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class110 local16 = this.aClass23_3.method578(super.anInt4552, true, arg0, super.anInt4566, 2048, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class31 local23 = arg0.method4289();
		local23.j(super.anInt4566 + super.anInt4550, super.anInt4559, super.anInt4552 + super.anInt4551);
		@Pc(41) Class3_Sub3 local41 = null;
		if (this.aBoolean421) {
			local41 = Static38.method672(1);
		}
		if (this.aClass23_3.aClass3_Sub2_1 == null) {
			local16.method4889(local23, local41 == null ? null : local41.aClass3_Sub5Array1[0], 0);
		} else {
			@Pc(77) Class146 local77 = this.aClass23_3.aClass3_Sub2_1.method171();
			arg0.method4262(local16, local77, local23, local41 == null ? null : local41.aClass3_Sub5Array1[0]);
		}
		@Pc(96) int local96 = super.anInt4566 >> 7;
		@Pc(101) int local101 = super.anInt4552 >> 7;
		this.aClass23_3.method586(true, local101, local16, local96, arg0, local101, local96);
		return local41;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return this.aClass23_3.anInt551;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5349(@OriginalArg(1) Class19 arg0) {
		this.aClass23_3.method588(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5351() {
		return this.aClass23_3.method584();
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)I")
	@Override
	public int method3583() {
		return this.aClass23_3.method580();
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)I")
	@Override
	public int method5354() {
		return this.aClass23_3.anInt536;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5348(@OriginalArg(0) Class19 arg0) {
		this.aClass23_3.method582(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	@Override
	public Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return this.aClass23_3.method578(0, false, arg0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class110 local16 = this.aClass23_3.method578(super.anInt4552, false, arg1, super.anInt4566, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class31 local28 = arg1.method4289();
			local28.j(super.anInt4566 + super.anInt4550, super.anInt4559, super.anInt4552 + super.anInt4551);
			return local16.method4894(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
		@Pc(22) Class110 local22 = this.aClass23_3.method578(super.anInt4552, true, arg0, super.anInt4566, 262144, false);
		if (local22 != null) {
			@Pc(29) int local29 = super.anInt4566 >> 7;
			@Pc(34) int local34 = super.anInt4552 >> 7;
			this.aClass23_3.method586(false, local34, local22, local29, arg0, local34, local29);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)I")
	@Override
	public int method5350() {
		return this.aClass23_3.anInt548;
	}
}
