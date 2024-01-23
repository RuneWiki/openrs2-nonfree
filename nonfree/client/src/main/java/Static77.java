import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "Lclient!cb;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "[J")
	public static long[] aLongArray4 = new long[500];

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_595 = Static200.method3116("Started 3d library");

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "Lclient!kh;")
	private static Class60 aClass60_597 = Static200.method3116("yellow:");

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "Lclient!kh;")
	public static Class60 aClass60_596 = aClass60_597;

	@OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
	public static int anInt1873 = 4;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "[I")
	public static int[] anIntArray217 = new int[anInt1873];

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "Lclient!kh;")
	public static Class60 aClass60_598 = aClass60_595;

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
	public static int anInt1868 = 0;

	@OriginalMember(owner = "client!hg", name = "R", descriptor = "Lclient!kh;")
	public static Class60 aClass60_599 = aClass60_597;

	@OriginalMember(owner = "client!hg", name = "W", descriptor = "[[Lclient!sc;")
	public static Class89[][] aClass89ArrayArray1 = new Class89[anInt1873][500];

	@OriginalMember(owner = "client!hg", name = "Y", descriptor = "[Lclient!ta;")
	public static Class94[] aClass94Array1 = new Class94[4];

	@OriginalMember(owner = "client!hg", name = "ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_600 = Static200.method3116(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!hg", name = "db", descriptor = "Lclient!kh;")
	public static Class60 aClass60_601 = Static200.method3116("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZLclient!ai;Lclient!ai;Z)V")
	public static void method1382(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) boolean arg3) {
		Static65.aClass7_11 = arg2;
		Static41.aBoolean63 = arg0;
		Static10.aClass7_3 = arg1;
		Static15.aBoolean31 = arg3;
		Static36.aClass27_104 = new Class27(30);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
	public static void method1384(@OriginalArg(0) boolean arg0) {
		Static84.method1044();
		Static111.anInt2541++;
		if (Static111.anInt2541 < 50 && !arg0) {
			return;
		}
		Static111.anInt2541 = 0;
		if (Static207.aBoolean246 || Static184.aClass55_3 == null) {
			return;
		}
		Static96.aClass1_Sub9_Sub1_3.method953(19);
		try {
			Static184.aClass55_3.method1756(Static96.aClass1_Sub9_Sub1_3.aByteArray20, Static96.aClass1_Sub9_Sub1_3.anInt1192);
			Static96.aClass1_Sub9_Sub1_3.anInt1192 = 0;
		} catch (@Pc(44) IOException local44) {
			Static207.aBoolean246 = true;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZI)V")
	public static void method1386(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static56.anInt1482; local3++) {
			@Pc(20) long local20 = (long) Static19.anIntArray73[local3] << 32 | 0x20000000L;
			@Pc(26) Class9_Sub4_Sub2 local26 = Static1.aClass9_Sub4_Sub2Array1[Static19.anIntArray73[local3]];
			if (local26 != null && local26.method2907() && local26.aClass1_Sub1_Sub9_1.aBoolean126 == arg0 && local26.aClass1_Sub1_Sub9_1.method1740()) {
				@Pc(53) int local53 = local26.anInt3925 >> 7;
				@Pc(58) int local58 = local26.anInt3903 >> 7;
				if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
					if (local26.anInt3937 == 1 && (local26.anInt3925 & 0x7F) == 64 && (local26.anInt3903 & 0x7F) == 64) {
						if (Static19.anInt471 == Static7.anIntArrayArray5[local53][local58]) {
							continue;
						}
						Static7.anIntArrayArray5[local53][local58] = Static19.anInt471;
					}
					if (!local26.aClass1_Sub1_Sub9_1.aBoolean127) {
						local20 |= Long.MIN_VALUE;
					}
					local26.anInt3927 = Static165.method2268((local26.anInt3937 - 1) * 64 + local26.anInt3903, Static180.anInt3841, local26.anInt3925 + local26.anInt3937 * 64 - 64);
					Static54.method1049(Static180.anInt3841, local26.anInt3925, local26.anInt3903, local26.anInt3927, (local26.anInt3937 - 1) * 64 + 60, local26, local26.anInt3913, local20, local26.aBoolean212);
				}
			}
		}
	}
}
