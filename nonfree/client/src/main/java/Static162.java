import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream6;

	@OriginalMember(owner = "client!fia", name = "h", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!fia", name = "t", descriptor = "Lclient!eh;")
	public static Class56 aClass56_11;

	@OriginalMember(owner = "client!fia", name = "g", descriptor = "Z")
	public static boolean aBoolean577 = false;

	@OriginalMember(owner = "client!fia", name = "j", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_247 = new Class196(13, 0);

	@OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
	public static int anInt7889 = 0;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ZZ)V")
	public static void method6698(@OriginalArg(1) boolean arg0) {
		if (Static537.aClass240_34 != null) {
			Static537.aClass240_34.method5658();
			Static537.aClass240_34 = null;
		}
		Static16.anInt9847 = 0;
		Static422.method6420();
		Static612.method8231();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static137.aClass234Array1[local17].method5453();
		}
		Static355.method5246(false);
		System.gc();
		Static666.method8680();
		Static26.aBoolean13 = false;
		Static367.anInt6416 = -1;
		Static516.method3871();
		Static99.method1647(true);
		Static216.anInt3459 = 0;
		Static48.anInt750 = 0;
		Static544.anInt8919 = 0;
		Static566.anInt9293 = 0;
		Static645.anInt10204 = 0;
		Static454.anInt7910 = 0;
		for (@Pc(63) int local63 = 0; local63 < Static217.aClass358Array1.length; local63++) {
			Static217.aClass358Array1[local63] = null;
		}
		Static373.method5520();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local81] = null;
		}
		Static386.anInt6720 = 0;
		Static223.aClass335_19.method7773();
		Static562.anInt9155 = 0;
		Static109.aClass335_12.method7773();
		Static353.method5241();
		Static500.anInt8514 = 0;
		Static413.aClass63_1.method1220();
		Static229.method3280();
		Static495.method7192();
		Static57.aClass5_Sub49_1 = null;
		Static583.aClass233_2 = null;
		Static452.aLong241 = 0L;
		Static584.aClass5_Sub33_2 = null;
		Static619.aClass233_3 = null;
		Static394.aClass5_Sub49_2 = null;
		if (arg0) {
			Static42.method560(12);
			return;
		}
		Static42.method560(3);
		try {
			Static680.method2300("loggedout", Static285.anApplet5);
		} catch (@Pc(139) Throwable local139) {
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6704(@OriginalArg(1) String arg0) {
		if (!Static386.aBoolean482 || (Static2.anInt22 & 0x18) == 0) {
			return;
		}
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17 = Static72.anInt9084;
		@Pc(24) int[] local24 = Static388.anIntArray381;
		for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
			@Pc(33) Class41_Sub1_Sub1_Sub3_Sub2 local33 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local24[local26]];
			if (local33.aString100 != null && local33.aString100.equalsIgnoreCase(arg0) && (local33 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 && (Static2.anInt22 & 0x10) != 0 || local33 != null && (Static2.anInt22 & 0x8) != 0)) {
				@Pc(69) Class5_Sub16 local69 = Static455.method6717(Static67.aClass187_23, Static16.aClass332_8);
				local69.aClass5_Sub15_Sub2_1.method3660(local24[local26]);
				local69.aClass5_Sub15_Sub2_1.method3636(0);
				local69.aClass5_Sub15_Sub2_1.method3660(Static669.anInt10434);
				local69.aClass5_Sub15_Sub2_1.method3660(Static537.anInt10359);
				local69.aClass5_Sub15_Sub2_1.method3679(Static404.anInt6945);
				Static479.method7038(local69);
				local15 = true;
				Static240.method3447(local33.method7917(), local33.anIntArray528[0], 0, true, -2, 0, local33.method7917(), local33.anIntArray527[0]);
				break;
			}
		}
		if (!local15) {
			Static566.method7772(Static49.aClass42_21.method730(Static259.anInt4113) + arg0);
		}
		if (Static386.aBoolean482) {
			Static355.method5247();
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)I")
	public static int method6707(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
