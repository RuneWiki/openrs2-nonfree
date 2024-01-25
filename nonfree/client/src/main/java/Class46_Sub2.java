import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!me", name = "s", descriptor = "I")
	private final int anInt4484;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	private final int anInt4480;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	private final int anInt4476;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	private final int anInt4483;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIII)V")
	public Class46_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4484 = arg3;
		this.anInt4480 = arg0;
		this.anInt4476 = arg1;
		this.anInt4483 = arg2;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 * this.anInt4480 >> 12;
		@Pc(20) int local20 = this.anInt4483 * arg1 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt4476 >> 12;
		@Pc(34) int local34 = this.anInt4484 * arg0 >> 12;
		Static87.method1047(local20, local34, super.anInt7287, local27, local13);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
