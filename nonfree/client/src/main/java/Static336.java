import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
	public static int anInt5466 = 0;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_74 = new Class146(30, -1);

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	public static void method4433(@OriginalArg(1) int arg0) {
		Static156.anInt2878 = arg0;
		Static454.aClass137_59.method2739();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)[Lclient!cu;")
	public static Class44[] method4434() {
		return new Class44[] { Static389.aClass44_1, Static389.aClass44_2, Static389.aClass44_3, Static389.aClass44_4, Static389.aClass44_5, Static389.aClass44_6, Static389.aClass44_7, Static389.aClass44_8, Static389.aClass44_9, Static389.aClass44_10, Static389.aClass44_11, Static389.aClass44_12 };
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!fh;II)V")
	public static void method4436(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (Static37.aClass142_2 == null) {
			return;
		}
		try {
			Static37.aClass142_2.method2808(0L);
			Static37.aClass142_2.method2810(arg0.aByteArray81, 24, arg1);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)Z")
	public static boolean method4437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static127.method1766(arg1, arg0) || Static293.method3831(arg1, arg0);
	}
}
