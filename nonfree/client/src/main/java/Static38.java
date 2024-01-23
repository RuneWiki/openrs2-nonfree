import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public static int anInt1012;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!d;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = null;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public static int anInt1016 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z")
	public static boolean method663(@OriginalArg(0) int arg0) {
		if (arg0 == Static232.anInt5088) {
			return false;
		}
		Static265.anIntArrayArray40 = new int[104][104];
		Static127.anIntArrayArrayArray8 = new int[4][13][13];
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static47.aClass65Array1[local21] = new Class65(104, 104);
		}
		Static232.anInt5088 = arg0;
		Static132.aByteArrayArrayArray10 = new byte[4][104][104];
		Static145.aByteArrayArrayArray13 = new byte[4][104][104];
		Static138.aClass3ArrayArrayArray1 = new Class3[4][104][104];
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!se;)V")
	public static void method664(@OriginalArg(1) Class122 arg0) {
		@Pc(10) int local10 = arg0.anInt4672;
		if (local10 == 324) {
			if (Static116.anInt3022 == -1) {
				Static95.anInt2642 = arg0.anInt4701;
				Static116.anInt3022 = arg0.anInt4729;
			}
			if (Static76.aClass94_2.aBoolean191) {
				arg0.anInt4729 = Static116.anInt3022;
			} else {
				arg0.anInt4729 = Static95.anInt2642;
			}
		} else if (local10 == 325) {
			if (Static116.anInt3022 == -1) {
				Static95.anInt2642 = arg0.anInt4701;
				Static116.anInt3022 = arg0.anInt4729;
			}
			if (Static76.aClass94_2.aBoolean191) {
				arg0.anInt4729 = Static95.anInt2642;
			} else {
				arg0.anInt4729 = Static116.anInt3022;
			}
		} else if (local10 == 327) {
			arg0.anInt4660 = 150;
			arg0.anInt4661 = (int) (Math.sin((double) Static156.anInt3722 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4651 = 5;
			arg0.anInt4676 = -1;
		} else if (local10 == 328) {
			if (Static83.aClass9_Sub1_Sub1_1.aString12 == null) {
				arg0.anInt4676 = 0;
			} else {
				arg0.anInt4660 = 150;
				arg0.anInt4661 = (int) (Math.sin((double) Static156.anInt3722 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4651 = 5;
				arg0.anInt4676 = ((int) Static93.method2008(Static83.aClass9_Sub1_Sub1_1.aString12) << 11) + 2047;
				arg0.anInt4666 = 0;
				arg0.anInt4680 = Static83.aClass9_Sub1_Sub1_1.anInt451;
				arg0.anInt4675 = Static83.aClass9_Sub1_Sub1_1.anInt464;
				arg0.anInt4647 = Static83.aClass9_Sub1_Sub1_1.anInt450;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!mi;I)V")
	public static void method666(@OriginalArg(0) Class9_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt421 - Static156.anInt3722;
		@Pc(20) int local20 = arg0.anInt463 * 128 + arg0.method208() * 64;
		@Pc(31) int local31 = arg0.anInt471 * 128 + arg0.method208() * 64;
		arg0.anInt427 += (local20 - arg0.anInt427) / local9;
		arg0.anInt429 = 0;
		if (arg0.anInt468 == 0) {
			arg0.anInt418 = 1024;
		}
		if (arg0.anInt468 == 1) {
			arg0.anInt418 = 1536;
		}
		arg0.anInt479 += (local31 - arg0.anInt479) / local9;
		if (arg0.anInt468 == 2) {
			arg0.anInt418 = 0;
		}
		if (arg0.anInt468 == 3) {
			arg0.anInt418 = 512;
		}
	}
}
