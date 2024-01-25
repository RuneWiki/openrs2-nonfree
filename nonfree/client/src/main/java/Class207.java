import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class207 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public int anInt5483;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public int anInt5486;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
	public int anInt5489;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method4402(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2915();
			if (local13 == 0) {
				return;
			}
			this.method4403(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!wm;BI)V")
	private void method4403(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5483 = arg0.method2896();
			this.anInt5486 = arg0.method2915();
			this.anInt5489 = arg0.method2915();
		}
	}
}
