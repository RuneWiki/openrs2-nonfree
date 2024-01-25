import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[6][];

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public static int anInt4524 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;ZII)V")
	public static void method3751(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static134.aClass386_56.anInt11070 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(27) Class341 local27 = Static217.aClass90_1.method2122(arg5);
			if (local27 == null || local27.method8270() != arg1) {
				return;
			}
			if (local27.method8270()) {
				local18 = local27.aString107;
			} else {
				local16 = local27.anInt9931;
			}
		}
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < Static175.aClass247_2.anInt7328; local50++) {
			@Pc(57) Class27 local57 = Static175.aClass247_2.method5962(local50);
			if ((!arg3 || local57.aBoolean73) && local57.anInt916 == -1 && local57.anInt900 == -1 && local57.anInt906 == -1 && local57.anInt938 == 0 && local57.aString9.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg1) {
						if (!arg2.equals(local57.method804(arg5, local18))) {
							continue;
						}
					} else if (local57.method807(arg5, local16) != arg4) {
						continue;
					}
				}
				if (local48 >= 250) {
					Static550.aShortArray136 = null;
					Static665.anInt4338 = -1;
					return;
				}
				if (local14.length <= local48) {
					@Pc(130) short[] local130 = new short[local14.length * 2];
					for (@Pc(132) int local132 = 0; local132 < local48; local132++) {
						local130[local132] = local14[local132];
					}
					local14 = local130;
				}
				local14[local48++] = (short) local50;
			}
		}
		Static665.anInt4338 = local48;
		Static38.anInt995 = 0;
		Static550.aShortArray136 = local14;
		@Pc(170) String[] local170 = new String[Static665.anInt4338];
		for (@Pc(172) int local172 = 0; local172 < Static665.anInt4338; local172++) {
			local170[local172] = Static175.aClass247_2.method5962(local14[local172]).aString9;
		}
		Static92.method1732(Static550.aShortArray136, local170);
		Static134.aClass386_56.method9197();
		Static134.aClass386_56.anInt11070 = 2;
	}
}
