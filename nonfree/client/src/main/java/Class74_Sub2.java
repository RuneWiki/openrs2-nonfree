import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
	private int anInt4928;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	private int anInt4923;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	private int anInt4932;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	private int anInt4933;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIII)V")
	public Class74_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4928 = arg0;
		this.anInt4923 = arg3;
		this.anInt4932 = arg2;
		this.anInt4933 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V")
	@Override
	public void method4818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4928 >> 12;
		@Pc(25) int local25 = this.anInt4932 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4923 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt4933 >> 12;
		Static268.method4455(this.anInt6029, local25, local10, local32, local39);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V")
	@Override
	public void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt4932 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt4928 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt4933 >> 12;
		@Pc(35) int local35 = this.anInt4923 * arg0 >> 12;
		Static177.method3089(local35, this.anInt6030, local28, this.anInt6022, local6, local21, this.anInt6029);
	}
}
