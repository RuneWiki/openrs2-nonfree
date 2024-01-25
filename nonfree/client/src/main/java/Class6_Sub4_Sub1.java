import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 implements Interface15 {

	@OriginalMember(owner = "client!iv", name = "Y", descriptor = "Lclient!ew;")
	private Class81 aClass81_2;

	@OriginalMember(owner = "client!iv", name = "H", descriptor = "Z")
	private final boolean aBoolean334;

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "Z")
	private final boolean aBoolean333;

	@OriginalMember(owner = "client!iv", name = "J", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!iv", name = "C", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!iv", name = "I", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!iv", name = "M", descriptor = "Z")
	private final boolean aBoolean335;

	@OriginalMember(owner = "client!iv", name = "Q", descriptor = "Lclient!w;")
	private Class3_Sub10_Sub18 aClass3_Sub10_Sub18_2;

	@OriginalMember(owner = "client!iv", name = "P", descriptor = "Lclient!ba;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIZIIIII)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static224.method4061(arg10, arg11));
		super.anInt9336 = arg3;
		this.aBoolean334 = arg6;
		this.aBoolean333 = arg1.anInt7164 != 0 && !arg6;
		this.aByte42 = (byte) arg11;
		super.anInt9342 = arg5;
		this.aShort73 = (short) arg1.anInt7168;
		this.aByte41 = (byte) arg10;
		this.aByte40 = (byte) arg2;
		this.aBoolean335 = arg0.method7439() && arg1.aBoolean488 && !this.aBoolean334 && Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091) != 0;
		@Pc(80) Class181 local80 = this.method3926(arg0, this.aBoolean335, 2048);
		if (local80 != null) {
			this.aClass3_Sub10_Sub18_2 = local80.aClass3_Sub10_Sub18_3;
			this.aClass2_2 = local80.aClass2_3;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		@Pc(29) Class3_Sub10_Sub18 local29;
		if (this.aClass3_Sub10_Sub18_2 == null && this.aBoolean335) {
			@Pc(22) Class181 local22 = this.method3926(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass3_Sub10_Sub18_3;
		} else {
			local29 = this.aClass3_Sub10_Sub18_2;
			this.aClass3_Sub10_Sub18_2 = null;
		}
		if (local29 != null) {
			Static446.method6775(local29, this.aByte40, super.anInt9336, super.anInt9342, null);
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!oa;I)Lclient!ba;")
	private Class2 method3924(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_2 != null && arg0.method7435(this.aClass2_2.h(), arg1) == 0) {
			return this.aClass2_2;
		} else {
			@Pc(28) Class181 local28 = this.method3926(arg0, false, arg1);
			return local28 == null ? null : local28.aClass2_3;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		if (this.aClass2_2 == null) {
			return null;
		}
		@Pc(17) Class205 local17 = arg0.method7448();
		local17.GA(super.anInt9340 + super.anInt9336, super.anInt9337, super.anInt9342 + super.anInt9335);
		@Pc(33) Class4_Sub1 local33 = null;
		if (this.aBoolean333) {
			local33 = Static264.method4641(1);
		}
		this.aClass2_2.method5774(local17, local33 == null ? null : local33.aClass4_Sub7Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
		if (this.aClass2_2 != null) {
			this.aClass2_2.method5785();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.method3924(arg1, arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		if (this.aClass81_2 == null) {
			this.aClass81_2 = Static257.method4541(super.anInt9342, super.anInt9337, super.anInt9336, this.method3924(arg0, 0));
		}
		return this.aClass81_2;
	}

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)I")
	@Override
	public int method7720() {
		return this.aClass2_2 == null ? 0 : this.aClass2_2.DA();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		@Pc(30) Class3_Sub10_Sub18 local30;
		if (this.aClass3_Sub10_Sub18_2 == null && this.aBoolean335) {
			@Pc(23) Class181 local23 = this.method3926(arg0, true, 262144);
			local30 = local23 == null ? null : local23.aClass3_Sub10_Sub18_3;
		} else {
			local30 = this.aClass3_Sub10_Sub18_2;
			this.aClass3_Sub10_Sub18_2 = null;
		}
		if (local30 != null) {
			Static348.method5673(local30, this.aByte40, super.anInt9336, super.anInt9342, null);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!oa;ZII)Lclient!lo;")
	private Class181 method3926(@OriginalArg(0) Class5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class242 local19 = Static454.aClass298_3.method7185(this.aShort73 & 0xFFFF);
		@Pc(31) Class52 local31;
		@Pc(26) Class52 local26;
		if (this.aBoolean334) {
			local26 = Static163.aClass52Array4[0];
			local31 = Static238.aClass52Array2[this.aByte40];
		} else {
			local31 = Static163.aClass52Array4[this.aByte40];
			if (this.aByte40 >= 3) {
				local26 = null;
			} else {
				local26 = Static163.aClass52Array4[this.aByte40 + 1];
			}
		}
		return local19.method5981(super.anInt9336, arg2, this.aByte42, arg0, super.anInt9337, arg1, this.aByte41, local26, super.anInt9342, local31);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aBoolean335;
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aByte42;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2 local15 = this.method3924(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class205 local20 = arg1.method7448();
			local20.GA(super.anInt9336, super.anInt9337, super.anInt9342);
			return local15.method5786(arg0, arg2, local20, false);
		}
	}
}
