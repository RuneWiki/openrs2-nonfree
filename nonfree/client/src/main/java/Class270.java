import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class270 {

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	public int anInt7523;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Lclient!mv;")
	public Class26_Sub2 aClass26_Sub2_2;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!wt;")
	public Class270 aClass270_3;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public void method5794() {
		if (Static400.anInt5905 >= 500) {
			return;
		}
		this.aClass270_3 = Static378.aClass270_2;
		this.aClass26_Sub2_2 = null;
		this.anInt7523 = 0;
		Static378.aClass270_2 = this;
		Static400.anInt5905++;
	}
}
