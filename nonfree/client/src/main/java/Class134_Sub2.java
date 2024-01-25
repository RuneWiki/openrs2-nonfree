import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class134_Sub2 extends Class134 {

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
	private final int anInt8131;

	@OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
	private final int anInt8135;

	@OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
	private final int anInt8136;

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "I")
	private final int anInt8134;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class134_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8131 = arg0;
		this.anInt8135 = arg2;
		this.anInt8136 = arg3;
		this.anInt8134 = arg1;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(III)V")
	@Override
	public void method8052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8131 >> 12;
		@Pc(17) int local17 = this.anInt8135 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt8134 >> 12;
		@Pc(36) int local36 = this.anInt8136 * arg1 >> 12;
		Static21.method243(local17, local29, local36, local10, super.anInt9223);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt8131 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt8135 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt8134 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt8136 * arg1 >> 12;
		Static414.method6394(local10, super.anInt9224, local17, super.anInt9222, super.anInt9223, local38, local31);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
	@Override
	public void method8051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8131 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt8135 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt8134 >> 12;
		@Pc(36) int local36 = this.anInt8136 * arg1 >> 12;
		Static332.method5162(local10, local36, local17, super.anInt9224, super.anInt9222, local29);
	}
}
