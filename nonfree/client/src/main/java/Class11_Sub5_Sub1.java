import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class11_Sub5_Sub1 extends Class11_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Lclient!gr;")
	private Class122 aClass122_3;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "S")
	private final short aShort31;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "Z")
	private final boolean aBoolean214;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "Lclient!w;")
	private Class6_Sub4_Sub2 aClass6_Sub4_Sub2_3;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!ba;")
	private Class23 aClass23_3;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIZIZ)V")
	public Class11_Sub5_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt1110, arg1.aBoolean96, arg1.aBoolean86);
		this.aShort31 = (short) arg1.anInt1060;
		this.aBoolean213 = arg8;
		this.aBoolean214 = arg1.anInt1107 != 0 && !arg6;
		this.aBoolean212 = arg6;
		this.aByte32 = (byte) arg7;
		super.anInt9740 = arg5;
		this.aByte31 = (byte) arg2;
		super.anInt9744 = arg3;
		this.aBoolean211 = arg0.method5452() && arg1.aBoolean93 && !this.aBoolean212 && Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean213) {
			local69 |= 0x10000;
		}
		@Pc(84) Class20 local84 = this.method2275(this.aBoolean211, arg0, local69);
		if (local84 != null) {
			this.aClass6_Sub4_Sub2_3 = local84.aClass6_Sub4_Sub2_1;
			this.aClass23_3 = local84.aClass23_1;
			if (this.aBoolean213) {
				this.aClass23_3 = this.aClass23_3.method7068((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aBoolean211;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		if (this.aClass23_3 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method5417();
		local11.GA(super.anInt9744, super.anInt9742, super.anInt9740);
		@Pc(21) Class5_Sub5 local21 = null;
		if (this.aBoolean214) {
			local21 = Static342.method5386(1);
		}
		this.aClass23_3.method7077(local11, local21 == null ? null : local21.aClass5_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		@Pc(14) Class6_Sub4_Sub2 local14;
		if (this.aClass6_Sub4_Sub2_3 == null && this.aBoolean211) {
			@Pc(25) Class20 local25 = this.method2275(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass6_Sub4_Sub2_1;
		} else {
			local14 = this.aClass6_Sub4_Sub2_3;
			this.aClass6_Sub4_Sub2_3 = null;
		}
		if (local14 != null) {
			Static279.method4617(local14, this.aByte31, super.anInt9744, super.anInt9740, null);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		if (this.aClass122_3 == null) {
			this.aClass122_3 = Static73.method1560(super.anInt9744, this.method2278(arg0, 0), super.anInt9740, super.anInt9742);
		}
		return this.aClass122_3;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLclient!oa;I)Lclient!au;")
	private Class20 method2275(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class31 local13 = Static480.aClass57_11.method1469(this.aShort31 & 0xFFFF);
		@Pc(32) Class62 local32;
		@Pc(27) Class62 local27;
		if (this.aBoolean212) {
			local27 = Static53.aClass62Array2[0];
			local32 = Static369.aClass62Array3[this.aByte31];
		} else {
			if (this.aByte31 >= 3) {
				local27 = null;
			} else {
				local27 = Static53.aClass62Array2[this.aByte31 + 1];
			}
			local32 = Static53.aClass62Array2[this.aByte31];
		}
		return local13.method1022(arg1, local32, super.anInt9740, super.anInt9742, this.aByte32, super.anInt9744, arg0, arg2, 22, local27);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
		if (this.aClass23_3 != null) {
			this.aClass23_3.method7069();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return 22;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		@Pc(18) Class6_Sub4_Sub2 local18;
		if (this.aClass6_Sub4_Sub2_3 == null && this.aBoolean211) {
			@Pc(29) Class20 local29 = this.method2275(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass6_Sub4_Sub2_1;
		} else {
			local18 = this.aClass6_Sub4_Sub2_3;
			this.aClass6_Sub4_Sub2_3 = null;
		}
		if (local18 != null) {
			Static217.method3472(local18, this.aByte31, super.anInt9744, super.anInt9740, null);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method2278(arg1, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		this.aBoolean213 = false;
		if (this.aClass23_3 != null) {
			this.aClass23_3.ia(this.aClass23_3.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!oa;ZI)Lclient!ba;")
	private Class23 method2278(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass23_3 != null && arg0.method5468(this.aClass23_3.h(), arg1) == 0) {
			return this.aClass23_3;
		} else {
			@Pc(35) Class20 local35 = this.method2275(false, arg0, arg1);
			return local35 == null ? null : local35.aClass23_1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class23 local14 = this.method2278(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class8 local19 = arg1.method5417();
			local19.GA(super.anInt9744, super.anInt9742, super.anInt9740);
			return local14.method7073(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		if (!(arg4 instanceof Class11_Sub5_Sub1)) {
			return;
		}
		@Pc(13) Class11_Sub5_Sub1 local13 = (Class11_Sub5_Sub1) arg4;
		if (this.aClass23_3 != null && local13.aClass23_3 != null) {
			this.aClass23_3.method7072(local13.aClass23_3, arg3, arg1, arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aShort31 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aByte32;
	}
}
