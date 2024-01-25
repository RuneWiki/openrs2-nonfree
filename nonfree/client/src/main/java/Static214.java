import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public static int anInt3764 = 0;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZ)Lclient!gn;")
	public static Class3_Sub18 method3324(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) long local12 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class3_Sub18) Static390.aClass44_37.method942(local12);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIZI)V")
	public static void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg0 - arg4;
		@Pc(19) int local19 = arg3 - arg2;
		if (local14 == 0) {
			if (local19 != 0) {
				Static56.method1007(arg1, arg3, arg4, arg2);
			}
		} else if (local19 == 0) {
			Static343.method5201(arg2, arg1, arg0, arg4);
		} else {
			@Pc(48) int local48 = (local19 << 12) / local14;
			@Pc(57) int local57 = arg2 - (local48 * arg4 >> 12);
			@Pc(70) int local70;
			@Pc(68) int local68;
			if (Static221.anInt3917 > arg0) {
				local68 = (local48 * Static221.anInt3917 >> 12) + local57;
				local70 = Static221.anInt3917;
			} else if (arg0 > Static365.anInt6140) {
				local68 = (local48 * Static365.anInt6140 >> 12) + local57;
				local70 = Static365.anInt6140;
			} else {
				local70 = arg0;
				local68 = arg3;
			}
			@Pc(104) int local104;
			@Pc(112) int local112;
			if (arg4 < Static221.anInt3917) {
				local104 = Static221.anInt3917;
				local112 = local57 + (local48 * Static221.anInt3917 >> 12);
			} else if (Static365.anInt6140 < arg4) {
				local112 = (Static365.anInt6140 * local48 >> 12) + local57;
				local104 = Static365.anInt6140;
			} else {
				local104 = arg4;
				local112 = arg2;
			}
			if (Static26.anInt345 > local112) {
				local112 = Static26.anInt345;
				local104 = (Static26.anInt345 - local57 << 12) / local48;
			} else if (local112 > Static272.anInt4750) {
				local112 = Static272.anInt4750;
				local104 = (Static272.anInt4750 - local57 << 12) / local48;
			}
			if (Static26.anInt345 > local68) {
				local68 = Static26.anInt345;
				local70 = (Static26.anInt345 - local57 << 12) / local48;
			} else if (Static272.anInt4750 < local68) {
				local70 = (Static272.anInt4750 - local57 << 12) / local48;
				local68 = Static272.anInt4750;
			}
			Static163.method2304(local104, local112, local68, arg1, local70);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!b;IBI)Lclient!vn;")
	public static Class239 method3327(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method253(0, arg1);
		return local9 == null ? null : new Class239(local9);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public static void method3328() {
		Static32.aClass20_14.anInt223 = 1;
		Static144.aClient1.method899();
		Static258.aBoolean359 = true;
		Static245.aBoolean344 = true;
		Static320.method4849();
		Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
		Static12.aClass234_6 = null;
		Static222.aClass234_79 = null;
		Static296.aClass234_104 = null;
		Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
		Static29.anInt4374 = 0;
		Static139.anInt2636 = 0;
		Static359.aClass234_123 = null;
		Static152.anInt2774 = 0;
		for (@Pc(4361) int local4361 = 0; local4361 < Static323.aClass229Array1.length; local4361++) {
			Static323.aClass229Array1[local4361] = null;
		}
		for (@Pc(4383) int local4383 = 0; local4383 < 100; local4383++) {
			Static179.aStringArray24[local4383] = null;
		}
		Static157.anInt2808 = (int) (Math.random() * 110.0D) - 55;
		Static352.aFloat68 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static30.anInt547 = 0;
		Static68.aBoolean81 = false;
		Static117.anInt2227 = 0;
		Static129.anInt2435 = (int) (Math.random() * 120.0D) - 60;
		Static187.anInt3396 = (int) (Math.random() * 30.0D) - 20;
		Static231.anInt4140 = (int) (Math.random() * 80.0D) - 40;
		Static347.anInt5875 = (int) (Math.random() * 100.0D) - 50;
		Static205.method305();
		for (@Pc(4448) int local4448 = 0; local4448 < 2048; local4448++) {
			Static308.aClass28_Sub1_Sub1_Sub2Array1[local4448] = null;
		}
		Static23.anInt305 = 0;
		for (@Pc(4464) int local4464 = 0; local4464 < 32768; local4464++) {
			Static166.aClass28_Sub1_Sub1_Sub1Array41[local4464] = null;
		}
		Static182.aClass138_22.method3046();
		Static93.aClass138_10.method3046();
		Static11.aClass22_8.method289();
		Static384.aClass44_39.method952();
		Static230.aClass138_34 = new Class138();
		Static351.anInt3266 = 0;
		Static331.anInt5599 = 0;
		Static331.aClass115_1.method2405();
		Static319.method4842();
		Static157.anInt2809 = 0;
		Static200.anInt3586 = 0;
		Static47.anInt971 = 0;
		Static37.anInt658 = 0;
		Static81.anInt1661 = 0;
		Static241.anInt4238 = 0;
		Static258.anInt4650 = 0;
		Static216.anInt6071 = 0;
		Static51.anInt1084 = 0;
		Static210.anInt3709 = 0;
		for (@Pc(4523) int local4523 = 0; local4523 < Static97.anIntArray196.length; local4523++) {
			if (!Static29.aBooleanArray105[local4523]) {
				Static97.anIntArray196[local4523] = -1;
			}
		}
		if (Static68.anInt1346 != -1) {
			Static293.method4553(Static68.anInt1346);
		}
		for (@Pc(4549) Class3_Sub22 local4549 = (Class3_Sub22) Static29.aClass44_26.method950(); local4549 != null; local4549 = (Class3_Sub22) Static29.aClass44_26.method949()) {
			if (!local4549.method5702()) {
				local4549 = (Class3_Sub22) Static29.aClass44_26.method950();
				if (local4549 == null) {
					break;
				}
			}
			Static53.method985(local4549, false, true);
		}
		Static68.anInt1346 = -1;
		Static29.aClass44_26 = new Class44(8);
		Static295.method4560();
		Static53.aClass62_2 = null;
		for (@Pc(4593) int local4593 = 0; local4593 < 8; local4593++) {
			Static289.aStringArray35[local4593] = null;
			Static383.aBooleanArray147[local4593] = false;
			Static200.anIntArray390[local4593] = -1;
		}
		Static239.method5189();
		Static350.aBoolean451 = true;
		for (@Pc(4619) int local4619 = 0; local4619 < 100; local4619++) {
			Static109.aBooleanArray45[local4619] = true;
		}
		Static316.aString55 = null;
		Static54.aClass236Array1 = null;
		Static12.anInt159 = 0;
		for (@Pc(4639) int local4639 = 0; local4639 < 6; local4639++) {
			Static8.aClass157Array119[local4639] = new Class157();
		}
		for (@Pc(4655) int local4655 = 0; local4655 < 25; local4655++) {
			Static363.anIntArray663[local4655] = 0;
			Static152.anIntArray299[local4655] = 0;
			Static33.anIntArray56[local4655] = 0;
		}
		Static347.method5256();
		Static55.aBoolean64 = true;
		Static66.aShortArray29 = Static115.aShortArray43 = Static276.aShortArray78 = Static197.aShortArray62 = new short[256];
		Static32.aString10 = Static126.aClass57_42.method1122(Static66.anInt1307);
		Static204.anInt4957 = 0;
		Static164.aClass154_Sub1_1.aBoolean477 = false;
		Static164.aClass154_Sub1_1.aBoolean476 = false;
		Static27.method329();
		Static273.method4274();
		Static32.aClass20_14.anInt223 = 2;
		Static369.aLong219 = 0L;
		Static127.aClass3_Sub2_2 = null;
	}
}
