import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage6;

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)V")
	public static void method2301() {
		Static406.anInt7454 = 2;
		Static141.anInt2838 = 0;
		Static402.aClass196_83 = null;
		Static495.anInt8540 = -1;
		Static236.aClass3_Sub7_Sub2_1 = null;
		Static185.aBoolean342 = false;
		Static324.anInt8117 = 1;
		Static563.anInt9401 = -1;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!sl;)Lclient!hj;")
	public static Class141_Sub1 method2303(@OriginalArg(1) Class3_Sub3 arg0) {
		return new Class141_Sub1(arg0.method4209(), arg0.method4209(), arg0.method4209(), arg0.method4209(), arg0.method4204(), arg0.method4225());
	}
}
