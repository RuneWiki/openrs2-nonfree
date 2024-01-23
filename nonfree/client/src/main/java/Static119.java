import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString90 = null;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	public static int anInt2398 = -1;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	public static int anInt2400 = 0;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public static int[] anIntArray194 = new int[2];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[B")
	public static byte[] method1928(@OriginalArg(1) int arg0) {
		@Pc(17) Class8_Sub1_Sub17 local17 = (Class8_Sub1_Sub17) Static230.aClass125_45.method2957((long) arg0);
		if (local17 == null) {
			@Pc(26) Random local26 = new Random((long) arg0);
			@Pc(29) byte[] local29 = new byte[512];
			@Pc(31) int local31;
			for (local31 = 0; local31 < 255; local31++) {
				local29[local31] = (byte) local31;
			}
			for (local31 = 0; local31 < 255; local31++) {
				@Pc(56) int local56 = 255 - local31;
				@Pc(61) int local61 = Static293.method4280(local56, local26);
				@Pc(65) byte local65 = local29[local61];
				local29[local61] = local29[local56];
				local29[local56] = local29[511 - local31] = local65;
			}
			local17 = new Class8_Sub1_Sub17(local29);
			Static230.aClass125_45.method2956((long) arg0, local17);
		}
		return local17.aByteArray39;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!pk;B)V")
	public static void method1929(@OriginalArg(0) Class132 arg0) {
		Static108.aClass132_40 = arg0;
	}
}
