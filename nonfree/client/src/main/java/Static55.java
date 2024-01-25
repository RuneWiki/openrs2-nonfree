import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public static int anInt1064;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public static int anInt1066;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_1 = new Class295(3, 8);

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt1068 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	public static void method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static88.aClass352_7.method7572(Static375.aClass253_28.method5453(Static161.anInt3095));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub40 local18 = (Class1_Sub40) Static166.aClass111_49.method2547(); local18 != null; local18 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			local24 = Static315.method4680(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static22.anInt572 * 16 + 21;
		@Pc(50) int local50 = arg0 - local13 / 2;
		if (Static349.anInt6422 < local50 + local13) {
			local50 = Static349.anInt6422 - local13;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(78) int local78 = arg1;
		if (Static594.anInt9806 < arg1 + local24) {
			local78 = Static594.anInt9806 - local24;
		}
		Static405.anInt7239 = local50;
		if (local78 < 0) {
			local78 = 0;
		}
		Static130.anInt2592 = local78;
		Static570.anInt9417 = local13;
		Static563.anInt9345 = (Static527.aBoolean672 ? 26 : 22) + Static22.anInt572 * 16;
		Static406.aBoolean553 = true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method955(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static307.anInt7603 = -1;
		Static133.anInt2648 = 1;
		Static181.method2849(arg1, false, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
	public static void method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub1_Sub5 local13 = local7.aClass11_Sub1_Sub5_2;
		@Pc(16) Class11_Sub1_Sub5 local16 = local7.aClass11_Sub1_Sub5_1;
		if (local13 != null) {
			local13.aShort59 = (short) (local13.aShort59 * arg3 / (0x10 << Static166.anInt7796 - 7));
			local13.aShort58 = (short) (local13.aShort58 * arg3 / (0x10 << Static166.anInt7796 - 7));
		}
		if (local16 != null) {
			local16.aShort59 = (short) (local16.aShort59 * arg3 / (0x10 << Static166.anInt7796 - 7));
			local16.aShort58 = (short) (local16.aShort58 * arg3 / (0x10 << Static166.anInt7796 - 7));
		}
	}
}
