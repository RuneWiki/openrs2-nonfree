import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	public static int anInt3544;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_42 = new Class274(57, -1);

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public static void method2926() {
		for (@Pc(18) Class2_Sub3 local18 = (Class2_Sub3) Static234.aClass238_27.method5833(); local18 != null; local18 = (Class2_Sub3) Static234.aClass238_27.method5838()) {
			if (local18.anInt293 == -1) {
				local18.anInt283 = 0;
				if (local18.anInt296 >= 0 && local18.anInt286 >= 0 && local18.anInt296 < Static3.anInt46 && local18.anInt286 < Static270.anInt5194) {
					Static258.method8461(local18);
				}
			} else {
				local18.method8599();
			}
		}
	}
}
