import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class322 {

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
	public int anInt9192 = 0;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!ig;II)V")
	private void method7518(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt9192 = arg0.method8578();
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!ig;)V")
	public void method7519(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8525();
			if (local11 == 0) {
				return;
			}
			this.method7518(arg0, local11);
		}
	}
}
