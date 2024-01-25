import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!f;")
	public static Class76 aClass76_11;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_80 = new Class256("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
	public static int anInt4327 = 0;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "Z")
	public static boolean aBoolean362 = true;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Z")
	public static final boolean aBoolean363 = false;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V")
	public static void method3487(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static29.anIntArray33[local7] = Static29.anIntArray33[local7 - 1];
			Static338.anIntArray385[local7] = Static338.anIntArray385[local7 - 1];
			Static109.aStringArray11[local7] = Static109.aStringArray11[local7 - 1];
			Static183.aStringArray14[local7] = Static183.aStringArray14[local7 - 1];
			Static223.aStringArray18[local7] = Static223.aStringArray18[local7 - 1];
			Static374.aStringArray38[local7] = Static374.aStringArray38[local7 - 1];
			Static219.anIntArray268[local7] = Static219.anIntArray268[local7 - 1];
		}
		Static29.anIntArray33[0] = arg6;
		Static109.aStringArray11[0] = arg2;
		Static338.anIntArray385[0] = arg4;
		Static183.aStringArray14[0] = arg1;
		Static223.aStringArray18[0] = arg0;
		Static219.anIntArray268[0] = arg3;
		Static406.anInt7045 = Static331.anInt5891;
		Static87.anInt2010++;
		Static374.aStringArray38[0] = arg5;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!pc;IIIZ)V")
	public static void method3489(@OriginalArg(1) int arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(3) int arg2) {
		Static391.aClass188_113 = arg1;
		Static415.anInt7247 = 1;
		Static206.aBoolean322 = false;
		Static434.anInt7559 = arg2;
		Static358.anInt6316 = 0;
		Static229.anInt4373 = arg0;
		Static158.anInt3122 = 2;
	}
}
