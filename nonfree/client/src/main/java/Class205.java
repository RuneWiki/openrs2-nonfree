import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class205 {

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public int anInt6230 = 2048;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
	public int anInt6229 = 0;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public int anInt6226 = 2048;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public int anInt6224 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!bg;III)V")
	private void method5274(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt6229 = arg0.method4532();
		} else if (arg2 == 2) {
			this.anInt6226 = arg0.method4556();
		} else if (arg2 == 3) {
			this.anInt6230 = arg0.method4556();
		} else if (arg2 == 4) {
			this.anInt6224 = arg0.method4551();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!bg;I)V")
	public void method5275(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method4532();
			if (local14 == 0) {
				return;
			}
			this.method5274(arg0, arg1, local14);
		}
	}
}
