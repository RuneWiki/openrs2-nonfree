import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
	private final int anInt8593;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	private final int anInt8590;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	private final int anInt8588;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	private final int anInt8589;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8593 = arg1;
		this.anInt8590 = arg0;
		this.anInt8588 = arg3;
		this.anInt8589 = arg2;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)V")
	@Override
	public void method7034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt8590 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt8589 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt8593 >> 12;
		@Pc(39) int local39 = this.anInt8588 * arg1 >> 12;
		Static272.method4719(super.anInt8582, local39, local18, super.anInt8583, super.anInt8586, local32, local25);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	@Override
	public void method7030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt8590 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt8589 >> 12;
		@Pc(32) int local32 = this.anInt8593 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt8588 >> 12;
		Static208.method3665(local18, local25, local32, super.anInt8582, super.anInt8586, local39);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
	@Override
	public void method7033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8590 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt8589 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt8593 >> 12;
		@Pc(31) int local31 = this.anInt8588 * arg1 >> 12;
		Static453.method7039(local10, local17, super.anInt8583, local31, local24);
	}
}
