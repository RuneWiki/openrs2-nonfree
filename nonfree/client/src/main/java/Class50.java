import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class50 implements Interface2 {

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "Lclient!ak;")
	private final Class13 aClass13_1 = new Class13(256);

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_16;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!lb;")
	private final Class221 aClass221_15;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	private final int anInt1235;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[Lclient!bl;")
	private final Class32[] aClass32Array1;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;)V")
	public Class50(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_16 = arg1;
		this.aClass221_15 = arg2;
		@Pc(24) Class3_Sub28 local24 = new Class3_Sub28(arg0.method5089(0, 0));
		this.anInt1235 = local24.method5272();
		this.aClass32Array1 = new Class32[this.anInt1235];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1235; local36++) {
			if (local24.method5322(-51) == 1) {
				this.aClass32Array1[local36] = new Class32();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1235; local61++) {
			if (this.aClass32Array1[local61] != null) {
				this.aClass32Array1[local61].aBoolean67 = local24.method5322(-22) == 0;
			}
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt1235; local97++) {
			if (this.aClass32Array1[local97] != null) {
				this.aClass32Array1[local97].aBoolean71 = local24.method5322(-51) == 1;
			}
		}
		for (@Pc(137) int local137 = 0; local137 < this.anInt1235; local137++) {
			if (this.aClass32Array1[local137] != null) {
				this.aClass32Array1[local137].aBoolean65 = local24.method5322(-10) == 1;
			}
		}
		for (@Pc(173) int local173 = 0; local173 < this.anInt1235; local173++) {
			if (this.aClass32Array1[local173] != null) {
				this.aClass32Array1[local173].aByte24 = local24.method5288();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt1235; local201++) {
			if (this.aClass32Array1[local201] != null) {
				this.aClass32Array1[local201].aByte20 = local24.method5288();
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.anInt1235; local229++) {
			if (this.aClass32Array1[local229] != null) {
				this.aClass32Array1[local229].aByte25 = local24.method5288();
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.anInt1235; local261++) {
			if (this.aClass32Array1[local261] != null) {
				this.aClass32Array1[local261].aByte19 = local24.method5288();
			}
		}
		for (@Pc(293) int local293 = 0; local293 < this.anInt1235; local293++) {
			if (this.aClass32Array1[local293] != null) {
				this.aClass32Array1[local293].aShort9 = (short) local24.method5272();
			}
		}
		for (@Pc(326) int local326 = 0; local326 < this.anInt1235; local326++) {
			if (this.aClass32Array1[local326] != null) {
				this.aClass32Array1[local326].aByte22 = local24.method5288();
			}
		}
		for (@Pc(354) int local354 = 0; local354 < this.anInt1235; local354++) {
			if (this.aClass32Array1[local354] != null) {
				this.aClass32Array1[local354].aByte23 = local24.method5288();
			}
		}
		for (@Pc(382) int local382 = 0; local382 < this.anInt1235; local382++) {
			if (this.aClass32Array1[local382] != null) {
				this.aClass32Array1[local382].aBoolean69 = local24.method5322(-69) == 1;
			}
		}
		for (@Pc(422) int local422 = 0; local422 < this.anInt1235; local422++) {
			if (this.aClass32Array1[local422] != null) {
				this.aClass32Array1[local422].aBoolean70 = local24.method5322(-83) == 1;
			}
		}
		for (@Pc(462) int local462 = 0; local462 < this.anInt1235; local462++) {
			if (this.aClass32Array1[local462] != null) {
				this.aClass32Array1[local462].aByte21 = local24.method5288();
			}
		}
		for (@Pc(494) int local494 = 0; local494 < this.anInt1235; local494++) {
			if (this.aClass32Array1[local494] != null) {
				this.aClass32Array1[local494].aBoolean68 = local24.method5322(-21) == 1;
			}
		}
		for (@Pc(530) int local530 = 0; local530 < this.anInt1235; local530++) {
			if (this.aClass32Array1[local530] != null) {
				this.aClass32Array1[local530].aBoolean64 = local24.method5322(-60) == 1;
			}
		}
		for (@Pc(568) int local568 = 0; local568 < this.anInt1235; local568++) {
			if (this.aClass32Array1[local568] != null) {
				this.aClass32Array1[local568].aBoolean66 = local24.method5322(-35) == 1;
			}
		}
		for (@Pc(602) int local602 = 0; local602 < this.anInt1235; local602++) {
			if (this.aClass32Array1[local602] != null) {
				this.aClass32Array1[local602].anInt865 = local24.method5322(-68);
			}
		}
		for (@Pc(634) int local634 = 0; local634 < this.anInt1235; local634++) {
			if (this.aClass32Array1[local634] != null) {
				this.aClass32Array1[local634].anInt862 = local24.method5312();
			}
		}
		for (@Pc(666) int local666 = 0; local666 < this.anInt1235; local666++) {
			if (this.aClass32Array1[local666] != null) {
				this.aClass32Array1[local666].anInt861 = local24.method5322(-61);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BFIZII)[I")
	@Override
	public int[] method1026(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1030(arg3).method135(this.aClass32Array1[arg3].aBoolean70, this.aClass221_15, (double) arg0, arg2, this, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
	@Override
	public int method1028() {
		return this.anInt1235;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)Lclient!ae;")
	private Class3_Sub4_Sub1 method1030(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4 local10 = this.aClass13_1.method324((long) arg0);
		if (local10 != null) {
			return (Class3_Sub4_Sub1) local10;
		}
		@Pc(22) byte[] local22 = this.aClass221_16.method5077(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(43) Class3_Sub4_Sub1 local43 = new Class3_Sub4_Sub1(new Class3_Sub28(local22));
			this.aClass13_1.method322(local43, (long) arg0);
			return local43;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1024(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub4_Sub1 local14 = this.method1030(arg0);
		return local14 != null && local14.method137(this, this.aClass221_15);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIFBIZ)[I")
	@Override
	public int[] method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method1030(arg3).method134(arg4, arg0, this.aClass221_15, arg1, this, this.aClass32Array1[arg3].aBoolean70, (double) arg2);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(FIIZII)[F")
	@Override
	public float[] method1029(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1030(arg3).method138(this, arg2, arg1, this.aClass221_15, this.aClass32Array1[arg3].aBoolean70);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lclient!bl;")
	@Override
	public Class32 method1027(@OriginalArg(1) int arg0) {
		return this.aClass32Array1[arg0];
	}
}
