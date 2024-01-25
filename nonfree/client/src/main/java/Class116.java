import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class116 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public int anInt3529;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public int anInt3530;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public int anInt3531;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!bg;)V")
	private void method3248(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3530 = arg1.method4556();
			this.anInt3529 = arg1.method4532();
			this.anInt3531 = arg1.method4532();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLclient!bg;)V")
	public void method3249(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4532();
			if (local9 == 0) {
				return;
			}
			this.method3248(local9, arg0);
		}
	}
}
