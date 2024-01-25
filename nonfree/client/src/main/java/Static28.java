import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
	public static int anInt487;

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
	public static int anInt486 = 2;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
	public static void method407() {
		@Pc(5) int local5 = 0;
		if (Static58.aClass6_Sub17_Sub1_1.method7351(Static79.anInt2700)) {
			local5 = 55;
		}
		if (!Static58.aClass6_Sub17_Sub1_1.aBoolean605) {
			local5 |= 0x40;
		}
		Static230.method3592(local5);
		Static85.aClass27_1.method521(local5);
		Static119.aClass244_4.method5722(local5);
		Static119.aClass226_4.method5375(local5);
		Static475.aClass291_2.method6549(local5);
		Static499.method7169(local5);
		Static300.method4533(local5);
		Static470.method6543(local5);
		Static497.method6879(local5);
		Static272.method4086();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)V")
	public static void method408(@OriginalArg(1) int arg0) {
		if (!Static58.aClass6_Sub17_Sub1_1.aBoolean608) {
			arg0 = -1;
		}
		if (arg0 == Static500.anInt8696) {
			return;
		}
		if (arg0 != -1) {
			@Pc(20) Class35 local20 = Static108.aClass249_2.method5809(arg0);
			@Pc(24) Class177 local24 = local20.method723();
			if (local24 == null) {
				arg0 = -1;
			} else {
				Static174.aClass313_24.method6989(local24.method4147(), local24.method4149(), Static77.aCanvas1, local24.method4150(), new Point(local20.anInt836, local20.anInt838));
				Static500.anInt8696 = arg0;
			}
		}
		if (arg0 == -1 && Static500.anInt8696 != -1) {
			Static174.aClass313_24.method6989(-1, null, Static77.aCanvas1, -1, new Point());
			Static500.anInt8696 = -1;
		}
	}
}
