import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class103 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public int anInt3088;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!sa;")
	public Class25_Sub1 aClass25_Sub1_1;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!jq;")
	public Class103 aClass103_2;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	public void method2889() {
		if (Static317.anInt6153 >= 500) {
			return;
		}
		this.anInt3088 = 0;
		this.aClass25_Sub1_1 = null;
		this.aClass103_2 = Static211.aClass103_3;
		Static211.aClass103_3 = this;
		Static317.anInt6153++;
	}
}
