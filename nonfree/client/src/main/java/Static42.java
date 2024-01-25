import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_8 = new Class208(77, 7);

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
	public static final int[] anIntArray55 = new int[1];

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	public static int anInt849 = 0;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
	public static final int[] anIntArray56 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "()V")
	public static void method802() {
		Static94.aClass65_1 = Static94.aClass65_2;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I")
	public static int method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static393.aByteArrayArray114 == null ? 0 : Static393.aByteArrayArray114[arg0][arg1] & 0xFF;
	}
}
