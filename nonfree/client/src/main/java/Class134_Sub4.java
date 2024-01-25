import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class134_Sub4 extends Class134 {

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	private final int anInt9230;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
	private final int anInt9235;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	private final int anInt9233;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	private final int anInt9227;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIII)V")
	public Class134_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt9230 = arg3;
		this.anInt9235 = arg0;
		this.anInt9233 = arg2;
		this.anInt9227 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
	@Override
	public void method8052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	@Override
	public void method8051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt9235 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt9233 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt9227 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt9230 >> 12;
		Static519.method7510(super.anInt9222, local10, local17, local31, local38);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
