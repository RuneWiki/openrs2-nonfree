import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
	public static int anInt5727;

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!lba", name = "B", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_103 = new Class322(53, 6);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public static void method5170() {
		if (Static202.aClass75_5.method6670()) {
			Static202.aClass75_5.method6708(Static4.aCanvas1);
			Static650.method8725();
			if (Static93.aBoolean113) {
				Static683.method8971(Static4.aCanvas1);
			} else {
				@Pc(27) Dimension local27 = Static4.aCanvas1.getSize();
				Static202.aClass75_5.method6652(Static4.aCanvas1, local27.width, local27.height);
			}
			Static202.aClass75_5.method6657(Static4.aCanvas1);
		} else {
			Static536.method7652(false, Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431());
		}
		Static35.method456();
		Static429.aBoolean549 = true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)V")
	public static void method5172(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static319.aBooleanArray17[arg0]) {
			Static552.aClass223_106.method5256(arg0);
			Static686.aClass381ArrayArray2[arg0] = null;
			Static431.aClass381ArrayArray1[arg0] = null;
			Static319.aBooleanArray17[arg0] = false;
		}
	}
}
