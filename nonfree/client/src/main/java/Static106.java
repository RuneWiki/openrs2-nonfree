import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt2880;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_956 = Static161.method2971("sl_button");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method2062() {
		aCanvas1 = null;
		aByteArrayArray8 = null;
		aClass13_956 = null;
		anIntArray285 = null;
		anIntArray284 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)V")
	public static void method2063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static62.anInt2602 != 0 && arg1 != -1) {
			Static15.method630(Static90.aClass4_Sub1_34, arg1, Static62.anInt2602);
			Static162.aBoolean294 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!hb;B[B)V")
	public static void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class1_Sub18 local3 = new Class1_Sub18();
		local3.anInt3531 = 0;
		local3.aClass28_3 = arg1;
		local3.aLong158 = arg0;
		local3.aByteArray32 = arg2;
		@Pc(22) Class82 local22 = Static64.aClass82_5;
		synchronized (Static64.aClass82_5) {
			Static64.aClass82_5.method2853(local3);
		}
		Static58.method1368();
	}
}
