import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static581 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
	public static int anInt9565 = 0;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Z")
	public static boolean aBoolean701 = false;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public static void method7950(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		if (Static634.anInt10113 == 1) {
			Static371.aClass143_7.method6238(arg0, arg1, Static435.anInt7679, Static437.anInt7720);
		} else {
			Static371.aClass143_7.method6238(arg0, arg1, 0, 0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!pg;)I")
	public static int method7951(@OriginalArg(1) Class271 arg0) {
		if (arg0 == Static214.aClass271_13) {
			return 9216;
		} else if (arg0 == Static148.aClass271_8) {
			return 34065;
		} else if (arg0 == Static552.aClass271_34) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I")
	public static int method7952() {
		if (Static518.aFrame4 == null) {
			return Static81.aBoolean103 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
