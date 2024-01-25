import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 implements Interface15 {

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "Lclient!ew;")
	private Class81 aClass81_5;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "S")
	private final short aShort112;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "Z")
	private final boolean aBoolean514;

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Z")
	private boolean aBoolean513;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "Z")
	private final boolean aBoolean515;

	@OriginalMember(owner = "client!qk", name = "U", descriptor = "Z")
	private final boolean aBoolean516;

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "Lclient!w;")
	private Class3_Sub10_Sub18 aClass3_Sub10_Sub18_5;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "Lclient!ba;")
	public Class2 aClass2_5;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIZIIZ)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static178.method3427(arg8, arg7));
		super.anInt9380 = arg5;
		this.aByte82 = (byte) arg7;
		this.aShort112 = (short) arg1.anInt7168;
		this.aBoolean514 = arg1.anInt7164 != 0 && !arg6;
		this.aByte84 = (byte) arg2;
		this.aBoolean513 = arg9;
		this.aByte83 = (byte) arg8;
		this.aBoolean515 = arg6;
		super.anInt9383 = arg3;
		this.aBoolean516 = arg0.method7439() && arg1.aBoolean488 && !this.aBoolean515 && Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean513) {
			local74 |= 0x10000;
		}
		@Pc(89) Class181 local89 = this.method6076(arg0, local74, this.aBoolean516);
		if (local89 != null) {
			this.aClass3_Sub10_Sub18_5 = local89.aClass3_Sub10_Sub18_3;
			this.aClass2_5 = local89.aClass2_3;
			if (this.aBoolean513) {
				this.aClass2_5 = this.aClass2_5.method5775((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return this.aBoolean513;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class6_Sub2_Sub2) {
			@Pc(12) Class6_Sub2_Sub2 local12 = (Class6_Sub2_Sub2) arg2;
			if (this.aClass2_5 != null && local12.aClass2_5 != null) {
				this.aClass2_5.method5781(local12.aClass2_5, arg0, arg5, arg1, arg4);
			}
		} else if (arg2 instanceof Class6_Sub1_Sub5) {
			@Pc(35) Class6_Sub1_Sub5 local35 = (Class6_Sub1_Sub5) arg2;
			if (this.aClass2_5 != null && local35.aClass2_4 != null) {
				this.aClass2_5.method5781(local35.aClass2_4, arg0, arg5, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
		if (this.aClass2_5 != null) {
			this.aClass2_5.method5785();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		if (this.aClass2_5 == null) {
			return null;
		}
		@Pc(11) Class205 local11 = arg0.method7448();
		local11.GA(super.anInt9383, super.anInt9386, super.anInt9380);
		@Pc(33) Class4_Sub1 local33 = null;
		if (this.aBoolean514) {
			local33 = Static264.method4641(1);
		}
		this.aClass2_5.method5774(local11, local33 == null ? null : local33.aClass4_Sub7Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aShort112 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2 local15 = this.method6078(131072, arg1);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class205 local20 = arg1.method7448();
			local20.GA(super.anInt9383, super.anInt9386, super.anInt9380);
			return local15.method5786(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aBoolean516;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.method6078(arg0, arg1);
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return this.aByte82;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		this.aBoolean513 = false;
		if (this.aClass2_5 != null) {
			this.aClass2_5.ia(this.aClass2_5.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!oa;IBZ)Lclient!lo;")
	private Class181 method6076(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class242 local18 = Static454.aClass298_3.method7185(this.aShort112 & 0xFFFF);
		@Pc(26) Class52 local26;
		@Pc(30) Class52 local30;
		if (this.aBoolean515) {
			local26 = Static238.aClass52Array2[this.aByte84];
			local30 = Static163.aClass52Array4[0];
		} else {
			if (this.aByte84 >= 3) {
				local30 = null;
			} else {
				local30 = Static163.aClass52Array4[this.aByte84 + 1];
			}
			local26 = Static163.aClass52Array4[this.aByte84];
		}
		return local18.method5981(super.anInt9383, arg1, this.aByte83, arg0, super.anInt9386, arg2, this.aByte82, local30, super.anInt9380, local26);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		@Pc(18) Class3_Sub10_Sub18 local18;
		if (this.aClass3_Sub10_Sub18_5 == null && this.aBoolean516) {
			@Pc(29) Class181 local29 = this.method6076(arg0, 262144, true);
			local18 = local29 == null ? null : local29.aClass3_Sub10_Sub18_3;
		} else {
			local18 = this.aClass3_Sub10_Sub18_5;
			this.aClass3_Sub10_Sub18_5 = null;
		}
		if (local18 != null) {
			Static348.method5673(local18, this.aByte84, super.anInt9383, super.anInt9380, null);
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		if (this.aClass81_5 == null) {
			this.aClass81_5 = Static257.method4541(super.anInt9380, super.anInt9386, super.anInt9383, this.method6078(0, arg0));
		}
		return this.aClass81_5;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBLclient!oa;)Lclient!ba;")
	private Class2 method6078(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		if (this.aClass2_5 != null && arg1.method7435(this.aClass2_5.h(), arg0) == 0) {
			return this.aClass2_5;
		} else {
			@Pc(26) Class181 local26 = this.method6076(arg1, arg0, false);
			return local26 == null ? null : local26.aClass2_3;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		@Pc(14) Class3_Sub10_Sub18 local14;
		if (this.aClass3_Sub10_Sub18_5 == null && this.aBoolean516) {
			@Pc(25) Class181 local25 = this.method6076(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass3_Sub10_Sub18_3;
		} else {
			local14 = this.aClass3_Sub10_Sub18_5;
			this.aClass3_Sub10_Sub18_5 = null;
		}
		if (local14 != null) {
			Static446.method6775(local14, this.aByte84, super.anInt9383, super.anInt9380, null);
		}
	}
}
