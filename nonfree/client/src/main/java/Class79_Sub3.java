import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class79_Sub3 extends Class79 {

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	private final int anInt4084;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
	private final int anInt4083;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	private final int anInt4080;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	private final int anInt4079;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class79_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4084 = arg0;
		this.anInt4083 = arg1;
		this.anInt4080 = arg2;
		this.anInt4079 = arg3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	@Override
	public void method5114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt4084 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt4080 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4083 >> 12;
		@Pc(39) int local39 = this.anInt4079 * arg1 >> 12;
		Static6.method206(local32, local39, local18, local25, super.anInt5792);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4084 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt4080 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt4083 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4079 >> 12;
		Static254.method4614(super.anInt5793, local10, super.anInt5794, local17, local24, local31);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
	@Override
	public void method5119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4084 >> 12;
		@Pc(25) int local25 = this.anInt4080 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4083 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt4079 >> 12;
		Static257.method4679(super.anInt5794, local32, super.anInt5793, local10, local25, local39, super.anInt5792);
	}
}
