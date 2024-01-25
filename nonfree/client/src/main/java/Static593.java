import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static593 {

	@OriginalMember(owner = "client!us", name = "d", descriptor = "Lclient!mha;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "Lclient!en;")
	public static final Class100 aClass100_6 = new Class100();

	@OriginalMember(owner = "client!us", name = "c", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!us", name = "e", descriptor = "J")
	public static long aLong250 = 0L;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
	public static void method8369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static31.method728(arg1)) {
			Static30.method656(arg0, Static261.aClass303ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!rba;ZZ)V")
	public static void method8370(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean582 = arg1;
		if (Static573.aBoolean668) {
			Static307.aClass182Array1[Static307.aClass182Array1.length - 1].method4411(arg0);
		} else {
			Static433.method6272(arg0, Static20.aClass2_Sub12Array1);
		}
	}
}
