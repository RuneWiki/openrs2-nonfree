import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!ph;")
	public static Class187 aClass187_90;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!wp;")
	public static Class270 aClass270_5;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!ri;")
	public static Class207 aClass207_5;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	public static int anInt5146 = -1;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "Lclient!os;")
	public static final Class182 aClass182_184 = new Class182("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!op", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!gh;Lclient!gh;)V")
	public static void method4133(@OriginalArg(1) Class89 arg0, @OriginalArg(2) Class89 arg1) {
		Static310.method4308(Static348.aClass27_85);
		Static337.aClass10_Sub8_Sub2_2.method2506(arg1.anInt2677);
		Static337.aClass10_Sub8_Sub2_2.method2497(arg0.anInt2720);
		Static337.aClass10_Sub8_Sub2_2.method2509(arg0.anInt2670);
		Static337.aClass10_Sub8_Sub2_2.method2519(arg1.anInt2720);
		Static337.aClass10_Sub8_Sub2_2.method2473(arg0.anInt2677);
		Static337.aClass10_Sub8_Sub2_2.method2519(arg1.anInt2670);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)S")
	public static short method4134(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(42) int local42 = local19 + local37;
		@Pc(48) int local48;
		if (local42 == 0) {
			local48 = local37 << 1;
		} else {
			local48 = (local37 << 8) / local42;
		}
		return (short) (local48 >> 4 << 7 | local9 << 10 | local42);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)V")
	public static void method4135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static74.method1394(local35, true, false);
	}
}
