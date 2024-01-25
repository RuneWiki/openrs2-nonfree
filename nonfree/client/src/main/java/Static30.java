import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)V")
	public static void method1110(@OriginalArg(0) int arg0) {
		if (Static155.aClass8_Sub25_6.aClass36_Sub24_1.method7400() == 0) {
			arg0 = -1;
		}
		if (Static601.anInt10242 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(28) Class167 local28 = Static454.aClass166_2.method4635(arg0);
			@Pc(32) Class111 local32 = local28.method4643();
			if (local32 == null) {
				arg0 = -1;
			} else {
				Static51.aClass118_1.method3397(local32.method3290(), local32.method3296(), Static549.aCanvas13, local32.method3287(), new Point(local28.anInt5698, local28.anInt5694));
				Static601.anInt10242 = arg0;
			}
		}
		if (arg0 == -1 && Static601.anInt10242 != -1) {
			Static51.aClass118_1.method3397(-1, -1, Static549.aCanvas13, null, new Point());
			Static601.anInt10242 = -1;
		}
	}
}
