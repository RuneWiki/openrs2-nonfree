import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	private final int anInt4138;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private final int anInt4136;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	private final int anInt4137;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	private final int anInt4132;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIII)V")
	public Class110_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4138 = arg1;
		this.anInt4136 = arg3;
		this.anInt4137 = arg2;
		this.anInt4132 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4132 >> 12;
		@Pc(17) int local17 = this.anInt4137 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt4138 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4136 >> 12;
		Static410.method5765(local24, super.anInt9840, local31, local10, local17);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	@Override
	public void method7735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
