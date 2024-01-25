import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!m", name = "r", descriptor = "I")
	private final int anInt5744;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	private final int anInt5740;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private final int anInt5738;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	private final int anInt5737;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIII)V")
	public Class125_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5744 = arg1;
		this.anInt5740 = arg2;
		this.anInt5738 = arg0;
		this.anInt5737 = arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	@Override
	public void method8246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt5738 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt5740 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt5744 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt5737 >> 12;
		Static32.method4588(0, super.anInt9675, local32, local18, local39, local25);
	}
}
