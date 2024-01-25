import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class188 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public int anInt4703 = 0;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public int anInt4707 = 2048;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public int anInt4708 = 2048;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public int anInt4709 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!mo;B)V")
	public void method3806(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5750();
			if (local17 == 0) {
				return;
			}
			this.method3807(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!mo;Z)V")
	private void method3807(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			this.anInt4709 = arg1.method5750();
		} else if (arg0 == 2) {
			this.anInt4708 = arg1.method5771();
		} else if (arg0 == 3) {
			this.anInt4707 = arg1.method5771();
		} else if (arg0 == 4) {
			this.anInt4703 = arg1.method5738();
		}
	}
}
