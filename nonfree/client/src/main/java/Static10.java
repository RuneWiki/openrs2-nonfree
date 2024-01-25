import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public static int anInt178;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public static int anInt176 = 0;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
	public static final int[] anIntArray19 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public static int anInt179 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!rp;")
	public static Class157 method171(@OriginalArg(0) Component arg0) {
		return new Class157_Sub1(arg0);
	}
}
