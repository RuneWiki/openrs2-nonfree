import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_43 = new Class158("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!df", name = "r", descriptor = "[I")
	public static final int[] anIntArray171 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString16 = "";

	@OriginalMember(owner = "client!df", name = "w", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_42 = new Class263(59, -1);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)Z")
	public static boolean method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!ap;)V")
	public static void method1376(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static450.anInt7890; local7++) {
			@Pc(13) int local13 = Static17.anIntArray24[local7];
			@Pc(17) Class30_Sub1_Sub1_Sub2 local17 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = arg0.method1171();
			if ((local21 & 0x8) != 0) {
				local21 += arg0.method1171() << 8;
			}
			if ((local21 & 0x400) != 0) {
				local21 += arg0.method1171() << 16;
			}
			Static342.method4807(local17, arg0, local13, local21);
		}
	}
}
