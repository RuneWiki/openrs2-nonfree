import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static625 {

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "Z")
	public static boolean aBoolean872 = false;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "Lclient!mw;")
	public static final Class239 aClass239_7 = new Class239();

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
	public static int anInt10224 = 0;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(B)V")
	public static void method8464() {
		if (Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 0 && Static481.anInt8082 != Static419.anInt7416) {
			Static393.method5767(Static427.anInt7491, false, Static436.anInt7546, 11);
		} else {
			Static179.method2889(Static208.aClass65_7);
			if (Static183.anInt3589 != Static481.anInt8082) {
				Static634.method8552();
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(III)B")
	public static byte method8465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
