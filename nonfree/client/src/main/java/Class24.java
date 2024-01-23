import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class24 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public int anInt606 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!ug;)V")
	public void method506(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3915();
			if (local9 == 0) {
				return;
			}
			this.method507(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ug;II)V")
	private void method507(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt606 = arg0.method3948();
		}
	}
}
