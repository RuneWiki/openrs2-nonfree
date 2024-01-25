import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
	public static int anInt6831;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "Lclient!bu;")
	public static Class32 aClass32_83;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_148 = new Class119(97, 11);

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_15 = new Class95(8, 4);

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_224 = new Class189("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IBI)I")
	public static int method5337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static290.anIntArray353[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method5338(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(1) int local1 = 99; local1 > 0; local1--) {
			Static384.anIntArray409[local1] = Static384.anIntArray409[local1 - 1];
			Static295.anIntArray359[local1] = Static295.anIntArray359[local1 - 1];
			Static8.aStringArray44[local1] = Static8.aStringArray44[local1 - 1];
			Static75.aStringArray15[local1] = Static75.aStringArray15[local1 - 1];
			Static125.aStringArray24[local1] = Static125.aStringArray24[local1 - 1];
			Static284.aStringArray37[local1] = Static284.aStringArray37[local1 - 1];
			Static277.anIntArray345[local1] = Static277.anIntArray345[local1 - 1];
		}
		Static384.anIntArray409[0] = arg1;
		Static295.anIntArray359[0] = arg6;
		Static8.aStringArray44[0] = arg5;
		Static75.aStringArray15[0] = arg4;
		Static125.aStringArray24[0] = arg0;
		Static277.anIntArray345[0] = arg2;
		Static84.anInt2097++;
		Static66.anInt1703 = Static301.anInt2459;
		Static284.aStringArray37[0] = arg3;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZI)I")
	public static int method5339(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub32 local8 = Static238.method3609(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local8.anIntArray340.length; local26++) {
				if (local8.anIntArray339[local26] == arg2) {
					local24 += local8.anIntArray340[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	public static void method5340() {
		@Pc(8) int local8 = Static374.aClass20_Sub1_1.method1810(Static105.anInt2382);
		if (local8 == 0) {
			Static229.aByteArrayArrayArray16 = null;
			Static340.method4514(0);
		} else if (local8 == 1) {
			Static79.method4479((byte) 0);
			Static340.method4514(512);
			if (Static9.aByteArrayArrayArray1 != null) {
				Static35.method720();
			}
		} else {
			Static79.method4479((byte) (Static52.anInt1374 - 4 & 0xFF));
			Static340.method4514(2);
		}
		Static297.anInt5327 = Static6.anInt93;
	}
}
