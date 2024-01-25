import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class6_Sub1_Sub5 extends Class6_Sub1 implements Interface15 {

	@OriginalMember(owner = "client!ns", name = "gb", descriptor = "Lclient!ew;")
	private Class81 aClass81_4;

	@OriginalMember(owner = "client!ns", name = "D", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!ns", name = "B", descriptor = "Z")
	private final boolean aBoolean403;

	@OriginalMember(owner = "client!ns", name = "ab", descriptor = "Z")
	private boolean aBoolean405;

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "S")
	private final short aShort96;

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "Z")
	private final boolean aBoolean402;

	@OriginalMember(owner = "client!ns", name = "G", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!ns", name = "P", descriptor = "Z")
	private final boolean aBoolean404;

	@OriginalMember(owner = "client!ns", name = "N", descriptor = "Lclient!w;")
	private Class3_Sub10_Sub18 aClass3_Sub10_Sub18_4;

	@OriginalMember(owner = "client!ns", name = "bb", descriptor = "Lclient!ba;")
	public Class2 aClass2_4;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIIZIIIIIIZ)V")
	public Class6_Sub1_Sub5(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7161 == 1, Static311.method5068(arg13, arg12));
		this.aByte52 = (byte) arg3;
		this.aBoolean403 = arg7;
		this.aBoolean405 = arg14;
		this.aShort96 = (short) arg1.anInt7168;
		this.aBoolean402 = arg1.anInt7164 != 0 && !arg7;
		this.aByte53 = (byte) arg13;
		this.aByte54 = (byte) arg12;
		this.aBoolean404 = arg0.method7439() && arg1.aBoolean488 && !this.aBoolean403 && Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091) != 0;
		@Pc(76) int local76 = 2048;
		if (this.aBoolean405) {
			local76 |= 0x10000;
		}
		@Pc(91) Class181 local91 = this.method5324(local76, arg0, this.aBoolean404);
		if (local91 != null) {
			this.aClass3_Sub10_Sub18_4 = local91.aClass3_Sub10_Sub18_3;
			this.aClass2_4 = local91.aClass2_3;
			if (this.aBoolean405) {
				this.aClass2_4 = this.aClass2_4.method5775((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		if (this.aClass81_4 == null) {
			this.aClass81_4 = Static257.method4541(super.anInt8813, super.anInt8814, super.anInt8811, this.method5320(0, arg0));
		}
		return this.aClass81_4;
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(B)I")
	@Override
	public int method7240() {
		return this.aClass2_4 == null ? 0 : this.aClass2_4.DA();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aShort96 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		@Pc(25) Class3_Sub10_Sub18 local25;
		if (this.aClass3_Sub10_Sub18_4 == null && this.aBoolean404) {
			@Pc(18) Class181 local18 = this.method5324(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass3_Sub10_Sub18_3;
		} else {
			local25 = this.aClass3_Sub10_Sub18_4;
			this.aClass3_Sub10_Sub18_4 = null;
		}
		if (local25 != null) {
			Static446.method6775(local25, this.aByte52, super.anInt8811, super.anInt8813, null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2 local14 = this.method5320(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class205 local19 = arg1.method7448();
			local19.GA(super.anInt8811, super.anInt8814, super.anInt8813);
			return local14.method5786(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLclient!oa;)Lclient!ba;")
	private Class2 method5320(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		if (this.aClass2_4 != null && arg1.method7435(this.aClass2_4.h(), arg0) == 0) {
			return this.aClass2_4;
		} else {
			@Pc(31) Class181 local31 = this.method5324(arg0, arg1, false);
			return local31 == null ? null : local31.aClass2_3;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aBoolean404;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class6_Sub2_Sub2) {
			@Pc(13) Class6_Sub2_Sub2 local13 = (Class6_Sub2_Sub2) arg2;
			if (this.aClass2_4 != null && local13.aClass2_5 != null) {
				this.aClass2_4.method5781(local13.aClass2_5, arg0, arg5, arg1, arg4);
			}
		} else if (arg2 instanceof Class6_Sub1_Sub5) {
			@Pc(35) Class6_Sub1_Sub5 local35 = (Class6_Sub1_Sub5) arg2;
			if (this.aClass2_4 != null && local35.aClass2_4 != null) {
				this.aClass2_4.method5781(local35.aClass2_4, arg0, arg5, arg1, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		this.aBoolean405 = false;
		if (this.aClass2_4 != null) {
			this.aClass2_4.ia(this.aClass2_4.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return this.aBoolean405;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		@Pc(20) Class3_Sub10_Sub18 local20;
		if (this.aClass3_Sub10_Sub18_4 == null && this.aBoolean404) {
			@Pc(31) Class181 local31 = this.method5324(262144, arg0, true);
			local20 = local31 == null ? null : local31.aClass3_Sub10_Sub18_3;
		} else {
			local20 = this.aClass3_Sub10_Sub18_4;
			this.aClass3_Sub10_Sub18_4 = null;
		}
		if (local20 != null) {
			Static348.method5673(local20, this.aByte52, super.anInt8811, super.anInt8813, null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
		if (this.aClass2_4 != null) {
			this.aClass2_4.method5785();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.method5320(arg0, arg1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
	public int method5323() {
		return this.aClass2_4 == null ? 15 : this.aClass2_4.ZA() / 4;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		if (this.aClass2_4 == null) {
			return null;
		}
		@Pc(11) Class205 local11 = arg0.method7448();
		local11.GA(super.anInt8811, super.anInt8814, super.anInt8813);
		@Pc(26) Class4_Sub1 local26 = null;
		if (this.aBoolean402) {
			local26 = Static264.method4641(1);
		}
		this.aClass2_4.method5774(local11, local26 == null ? null : local26.aClass4_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!oa;Z)Lclient!lo;")
	private Class181 method5324(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class242 local19 = Static454.aClass298_3.method7185(this.aShort96 & 0xFFFF);
		@Pc(31) Class52 local31;
		@Pc(26) Class52 local26;
		if (this.aBoolean403) {
			local26 = Static163.aClass52Array4[0];
			local31 = Static238.aClass52Array2[this.aByte52];
		} else {
			local31 = Static163.aClass52Array4[this.aByte52];
			if (this.aByte52 < 3) {
				local26 = Static163.aClass52Array4[this.aByte52 + 1];
			} else {
				local26 = null;
			}
		}
		return local19.method5981(super.anInt8811, arg0, this.aByte54 == 11 ? this.aByte53 + 4 : this.aByte53, arg1, super.anInt8814, arg2, this.aByte54 == 11 ? 10 : this.aByte54, local26, super.anInt8813, local31);
	}
}
