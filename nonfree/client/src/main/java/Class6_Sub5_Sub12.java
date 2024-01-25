import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class6_Sub5_Sub12 extends Class6_Sub5 {

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
	public int anInt5543 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!jr;)V")
	public void method4566(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6019();
			if (local5 == 0) {
				return;
			}
			this.method4569(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!jr;II)V")
	private void method4569(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt5543 = arg0.method6044();
		}
	}
}
