import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!on", name = "t", descriptor = "I")
	private final int anInt5179;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "I")
	private final int anInt5170;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	private final int anInt5172;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "I")
	private final int anInt5175;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5179 = arg0;
		this.anInt5170 = arg3;
		this.anInt5172 = arg2;
		this.anInt5175 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(III)V")
	@Override
	public void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(III)V")
	@Override
	public void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5179 >> 12;
		@Pc(17) int local17 = this.anInt5172 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5175 >> 12;
		@Pc(31) int local31 = this.anInt5170 * arg0 >> 12;
		Static319.method4564(super.anInt6934, super.anInt6936, local31, local24, local17, local10, super.anInt6939);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	@Override
	public void method5444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 * this.anInt5179 >> 12;
		@Pc(20) int local20 = this.anInt5172 * arg1 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt5175 >> 12;
		@Pc(34) int local34 = this.anInt5170 * arg0 >> 12;
		Static408.method5529(local34, local13, local20, super.anInt6936, local27);
	}
}
