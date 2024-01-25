import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!gq;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt732 = -1;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "[Lclient!cj;")
	public static final Class1_Sub2_Sub1_Sub1[] aClass1_Sub2_Sub1_Sub1Array1 = new Class1_Sub2_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public static int anInt733 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public static void method587(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(14, arg0);
		local8.method1197();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I")
	public static int method589(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
