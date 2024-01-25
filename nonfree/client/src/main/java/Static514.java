import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
	public static int anInt8562 = 0;

	@OriginalMember(owner = "client!sea", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[6][];

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
	public static int anInt8566 = -1;

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
	public static int anInt8567 = 100;

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
	public static int anInt8569 = 0;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	public static void method7200() {
		for (@Pc(10) Class2_Sub33 local10 = (Class2_Sub33) Static371.aClass109_36.method2325(); local10 != null; local10 = (Class2_Sub33) Static371.aClass109_36.method2318()) {
			if (local10.aBoolean434) {
				local10.method5117();
			}
		}
		for (@Pc(30) Class2_Sub33 local30 = (Class2_Sub33) Static164.aClass109_27.method2325(); local30 != null; local30 = (Class2_Sub33) Static164.aClass109_27.method2318()) {
			if (local30.aBoolean434) {
				local30.method5117();
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Z")
	public static boolean method7201(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 9 || arg0 == 1002 || arg0 == 5 || arg0 == 15;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(II)V")
	public static void method7203(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static193.aFloat16 = 3.0F;
		} else if (arg0 == 50) {
			Static193.aFloat16 = 4.0F;
		} else if (arg0 == 75) {
			Static193.aFloat16 = 6.0F;
		} else if (arg0 == 100) {
			Static193.aFloat16 = 8.0F;
		} else if (arg0 == 200) {
			Static193.aFloat16 = 16.0F;
		}
		Static160.anInt2883 = -1;
		Static160.anInt2883 = -1;
	}
}
