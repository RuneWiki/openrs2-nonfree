import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class208 {

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
	public int anInt5846 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!iaa;II)V")
	private void method5014(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt5846 = arg0.method4999();
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!iaa;B)V")
	public void method5017(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4966();
			if (local9 == 0) {
				return;
			}
			this.method5014(arg0, local9);
		}
	}
}
