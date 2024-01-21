import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!he", name = "P", descriptor = "I")
	public int anInt1421 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!ja;I)V")
	private void method1145(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1421 = arg0.method2933();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!ja;)V")
	public void method1146(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2962();
			if (local5 == 0) {
				return;
			}
			this.method1145(arg0, local5);
		}
	}
}
