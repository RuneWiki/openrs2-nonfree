import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class3_Sub5_Sub19 extends Class3_Sub5 {

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
	public int anInt10543 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!dt;I)V")
	public void method8641(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method8642(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!dt;II)V")
	private void method8642(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt10543 = arg0.method7951();
		}
	}
}
