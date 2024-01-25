import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class200 {

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public int anInt6197;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public int anInt6198;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	public int anInt6200;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!fb;)V")
	public void method5248(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3643();
			if (local5 == 0) {
				return;
			}
			this.method5251(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!fb;I)V")
	private void method5251(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6198 = arg0.method3649();
			this.anInt6197 = arg0.method3643();
			this.anInt6200 = arg0.method3643();
		}
	}
}
