import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class212 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public int anInt6046;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	public int anInt6048;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public int anInt6051;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!nn;Z)V")
	private void method4780(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6046 = arg1.method2485();
			this.anInt6051 = arg1.method2502();
			this.anInt6048 = arg1.method2502();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLclient!nn;)V")
	public void method4781(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2502();
			if (local12 == 0) {
				return;
			}
			this.method4780(local12, arg0);
		}
	}
}
