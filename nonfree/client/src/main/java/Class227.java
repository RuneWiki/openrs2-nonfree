import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class227 {

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "[I")
	public int[] anIntArray536;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6299 = -1;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	public int anInt6297 = -1;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!si;II)V")
	private void method4991(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6297 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anIntArray536 = new int[arg0.method5495()];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray536.length; local19++) {
				this.anIntArray536[local19] = arg0.method5500();
			}
		} else if (arg1 == 3) {
			this.anInt6299 = arg0.method5495();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLclient!si;)V")
	public void method4994(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5495();
			if (local14 == 0) {
				return;
			}
			this.method4991(arg0, local14);
		}
	}
}
