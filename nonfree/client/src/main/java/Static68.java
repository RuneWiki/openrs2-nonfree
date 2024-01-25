import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
	public static int anInt1583;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!wh;")
	public static Class356 aClass356_4 = new Class356(8);

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	public static int anInt1585 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)I")
	public static int method1442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = local15 << 1 | arg0 & 0x1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIII)V")
	public static void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static138.aLong131 = 0L;
		@Pc(8) int local8 = Static19.method541();
		if (arg0 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static136.aClass12_8.method6442()) {
			arg1 = true;
		}
		Static570.method7701(arg1, arg3, arg0, local8, arg2);
	}
}
