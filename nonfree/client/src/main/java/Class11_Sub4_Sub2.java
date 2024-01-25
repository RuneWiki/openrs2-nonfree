import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class11_Sub4_Sub2 extends Class11_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!gba", name = "K", descriptor = "Lclient!gr;")
	private Class122 aClass122_4;

	@OriginalMember(owner = "client!gba", name = "L", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "Z")
	private final boolean aBoolean304;

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "B")
	private final byte aByte37;

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!gba", name = "J", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!gba", name = "s", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!gba", name = "I", descriptor = "Z")
	private final boolean aBoolean305;

	@OriginalMember(owner = "client!gba", name = "M", descriptor = "Z")
	private final boolean aBoolean307;

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "Lclient!ba;")
	public Class23 aClass23_4;

	@OriginalMember(owner = "client!gba", name = "C", descriptor = "Lclient!w;")
	private Class6_Sub4_Sub2 aClass6_Sub4_Sub2_4;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIZIIZ)V")
	public Class11_Sub4_Sub2(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static60.method1325(arg7, arg8));
		this.aShort33 = (short) arg1.anInt1060;
		this.aBoolean304 = arg6;
		super.anInt5485 = arg5;
		this.aByte37 = (byte) arg7;
		this.aByte39 = (byte) arg8;
		this.aBoolean306 = arg9;
		this.aByte38 = (byte) arg2;
		super.anInt5484 = arg3;
		this.aBoolean305 = arg1.anInt1107 != 0 && !arg6;
		this.aBoolean307 = arg0.method5452() && arg1.aBoolean93 && !this.aBoolean304 && Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean306) {
			local71 |= 0x10000;
		}
		@Pc(86) Class20 local86 = this.method3272(local71, this.aBoolean307, arg0);
		if (local86 != null) {
			this.aClass23_4 = local86.aClass23_1;
			this.aClass6_Sub4_Sub2_4 = local86.aClass6_Sub4_Sub2_1;
			if (this.aBoolean306) {
				this.aClass23_4 = this.aClass23_4.method7068((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method3270(arg1, arg0);
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	private Class23 method3270(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass23_4 != null && arg0.method5468(this.aClass23_4.h(), arg1) == 0) {
			return this.aClass23_4;
		} else {
			@Pc(28) Class20 local28 = this.method3272(arg1, false, arg0);
			return local28 == null ? null : local28.aClass23_1;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class23 local15 = this.method3270(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class8 local20 = arg1.method5417();
			local20.GA(super.anInt5484, super.anInt5483, super.anInt5485);
			return local15.method7073(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return this.aBoolean306;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		@Pc(25) Class6_Sub4_Sub2 local25;
		if (this.aClass6_Sub4_Sub2_4 == null && this.aBoolean307) {
			@Pc(18) Class20 local18 = this.method3272(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass6_Sub4_Sub2_1;
		} else {
			local25 = this.aClass6_Sub4_Sub2_4;
			this.aClass6_Sub4_Sub2_4 = null;
		}
		if (local25 != null) {
			Static217.method3472(local25, this.aByte38, super.anInt5484, super.anInt5485, null);
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		if (this.aClass23_4 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method5417();
		local11.GA(super.anInt5484, super.anInt5483, super.anInt5485);
		@Pc(21) Class5_Sub5 local21 = null;
		if (this.aBoolean305) {
			local21 = Static342.method5386(1);
		}
		this.aClass23_4.method7077(local11, local21 == null ? null : local21.aClass5_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return this.aByte37;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aBoolean307;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		@Pc(14) Class6_Sub4_Sub2 local14;
		if (this.aClass6_Sub4_Sub2_4 == null && this.aBoolean307) {
			@Pc(25) Class20 local25 = this.method3272(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub4_Sub2_1;
		} else {
			local14 = this.aClass6_Sub4_Sub2_4;
			this.aClass6_Sub4_Sub2_4 = null;
		}
		if (local14 != null) {
			Static279.method4617(local14, this.aByte38, super.anInt5484, super.anInt5485, null);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		if (arg4 instanceof Class11_Sub4_Sub2) {
			@Pc(37) Class11_Sub4_Sub2 local37 = (Class11_Sub4_Sub2) arg4;
			if (this.aClass23_4 == null || local37.aClass23_4 == null) {
				return;
			}
			this.aClass23_4.method7072(local37.aClass23_4, arg3, arg1, arg2, arg0);
		} else if (arg4 instanceof Class11_Sub1_Sub3) {
			@Pc(18) Class11_Sub1_Sub3 local18 = (Class11_Sub1_Sub3) arg4;
			if (this.aClass23_4 != null && local18.aClass23_5 != null) {
				this.aClass23_4.method7072(local18.aClass23_5, arg3, arg1, arg2, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZBLclient!oa;)Lclient!au;")
	private Class20 method3272(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(21) Class31 local21 = Static480.aClass57_11.method1469(this.aShort33 & 0xFFFF);
		@Pc(33) Class62 local33;
		@Pc(28) Class62 local28;
		if (this.aBoolean304) {
			local28 = Static53.aClass62Array2[0];
			local33 = Static369.aClass62Array3[this.aByte38];
		} else {
			local33 = Static53.aClass62Array2[this.aByte38];
			if (this.aByte38 >= 3) {
				local28 = null;
			} else {
				local28 = Static53.aClass62Array2[this.aByte38 + 1];
			}
		}
		return local21.method1022(arg2, local33, super.anInt5485, super.anInt5483, this.aByte39, super.anInt5484, arg1, arg0, this.aByte37, local28);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
		if (this.aClass23_4 != null) {
			this.aClass23_4.method7069();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		if (this.aClass122_4 == null) {
			this.aClass122_4 = Static73.method1560(super.anInt5484, this.method3270(arg0, 0), super.anInt5485, super.anInt5483);
		}
		return this.aClass122_4;
	}

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		this.aBoolean306 = false;
		if (this.aClass23_4 != null) {
			this.aClass23_4.ia(this.aClass23_4.h() & 0xFFFEFFFF);
		}
	}
}
