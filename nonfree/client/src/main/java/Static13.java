import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	public static int anInt329;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	public static int anInt321 = 0;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
	public static int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public static volatile int anInt326 = 0;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
	public static int[] anIntArray15 = new int[128];

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public static int anInt330 = 0;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Lclient!ia;")
	private static Class51 aClass51_110 = Static64.method1101("Loaded update list");

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!ia;")
	public static Class51 aClass51_109 = aClass51_110;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method265() {
		if (Static32.aClass113_1 == null) {
			return;
		}
		try {
			@Pc(18) byte[] local18 = Static32.aClass113_1.method3303();
			if (local18 != null) {
				@Pc(25) Class1_Sub16 local25 = new Class1_Sub16(local18);
				Static39.anInt966 = local25.method3805();
				Static48.aClass48Array1 = new Class48[Static39.anInt966];
				for (@Pc(34) int local34 = 0; local34 < Static39.anInt966; local34++) {
					@Pc(44) Class48 local44 = Static48.aClass48Array1[local34] = new Class48();
					@Pc(48) int local48 = local25.method3805();
					local44.aBoolean81 = (local48 & 0x8000) != 0;
					local44.anInt1788 = local48 & 0x7FFF;
					local44.aClass51_602 = local25.method3781();
					local44.anInt1779 = local25.method3817();
					local44.anInt1783 = local34;
					local44.anInt1777 = Static19.method3357(local25.method3805());
				}
				Static181.method3049(0, Static48.aClass48Array1.length - 1, Static48.aClass48Array1);
				Static32.aClass113_1 = null;
			}
		} catch (@Pc(102) Exception local102) {
			local102.printStackTrace();
			Static32.aClass113_1 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILclient!k;IIIZI)V")
	public static void method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(8) int arg6) {
		@Pc(31) int local31;
		if (arg2 < 0 || arg2 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local31 = arg3.method3793();
				if (local31 == 0) {
					break;
				}
				if (local31 == 1) {
					arg3.method3793();
					break;
				}
				if (local31 <= 49) {
					arg3.method3793();
				}
			}
			return;
		}
		Static150.aByteArrayArrayArray9[arg1][arg2][arg0] = 0;
		while (true) {
			local31 = arg3.method3793();
			if (local31 == 0) {
				if (arg1 == 0) {
					Static20.anIntArrayArrayArray2[0][arg2][arg0] = -Static197.method1853(arg2 + arg5 + 932731, arg6 + (556238 - -arg0)) * 8;
				} else {
					Static20.anIntArrayArrayArray2[arg1][arg2][arg0] = Static20.anIntArrayArrayArray2[arg1 - 1][arg2][arg0] - 240;
				}
				break;
			}
			if (local31 == 1) {
				@Pc(112) int local112 = arg3.method3793();
				if (local112 == 1) {
					local112 = 0;
				}
				if (arg1 == 0) {
					Static20.anIntArrayArrayArray2[0][arg2][arg0] = -local112 * 8;
				} else {
					Static20.anIntArrayArrayArray2[arg1][arg2][arg0] = Static20.anIntArrayArrayArray2[arg1 - 1][arg2][arg0] - local112 * 8;
				}
				break;
			}
			if (local31 <= 49) {
				Static229.aByteArrayArrayArray15[arg1][arg2][arg0] = arg3.method3802();
				Static11.aByteArrayArrayArray2[arg1][arg2][arg0] = (byte) ((local31 - 2) / 4);
				Static113.aByteArrayArrayArray8[arg1][arg2][arg0] = (byte) (arg4 + local31 - 2 & 0x3);
			} else if (local31 <= 81) {
				Static150.aByteArrayArrayArray9[arg1][arg2][arg0] = (byte) (local31 - 49);
			} else {
				Static15.aByteArrayArrayArray3[arg1][arg2][arg0] = (byte) (local31 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLclient!mb;)V")
	public static void method267(@OriginalArg(1) Class70 arg0) {
		Static200.anInt4254 = arg0.method3523(Static20.aClass51_180);
		Static33.anInt785 = arg0.method3523(Static147.aClass51_1128);
		Static37.anInt895 = arg0.method3523(Static9.aClass51_59);
		Static182.anInt3969 = arg0.method3523(Static210.aClass51_1554);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Lclient!te;")
	public static Class1_Sub2_Sub1 method268() {
		@Pc(9) int local9 = Static89.anIntArray85[0] * Static51.anIntArray72[0];
		@Pc(17) byte[] local17 = Static73.aByteArrayArray4[0];
		@Pc(20) int[] local20 = new int[local9];
		for (@Pc(22) int local22 = 0; local22 < local9; local22++) {
			local20[local22] = Static52.anIntArray74[local17[local22] & 0xFF];
		}
		@Pc(61) Class1_Sub2_Sub1_Sub1 local61 = new Class1_Sub2_Sub1_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[0], Static152.anIntArray225[0], Static51.anIntArray72[0], Static89.anIntArray85[0], local20);
		Static134.method2401();
		return local61;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Lclient!ve;")
	public static Class119 method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class119 local14 = local7.aClass119_1;
			local7.aClass119_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)Z")
	public static boolean method276() {
		@Pc(5) Class22 local5 = Static188.aClass22_1;
		synchronized (Static188.aClass22_1) {
			if (Static193.anInt4185 == Static39.anInt968) {
				return false;
			} else {
				Static16.anInt385 = Static68.anIntArray101[Static39.anInt968];
				Static199.anInt4229 = Static221.anIntArray362[Static39.anInt968];
				Static39.anInt968 = Static39.anInt968 + 1 & 0x7F;
				return true;
			}
		}
	}
}
