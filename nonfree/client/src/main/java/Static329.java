import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
	public static int anInt6592;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([[S[[FI)[[S")
	public static short[][] method5518(@OriginalArg(0) short[][] arg0, @OriginalArg(1) float[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			for (@Pc(15) int local15 = 0; local15 < arg0[local3].length; local15++) {
				arg0[local3][local15] = (short) (arg1[local3][local15] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V")
	public static void method5521() {
		@Pc(1) Class112 local1 = Static107.aClass112_13;
		synchronized (Static107.aClass112_13) {
			Static107.aClass112_13.method3643();
		}
		local1 = Static254.aClass112_31;
		synchronized (Static254.aClass112_31) {
			Static254.aClass112_31.method3643();
		}
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(B)V")
	public static void method5522() {
		Static415.method6511();
		Static172.anInt4126 = 0;
		Static276.aClass218_71 = null;
		Static17.aClass218_2 = null;
		Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
		Static614.aClass218_148 = null;
		Static448.anInt8138 = 0;
		Static285.anInt5873 = 0;
		Static177.aClass218_47 = null;
		Static164.method7296();
		Static90.method2285();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local35] = null;
		}
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 = null;
		for (@Pc(51) int local51 = 0; local51 < Static234.anInt5314; local51++) {
			@Pc(58) Class2_Sub3_Sub1_Sub2_Sub1 local58 = Static482.aClass3_Sub49Array1[local51].aClass2_Sub3_Sub1_Sub2_Sub1_2;
			if (local58 != null) {
				local58.anInt6331 = -1;
			}
		}
		Static624.method8486();
		Static516.anInt9019 = 1;
		Static155.anInt3810 = -1;
		Static531.anInt9157 = -1;
		Static182.method3694(10);
		for (@Pc(82) int local82 = 0; local82 < 100; local82++) {
			Static178.aBooleanArray12[local82] = true;
		}
		Static387.method6102();
		Static189.aLong94 = 0L;
		Static369.aClass3_Sub14_1 = null;
	}
}
