import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public static int anInt6507;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
	public static int[] anIntArray830;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "Lclient!rk;")
	public static Class180 aClass180_96;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "Lclient!rk;")
	public static Class180 aClass180_97;

	@OriginalMember(owner = "client!w", name = "R", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public static int anInt6504 = -1;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_71 = new Class103(128);

	@OriginalMember(owner = "client!w", name = "L", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "Z")
	public static boolean aBoolean474 = false;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!pe;Z)V")
	public static void method5557(@OriginalArg(0) Class89 arg0) {
		arg0.method5431(0, 0, Static128.anInt2823, 350);
		arg0.method5439(0, 0, Static128.anInt2823, 350, Static276.anInt5461 << 24 | 0x332277, 1);
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local31 = Static338.anIntArray816[local25];
			@Pc(35) int local35 = Static107.anIntArray224[local25];
			arg0.method5439(local31, local35, 2, 2, Static122.anIntArray367[local25] << 24 | 0xFFFFFF, 1);
		}
		for (local31 = 0; local31 < Static353.aStringArray27.length; local31++) {
			Static341.aClass94_32.method5692(10, -1, Static353.aStringArray27[local31], 350 - Static326.aClass208_7.anInt6371 - Static73.anInt1814 - Static130.anInt2837 * local31 - 2, -16777216);
		}
		arg0.method5448(0, Static128.anInt2823, 350 - Static73.anInt1814, -1);
		Static149.aClass94_19.method5692(10, -1, "--> " + Static125.aString190 + "*", 350 - Static175.aClass208_3.anInt6371 - 1, -16777216);
	}
}
