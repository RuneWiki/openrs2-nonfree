import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dd", name = "Hb", descriptor = "Z")
	public static boolean aBoolean66;

	@OriginalMember(owner = "client!dd", name = "Kb", descriptor = "I")
	public static int anInt1312;

	@OriginalMember(owner = "client!dd", name = "Pb", descriptor = "Lclient!rp;")
	public static Class223 aClass223_4;

	@OriginalMember(owner = "client!dd", name = "Fb", descriptor = "Lclient!ek;")
	public static final Class67 aClass67_5 = new Class67(16);

	@OriginalMember(owner = "client!dd", name = "Jb", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_10 = new Class137(64);

	@OriginalMember(owner = "client!dd", name = "Ob", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "(I)V")
	public static void method1083() {
		Static448.method5935(Static71.aClass146_104);
		Static247.aClass4_Sub9_Sub2_2.method4999(Static37.method500());
		Static247.aClass4_Sub9_Sub2_2.method5029(Static345.anInt5723);
		Static247.aClass4_Sub9_Sub2_2.method5029(Static120.anInt2134);
		Static247.aClass4_Sub9_Sub2_2.method4999(Static413.aClass49_Sub1_1.anInt3200);
	}

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "(B)V")
	public static void method1087() {
		@Pc(7) Class70 local7 = null;
		try {
			@Pc(13) Class45 local13 = Static24.aClass196_1.method3908("3", false);
			while (local13.anInt1129 == 0) {
				Static435.method5777(1L);
			}
			if (local13.anInt1129 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class70) local13.anObject5;
			@Pc(42) byte[] local42 = new byte[(int) local7.method1446()];
			if (local42.length == 0) {
				Static150.aString22 = "";
				Static276.aString38 = "";
			} else {
				@Pc(69) int local69;
				for (@Pc(56) int local56 = 0; local56 < local42.length; local56 += local69) {
					local69 = local7.method1445(local56, local42, local42.length - local56);
					if (local69 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(94) Class4_Sub9 local94 = new Class4_Sub9(local42);
				@Pc(98) int local98 = local94.method5007();
				if (local98 > 50) {
					throw new RuntimeException("Bad length");
				}
				local94.anInt6207 = local98 + 1;
				if (!local94.method5054()) {
					throw new RuntimeException("Invalid CRC");
				}
				local94.anInt6207 = 1;
				@Pc(129) int local129 = local94.method5007();
				if (local129 != 0) {
					throw new RuntimeException("Invalid version " + local129);
				}
				Static150.aString22 = local94.method5019();
				Static276.aString38 = local94.method5019();
			}
		} catch (@Pc(160) Exception local160) {
			Static150.aString22 = "";
			Static276.aString38 = "";
		}
		try {
			if (local7 != null) {
				local7.method1443();
			}
		} catch (@Pc(171) Exception local171) {
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([[BI[B[I[III[[B)I")
	public static int method1088(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg4[arg5];
		@Pc(15) int local15 = arg3[arg5] + local9;
		@Pc(19) int local19 = arg4[arg1];
		@Pc(26) int local26 = local19 + arg3[arg1];
		@Pc(28) int local28 = local9;
		if (local19 > local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = local15;
		if (local15 > local26) {
			local39 = local26;
		}
		@Pc(50) int local50 = arg2[arg5] & 0xFF;
		if (local50 > (arg2[arg1] & 0xFF)) {
			local50 = arg2[arg1] & 0xFF;
		}
		@Pc(71) byte[] local71 = arg0[arg5];
		@Pc(75) byte[] local75 = arg6[arg1];
		@Pc(79) int local79 = local28 - local9;
		@Pc(83) int local83 = local28 - local19;
		for (@Pc(85) int local85 = local28; local85 < local39; local85++) {
			@Pc(97) int local97 = local75[local83++] + local71[local79++];
			if (local50 > local97) {
				local50 = local97;
			}
		}
		return -local50;
	}
}
