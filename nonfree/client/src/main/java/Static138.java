import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
	public static int anInt2770;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "[[[Lclient!dn;")
	public static Class51[][][] aClass51ArrayArrayArray1;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
	public static int anInt2773 = 0;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "Lclient!sg;")
	public static final Class5_Sub38 aClass5_Sub38_1 = new Class5_Sub38(0, 0);

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
	public static int anInt2777 = -1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!am;B)V")
	public static void method2590(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class10 arg1) {
		while (true) {
			@Pc(6) Class60 local6 = arg1.method311(arg0);
			while (local6.anInt1838 == 0) {
				Static105.method2138(10L);
			}
			if (local6.anInt1838 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static105.method2138(100L);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)I")
	public static int method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static312.anIntArray503[arg1 & 0x3] : Static289.anIntArray416[arg1 & 0x3];
	}
}
