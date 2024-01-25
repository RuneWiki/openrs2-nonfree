import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class270 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!qr;")
	public Class270 aClass270_2;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	public int anInt7849;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!fu;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public void method6555() {
		if (Static467.anInt8609 >= 500) {
			return;
		}
		this.anInt7849 = 0;
		this.aClass270_2 = Static434.aClass270_3;
		this.aClass11_Sub1_2 = null;
		Static434.aClass270_3 = this;
		Static467.anInt8609++;
	}
}
