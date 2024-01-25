import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!lba", name = "K", descriptor = "I")
	public static int anInt5319;

	@OriginalMember(owner = "client!lba", name = "L", descriptor = "Lclient!ro;")
	public static Class306 aClass306_3;

	@OriginalMember(owner = "client!lba", name = "F", descriptor = "Lclient!qaa;")
	public static final Class5_Sub40 aClass5_Sub40_1 = new Class5_Sub40(0, -1);

	@OriginalMember(owner = "client!lba", name = "N", descriptor = "I")
	public static int anInt5321 = 0;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!ofa;)Lclient!sd;")
	public static Class314 method4758(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(12) int local12 = arg0.method5913();
		return new Class314(local12);
	}

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "(I)V")
	public static void method4759() {
		for (@Pc(10) Class5_Sub44 local10 = (Class5_Sub44) Static174.aClass330_14.method7908(); local10 != null; local10 = (Class5_Sub44) Static174.aClass330_14.method7914()) {
			if (local10.anInt8641 > 0) {
				local10.anInt8641--;
			}
			if (local10.anInt8641 != 0) {
				if (local10.anInt8648 > 0) {
					local10.anInt8648--;
				}
				if (local10.anInt8648 == 0 && local10.anInt8645 >= 1 && local10.anInt8639 >= 1 && local10.anInt8645 <= Static326.anInt5541 - 2 && Static448.anInt7637 - 2 >= local10.anInt8639 && (local10.anInt8652 < 0 || Static241.method4009(local10.anInt8646, local10.anInt8652))) {
					Static261.method4263(local10.anInt8642, local10.anInt8639, local10.anInt8646, local10.anInt8652, -1, local10.anInt8645, local10.anInt8650, local10.anInt8640);
					local10.anInt8648 = -1;
					if (local10.anInt8652 == local10.anInt8643 && local10.anInt8643 == -1) {
						local10.method9047();
					} else if (local10.anInt8652 == local10.anInt8643 && local10.anInt8644 == local10.anInt8650 && local10.anInt8649 == local10.anInt8646) {
						local10.method9047();
					}
				}
			} else if (local10.anInt8643 < 0 || Static241.method4009(local10.anInt8649, local10.anInt8643)) {
				Static261.method4263(local10.anInt8642, local10.anInt8639, local10.anInt8649, local10.anInt8643, -1, local10.anInt8645, local10.anInt8644, local10.anInt8640);
				local10.method9047();
			}
		}
	}
}
