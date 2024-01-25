import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static207 {

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
	public static int anInt3690;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZZI)V")
	public static void method3389(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static261.anInt4685++;
			Static53.method939();
		}
		if (arg0) {
			Static632.anInt10345++;
			Static234.method3709();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method3390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
