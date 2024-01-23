import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!o", name = "rc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!o", name = "uc", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!o", name = "mc", descriptor = "I")
	public static int anInt3803 = 0;

	@OriginalMember(owner = "client!o", name = "qc", descriptor = "Ljava/lang/String;")
	public static String aString211 = "flash1:";

	@OriginalMember(owner = "client!o", name = "tc", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!o", name = "wc", descriptor = "I")
	public static int anInt3809 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method3201(@OriginalArg(0) Class121 arg0) {
		Static120.aClass23_Sub1Array1 = Static289.method4414(arg0, Static209.anInt3974);
		Static189.anIntArray298 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(29) float local29 = (float) (Static182.anIntArray295[local15] >> 16 & 0xFF);
			@Pc(39) int local39 = Static182.anIntArray295[local15 + 1] >> 16 & 0xFF;
			@Pc(47) float local47 = ((float) local39 - local29) / 64.0F;
			@Pc(56) float local56 = (float) (Static182.anIntArray295[local15] >> 8 & 0xFF);
			@Pc(66) int local66 = Static182.anIntArray295[local15 + 1] >> 8 & 0xFF;
			@Pc(73) float local73 = (float) (Static182.anIntArray295[local15] & 0xFF);
			@Pc(81) float local81 = ((float) local66 - local56) / 64.0F;
			@Pc(89) int local89 = Static182.anIntArray295[local15 + 1] & 0xFF;
			@Pc(97) float local97 = ((float) local89 - local73) / 64.0F;
			for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
				Static189.anIntArray298[local99 + local15 * 64] = (int) local73 | (int) local56 << 8 | (int) local29 << 16;
				local29 += local47;
				local73 += local97;
				local56 += local81;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static189.anIntArray298[local15] = Static182.anIntArray295[3];
		}
		Static228.anIntArray353 = new int[32768];
		Static273.anIntArray437 = new int[32768];
		Static81.method1571(null);
		Static245.anIntArray392 = new int[32768];
		Static42.anIntArray48 = new int[32768];
		Static162.aClass1_Sub2_Sub1_Sub2_2 = new Class1_Sub2_Sub1_Sub2(128, 254);
	}
}
