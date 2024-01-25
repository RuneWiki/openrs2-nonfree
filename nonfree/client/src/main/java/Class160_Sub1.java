import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
	private final int anInt4745;

	@OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
	private final int anInt4746;

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
	private final int anInt4744;

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "I")
	private final int anInt4741;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIIII)V")
	public Class160_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4745 = arg2;
		this.anInt4746 = arg1;
		this.anInt4744 = arg0;
		this.anInt4741 = arg3;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)V")
	@Override
	public void method8042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt4744 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt4745 >> 12;
		@Pc(28) int local28 = this.anInt4746 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt4741 >> 12;
		Static542.method7602(local14, super.anInt9562, local35, local21, local28);
	}
}
