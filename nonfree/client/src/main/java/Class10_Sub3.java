import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
	private final int anInt4747;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	private final int anInt4736;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
	private final int anInt4746;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	private final int anInt4735;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(IIIIII)V")
	public Class10_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4747 = arg2;
		this.anInt4736 = arg3;
		this.anInt4746 = arg0;
		this.anInt4735 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V")
	@Override
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BII)V")
	@Override
	public void method4800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(III)V")
	@Override
	public void method4801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt4746 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt4747 >> 12;
		@Pc(30) int local30 = this.anInt4735 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt4736 * arg0 >> 12;
		Static316.method5327(local16, super.anInt5381, local23, local30, local37);
	}
}
