import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	public static int anInt349;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)V")
	public static void method312() {
		Static342.aClass171_47.method3933(5);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	public static int method313() {
		return 2;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)V")
	public static void method315(@OriginalArg(0) boolean arg0) {
		Static112.method2026();
		if (Static162.anInt3250 != 30 && Static162.anInt3250 != 25) {
			return;
		}
		Static385.anInt6455++;
		if (Static385.anInt6455 < 50 && !arg0) {
			return;
		}
		Static385.anInt6455 = 0;
		if (!Static235.aBoolean424 && Static34.aClass34_2 != null) {
			Static159.method2586(Static104.aClass54_34);
			try {
				Static34.aClass34_2.method606(Static424.aClass2_Sub23_Sub2_1.anInt6952, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
				Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
			} catch (@Pc(62) IOException local62) {
				Static235.aBoolean424 = true;
			}
		}
		Static112.method2026();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z")
	public static boolean method316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
