import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ha", name = "nb", descriptor = "I")
	public int anInt1315 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!b;)V")
	public void method845(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1495();
			if (local5 == 0) {
				return;
			}
			this.method847(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!b;II)V")
	private void method847(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt1315 = arg0.method1500();
		}
	}
}
