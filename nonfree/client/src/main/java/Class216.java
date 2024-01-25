import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class216 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	public int anInt6229;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!hw;)V")
	private void method4963(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt6225 = arg1.method6148();
			this.anInt6229 = arg1.method6138();
			this.anInt6230 = arg1.method6138();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!hw;)V")
	public void method4965(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method6138();
			if (local14 == 0) {
				return;
			}
			this.method4963(local14, arg0);
		}
	}
}
