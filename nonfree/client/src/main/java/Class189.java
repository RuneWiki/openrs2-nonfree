import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class189 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public int anInt4640 = 2048;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public int anInt4642 = 0;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "I")
	public int anInt4641 = 0;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public int anInt4643 = 2048;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method3699(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4641 = arg0.method5007();
		} else if (arg1 == 2) {
			this.anInt4643 = arg0.method5028();
		} else if (arg1 == 3) {
			this.anInt4640 = arg0.method5028();
		} else if (arg1 == 4) {
			this.anInt4642 = arg0.method5061();
			return;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!fh;)V")
	public void method3701(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5007();
			if (local13 == 0) {
				return;
			}
			this.method3699(arg0, local13);
		}
	}
}
