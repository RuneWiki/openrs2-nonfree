import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class33_Sub4 extends Class33 {

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
	private final int anInt7500;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
	private final int anInt7502;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
	private final int anInt7495;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
	private final int anInt7497;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIII)V")
	public Class33_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7500 = arg3;
		this.anInt7502 = arg0;
		this.anInt7495 = arg1;
		this.anInt7497 = arg2;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
	@Override
	public void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt7502 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt7497 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt7495 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt7500 >> 12;
		Static516.method6723(super.anInt7489, local18, super.anInt7492, local25, local39, local32);
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(III)V")
	@Override
	public void method6288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7502 * arg1 >> 12;
		@Pc(23) int local23 = this.anInt7497 * arg1 >> 12;
		@Pc(30) int local30 = this.anInt7495 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt7500 >> 12;
		Static94.method1606(local30, super.anInt7490, local10, local23, local37);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7502 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt7497 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt7495 >> 12;
		@Pc(31) int local31 = this.anInt7500 * arg1 >> 12;
		Static116.method1792(local24, local10, local31, super.anInt7492, super.anInt7489, local17, super.anInt7490);
	}
}
