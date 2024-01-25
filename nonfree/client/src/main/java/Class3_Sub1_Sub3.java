import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "Z")
	private final boolean aBoolean404;

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "S")
	private final short aShort77;

	@OriginalMember(owner = "client!sh", name = "S", descriptor = "B")
	private final byte aByte85;

	@OriginalMember(owner = "client!sh", name = "R", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "Lclient!va;")
	private Class224 aClass224_6;

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "Lclient!ss;")
	private Class6_Sub2_Sub10 aClass6_Sub2_Sub10_5;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!eq;Lclient!hn;IIIIZIIIII)V")
	public Class3_Sub1_Sub3(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static345.method5184(arg10, arg11));
		this.aByte82 = (byte) arg2;
		super.anInt6392 = arg3;
		this.aBoolean406 = arg6;
		this.aBoolean404 = arg1.anInt3163 != 0 && !arg6;
		super.anInt6384 = arg5;
		this.aShort77 = (short) arg1.anInt3167;
		this.aByte85 = (byte) arg11;
		this.aByte84 = (byte) arg10;
		this.aBoolean405 = arg0.method4995() && arg1.aBoolean208 && !this.aBoolean406 && Static291.aClass28_Sub1_1.anInt1034 != 0;
		@Pc(75) Class247 local75 = this.method5328(this.aBoolean405, 2048, arg0);
		if (local75 != null) {
			this.aClass224_6 = local75.aClass224_7;
			this.aClass6_Sub2_Sub10_5 = local75.aClass6_Sub2_Sub10_6;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIILclient!eq;)Lclient!uq;")
	private Class247 method5328(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(19) Class106 local19 = Static448.aClass104_4.method2616(this.aShort77 & 0xFFFF);
		@Pc(44) Class86 local44;
		@Pc(35) Class86 local35;
		if (this.aBoolean406) {
			local44 = Static288.aClass86Array3[this.aByte82];
			local35 = Static87.aClass86Array2[0];
		} else {
			if (this.aByte82 < 3) {
				local35 = Static87.aClass86Array2[this.aByte82 + 1];
			} else {
				local35 = null;
			}
			local44 = Static87.aClass86Array2[this.aByte82];
		}
		return local19.method2627(local35, local44, super.anInt6392, super.anInt6384, arg1, super.anInt6397, this.aByte84, arg0, this.aByte85, arg2);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return this.aByte85;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
		@Pc(32) Class6_Sub2_Sub10 local32;
		if (this.aClass6_Sub2_Sub10_5 == null && this.aBoolean405) {
			@Pc(25) Class247 local25 = this.method5328(true, 262144, arg0);
			local32 = local25 == null ? null : local25.aClass6_Sub2_Sub10_6;
		} else {
			local32 = this.aClass6_Sub2_Sub10_5;
			this.aClass6_Sub2_Sub10_5 = null;
		}
		if (local32 != null) {
			Static236.method3640(local32, this.aByte82, super.anInt6392, super.anInt6384, null);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return this.aByte84;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!eq;IB)Lclient!va;")
	private Class224 method5329(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass224_6 != null && arg0.method5053(this.aClass224_6.method5811(), arg1) == 0) {
			return this.aClass224_6;
		} else {
			@Pc(30) Class247 local30 = this.method5328(false, arg1, arg0);
			return local30 == null ? null : local30.aClass224_7;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		if (this.aClass224_6 == null) {
			return null;
		}
		@Pc(11) Class5 local11 = arg0.method5064();
		local11.method3846(super.anInt6386 + super.anInt6392, super.anInt6397, super.anInt6384 + super.anInt6394);
		@Pc(34) Class57_Sub2 local34 = null;
		if (this.aBoolean404) {
			local34 = Static291.method4377(1);
		}
		this.aClass224_6.method5798(local11, local34 == null ? null : local34.aClass57_Sub5Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class224 local17 = this.method5329(arg1, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class5 local22 = arg1.method5064();
			local22.method3846(super.anInt6392, super.anInt6397, super.anInt6384);
			return local17.method5836(arg0, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return this.method5329(arg1, arg0);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
		if (this.aClass224_6 != null) {
			this.aClass224_6.method5799();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return this.aShort77 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)I")
	@Override
	public int method5319() {
		return this.aClass224_6 == null ? 0 : this.aClass224_6.method5812();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return this.aBoolean405;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
		@Pc(14) Class6_Sub2_Sub10 local14;
		if (this.aClass6_Sub2_Sub10_5 == null && this.aBoolean405) {
			@Pc(25) Class247 local25 = this.method5328(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub10_6;
		} else {
			local14 = this.aClass6_Sub2_Sub10_5;
			this.aClass6_Sub2_Sub10_5 = null;
		}
		if (local14 != null) {
			Static194.method3059(local14, this.aByte82, super.anInt6392, super.anInt6384, null);
		}
	}
}
