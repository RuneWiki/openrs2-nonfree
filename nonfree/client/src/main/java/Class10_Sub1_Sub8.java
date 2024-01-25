import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class10_Sub1_Sub8 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
	public int anInt3749 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!nn;)V")
	public void method3000(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2502();
			if (local17 == 0) {
				return;
			}
			this.method3001(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!nn;II)V")
	private void method3001(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt3749 = arg0.method2485();
		}
	}
}
