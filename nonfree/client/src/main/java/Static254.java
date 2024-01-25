import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "Lclient!em;")
	public static final Class83 aClass83_61 = new Class83(27, 6);

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
	public static int anInt2689 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method2368(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static73.anInt1422;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(27) Class361 local27 = Static197.aClass284_1.method6124(arg0[local13]);
			if (local27.anInt9619 != -1) {
				@Pc(39) Class5 local39 = (Class5) Static364.aClass207_50.method4390((long) local27.anInt9619);
				if (local39 == null) {
					@Pc(47) Class282 local47 = Static604.method6027(Static121.aClass308_48, local27.anInt9619, 0);
					if (local47 != null) {
						local39 = Static31.aClass78_18.method6838(local47, true);
						Static364.aClass207_50.method4391((long) local27.anInt9619, local39);
					}
				}
				if (local39 != null) {
					Static519.aClass5Array19[local11] = local39;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)V")
	public static void method2371(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static518.anInt9331 - Static307.anInt7596;
		if (local8 >= 100) {
			Static434.anInt7761 = -1;
			Static469.anInt8080 = -1;
			Static358.anInt9363 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static487.aFloat206;
		if (Static140.anInt2732 >> 8 > local23) {
			local23 = Static140.anInt2732 >> 8;
		}
		if (Static586.aBooleanArray40[4] && Static293.anIntArray308[4] + 128 > local23) {
			local23 = Static293.anIntArray308[4] + 128;
		}
		@Pc(64) int local64 = Static570.anInt9433 + (int) Static331.aFloat172 & 0x3FFF;
		Static91.method6730((local23 >> 3) * 3 + 600 << 2, local64, Static538.method6114(Static240.anInt4414, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902) - 200, Static183.anInt3630, arg0, local23, Static173.anInt3244);
		@Pc(107) float local107 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static393.anInt6978 = (int) (local107 * (float) (Static393.anInt6978 - Static262.anInt4766) + (float) Static262.anInt4766);
		Static78.anInt1534 = (int) ((float) Static4.anInt9359 + (float) (Static78.anInt1534 - Static4.anInt9359) * local107);
		Static20.anInt542 = (int) ((float) (Static20.anInt542 - Static40.anInt815) * local107 + (float) Static40.anInt815);
		Static428.anInt7673 = (int) ((float) (Static428.anInt7673 - Static433.anInt4793) * local107 + (float) Static433.anInt4793);
		@Pc(159) int local159 = Static175.anInt3256 - Static245.anInt4528;
		if (local159 > 8192) {
			local159 -= 16384;
		} else if (local159 < -8192) {
			local159 += 16384;
		}
		Static175.anInt3256 = (int) ((float) local159 * local107 + (float) Static245.anInt4528);
		Static175.anInt3256 &= 0x3FFF;
	}
}
