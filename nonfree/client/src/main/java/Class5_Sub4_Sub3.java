import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class5_Sub4_Sub3 extends Class5_Sub4 {

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
	public int anInt1093 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLclient!ee;)V")
	private void method1132(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 2) {
			this.anInt1093 = arg1.method8631();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method1135(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method1132(local5, arg0);
		}
	}
}
