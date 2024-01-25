import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class231 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
	public int anInt6766;

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
	public int anInt6768;

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
	public int anInt6769;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!so;I)V")
	public void method5489(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method5490(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILclient!so;)V")
	private void method5490(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt6766 = arg1.method5900();
			this.anInt6768 = arg1.method5866();
			this.anInt6769 = arg1.method5866();
		}
	}
}
