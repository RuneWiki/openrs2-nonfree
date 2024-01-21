import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_70;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_862 = Static60.method1113("::");

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	public static int anInt2779 = 0;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_863 = Static60.method1113("mapfunction");

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_864 = Static60.method1113(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_865 = Static60.method1113("<col=00ff00>");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lclient!jc;")
	public static Class4_Sub1_Sub9 method1793(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub1_Sub9 local15 = (Class4_Sub1_Sub9) Static32.aClass33_11.method998((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static11.aClass20_59.method597(3, arg0);
		local15 = new Class4_Sub1_Sub9();
		if (local25 != null) {
			local15.method1019(new Class4_Sub11(local25));
		}
		Static32.aClass33_11.method997((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZBLclient!ue;)V")
	public static void method1794(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub21 arg1) {
		@Pc(7) int local7 = (int) arg1.aLong99;
		@Pc(10) int local10 = arg1.anInt2939;
		arg1.method1999();
		if (arg0) {
			Static97.method1661(local10);
		}
		Static89.method1566(local10);
		@Pc(25) Class4_Sub7 local25 = Static106.method1749(local7);
		if (local25 != null) {
			Static110.method1772(local25);
		}
		Static22.aBoolean250 = false;
		Static99.anInt2589 = 0;
		Static51.method989(Static31.anInt801, Static101.anInt2612, Static39.anInt974, Static91.anInt2422);
		if (Static11.anInt2982 != -1) {
			Static130.method2006(Static11.anInt2982, 1);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1795() {
		aClass20_Sub1_70 = null;
		aClass22_863 = null;
		aClass22_865 = null;
		aClass22_864 = null;
		aClass22_862 = null;
		aByteArrayArrayArray7 = null;
		aCRC32_2 = null;
		aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!ka;I)V")
	public static void method1796(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt2474 && arg2 != -1) {
			@Pc(52) int local52 = Static79.method1437(arg2).anInt3005;
			if (local52 == 1) {
				arg1.anInt2492 = 0;
				arg1.anInt2476 = 0;
				arg1.anInt2483 = 0;
				arg1.anInt2477 = arg0;
			}
			if (local52 == 2) {
				arg1.anInt2476 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt2474 == -1 || Static79.method1437(arg2).anInt2997 >= Static79.method1437(arg1.anInt2474).anInt2997) {
			arg1.anInt2501 = arg1.anInt2460;
			arg1.anInt2477 = arg0;
			arg1.anInt2483 = 0;
			arg1.anInt2476 = 0;
			arg1.anInt2492 = 0;
			arg1.anInt2474 = arg2;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!jd;IIIIIII)V")
	public static void method1798(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(23) int local23;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local23 = arg0.method719();
				if (local23 == 0) {
					return;
				}
				if (local23 == 1) {
					arg0.method719();
					return;
				}
				if (local23 <= 49) {
					arg0.method719();
				}
			}
			return;
		}
		Static3.aByteArrayArrayArray1[arg1][arg5][arg4] = 0;
		while (true) {
			local23 = arg0.method719();
			if (local23 == 0) {
				if (arg1 == 0) {
					Static57.anIntArrayArrayArray4[0][arg5][arg4] = -Static12.method173(arg2 + arg4 + 556238, arg5 + 932731 - -arg6) * 8;
					return;
				} else {
					Static57.anIntArrayArrayArray4[arg1][arg5][arg4] = Static57.anIntArrayArrayArray4[arg1 - 1][arg5][arg4] - 240;
					return;
				}
			}
			if (local23 == 1) {
				@Pc(119) int local119 = arg0.method719();
				if (local119 == 1) {
					local119 = 0;
				}
				if (arg1 == 0) {
					Static57.anIntArrayArrayArray4[0][arg5][arg4] = -local119 * 8;
					return;
				}
				Static57.anIntArrayArrayArray4[arg1][arg5][arg4] = Static57.anIntArrayArrayArray4[arg1 - 1][arg5][arg4] - local119 * 8;
				return;
			}
			if (local23 <= 49) {
				Static92.aByteArrayArrayArray4[arg1][arg5][arg4] = arg0.method731();
				aByteArrayArrayArray7[arg1][arg5][arg4] = (byte) ((local23 - 2) / 4);
				aByteArrayArrayArray6[arg1][arg5][arg4] = (byte) (arg3 + local23 - 2 & 0x3);
			} else if (local23 <= 81) {
				Static3.aByteArrayArrayArray1[arg1][arg5][arg4] = (byte) (local23 - 49);
			} else {
				Static97.aByteArrayArrayArray5[arg1][arg5][arg4] = (byte) (local23 - 81);
			}
		}
	}
}
