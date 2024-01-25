import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	private final int anInt5330;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	private final int anInt5325;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	private final int anInt5326;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	private final int anInt5331;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIII)V")
	public Class31_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5330 = arg2;
		this.anInt5325 = arg0;
		this.anInt5326 = arg3;
		this.anInt5331 = arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	@Override
	public void method5444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
	@Override
	public void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5325 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5330 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5331 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5326 >> 12;
		Static119.method1745(local24, super.anInt6939, local17, local10, local31);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)V")
	@Override
	public void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
