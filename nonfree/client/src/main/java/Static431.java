import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public static int anInt7617 = 765;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I")
	public static int method5778(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method5780() {
		for (@Pc(12) Class1_Sub1_Sub1 local12 = (Class1_Sub1_Sub1) Static184.aClass203_32.method4548(); local12 != null; local12 = (Class1_Sub1_Sub1) Static184.aClass203_32.method4545()) {
			@Pc(22) Class30_Sub1_Sub3 local22 = local12.aClass30_Sub1_Sub3_1;
			if (local22.aBoolean294) {
				local12.method6178();
				local22.method3531();
			} else if (Static187.anInt3975 >= local22.anInt4575) {
				local22.method3535(Static234.anInt4630);
				if (local22.aBoolean294) {
					local12.method6178();
				} else {
					Static193.method3130(local22, true);
				}
			}
		}
	}
}
