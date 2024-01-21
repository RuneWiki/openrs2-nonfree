import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	private final int anInt1568;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	private final int anInt1565;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	private final int anInt1558;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	private final int anInt1561;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class33_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1568 = arg2;
		this.anInt1565 = arg0;
		this.anInt1558 = arg3;
		this.anInt1561 = arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	@Override
	public void method2267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt1568 >> 12;
		@Pc(25) int local25 = this.anInt1561 * arg0 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt1558 >> 12;
		@Pc(39) int local39 = this.anInt1565 * arg1 >> 12;
		Static34.method616(super.anInt3060, super.anInt3058, local25, local39, local14, local32, super.anInt3057);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)V")
	@Override
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)V")
	@Override
	public void method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1565 * arg0 >> 12;
		@Pc(13) int local13 = this.anInt1568 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt1558 * arg1 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt1561 >> 12;
		Static92.method1358(super.anInt3058, local25, local32, local6, local13);
	}
}
