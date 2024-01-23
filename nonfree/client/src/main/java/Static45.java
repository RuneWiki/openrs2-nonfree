import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public static int anInt837 = 0;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString55 = " ";

	@OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
	public static int[] anIntArray60 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString56 = "Loading title screen - ";

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method721(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static8.method114(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(26) int local26;
			for (local26 = local19; arg0 != arg1.charAt(local26); local26++) {
			}
			local15[local17++] = arg1.substring(local19, local26);
			local19 = local26 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public static void method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static43.method2329(12, arg0);
		local8.method1520();
		local8.anInt1993 = arg1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)[F")
	public static float[] method723() {
		@Pc(9) float local9 = Static178.method2786() + Static178.method2789();
		@Pc(15) int local15 = Static178.method2791();
		@Pc(24) float local24 = (float) (local15 >> 16 & 0xFF) / 255.0F;
		Static159.aFloatArray64[3] = 1.0F;
		@Pc(37) float local37 = (float) (local15 >> 8 & 0xFF) / 255.0F;
		@Pc(39) float local39 = 0.58823526F;
		@Pc(46) float local46 = (float) (local15 & 0xFF) / 255.0F;
		Static159.aFloatArray64[2] = local39 * Static168.aFloatArray38[2] * local46 * local9;
		Static159.aFloatArray64[1] = local9 * local39 * Static168.aFloatArray38[1] * local37;
		Static159.aFloatArray64[0] = Static168.aFloatArray38[0] * local24 * local39 * local9;
		return Static159.aFloatArray64;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)V")
	public static void method726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub3_Sub9 local12 = Static43.method2329(11, arg0);
		local12.method1520();
		local12.anInt1993 = arg1;
		local12.anInt2001 = arg2;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)J")
	public static long method727() {
		return Static50.aClass78_1.method3302();
	}
}
