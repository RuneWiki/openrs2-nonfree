import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public static int anInt9401;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public static int anInt9403 = 0;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt9404 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V")
	public static void method8100(@OriginalArg(1) int arg0) {
		if (Static262.aClass3_Sub27_12.aClass21_Sub10_1.method3734() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static620.anInt10048) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class275 local25 = Static64.aClass263_34.method6852(arg0);
			@Pc(29) Class107 local29 = local25.method7008();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static205.aClass138_2.method3580(local29.method2760(), local29.method2764(), local29.method2769(), new Point(local25.anInt8080, local25.anInt8083), Static364.aCanvas13);
				Static620.anInt10048 = arg0;
			}
		}
		if (arg0 == -1 && Static620.anInt10048 != -1) {
			Static205.aClass138_2.method3580(null, -1, -1, new Point(), Static364.aCanvas13);
			Static620.anInt10048 = -1;
		}
	}
}
