import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "[I")
	public static final int[] anIntArray426 = new int[100];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIIIZ)V")
	public static void method4679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static74.anInt1413 == 0) {
			Static204.method3650(false);
		} else {
			Static43.anInt852 = Static74.anInt1413;
			Static156.method2520(0);
		}
		Static4.anInt19 = arg2;
		Static252.anInt5976 = arg0;
		Static134.aBoolean161 = arg3;
		Static271.method3809(arg1);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V")
	public static void method4681() {
		Static330.aClass26_57.method328();
		Static313.aClass26_56.method328();
	}

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)V")
	public static void method4682() {
		if (!Static101.method1502()) {
			return;
		}
		if (Static314.aStringArray21 == null) {
			Static321.method5337();
		}
		Static34.aBooleanArray5 = new boolean[100];
		Static316.anIntArray508 = new int[100];
		Static186.anIntArray286 = new int[100];
		Static238.aBoolean319 = true;
		Static325.anIntArray88 = new int[100];
		Static236.anInt4750 = 0;
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			Static316.anIntArray508[local26] = (int) (Math.random() * (double) Static164.anInt3090);
			Static325.anIntArray88[local26] = (int) (Math.random() * 350.0D);
			Static186.anIntArray286[local26] = (int) (Math.random() * 102.0D);
			Static34.aBooleanArray5[local26] = Math.random() < 0.5D;
		}
		try {
			Static55.aClipboard1 = Static210.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(72) Exception local72) {
		}
	}

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "(B)V")
	public static void method4683() {
		Static76.aClass18_3.method4635();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static182.aLongArray4[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static237.aLongArray6[local24] = 0L;
		}
		Static191.anInt6248 = 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[Lclient!ms;)V")
	public static void method4684(@OriginalArg(1) int arg0, @OriginalArg(2) Class137[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class137 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt4067 == 0) {
					if (local9.aClass137Array2 != null) {
						method4684(arg0, local9.aClass137Array2);
					}
					@Pc(33) Class11_Sub41 local33 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local9.anInt4044);
					if (local33 != null) {
						Static313.method5275(arg0, local33.anInt6364);
					}
				}
				@Pc(52) Class11_Sub13 local52;
				if (arg0 == 0 && local9.anObjectArray29 != null) {
					local52 = new Class11_Sub13();
					local52.anObjectArray3 = local9.anObjectArray29;
					local52.aClass137_5 = local9;
					Static93.method1353(local52);
				}
				if (arg0 == 1 && local9.anObjectArray21 != null) {
					if (local9.anInt4095 >= 0) {
						@Pc(79) Class137 local79 = Static166.method2688(local9.anInt4044);
						if (local79 == null || local79.aClass137Array2 == null || local9.anInt4095 >= local79.aClass137Array2.length || local9 != local79.aClass137Array2[local9.anInt4095]) {
							continue;
						}
					}
					local52 = new Class11_Sub13();
					local52.aClass137_5 = local9;
					local52.anObjectArray3 = local9.anObjectArray21;
					Static93.method1353(local52);
				}
			}
		}
	}
}
