import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class302 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public int anInt9079;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!mca;")
	public Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Lclient!sr;")
	public Class302 aClass302_2;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	public void method7423() {
		if (Static594.anInt10394 >= 500) {
			return;
		}
		this.aClass302_2 = Static503.aClass302_3;
		this.aClass2_Sub2_1 = null;
		this.anInt9079 = 0;
		Static594.anInt10394++;
		Static503.aClass302_3 = this;
	}
}
