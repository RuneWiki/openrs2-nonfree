import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
	public int anInt5494 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method4387(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5539();
			if (local9 == 0) {
				return;
			}
			this.method4388(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLclient!fh;)V")
	private void method4388(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 2) {
			this.anInt5494 = arg1.method5598();
		}
	}
}
