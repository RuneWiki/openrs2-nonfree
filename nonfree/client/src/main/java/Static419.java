import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIB)V")
	public static void method5599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static445.anInt7122 == 2) {
			Static440.anInt7072 = local11;
			Static338.anInt5355 = local15;
			Static161.anInt2901 = 0;
		}
		Static440.aFloat144 = local15;
		Static339.aFloat100 = local11;
		Static222.method3034();
		Static68.aBoolean87 = true;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Z")
	public static boolean method5600() {
		try {
			@Pc(7) Class110 local7 = new Class110();
			@Pc(17) byte[] local17 = local7.method2432(Static411.aByteArray77);
			Static345.method4632(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V")
	public static void method5603() {
		Static573.method7860();
		Static324.aClass12_1 = null;
		Static113.aClass350ArrayArray1 = null;
		Static566.aClass95_14 = null;
		Static386.aClass12_2 = null;
		Static608.aClass12_4 = null;
	}
}
