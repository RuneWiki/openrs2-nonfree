import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public final class Class243 {

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "Lclient!oga;")
	public Class243 aClass243_3;

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "Lclient!jb;")
	public Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
	public void method6494() {
		if (Static467.anInt8766 < 500) {
			this.aClass3_Sub1_Sub3_1 = null;
			this.aClass243_3 = Static207.aClass243_2;
			Static207.aClass243_2 = this;
			Static467.anInt8766++;
		}
	}
}
