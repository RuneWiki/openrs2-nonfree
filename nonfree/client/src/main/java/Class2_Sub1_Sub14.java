import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	public int anInt2940;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	public int anInt2945;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
	public int anInt2948;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!va;)V")
	public void method2119(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1461();
			if (local5 == 0) {
				return;
			}
			this.method2120(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!va;II)V")
	private void method2120(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2948 = arg0.method1456();
			this.anInt2945 = arg0.method1461();
			this.anInt2940 = arg0.method1461();
		}
	}
}
