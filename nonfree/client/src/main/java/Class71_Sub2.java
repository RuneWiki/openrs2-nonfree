import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
	private final int anInt6501;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	private final int anInt6494;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	private final int anInt6495;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	private final int anInt6499;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class71_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6501 = arg1;
		this.anInt6494 = arg2;
		this.anInt6495 = arg0;
		this.anInt6499 = arg3;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt6495 >> 12;
		@Pc(25) int local25 = this.anInt6494 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt6501 >> 12;
		@Pc(39) int local39 = this.anInt6499 * arg1 >> 12;
		Static4.method24(super.anInt6816, super.anInt6815, local32, local25, super.anInt6817, local39, local18);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6495 >> 12;
		@Pc(17) int local17 = this.anInt6494 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6501 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt6499 >> 12;
		Static8.method4682(local17, local24, super.anInt6816, local10, local38, super.anInt6817);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6495 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6494 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt6501 >> 12;
		@Pc(37) int local37 = this.anInt6499 * arg0 >> 12;
		Static415.method5327(local10, local37, local30, super.anInt6815, local17);
	}
}
