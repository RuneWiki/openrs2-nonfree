import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class98 {

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
	public int anInt2952;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Lclient!fv;")
	public Class98 aClass98_1;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "Lclient!ada;")
	public Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	public void method2517() {
		if (Static38.anInt992 >= 500) {
			return;
		}
		this.aClass6_Sub1_1 = null;
		this.anInt2952 = 0;
		this.aClass98_1 = Static340.aClass98_2;
		Static38.anInt992++;
		Static340.aClass98_2 = this;
	}
}
