import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!bea", name = "E", descriptor = "Lclient!bda;")
	public static Class15_Sub2_Sub1_Sub1 aClass15_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "Lclient!ti;")
	public static final Class281 aClass281_1 = new Class281();

	@OriginalMember(owner = "client!bea", name = "L", descriptor = "[I")
	public static final int[] anIntArray65 = new int[14];

	@OriginalMember(owner = "client!bea", name = "Q", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_22 = new Class150(68, -2);

	@OriginalMember(owner = "client!bea", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!bea", name = "T", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_23 = new Class150(52, 4);

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
	public static void method824() {
		if (Static22.aClass83_4 == null) {
			return;
		}
		if (Static22.aClass83_4.anInt2495 == 1) {
			Static22.aClass83_4 = null;
			return;
		}
		if (Static22.aClass83_4.anInt2495 == 2) {
			Static166.method2947(Static491.aString75, Static327.aClass9_19, 2);
			Static22.aClass83_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLclient!ui;)V")
	public static void method828(@OriginalArg(1) Class5_Sub47 arg0) {
		if (!Static218.aBoolean250) {
			arg0.method7425();
			Static257.anInt5147--;
		}
	}
}
