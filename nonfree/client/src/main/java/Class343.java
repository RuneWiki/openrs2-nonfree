import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sla")
public final class Class343 {

	@OriginalMember(owner = "client!sla", name = "f", descriptor = "Lclient!qfa;")
	public Class19_Sub1_Sub3 aClass19_Sub1_Sub3_1;

	@OriginalMember(owner = "client!sla", name = "b", descriptor = "Lclient!sla;")
	public Class343 aClass343_4;

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(Z)V")
	public void method8101() {
		if (Static283.anInt5144 < 500) {
			this.aClass343_4 = Static57.aClass343_3;
			this.aClass19_Sub1_Sub3_1 = null;
			Static283.anInt5144++;
			Static57.aClass343_3 = this;
		}
	}
}
