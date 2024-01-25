import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt5339;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	public static int anInt5345;

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
	public static int anInt5335 = 0;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "Z")
	public static boolean aBoolean344 = true;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "[I")
	public static final int[] anIntArray316 = new int[64];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)V")
	public static void method4802(@OriginalArg(1) int arg0) {
		if (Static577.aClass5_Sub19_25.aClass17_Sub5_1.method1236() == 0) {
			arg0 = -1;
		}
		if (Static469.anInt7627 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(31) Class323 local31 = Static458.aClass233_1.method5211(arg0);
			@Pc(35) Class362 local35 = local31.method7359();
			if (local35 == null) {
				arg0 = -1;
			} else {
				Static681.aClass349_6.method7740(local35.method8278(), local35.method8272(), Static357.aCanvas8, local35.method8277(), new Point(local31.anInt8534, local31.anInt8533));
				Static469.anInt7627 = arg0;
			}
		}
		if (arg0 == -1 && Static469.anInt7627 != -1) {
			Static681.aClass349_6.method7740(-1, (int[]) null, Static357.aCanvas8, -1, new Point());
			Static469.anInt7627 = -1;
		}
	}
}
