import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class181 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public int anInt5482 = 2048;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	public int anInt5485 = 2048;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public int anInt5481 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public int anInt5483 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!fd;B)V")
	private void method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt5483 = arg2.method4666();
		} else if (arg1 == 2) {
			this.anInt5482 = arg2.method4653();
		} else if (arg1 == 3) {
			this.anInt5485 = arg2.method4653();
		} else if (arg1 == 4) {
			this.anInt5481 = arg2.method4613();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!fd;I)V")
	public void method4475(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method4666();
			if (local5 == 0) {
				return;
			}
			this.method4474(arg1, local5, arg0);
		}
	}
}
