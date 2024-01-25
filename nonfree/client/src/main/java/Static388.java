import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
	public static int anInt903;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
	private static int anInt926;

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
	private static int anInt927;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "Z")
	private static boolean aBoolean75;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	public static int anInt891 = 10;

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_38 = new Class214(22, -2);

	@OriginalMember(owner = "client!tk", name = "providesignlink", descriptor = "(Lclient!ji;)V")
	private static void method779(@OriginalArg(0) Class124 arg0) {
		Static41.aClass124_2 = arg0;
		Static357.aClass124_5 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(JZZII)Ljava/lang/String;")
	public static String method790(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local27 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg3 > 0) {
			for (local47 = 0; local47 < arg3; local47++) {
				local52 = (int) arg0;
				arg0 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg0 * 10));
			}
			local43.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg0;
			arg0 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg1) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
	public static void method791(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static368.anInt6250 - Static202.anInt3320;
		if (local8 >= 100) {
			Static100.anInt1781 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static278.aFloat52;
		if (Static220.anInt3560 >> 8 > local19) {
			local19 = Static220.anInt3560 >> 8;
		}
		if (Static35.aBooleanArray6[4] && local19 < Static140.anIntArray113[4] + 128) {
			local19 = Static140.anIntArray113[4] + 128;
		}
		@Pc(56) int local56 = Static104.anInt7242 + (int) Static95.aFloat27 & 0x3FFF;
		Static32.method555(Static155.anInt2606, local56, (local19 >> 3) * 3 + 600 << 0, Static183.method4175(Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613, Static138.anInt3548) - 50, Static327.anInt5372, arg0, local19);
		@Pc(106) float local106 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static8.anInt7337 = (int) ((float) Static211.anInt3377 + (float) (Static8.anInt7337 - Static211.anInt3377) * local106);
		Static401.anInt3623 = (int) ((float) Static34.anInt678 + local106 * (float) (Static401.anInt3623 - Static34.anInt678));
		Static278.anInt4391 = (int) ((float) Static427.anInt6992 + (float) (Static278.anInt4391 - Static427.anInt6992) * local106);
		Static5.anInt113 = (int) ((float) Static201.anInt3268 + (float) (Static5.anInt113 - Static201.anInt3268) * local106);
		@Pc(158) int local158 = Static409.anInt6636 - Static333.anInt5460;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static409.anInt6636 = (int) (local106 * (float) local158 + (float) Static333.anInt5460);
		Static409.anInt6636 &= 0x3FFF;
	}
}
