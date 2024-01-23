import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class172 {

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public int anInt5438;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public int anInt5442;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public int anInt5445;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ug;II)V")
	private void method4414(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5445 = arg0.method3948();
			this.anInt5442 = arg0.method3915();
			this.anInt5438 = arg0.method3915();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!ug;)V")
	public void method4419(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3915();
			if (local16 == 0) {
				return;
			}
			this.method4414(arg0, local16);
		}
	}
}
