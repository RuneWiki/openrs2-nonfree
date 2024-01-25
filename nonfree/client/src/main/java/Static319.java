import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt6112;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	public static final int[] anIntArray473 = new int[5];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method5493() {
		Static69.anIntArray136 = null;
		Static341.aByteArrayArrayArray11 = null;
		Static102.anIntArrayArrayArray134 = null;
		Static129.anIntArray212 = null;
		Static310.aByteArrayArrayArray8 = null;
		Static103.anIntArray171 = null;
		Static312.aByteArrayArrayArray9 = null;
		Static259.anIntArray399 = null;
		Static275.anIntArray416 = null;
		Static35.aByteArrayArrayArray1 = null;
		Static192.aByteArrayArrayArray5 = null;
		Static100.anIntArray170 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[Lclient!kg;I)V")
	public static void method5494(@OriginalArg(0) int arg0, @OriginalArg(1) Class112[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class112 local14 = arg1[local8];
			if (local14 != null) {
				if (local14.anInt3373 == 0) {
					if (local14.aClass112Array2 != null) {
						method5494(arg0, local14.aClass112Array2);
					}
					@Pc(35) Class1_Sub15 local35 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local14.anInt3376);
					if (local35 != null) {
						Static127.method2641(arg0, local35.anInt1496);
					}
				}
				@Pc(51) Class1_Sub35 local51;
				if (arg0 == 0 && local14.anObjectArray4 != null) {
					local51 = new Class1_Sub35();
					local51.anObjectArray34 = local14.anObjectArray4;
					local51.aClass112_16 = local14;
					Static302.method5243(local51);
				}
				if (arg0 == 1 && local14.anObjectArray20 != null) {
					if (local14.anInt3398 >= 0) {
						@Pc(76) Class112 local76 = Static188.method3536(local14.anInt3376);
						if (local76 == null || local76.aClass112Array2 == null || local76.aClass112Array2.length <= local14.anInt3398 || local76.aClass112Array2[local14.anInt3398] != local14) {
							continue;
						}
					}
					local51 = new Class1_Sub35();
					local51.anObjectArray34 = local14.anObjectArray20;
					local51.aClass112_16 = local14;
					Static302.method5243(local51);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method5495() {
		Static40.method954();
		Static152.method2921();
		Static26.method639();
		Static192.method3609();
		Static307.method5312();
		Static243.aClass220_2.method5973();
		Static103.method2243();
		Static150.method4954();
		Static92.method1927();
		Static5.method274();
		Static313.method5408();
		Static78.method1687();
		Static48.method2779();
		Static237.method2579();
		Static22.method5875();
		Static211.method3896();
		Static231.method4292();
		Static80.method1713();
		Static94.method2042();
		Static265.method4813();
		Static29.method698();
		Static123.method2599();
		Static327.method3847();
		Static328.aClass21_165.method844(5);
		Static217.aClass21_116.method844(5);
		Static219.aClass21_119.method844(5);
		Static359.aClass21_176.method844(5);
		Static302.aClass21_155.method844(5);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIILclient!df;ILclient!fp;)V")
	public static void method5496(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(6) Class63 arg5) {
		if (arg0) {
			Static355.aClass4_25.method5948((Static213.anInt4274 - Static355.aClass4_25.method5961()) / 2, (Static130.anInt2825 - Static355.aClass4_25.method5963()) / 2);
			Static214.aClass4_16.method5948((Static213.anInt4274 - Static214.aClass4_16.method5961()) / 2, 18);
		}
		arg4.method6036(arg1, Static130.anInt2825 / 2 - 26, (Static171.aClass81_1 == Static285.aClass81_4 ? Static71.aClass106_57 : Static227.aClass106_156).method2927(Static254.anInt5172), -1, Static213.anInt4274 / 2);
		@Pc(58) int local58 = Static130.anInt2825 / 2 - 18;
		arg5.method4645(Static213.anInt4274 / 2 - 152, local58, 304, 34, arg2, 0);
		arg5.method4645(Static213.anInt4274 / 2 - 151, local58 - -1, 302, 32, 0, 0);
		arg5.method4653(Static213.anInt4274 / 2 - 150, local58 - -2, Static367.anInt7054 * 3, 30, arg3, 0);
		arg5.method4653(Static367.anInt7054 * 3 + Static213.anInt4274 / 2 - 150, local58 + 2, 300 - Static367.anInt7054 * 3, 30, 0, 0);
		arg4.method6036(arg1, Static130.anInt2825 / 2 + 4, Static367.aString66, -1, Static213.anInt4274 / 2);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method5498() {
		for (@Pc(16) Class1_Sub40 local16 = (Class1_Sub40) Static99.aClass42_13.method1543(); local16 != null; local16 = (Class1_Sub40) Static99.aClass42_13.method1551()) {
			if (local16.aBoolean454) {
				local16.method5482();
			}
		}
		for (@Pc(36) Class1_Sub40 local36 = (Class1_Sub40) Static136.aClass42_40.method1543(); local36 != null; local36 = (Class1_Sub40) Static136.aClass42_40.method1551()) {
			if (local36.aBoolean454) {
				local36.method5482();
			}
		}
	}
}
