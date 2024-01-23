import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!nk;")
	public static Class121 aClass121_133;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public static int anInt5420;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public static int anInt5424;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!vh;")
	public static Class187 aClass187_152 = new Class187(100);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "S")
	public static short aShort55 = 320;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
	public static int[] anIntArray481 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!vh;")
	public static Class187 aClass187_153 = new Class187(64);

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public static int anInt5423 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!nk;Lclient!nk;ILclient!nk;)V")
	public static void method4608(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(3) Class121 arg2) {
		Static194.aClass121_87 = arg2;
		Static38.aClass121_88 = arg1;
		Static102.aClass121_50 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class1_Sub33 local30 = Static105.aClass1_Sub33ArrayArrayArray2[local9][arg0][arg1] = Static105.aClass1_Sub33ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt5738--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt5733; local40++) {
					@Pc(49) Class161 local49 = local30.aClass161Array3[local40];
					if ((local49.aLong171 >> 29 & 0x3L) == 2L && local49.anInt4641 == arg0 && local49.anInt4636 == arg1) {
						local49.anInt4646--;
					}
				}
			}
		}
		if (Static105.aClass1_Sub33ArrayArrayArray2[0][arg0][arg1] == null) {
			Static105.aClass1_Sub33ArrayArrayArray2[0][arg0][arg1] = new Class1_Sub33(0, arg0, arg1);
		}
		Static105.aClass1_Sub33ArrayArrayArray2[0][arg0][arg1].aClass1_Sub33_1 = local7;
		Static105.aClass1_Sub33ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!vj;ILclient!vj;Z)I")
	public static int method4613(@OriginalArg(1) Class29_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class29_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(11) int local11 = arg0.anInt5336;
			@Pc(14) int local14 = arg2.anInt5336;
			if (!arg3) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static233.method3610(Static114.anInt2371, arg2.method4544().aString199, arg0.method4544().aString199);
		} else if (arg1 == 3) {
			if (arg0.aString324.equals("-")) {
				if (arg2.aString324.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString324.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static233.method3610(Static114.anInt2371, arg2.aString324, arg0.aString324);
			}
		} else if (arg1 == 4) {
			return arg0.method4541() ? (arg2.method4541() ? 0 : 1) : arg2.method4541() ? -1 : 0;
		} else if (arg1 == 5) {
			return arg0.method4538() ? (arg2.method4538() ? 0 : 1) : arg2.method4538() ? -1 : 0;
		} else if (arg1 == 6) {
			return arg0.method4539() ? (arg2.method4539() ? 0 : 1) : (arg2.method4539() ? -1 : 0);
		} else if (arg1 == 7) {
			return arg0.method4542() ? (arg2.method4542() ? 0 : 1) : arg2.method4542() ? -1 : 0;
		} else {
			return arg0.anInt5342 - arg2.anInt5342;
		}
	}
}
