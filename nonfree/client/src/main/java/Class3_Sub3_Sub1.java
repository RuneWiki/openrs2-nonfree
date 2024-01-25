import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "S")
	private final short aShort21;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "Z")
	private final boolean aBoolean100;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "Lclient!ss;")
	private Class6_Sub2_Sub10 aClass6_Sub2_Sub10_1;

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "Lclient!va;")
	public Class224 aClass224_1;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!eq;Lclient!hn;IIIIZIIZ)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static238.method3676(arg8, arg7));
		this.aBoolean97 = arg1.anInt3163 != 0 && !arg6;
		this.aShort21 = (short) arg1.anInt3167;
		this.aByte16 = (byte) arg8;
		this.aBoolean98 = arg9;
		this.aBoolean100 = arg6;
		this.aByte17 = (byte) arg2;
		this.aByte18 = (byte) arg7;
		super.anInt5872 = arg3;
		super.anInt5871 = arg5;
		this.aBoolean99 = arg0.method4995() && arg1.aBoolean208 && !this.aBoolean100 && Static291.aClass28_Sub1_1.anInt1034 != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean98) {
			local69 |= 0x10000;
		}
		@Pc(84) Class247 local84 = this.method1020(arg0, local69, this.aBoolean99);
		if (local84 != null) {
			this.aClass6_Sub2_Sub10_1 = local84.aClass6_Sub2_Sub10_6;
			this.aClass224_1 = local84.aClass224_7;
			if (this.aBoolean98) {
				this.aClass224_1 = this.aClass224_1.method5808((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return this.aBoolean99;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class224 local17 = this.method1023(arg1, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class5 local22 = arg1.method5064();
			local22.method3846(super.anInt5872, super.anInt5873, super.anInt5871);
			return local17.method5836(arg0, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
		if (this.aClass224_1 != null) {
			this.aClass224_1.method5799();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!eq;IZ)Lclient!uq;")
	private Class247 method1020(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class106 local19 = Static448.aClass104_4.method2616(this.aShort21 & 0xFFFF);
		@Pc(44) Class86 local44;
		@Pc(30) Class86 local30;
		if (this.aBoolean100) {
			local44 = Static288.aClass86Array3[this.aByte17];
			local30 = Static87.aClass86Array2[0];
		} else {
			if (this.aByte17 >= 3) {
				local30 = null;
			} else {
				local30 = Static87.aClass86Array2[this.aByte17 + 1];
			}
			local44 = Static87.aClass86Array2[this.aByte17];
		}
		return local19.method2627(local30, local44, super.anInt5872, super.anInt5871, arg1, super.anInt5873, this.aByte18, arg2, this.aByte16, arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return this.method1023(arg1, arg0);
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return this.aBoolean98;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		if (arg2 instanceof Class3_Sub3_Sub1) {
			@Pc(5) Class3_Sub3_Sub1 local5 = (Class3_Sub3_Sub1) arg2;
			if (this.aClass224_1 != null && local5.aClass224_1 != null) {
				this.aClass224_1.method5825(local5.aClass224_1, arg3, arg1, arg0, arg4);
			}
		} else if (arg2 instanceof Class3_Sub2_Sub4) {
			@Pc(28) Class3_Sub2_Sub4 local28 = (Class3_Sub2_Sub4) arg2;
			if (this.aClass224_1 != null && local28.aClass224_2 != null) {
				this.aClass224_1.method5825(local28.aClass224_2, arg3, arg1, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!eq;II)Lclient!va;")
	private Class224 method1023(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass224_1 != null && arg0.method5053(this.aClass224_1.method5811(), arg1) == 0) {
			return this.aClass224_1;
		} else {
			@Pc(31) Class247 local31 = this.method1020(arg0, arg1, false);
			return local31 == null ? null : local31.aClass224_7;
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		this.aBoolean98 = false;
		if (this.aClass224_1 != null) {
			this.aClass224_1.method5809(this.aClass224_1.method5811() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
		@Pc(18) Class6_Sub2_Sub10 local18;
		if (this.aClass6_Sub2_Sub10_1 == null && this.aBoolean99) {
			@Pc(29) Class247 local29 = this.method1020(arg0, 262144, true);
			local18 = local29 == null ? null : local29.aClass6_Sub2_Sub10_6;
		} else {
			local18 = this.aClass6_Sub2_Sub10_1;
			this.aClass6_Sub2_Sub10_1 = null;
		}
		if (local18 != null) {
			Static194.method3059(local18, this.aByte17, super.anInt5872, super.anInt5871, null);
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return this.aByte18;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		if (this.aClass224_1 == null) {
			return null;
		}
		@Pc(17) Class5 local17 = arg0.method5064();
		local17.method3846(super.anInt5872, super.anInt5873, super.anInt5871);
		@Pc(27) Class57_Sub2 local27 = null;
		if (this.aBoolean97) {
			local27 = Static291.method4377(1);
		}
		this.aClass224_1.method5798(local17, local27 == null ? null : local27.aClass57_Sub5Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return this.aShort21 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
		@Pc(23) Class6_Sub2_Sub10 local23;
		if (this.aClass6_Sub2_Sub10_1 == null && this.aBoolean99) {
			@Pc(34) Class247 local34 = this.method1020(arg0, 262144, true);
			local23 = local34 == null ? null : local34.aClass6_Sub2_Sub10_6;
		} else {
			local23 = this.aClass6_Sub2_Sub10_1;
			this.aClass6_Sub2_Sub10_1 = null;
		}
		if (local23 != null) {
			Static236.method3640(local23, this.aByte17, super.anInt5872, super.anInt5871, null);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return this.aByte16;
	}
}
