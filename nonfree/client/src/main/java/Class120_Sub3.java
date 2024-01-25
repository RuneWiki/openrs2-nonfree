import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class120_Sub3 extends Class120 {

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
	private final int anInt6725;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	private final int anInt6726;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	private final int anInt6727;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
	private final int anInt6728;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(IIIIIII)V")
	public Class120_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6725 = arg2;
		this.anInt6726 = arg3;
		this.anInt6727 = arg1;
		this.anInt6728 = arg0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6728 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6725 >> 12;
		@Pc(24) int local24 = this.anInt6727 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt6726 * arg1 >> 12;
		Static572.method7966(super.anInt10803, local17, local31, super.anInt10799, local10, local24, super.anInt10802);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)V")
	@Override
	public void method9432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(IBI)V")
	@Override
	public void method9430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6728 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6725 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt6727 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt6726 >> 12;
		Static392.method5832(local17, local34, local41, local10, super.anInt10802);
	}
}
