import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class182 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public int anInt4678;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public int anInt4680;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	public int anInt4683;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!dga;B)V")
	public void method4031(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method4033(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILclient!dga;)V")
	private void method4033(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4680 = arg1.method6006();
			this.anInt4678 = arg1.method6041();
			this.anInt4683 = arg1.method6041();
		}
	}
}
