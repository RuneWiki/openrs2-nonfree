import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
	public static int anInt6838;

	@OriginalMember(owner = "client!mv", name = "ob", descriptor = "I")
	public static int anInt6876;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "F")
	public static float aFloat128 = 0.25F;

	@OriginalMember(owner = "client!mv", name = "K", descriptor = "[Lclient!su;")
	public static final Class329[] aClass329Array1 = new Class329[4];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)I")
	public static int method5701(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLjava/lang/String;ZZLjava/lang/String;II)V")
	public static void method5705(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static7.aClass390_1.anInt10731 = 1;
		@Pc(9) String local9 = arg0.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = -1;
		@Pc(16) String local16 = null;
		if (arg5 != -1) {
			@Pc(25) Class233 local25 = Static191.aClass381_2.method8728(arg5);
			if (local25 == null || arg1 != local25.method5642()) {
				return;
			}
			if (local25.method5642()) {
				local16 = local25.aString56;
			} else {
				local14 = local25.anInt6763;
			}
		}
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < Static110.aClass105_1.anInt2978; local52++) {
			@Pc(65) Class238 local65 = Static110.aClass105_1.method2659(local52);
			if ((!arg2 || local65.aBoolean600) && local65.anInt6852 == -1 && local65.anInt6840 == -1 && local65.anInt6871 == -1 && local65.anInt6847 == 0 && local65.aString57.toLowerCase().indexOf(local9) != -1) {
				if (arg5 != -1) {
					if (arg1) {
						if (!arg3.equals(local65.method5699(arg5, local16))) {
							continue;
						}
					} else if (local65.method5687(arg5, local14) != arg4) {
						continue;
					}
				}
				if (local50 >= 250) {
					Static285.aShortArray74 = null;
					Static227.anInt4175 = -1;
					return;
				}
				if (local12.length <= local50) {
					@Pc(140) short[] local140 = new short[local12.length * 2];
					for (@Pc(142) int local142 = 0; local142 < local50; local142++) {
						local140[local142] = local12[local142];
					}
					local12 = local140;
				}
				local12[local50++] = (short) local52;
			}
		}
		Static285.aShortArray74 = local12;
		Static227.anInt4175 = local50;
		Static175.anInt3412 = 0;
		@Pc(179) String[] local179 = new String[Static227.anInt4175];
		for (@Pc(181) int local181 = 0; local181 < Static227.anInt4175; local181++) {
			local179[local181] = Static110.aClass105_1.method2659(local12[local181]).aString57;
		}
		Static679.method9047(Static285.aShortArray74, local179);
		Static7.aClass390_1.method8930();
		Static7.aClass390_1.anInt10731 = 2;
	}
}
