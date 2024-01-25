import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class30 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Z")
	public boolean aBoolean71;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
	public int anInt794 = 16777215;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	public int anInt799 = 8;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt799 = arg1.method3555();
		} else if (arg0 == 2) {
			this.aBoolean71 = true;
		} else if (arg0 == 3) {
			this.anInt800 = arg1.method3558();
			this.anInt803 = arg1.method3558();
			this.anInt802 = arg1.method3558();
		} else if (arg0 == 4) {
			this.anInt792 = arg1.method3580();
		} else if (arg0 == 5) {
			this.anInt804 = arg1.method3555();
		} else if (arg0 == 6) {
			this.anInt794 = arg1.method3563();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!sv;I)V")
	public void method649(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3580();
			if (local14 == 0) {
				return;
			}
			this.method644(local14, arg0);
		}
	}
}
