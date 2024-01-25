import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class391 {

	@OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
	public int anInt10632;

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
	public int anInt10634;

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
	public int anInt10636;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method9038(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2048(255);
			if (local5 == 0) {
				return;
			}
			this.method9041(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ika;II)V")
	private void method9041(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10634 = arg0.method2028(-14795);
			this.anInt10636 = arg0.method2048(255);
			this.anInt10632 = arg0.method2048(255);
		}
	}
}
