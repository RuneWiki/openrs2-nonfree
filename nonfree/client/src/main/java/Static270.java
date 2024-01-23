import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "Lclient!ak;")
	public static Class7 aClass7_215;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
	public static int anInt5407 = 0;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
	public static int anInt5412 = 0;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "Lclient!pf;")
	public static Class1_Sub18_Sub1 aClass1_Sub18_Sub1_3 = new Class1_Sub18_Sub1(5000);

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "[F")
	public static float[] aFloatArray31 = new float[4];

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "Lclient!og;")
	public static Class127 aClass127_15 = null;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
	public static int anInt5417 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJZIB)Ljava/lang/String;")
	public static String method4147(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(11) boolean local11 = false;
		@Pc(13) char local13 = ',';
		@Pc(19) char local19 = '.';
		@Pc(24) StringBuffer local24 = new StringBuffer(26);
		if (arg1 < 0L) {
			arg1 = -arg1;
			local11 = true;
		}
		if (arg0 == 0) {
			local19 = ',';
			local13 = '.';
		}
		if (arg0 == 2) {
			local19 = ' ';
		}
		@Pc(58) int local58;
		@Pc(64) int local64;
		if (arg3 > 0) {
			for (local58 = 0; local58 < arg3; local58++) {
				local64 = (int) arg1;
				arg1 /= 10L;
				local24.append((char) (local64 + 48 - (int) arg1 * 10));
			}
			local24.append(local13);
		}
		local58 = 0;
		while (true) {
			local64 = (int) arg1;
			arg1 /= 10L;
			local24.append((char) (local64 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local11) {
					local24.append('-');
				}
				return local24.reverse().toString();
			}
			if (arg2) {
				local58++;
				if (local58 % 3 == 0) {
					local24.append(local19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(10, arg3);
		local8.method1859();
		local8.anInt2279 = arg2;
		local8.anInt2274 = arg0;
		local8.anInt2282 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
	public static void method4149() {
		Static284.aClass31_43.method856(5);
		Static247.aClass31_36.method856(5);
	}
}
