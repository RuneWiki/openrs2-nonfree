import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class11_Sub1_Sub3 extends Class11_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "Lclient!gr;")
	private Class122 aClass122_5;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "Z")
	private boolean aBoolean347;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "S")
	private final short aShort41;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "Z")
	private final boolean aBoolean346;

	@OriginalMember(owner = "client!hj", name = "eb", descriptor = "Z")
	private final boolean aBoolean348;

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "Lclient!ba;")
	public Class23 aClass23_5;

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "Lclient!w;")
	private Class6_Sub4_Sub2 aClass6_Sub4_Sub2_5;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIIZIIIIIIZ)V")
	public Class11_Sub1_Sub3(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1103 == 1, Static206.method3812(arg12, arg13));
		this.aByte45 = (byte) arg13;
		this.aByte43 = (byte) arg3;
		this.aByte44 = (byte) arg12;
		this.aBoolean347 = arg14;
		this.aShort41 = (short) arg1.anInt1060;
		this.aBoolean346 = arg7;
		this.aBoolean348 = arg1.anInt1107 != 0 && !arg7;
		this.aBoolean345 = arg0.method5452() && arg1.aBoolean93 && !this.aBoolean346 && Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145) != 0;
		@Pc(76) int local76 = 2048;
		if (this.aBoolean347) {
			local76 |= 0x10000;
		}
		@Pc(91) Class20 local91 = this.method3761(this.aBoolean345, arg0, local76);
		if (local91 != null) {
			this.aClass23_5 = local91.aClass23_1;
			this.aClass6_Sub4_Sub2_5 = local91.aClass6_Sub4_Sub2_1;
			if (this.aBoolean347) {
				this.aClass23_5 = this.aClass23_5.method7068((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)I")
	@Override
	public int method6199() {
		return this.aClass23_5 == null ? 0 : this.aClass23_5.DA();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		if (this.aClass122_5 == null) {
			this.aClass122_5 = Static73.method1560(super.anInt7347, this.method3759(0, arg0), super.anInt7351, super.anInt7350);
		}
		return this.aClass122_5;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return this.aBoolean347;
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)I")
	public int method3758() {
		return this.aClass23_5 == null ? 15 : this.aClass23_5.ZA() / 4;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IILclient!oa;)Lclient!ba;")
	private Class23 method3759(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		if (this.aClass23_5 != null && arg1.method5468(this.aClass23_5.h(), arg0) == 0) {
			return this.aClass23_5;
		} else {
			@Pc(31) Class20 local31 = this.method3761(false, arg1, arg0);
			return local31 == null ? null : local31.aClass23_1;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		@Pc(21) Class6_Sub4_Sub2 local21;
		if (this.aClass6_Sub4_Sub2_5 == null && this.aBoolean345) {
			@Pc(32) Class20 local32 = this.method3761(true, arg0, 262144);
			local21 = local32 == null ? null : local32.aClass6_Sub4_Sub2_1;
		} else {
			local21 = this.aClass6_Sub4_Sub2_5;
			this.aClass6_Sub4_Sub2_5 = null;
		}
		if (local21 != null) {
			Static279.method4617(local21, this.aByte43, super.anInt7347, super.anInt7351, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method3759(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aShort41 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class23 local9 = this.method3759(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class8 local20 = arg1.method5417();
			local20.GA(super.anInt7347, super.anInt7350, super.anInt7351);
			return local9.method7073(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		@Pc(29) Class6_Sub4_Sub2 local29;
		if (this.aClass6_Sub4_Sub2_5 == null && this.aBoolean345) {
			@Pc(22) Class20 local22 = this.method3761(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass6_Sub4_Sub2_1;
		} else {
			local29 = this.aClass6_Sub4_Sub2_5;
			this.aClass6_Sub4_Sub2_5 = null;
		}
		if (local29 != null) {
			Static217.method3472(local29, this.aByte43, super.anInt7347, super.anInt7351, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aBoolean345;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		if (arg4 instanceof Class11_Sub4_Sub2) {
			@Pc(5) Class11_Sub4_Sub2 local5 = (Class11_Sub4_Sub2) arg4;
			if (this.aClass23_5 != null && local5.aClass23_4 != null) {
				this.aClass23_5.method7072(local5.aClass23_4, arg3, arg1, arg2, arg0);
			}
		} else if (arg4 instanceof Class11_Sub1_Sub3) {
			@Pc(28) Class11_Sub1_Sub3 local28 = (Class11_Sub1_Sub3) arg4;
			if (this.aClass23_5 != null && local28.aClass23_5 != null) {
				this.aClass23_5.method7072(local28.aClass23_5, arg3, arg1, arg2, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		if (this.aClass23_5 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method5417();
		local11.GA(super.anInt7347, super.anInt7350, super.anInt7351);
		@Pc(21) Class5_Sub5 local21 = null;
		if (this.aBoolean348) {
			local21 = Static342.method5386(1);
		}
		this.aClass23_5.method7077(local11, local21 == null ? null : local21.aClass5_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
		if (this.aClass23_5 != null) {
			this.aClass23_5.method7069();
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		this.aBoolean347 = false;
		if (this.aClass23_5 != null) {
			this.aClass23_5.ia(this.aClass23_5.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLclient!oa;II)Lclient!au;")
	private Class20 method3761(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class31 local18 = Static480.aClass57_11.method1469(this.aShort41 & 0xFFFF);
		@Pc(26) Class62 local26;
		@Pc(30) Class62 local30;
		if (this.aBoolean346) {
			local26 = Static369.aClass62Array3[this.aByte43];
			local30 = Static53.aClass62Array2[0];
		} else {
			local26 = Static53.aClass62Array2[this.aByte43];
			if (this.aByte43 >= 3) {
				local30 = null;
			} else {
				local30 = Static53.aClass62Array2[this.aByte43 + 1];
			}
		}
		return local18.method1022(arg1, local26, super.anInt7351, super.anInt7350, this.aByte44 == 11 ? this.aByte45 + 4 : this.aByte45, super.anInt7347, arg0, arg2, this.aByte44 == 11 ? 10 : this.aByte44, local30);
	}
}
