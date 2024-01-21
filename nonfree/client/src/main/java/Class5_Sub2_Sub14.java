import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!o", name = "M", descriptor = "I")
	public int anInt2778;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public int anInt2779;

	@OriginalMember(owner = "client!o", name = "R", descriptor = "I")
	public int anInt2783;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!ce;)V")
	private void method2062(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt2779 = arg1.method3077();
			this.anInt2783 = arg1.method3062();
			this.anInt2778 = arg1.method3062();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method2063(@OriginalArg(0) Class5_Sub6 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3062();
			if (local10 == 0) {
				return;
			}
			this.method2062(local10, arg0);
		}
	}
}
