import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_99 = new Class45(110, -1);

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "[F")
	public static final float[] aFloatArray52 = new float[4];

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_100 = new Class45(46, 3);

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!mc;")
	public static Class198 aClass198_12 = null;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([BILjava/lang/String;I)I")
	public static int method5524(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(27) int local27 = Static421.method6533(arg1.charAt(local17));
			@Pc(46) int local46 = local15 <= local17 + 1 ? -1 : Static421.method6533(arg1.charAt(local17 + 1));
			@Pc(67) int local67 = local17 + 2 < local15 ? Static421.method6533(arg1.charAt(local17 + 2)) : -1;
			@Pc(82) int local82 = local17 + 3 < local15 ? Static421.method6533(arg1.charAt(local17 + 3)) : -1;
			arg0[arg2++] = (byte) (local46 >>> 4 | local27 << 2);
			if (local67 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local46 & 0xF) << 4 | local67 >>> 2);
			if (local82 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local67 & 0x3) << 6 | local82);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ff;I)V")
	public static void method5525(@OriginalArg(0) Class12_Sub13 arg0) {
		if (arg0.aClass12_Sub29_5 != null) {
			arg0.aClass12_Sub29_5.anInt5184 = 0;
		}
		arg0.aBoolean658 = false;
		for (@Pc(18) Class12_Sub13 local18 = arg0.method7674(); local18 != null; local18 = arg0.method7673()) {
			method5525(local18);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
	public static boolean method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
