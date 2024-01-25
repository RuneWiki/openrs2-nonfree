import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class160 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	public int anInt4805;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public int anInt4808;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
	public int anInt4810;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
	public int anInt4812;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
	public int anInt4814;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
	public int anInt4807 = 8;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	public int anInt4809 = 16777215;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method4125(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4966();
			if (local13 == 0) {
				return;
			}
			this.method4127(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!iaa;I)V")
	private void method4127(@OriginalArg(1) Class6_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4807 = arg0.method4999();
		} else if (arg1 == 2) {
			this.aBoolean374 = true;
		} else if (arg1 == 3) {
			this.anInt4814 = arg0.method4974();
			this.anInt4810 = arg0.method4974();
			this.anInt4812 = arg0.method4974();
		} else if (arg1 == 4) {
			this.anInt4808 = arg0.method4966();
		} else if (arg1 == 5) {
			this.anInt4805 = arg0.method4999();
		} else if (arg1 == 6) {
			this.anInt4809 = arg0.method4949();
			return;
		}
	}
}
