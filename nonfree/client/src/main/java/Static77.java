import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!sea;")
	public static Class308 aClass308_183;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
	public static final int[] anIntArray573 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!da", name = "h", descriptor = "J")
	public static long aLong250 = 0L;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method7390() {
		Static326.aClass97_3.method2367();
		Static216.aClass238_1.method5651();
		Static475.aClient1.method1080();
		Static103.aCanvas2.setBackground(Color.black);
		Static389.anInt6933 = -1;
		Static326.aClass97_3 = Static78.method1321(Static103.aCanvas2);
		Static216.aClass238_1 = Static550.method7496(Static103.aCanvas2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	public static int method7407(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
