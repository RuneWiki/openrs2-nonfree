import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!rw;")
	public static final Class284 aClass284_4 = new Class284(128);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)Lclient!vu;")
	public static Class102_Sub8 method7350() {
		@Pc(8) Class102_Sub8 local8 = (Class102_Sub8) Static89.aClass249_2.method5812();
		if (local8 == null) {
			return new Class102_Sub8();
		} else {
			Static559.anInt9370--;
			return local8;
		}
	}
}
