import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class234 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
	public int anInt6129 = 2048;

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
	public int anInt6131 = 0;

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
	public int anInt6132 = 2048;

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
	public int anInt6134 = 0;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method5545(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8632();
			if (local5 == 0) {
				return;
			}
			this.method5547(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method5547(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6134 = arg0.method8632();
		} else if (arg1 == 2) {
			this.anInt6132 = arg0.method8593();
		} else if (arg1 == 3) {
			this.anInt6129 = arg0.method8593();
		} else if (arg1 == 4) {
			this.anInt6131 = arg0.method8589();
			return;
		}
	}
}
