import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
	public static int anInt6559;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Lclient!la;")
	public static Class57 aClass57_5;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "[Lclient!el;")
	public static Class68[] aClass68Array1 = new Class68[50];

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Lclient!s;")
	public static final Class217 aClass217_140 = new Class217(67, 8);

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[100];

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "Lclient!je;")
	public static final Class127 aClass127_17 = new Class127(14, 0, 4, 1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method5148(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static297.aClass187_90.anInt5387 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static313.aClass272_2.anInt7599; local18++) {
			@Pc(25) Class60 local25 = Static313.aClass272_2.method6068(local18);
			if ((!arg1 || local25.lb) && local25.anInt1691 == -1 && local25.anInt1722 == -1 && local25.anInt1742 == 0 && local25.aString11.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static9.anInt150 = -1;
					Static260.aShortArray69 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(71) short[] local71 = new short[local14.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local16; local73++) {
						local71[local73] = local14[local73];
					}
					local14 = local71;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static9.anInt150 = local16;
		Static260.aShortArray69 = local14;
		Static452.anInt4834 = 0;
		@Pc(107) String[] local107 = new String[Static9.anInt150];
		for (@Pc(109) int local109 = 0; local109 < Static9.anInt150; local109++) {
			local107[local109] = Static313.aClass272_2.method6068(local14[local109]).aString11;
		}
		Static259.method4921(local107, Static260.aShortArray69);
		Static297.aClass187_90.method4285();
		Static297.aClass187_90.anInt5387 = 2;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
	public static void method5149(@OriginalArg(0) int arg0) {
		Static126.anInt2600 = -1;
		Static370.anInt6392 = -1;
		Static90.anInt1909 = arg0;
		Static14.method198();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[B[BIIII)V")
	public static void method5150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg1 >> 2);
		@Pc(19) int local19 = -(arg1 & 0x3);
		for (@Pc(22) int local22 = -arg0; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg6++;
				arg3[local30] += arg2[arg5++];
				@Pc(42) int local42 = arg6++;
				arg3[local42] += arg2[arg5++];
				@Pc(54) int local54 = arg6++;
				arg3[local54] += arg2[arg5++];
				@Pc(66) int local66 = arg6++;
				arg3[local66] += arg2[arg5++];
			}
			for (@Pc(81) int local81 = local19; local81 < 0; local81++) {
				local30 = arg6++;
				arg3[local30] += arg2[arg5++];
			}
			arg5 += arg4;
			arg6 += arg7;
		}
	}
}
