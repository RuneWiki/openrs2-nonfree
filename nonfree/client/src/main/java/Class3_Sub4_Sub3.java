import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
	public int anInt1135 = 0;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method827(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2582();
			if (local12 == 0) {
				return;
			}
			this.method828(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!cu;B)V")
	private void method828(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 2) {
			this.anInt1135 = arg1.method2588();
		}
	}
}
