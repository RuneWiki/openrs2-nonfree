import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class46 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!dg;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public int anInt1089;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!wt;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public void method925() {
		if (Static203.anInt3754 >= 500) {
			return;
		}
		this.aClass1_Sub5_1 = null;
		this.anInt1089 = 0;
		this.aClass46_1 = Static299.aClass46_2;
		Static299.aClass46_2 = this;
		Static203.anInt3754++;
	}
}
