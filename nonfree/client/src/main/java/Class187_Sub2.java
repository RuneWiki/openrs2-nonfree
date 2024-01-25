import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class187_Sub2 extends Class187 {

	@OriginalMember(owner = "client!og", name = "s", descriptor = "I")
	private final int anInt6358;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	private final int anInt6354;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	private final int anInt6353;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	private final int anInt6356;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIII)V")
	public Class187_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6358 = arg0;
		this.anInt6354 = arg3;
		this.anInt6353 = arg2;
		this.anInt6356 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	@Override
	public void method6715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(III)V")
	@Override
	public void method6720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6358 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6353 >> 12;
		@Pc(28) int local28 = this.anInt6356 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt6354 >> 12;
		Static103.method7655(super.anInt8298, local10, local28, local35, local17);
	}
}
