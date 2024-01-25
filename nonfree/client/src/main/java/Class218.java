import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class218 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	public int anInt6373;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public int anInt6374;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	public int anInt6375;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Z")
	public boolean aBoolean436;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public int anInt6378;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
	public int anInt6380;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	public int anInt6377 = 16777215;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public int anInt6381 = 8;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!so;)V")
	private void method5279(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt6381 = arg1.method5900();
		} else if (arg0 == 2) {
			this.aBoolean436 = true;
		} else if (arg0 == 3) {
			this.anInt6374 = arg1.method5890();
			this.anInt6380 = arg1.method5890();
			this.anInt6375 = arg1.method5890();
		} else if (arg0 == 4) {
			this.anInt6378 = arg1.method5866();
			return;
		} else if (arg0 == 5) {
			this.anInt6373 = arg1.method5900();
			return;
		} else if (arg0 == 6) {
			this.anInt6377 = arg1.method5862();
			return;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!so;Z)V")
	public void method5280(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method5279(local9, arg0);
		}
	}
}
