import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class176 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public int anInt5446 = 0;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	public int anInt5449 = 2048;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public int anInt5447 = 2048;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public int anInt5454 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!fb;I)V")
	public void method4587(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3643();
			if (local5 == 0) {
				return;
			}
			this.method4589(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILclient!fb;)V")
	private void method4589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub4 arg2) {
		if (arg1 == 1) {
			this.anInt5454 = arg2.method3643();
		} else if (arg1 == 2) {
			this.anInt5449 = arg2.method3649();
		} else if (arg1 == 3) {
			this.anInt5447 = arg2.method3649();
		} else if (arg1 == 4) {
			this.anInt5446 = arg2.method3622();
		}
	}
}
