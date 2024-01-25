import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class273 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!pb;")
	public Class273 aClass273_114;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!vv;")
	public Class8_Sub1_Sub3 aClass8_Sub1_Sub3_1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method6495() {
		if (Static137.anInt2258 < 500) {
			this.aClass8_Sub1_Sub3_1 = null;
			this.aClass273_114 = Static362.aClass273_168;
			Static362.aClass273_168 = this;
			Static137.anInt2258++;
		}
	}
}
