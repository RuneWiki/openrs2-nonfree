import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "Lclient!c;")
	public static Class31 aClass31_2;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	public static int anInt4590 = 10;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
	public static int anInt4615 = -1;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "Lclient!sl;")
	private static final Class215 aClass215_51 = new Class215(26, 7);

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_52 = new Class215(68, 3);

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	public static void method3609() {
		Static182.aClass68_19.method1777();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!qm;IZ)V")
	public static void method3617(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub39 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null || arg1 == Static206.aClass183_28.aClass4_207) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt5696;
		@Pc(18) int local18 = arg1.anInt5697;
		@Pc(21) int local21 = arg1.anInt5699;
		@Pc(25) int local25 = (int) arg1.aLong192;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg1.aLong192;
		if (local21 == 1004 || local21 == 1012 || local21 == 1008 || local21 == 1001 || local21 == 1006) {
			Static382.method5043(local21, local15, local25);
		}
		if (local21 == 45) {
			Static14.anInt191 = arg2;
			Static205.anInt3911 = arg0;
			Static85.anInt1764 = 2;
			Static216.anInt4014 = 0;
			Static429.method5476(Static309.aClass215_68);
			Static3.aClass4_Sub12_Sub1_5.method2505(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2505(Static86.anInt1771 + local18);
			Static3.aClass4_Sub12_Sub1_5.method2496(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static443.method5589(local32, local15, local18);
		}
		@Pc(120) Class16_Sub1_Sub5_Sub1 local120;
		if (local21 == 10) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static85.anInt1764 = 2;
				Static205.anInt3911 = arg0;
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static216.aClass215_43);
				Static3.aClass4_Sub12_Sub1_5.method2496(local25);
				Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		@Pc(180) Class16_Sub1_Sub5_Sub2 local180;
		if (local21 == 15) {
			local180 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local25];
			if (local180 != null) {
				Static216.anInt4014 = 0;
				Static85.anInt1764 = 2;
				Static205.anInt3911 = arg0;
				Static14.anInt191 = arg2;
				Static429.method5476(Static203.aClass215_40);
				Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2524(local25);
				Static166.method2734(0, local180.anIntArray427[0], local180.anIntArray426[0], local180.method4751(), true, local180.method4751(), 0, -2);
			}
		}
		if (local21 == 46) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static85.anInt1764 = 2;
				Static205.anInt3911 = arg0;
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static339.aClass215_80);
				Static3.aClass4_Sub12_Sub1_5.method2513(Static408.anInt6726);
				Static3.aClass4_Sub12_Sub1_5.method2496(local25);
				Static3.aClass4_Sub12_Sub1_5.method2524(Static161.anInt3179);
				Static3.aClass4_Sub12_Sub1_5.method2524(Static23.anInt350);
				Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 6) {
			Static205.anInt3911 = arg0;
			Static85.anInt1764 = 2;
			Static216.anInt4014 = 0;
			Static14.anInt191 = arg2;
			Static429.method5476(Static330.aClass215_77);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2513(Static408.anInt6726);
			Static3.aClass4_Sub12_Sub1_5.method2496(Static86.anInt1771 + local18);
			Static3.aClass4_Sub12_Sub1_5.method2505(local25);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static161.anInt3179);
			Static3.aClass4_Sub12_Sub1_5.method2494(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2494(Static23.anInt350);
			Static95.method1664(local15, local18);
		}
		if (local21 == 59) {
			if (Static104.anInt2252 > 0 && Static384.aClass244_1.method5489(82) && Static384.aClass244_1.method5489(81)) {
				Static200.method3168(Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, Static86.anInt1771 + local18, local15 + Static180.anInt3453);
			} else {
				Static205.anInt3911 = arg0;
				Static85.anInt1764 = 1;
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static173.aClass215_38);
				Static3.aClass4_Sub12_Sub1_5.method2505(local15 + Static180.anInt3453);
				Static3.aClass4_Sub12_Sub1_5.method2496(local18 + Static86.anInt1771);
			}
		}
		if (local21 == 58) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static205.anInt3911 = arg0;
				Static14.anInt191 = arg2;
				Static85.anInt1764 = 2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static111.aClass215_28);
				Static3.aClass4_Sub12_Sub1_5.method2505(local25);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 8) {
			Static216.anInt4014 = 0;
			Static85.anInt1764 = 2;
			Static14.anInt191 = arg2;
			Static205.anInt3911 = arg0;
			Static429.method5476(Static339.aClass215_80);
			Static3.aClass4_Sub12_Sub1_5.method2513(Static408.anInt6726);
			Static3.aClass4_Sub12_Sub1_5.method2496(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6037);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static161.anInt3179);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static23.anInt350);
			Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
		}
		if (local21 == 21) {
			local180 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local25];
			if (local180 != null) {
				Static205.anInt3911 = arg0;
				Static85.anInt1764 = 2;
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static266.aClass215_61);
				Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2494(local25);
				Static166.method2734(0, local180.anIntArray427[0], local180.anIntArray426[0], local180.method4751(), true, local180.method4751(), 0, -2);
			}
		}
		if (local21 == 23) {
			Static85.anInt1764 = 2;
			Static205.anInt3911 = arg0;
			Static216.anInt4014 = 0;
			Static14.anInt191 = arg2;
			Static429.method5476(Static455.aClass215_73);
			Static3.aClass4_Sub12_Sub1_5.method2494(Static180.anInt3453 + local15);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static86.anInt1771 + local18);
			Static3.aClass4_Sub12_Sub1_5.method2496(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static443.method5589(local32, local15, local18);
		}
		if (local21 == 25) {
			Static216.anInt4014 = 0;
			Static205.anInt3911 = arg0;
			Static14.anInt191 = arg2;
			Static85.anInt1764 = 2;
			Static429.method5476(Static331.aClass215_78);
			Static3.aClass4_Sub12_Sub1_5.method2496(local18 + Static86.anInt1771);
			Static3.aClass4_Sub12_Sub1_5.method2505((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static3.aClass4_Sub12_Sub1_5.method2496(Static180.anInt3453 + local15);
			Static3.aClass4_Sub12_Sub1_5.method2533(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static443.method5589(local32, local15, local18);
		}
		if (local21 == 49) {
			Static205.anInt3911 = arg0;
			Static216.anInt4014 = 0;
			Static85.anInt1764 = 2;
			Static14.anInt191 = arg2;
			Static429.method5476(Static455.aClass215_72);
			Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static86.anInt1771 + local18);
			Static3.aClass4_Sub12_Sub1_5.method2494(local25);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static180.anInt3453 + local15);
			Static95.method1664(local15, local18);
		}
		if (local21 == 1007) {
			Static205.anInt3911 = arg0;
			Static216.anInt4014 = 0;
			Static14.anInt191 = arg2;
			Static85.anInt1764 = 2;
			Static429.method5476(Static326.aClass215_75);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2494(local18 + Static86.anInt1771);
			Static3.aClass4_Sub12_Sub1_5.method2505(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static3.aClass4_Sub12_Sub1_5.method2524(local15 + Static180.anInt3453);
			Static443.method5589(local32, local15, local18);
		}
		if (local21 == 16) {
			Static205.anInt3911 = arg0;
			Static216.anInt4014 = 0;
			Static14.anInt191 = arg2;
			Static85.anInt1764 = 2;
			Static429.method5476(Static94.aClass215_21);
			Static3.aClass4_Sub12_Sub1_5.method2505(local25);
			Static3.aClass4_Sub12_Sub1_5.method2533(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static180.anInt3453 + local15);
			Static3.aClass4_Sub12_Sub1_5.method2496(local18 + Static86.anInt1771);
			Static95.method1664(local15, local18);
		}
		if (local21 == 60 && Static304.aClass247_16 == null) {
			Static92.method1617(local18, local15);
			Static304.aClass247_16 = Static378.method3230(local18, local15);
			Static63.method1142(Static304.aClass247_16);
		}
		@Pc(895) Class247 local895;
		if (local21 == 9) {
			local895 = Static378.method3230(local18, local15);
			if (local895 != null) {
				Static336.method5139();
				@Pc(902) Class4_Sub33 local902 = Static53.method900(local895);
				Static286.method3975(local902.anInt5110, local902.method3911(), local895);
				Static388.aString62 = Static329.method4431(local895);
				if (Static388.aString62 == null) {
					Static388.aString62 = "Null";
				}
				Static49.aString28 = local895.aString66 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 12) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static205.anInt3911 = arg0;
				Static85.anInt1764 = 2;
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static130.aClass215_34);
				Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2496(local25);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 57) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static205.anInt3911 = arg0;
				Static85.anInt1764 = 2;
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static122.aClass215_32);
				Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2505(local25);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 30) {
			Static85.anInt1764 = 2;
			Static205.anInt3911 = arg0;
			Static14.anInt191 = arg2;
			Static216.anInt4014 = 0;
			Static429.method5476(Static248.aClass215_53);
			Static3.aClass4_Sub12_Sub1_5.method2505(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2513(Static408.anInt6726);
			Static3.aClass4_Sub12_Sub1_5.method2505(Static23.anInt350);
			Static3.aClass4_Sub12_Sub1_5.method2505(Static161.anInt3179);
			Static3.aClass4_Sub12_Sub1_5.method2533(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static86.anInt1771 + local18);
			Static3.aClass4_Sub12_Sub1_5.method2496(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static443.method5589(local32, local15, local18);
		}
		if (local21 == 19) {
			Static14.anInt191 = arg2;
			Static205.anInt3911 = arg0;
			Static85.anInt1764 = 1;
			Static216.anInt4014 = 0;
			Static429.method5476(Static228.aClass215_29);
			Static3.aClass4_Sub12_Sub1_5.method2505(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2513(Static408.anInt6726);
			Static3.aClass4_Sub12_Sub1_5.method2505(Static161.anInt3179);
			Static3.aClass4_Sub12_Sub1_5.method2505(Static23.anInt350);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static86.anInt1771 + local18);
			Static166.method2734(0, local18, local15, 1, true, 1, 0, -4);
		}
		if (local21 == 47) {
			local895 = Static378.method3230(local18, local15);
			if (local895 != null) {
				Static207.method4182(local895);
			}
		}
		if (local21 == 50) {
			local180 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local25];
			if (local180 != null) {
				Static14.anInt191 = arg2;
				Static205.anInt3911 = arg0;
				Static216.anInt4014 = 0;
				Static85.anInt1764 = 2;
				Static429.method5476(Static265.aClass215_60);
				Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2496(local25);
				Static166.method2734(0, local180.anIntArray427[0], local180.anIntArray426[0], local180.method4751(), true, local180.method4751(), 0, -2);
			}
		}
		if (local21 == 5) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static85.anInt1764 = 2;
				Static205.anInt3911 = arg0;
				Static216.anInt4014 = 0;
				Static14.anInt191 = arg2;
				Static429.method5476(Static82.aClass215_18);
				Static3.aClass4_Sub12_Sub1_5.method2496(local25);
				Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 22) {
			local180 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local25];
			if (local180 != null) {
				Static216.anInt4014 = 0;
				Static14.anInt191 = arg2;
				Static85.anInt1764 = 2;
				Static205.anInt3911 = arg0;
				Static429.method5476(Static257.aClass215_58);
				Static3.aClass4_Sub12_Sub1_5.method2505(local25);
				Static3.aClass4_Sub12_Sub1_5.method2496(Static161.anInt3179);
				Static3.aClass4_Sub12_Sub1_5.method2531(Static408.anInt6726);
				Static3.aClass4_Sub12_Sub1_5.method2496(Static23.anInt350);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static166.method2734(0, local180.anIntArray427[0], local180.anIntArray426[0], local180.method4751(), true, local180.method4751(), 0, -2);
			}
		}
		if (local21 == 48 || local21 == 1002) {
			Static413.method5309(local25, arg1.aString56, local18, local15);
		}
		if (local21 == 2) {
			Static14.anInt191 = arg2;
			Static85.anInt1764 = 2;
			Static205.anInt3911 = arg0;
			Static216.anInt4014 = 0;
			Static429.method5476(aClass215_51);
			Static3.aClass4_Sub12_Sub1_5.method2505(local25);
			Static3.aClass4_Sub12_Sub1_5.method2524(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2505(local18 + Static86.anInt1771);
			Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static95.method1664(local15, local18);
		}
		if (local21 == 18) {
			Static205.anInt3911 = arg0;
			Static85.anInt1764 = 2;
			Static14.anInt191 = arg2;
			Static216.anInt4014 = 0;
			Static429.method5476(Static100.aClass215_22);
			Static3.aClass4_Sub12_Sub1_5.method2496(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2524((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static3.aClass4_Sub12_Sub1_5.method2524(local18 + Static86.anInt1771);
			Static443.method5589(local32, local15, local18);
		}
		if (local21 == 3) {
			local180 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local25];
			if (local180 != null) {
				Static14.anInt191 = arg2;
				Static205.anInt3911 = arg0;
				Static85.anInt1764 = 2;
				Static216.anInt4014 = 0;
				Static429.method5476(Static421.aClass215_93);
				Static3.aClass4_Sub12_Sub1_5.method2496(local25);
				Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static166.method2734(0, local180.anIntArray427[0], local180.anIntArray426[0], local180.method4751(), true, local180.method4751(), 0, -2);
			}
		}
		if (local21 == 17) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static14.anInt191 = arg2;
				Static85.anInt1764 = 2;
				Static205.anInt3911 = arg0;
				Static216.anInt4014 = 0;
				Static429.method5476(aClass215_52);
				Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2524(local25);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 1003) {
			Static14.anInt191 = arg2;
			Static85.anInt1764 = 2;
			Static205.anInt3911 = arg0;
			Static216.anInt4014 = 0;
			local180 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local25];
			if (local180 != null) {
				@Pc(1653) Class264 local1653 = local180.aClass264_1;
				if (local1653.anIntArray544 != null) {
					local1653 = local1653.method5574(Static257.aClass114_1);
				}
				if (local1653 != null) {
					Static429.method5476(Static323.aClass215_74);
					Static3.aClass4_Sub12_Sub1_5.method2524(local1653.anInt7211);
				}
			}
		}
		if (local21 == 13) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static85.anInt1764 = 2;
				Static205.anInt3911 = arg0;
				Static429.method5476(Static278.aClass215_63);
				Static3.aClass4_Sub12_Sub1_5.method2505(local25);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 44) {
			if (Static104.anInt2252 > 0 && Static384.aClass244_1.method5489(82) && Static384.aClass244_1.method5489(81)) {
				Static200.method3168(Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, local18 + Static86.anInt1771, local15 + Static180.anInt3453);
			} else {
				Static419.method5383(local15, local25, local18);
				if (local25 == 1) {
					Static3.aClass4_Sub12_Sub1_5.method2551(-1);
					Static3.aClass4_Sub12_Sub1_5.method2551(-1);
					Static3.aClass4_Sub12_Sub1_5.method2524((int) Static368.aFloat192);
					Static3.aClass4_Sub12_Sub1_5.method2551(57);
					Static3.aClass4_Sub12_Sub1_5.method2551(Static175.anInt3399);
					Static3.aClass4_Sub12_Sub1_5.method2551(Static110.anInt2374);
					Static3.aClass4_Sub12_Sub1_5.method2551(89);
					Static3.aClass4_Sub12_Sub1_5.method2524(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893);
					Static3.aClass4_Sub12_Sub1_5.method2524(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892);
					Static3.aClass4_Sub12_Sub1_5.method2551(63);
				} else {
					Static85.anInt1764 = 1;
					Static216.anInt4014 = 0;
					Static205.anInt3911 = arg0;
					Static14.anInt191 = arg2;
				}
				Static166.method2734(0, local18, local15, 1, true, 1, 0, -4);
			}
		}
		if (local21 == 51) {
			Static85.anInt1764 = 2;
			Static14.anInt191 = arg2;
			Static205.anInt3911 = arg0;
			Static216.anInt4014 = 0;
			Static429.method5476(Static115.aClass215_31);
			Static3.aClass4_Sub12_Sub1_5.method2524(local25);
			Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static3.aClass4_Sub12_Sub1_5.method2496(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2496(local18 + Static86.anInt1771);
			Static95.method1664(local15, local18);
		}
		if (local21 == 1010) {
			Static85.anInt1764 = 2;
			Static216.anInt4014 = 0;
			Static14.anInt191 = arg2;
			Static205.anInt3911 = arg0;
			Static429.method5476(Static110.aClass215_27);
			Static3.aClass4_Sub12_Sub1_5.method2524(local25);
		}
		if (local21 == 1009) {
			Static216.anInt4014 = 0;
			Static205.anInt3911 = arg0;
			Static85.anInt1764 = 2;
			Static14.anInt191 = arg2;
			Static429.method5476(Static224.aClass215_45);
			Static3.aClass4_Sub12_Sub1_5.method2524(local25);
		}
		if (local21 == 4) {
			Static85.anInt1764 = 2;
			Static216.anInt4014 = 0;
			Static14.anInt191 = arg2;
			Static205.anInt3911 = arg0;
			Static429.method5476(Static338.aClass215_79);
			Static3.aClass4_Sub12_Sub1_5.method2494(local15 + Static180.anInt3453);
			Static3.aClass4_Sub12_Sub1_5.method2494(Static86.anInt1771 + local18);
			Static3.aClass4_Sub12_Sub1_5.method2496(local25);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
			Static95.method1664(local15, local18);
		}
		if (local21 == 20) {
			local120 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local25];
			if (local120 != null) {
				Static85.anInt1764 = 2;
				Static14.anInt191 = arg2;
				Static216.anInt4014 = 0;
				Static205.anInt3911 = arg0;
				Static429.method5476(Static64.aClass215_12);
				Static3.aClass4_Sub12_Sub1_5.method2495(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2494(local25);
				Static166.method2734(0, local120.anIntArray427[0], local120.anIntArray426[0], local120.method4751(), true, local120.method4751(), 0, -2);
			}
		}
		if (local21 == 11) {
			local180 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local25];
			if (local180 != null) {
				Static205.anInt3911 = arg0;
				Static216.anInt4014 = 0;
				Static14.anInt191 = arg2;
				Static85.anInt1764 = 2;
				Static429.method5476(Static354.aClass215_83);
				Static3.aClass4_Sub12_Sub1_5.method2521(Static384.aClass244_1.method5489(82) ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2524(local25);
				Static166.method2734(0, local180.anIntArray427[0], local180.anIntArray426[0], local180.method4751(), true, local180.method4751(), 0, -2);
			}
		}
		if (Static341.aBoolean599) {
			Static336.method5139();
		}
		if (Static378.aClass247_8 != null && Static91.anInt1087 == 0) {
			Static63.method1142(Static378.aClass247_8);
		}
	}
}
