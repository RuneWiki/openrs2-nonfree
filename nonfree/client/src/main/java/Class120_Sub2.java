import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class120_Sub2 extends Class120 {

	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	private final int anInt5737;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	private final int anInt5744;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	private final int anInt5741;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "I")
	private final int anInt5742;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V")
	public Class120_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5737 = arg0;
		this.anInt5744 = arg3;
		this.anInt5741 = arg1;
		this.anInt5742 = arg2;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IBI)V")
	@Override
	public void method9430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	@Override
	public void method9432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt5737 * arg0 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt5742 >> 12;
		@Pc(34) int local34 = this.anInt5741 * arg1 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt5744 >> 12;
		Static438.method6364(local34, local27, super.anInt10799, local20, local41);
	}
}
