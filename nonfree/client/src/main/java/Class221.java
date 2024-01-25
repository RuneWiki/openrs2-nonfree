import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class221 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public int anInt5562 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!rp;)V")
	private void method5023(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 == 5) {
			this.anInt5562 = arg1.method2767();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method5025(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2739();
			if (local9 == 0) {
				return;
			}
			this.method5023(local9, arg0);
		}
	}
}
