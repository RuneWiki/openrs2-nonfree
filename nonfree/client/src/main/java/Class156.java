import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class156 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public int anInt4697;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public int anInt4699;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public int anInt4701;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public int anInt4707;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public int anInt4704 = 16777215;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public int anInt4708 = 8;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!fd;I)V")
	private void method3920(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4708 = arg1.method4653();
		} else if (arg2 == 2) {
			this.aBoolean328 = true;
		} else if (arg2 == 3) {
			this.anInt4697 = arg1.method4613();
			this.anInt4698 = arg1.method4613();
			this.anInt4701 = arg1.method4613();
		} else if (arg2 == 4) {
			this.anInt4707 = arg1.method4666();
		} else if (arg2 == 5) {
			this.anInt4699 = arg1.method4653();
		} else if (arg2 == 6) {
			this.anInt4704 = arg1.method4655();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BILclient!fd;)V")
	public void method3923(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4666();
			if (local9 == 0) {
				return;
			}
			this.method3920(arg0, arg1, local9);
		}
	}
}
