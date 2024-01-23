import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray10;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public static int anInt5209;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Loaded input handler";

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	public static int anInt5207 = 0;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString182 = "wave:";

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Lclient!l;")
	public static Class98 aClass98_41 = new Class98(64);

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
	public static int[] anIntArray545 = new int[32];

	@OriginalMember(owner = "client!si", name = "k", descriptor = "I")
	public static int anInt5210 = 0;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ud;I)V")
	public static void method4274(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub5 arg1) {
		if (arg1.anInt5094 > Static124.anInt2371) {
			Static247.method4165(arg1);
		} else if (Static124.anInt2371 > arg1.anInt5088) {
			Static259.method4350(arg1);
		} else {
			Static23.method366(arg1);
		}
		if (arg1.anInt5073 < 128 || arg1.anInt5016 < 128 || arg1.anInt5073 >= 13184 || arg1.anInt5016 >= 13184) {
			arg1.anInt5094 = 0;
			arg1.anInt5088 = 0;
			arg1.anInt5023 = -1;
			arg1.anInt5061 = -1;
			arg1.anInt5073 = arg1.anIntArray537[0] * 128 + arg1.method4186() * 64;
			arg1.anInt5016 = arg1.anIntArray535[0] * 128 + arg1.method4186() * 64;
			arg1.method4194();
		}
		if (arg1 == Static136.aClass10_Sub5_Sub1_1 && (arg1.anInt5073 < 1536 || arg1.anInt5016 < 1536 || arg1.anInt5073 >= 11776 || arg1.anInt5016 >= 11776)) {
			arg1.anInt5023 = -1;
			arg1.anInt5094 = 0;
			arg1.anInt5088 = 0;
			arg1.anInt5061 = -1;
			arg1.anInt5073 = arg1.anIntArray537[0] * 128 + arg1.method4186() * 64;
			arg1.anInt5016 = arg1.anIntArray535[0] * 128 + arg1.method4186() * 64;
			arg1.method4194();
		}
		Static186.method3126(arg1);
		Static240.method4069(arg1);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!ua;I)V")
	public static void method4275(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class176 arg1) {
		while (true) {
			@Pc(6) Class178 local6 = arg1.method4514(arg0);
			while (local6.anInt5649 == 0) {
				Static150.method2552(10L);
			}
			if (local6.anInt5649 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static150.method2552(100L);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!rn;)V")
	public static void method4277(@OriginalArg(1) Class155 arg0) {
		Static129.anInt2459 = arg0.method4120("runes");
	}
}
