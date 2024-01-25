import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Lclient!kea;")
	public static Class161 aClass161_66;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_81 = new Class158(13, -1);

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public static int anInt6217 = 0;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
	public static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public static int anInt6220 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Lclient!uaa;")
	public static Class290 method5207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static279.aClass290ArrayArrayArray7[0][arg1][arg2] != null && Static279.aClass290ArrayArrayArray7[0][arg1][arg2].aClass290_1 != null;
			if (local28 && arg0 >= Static399.anInt7385 - 1) {
				return null;
			}
			Static343.method5436(arg0, arg1, arg2);
		}
		return Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ada;)V")
	public static void method5208(@OriginalArg(0) Class6_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort123; local2 <= arg0.aShort122; local2++) {
			for (@Pc(6) int local6 = arg0.aShort120; local6 <= arg0.aShort121; local6++) {
				@Pc(16) Class290 local16 = Static279.aClass290ArrayArrayArray7[arg0.aByte100][local2][local6];
				if (local16 != null) {
					@Pc(21) Class98 local21 = local16.aClass98_3;
					@Pc(23) Class98 local23 = null;
					while (local21 != null) {
						if (local21.aClass6_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass98_3 = local21.aClass98_1;
							} else {
								local23.aClass98_1 = local21.aClass98_1;
							}
							local21.method2517();
							break;
						}
						local23 = local21;
						local21 = local21.aClass98_1;
					}
					local16.aByte93 = 0;
					for (@Pc(56) Class98 local56 = local16.aClass98_3; local56 != null; local56 = local56.aClass98_1) {
						local16.aByte93 = (byte) (local16.aByte93 | local56.anInt2952);
					}
				}
			}
		}
	}
}
