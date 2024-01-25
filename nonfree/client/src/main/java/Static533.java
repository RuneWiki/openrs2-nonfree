import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public static int anInt8877;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
	public static final int[] anIntArray508 = new int[16];

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public static int anInt8884 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method7616(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(25) int local25 = arg0 ? 32768 : 0;
		@Pc(37) int local37 = local25 + (arg0 ? Static54.aClass308_1.anInt8039 : Static54.aClass308_1.anInt8040);
		for (@Pc(39) int local39 = local25; local39 < local37; local39++) {
			@Pc(46) Class5_Sub1_Sub5 local46 = Static54.aClass308_1.method6953(local39);
			if (local46.aBoolean257 && local46.method3285().toLowerCase().indexOf(local8) != -1) {
				if (local18 >= 50) {
					Static380.anInt6378 = -1;
					Static602.aShortArray141 = null;
					return;
				}
				if (local18 >= local16.length) {
					@Pc(83) short[] local83 = new short[local16.length * 2];
					for (@Pc(85) int local85 = 0; local85 < local18; local85++) {
						local83[local85] = local16[local85];
					}
					local16 = local83;
				}
				local16[local18++] = (short) local39;
			}
		}
		Static637.anInt7728 = 0;
		Static380.anInt6378 = local18;
		Static602.aShortArray141 = local16;
		@Pc(128) String[] local128 = new String[Static380.anInt6378];
		for (@Pc(130) int local130 = 0; local130 < Static380.anInt6378; local130++) {
			local128[local130] = Static54.aClass308_1.method6953(local16[local130]).method3285();
		}
		Static272.method4456(Static602.aShortArray141, local128);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)V")
	public static void method7622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg1, 17);
		local9.method7441();
		local9.anInt8635 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[S)[S")
	public static short[] method7628(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(13) short[] local13 = new short[arg0];
		Static693.method8322(arg1, 0, local13, 0, arg0);
		return local13;
	}
}
