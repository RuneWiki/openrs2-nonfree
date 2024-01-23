import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt3388;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray33 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_895 = Static231.method3737("Hidden)2");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_896 = Static231.method3737(")1p");

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!hd;")
	public static Class50 aClass50_18 = new Class50(8);

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public static int anInt3399 = 0;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
	public static int[] anIntArray297 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)Z")
	public static boolean method2514(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)I")
	public static int method2515(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(21) Class1_Sub20 local21 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg0);
		if (local21 == null) {
			return Static11.method315(arg0).anInt109;
		}
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local21.anIntArray264.length; local32++) {
			if (local21.anIntArray264[local32] == -1) {
				local30++;
			}
		}
		return local30 + Static11.method315(arg0).anInt109 - local21.anIntArray264.length;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(IZ)V")
	public static void method2516(@OriginalArg(1) boolean arg0) {
		Static36.method706(Static158.anInt3484, Static77.anInt1732, arg0, Static180.anInt4990);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!vf;I)Lclient!sc;")
	public static Class107 method2517(@OriginalArg(1) Class1_Sub26 arg0) {
		try {
			@Pc(7) Class107 local7 = new Class107();
			local7.anInt4186 = arg0.method2946();
			if (local7.anInt4186 > 32767) {
				local7.anInt4186 = 32767;
			}
			local7.aByteArray55 = new byte[local7.anInt4186];
			arg0.anInt4021 += Static93.aClass17_2.method397(local7.anInt4186, local7.aByteArray55, 0, arg0.aByteArray52, arg0.anInt4021);
			return local7;
		} catch (@Pc(49) Exception local49) {
			return Static229.aClass107_1343;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method2519() {
		Static186.aClass64Array7 = null;
		Static168.aClass64Array6 = null;
		Static221.aClass1_Sub2_Sub2Array11 = null;
		Static120.aClass64Array3 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLclient!ej;)V")
	public static void method2520(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class34 arg1) {
		if (arg0) {
			Static27.anInt523 = 3;
			Static27.method477(false);
			Static112.anInt2482 = 0;
			Static182.aBoolean362 = false;
			Static91.anInt1982 = 127;
			Static90.anInt1961 = 127;
			Static85.anInt1851 = 0;
			Static142.aBoolean266 = false;
			Static224.aBoolean434 = false;
			Static73.aBoolean151 = false;
			Static96.anInt2088 = 0;
			Static163.aBoolean316 = false;
			Static156.aBoolean301 = false;
			Static100.aBoolean195 = false;
			Static83.anInt1786 = 0;
			Static14.aBoolean30 = false;
			Static153.aBoolean296 = false;
			Static163.aBoolean317 = false;
			Static157.anInt3449 = 255;
			Static169.aBoolean326 = false;
			Static179.aBoolean357 = false;
			Static35.method697(arg1);
			return;
		}
		Static27.anInt523 = 3;
		Static27.method477(true);
		Static73.aBoolean151 = true;
		Static156.aBoolean301 = true;
		Static169.aBoolean326 = true;
		Static100.aBoolean195 = true;
		Static85.anInt1851 = 2;
		Static153.aBoolean296 = true;
		Static163.aBoolean316 = true;
		Static91.anInt1982 = 127;
		Static163.aBoolean317 = true;
		Static224.aBoolean434 = true;
		Static157.anInt3449 = 255;
		Static182.aBoolean362 = true;
		Static179.aBoolean357 = true;
		Static83.anInt1786 = 0;
		Static96.anInt2088 = 0;
		Static112.anInt2482 = 0;
		@Pc(51) Class39 local51 = null;
		Static14.aBoolean30 = true;
		Static142.aBoolean266 = true;
		Static90.anInt1961 = 127;
		try {
			@Pc(62) Class84 local62 = arg1.method1060("runescape");
			while (local62.anInt3171 == 0) {
				Static148.method2431(1L);
			}
			if (local62.anInt3171 == 1) {
				local51 = (Class39) local62.anObject4;
				@Pc(87) byte[] local87 = new byte[(int) local51.method1202()];
				@Pc(102) int local102;
				for (@Pc(89) int local89 = 0; local89 < local87.length; local89 += local102) {
					local102 = local51.method1198(local87.length - local89, local87, local89);
					if (local102 == -1) {
						throw new IOException("EOF");
					}
				}
				Static183.method3037(new Class1_Sub26(local87));
			}
		} catch (@Pc(131) Exception local131) {
		}
		try {
			if (local51 != null) {
				local51.method1200();
				return;
			}
		} catch (@Pc(138) Exception local138) {
			return;
		}
	}
}
