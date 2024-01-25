import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class211 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public int anInt6888;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public int anInt6893;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public int anInt6895;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!dg;B)V")
	private void method5937(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt6888 = arg1.method4464();
			this.anInt6893 = arg1.method4421();
			this.anInt6895 = arg1.method4421();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!dg;)V")
	public void method5942(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4421();
			if (local9 == 0) {
				return;
			}
			this.method5937(local9, arg0);
		}
	}
}
