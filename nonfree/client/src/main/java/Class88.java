import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class88 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public int anInt3277;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public int anInt3279;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "I")
	public int anInt3285;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!im;II)V")
	private void method2585(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3279 = arg0.method2652();
			this.anInt3277 = arg0.method2655();
			this.anInt3285 = arg0.method2655();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!im;B)V")
	public void method2590(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2655();
			if (local9 == 0) {
				return;
			}
			this.method2585(arg0, local9);
		}
	}
}
