import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class4_Sub2_Sub7 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
	public int anInt1106 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!fh;)V")
	public void method864(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5007();
			if (local5 == 0) {
				return;
			}
			this.method865(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method865(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1106 = arg0.method5028();
		}
	}
}
