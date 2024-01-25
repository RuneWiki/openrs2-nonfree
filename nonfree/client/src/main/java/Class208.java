import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class208 {

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
	public int anInt6542;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
	public int anInt6544;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
	public int anInt6548;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!kh;I)V")
	public void method5565(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method5185();
			if (local19 == 0) {
				return;
			}
			this.method5566(arg0, local19);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!kh;II)V")
	private void method5566(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6542 = arg0.method5187();
			this.anInt6544 = arg0.method5185();
			this.anInt6548 = arg0.method5185();
		}
	}
}
