import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class64 {

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public int anInt1418;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Lclient!kr;")
	public Class67_Sub3 aClass67_Sub3_1;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Lclient!em;")
	public Class64 aClass64_2;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public void method1148() {
		if (Static189.anInt625 >= 500) {
			return;
		}
		this.anInt1418 = 0;
		this.aClass64_2 = Static15.aClass64_6;
		this.aClass67_Sub3_1 = null;
		Static189.anInt625++;
		Static15.aClass64_6 = this;
	}
}
