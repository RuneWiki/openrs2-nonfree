import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
	private int anInt1386;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
	private int anInt1382;

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
	private int anInt1387;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	private int anInt1379;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1386 = arg2;
		this.anInt1382 = arg0;
		this.anInt1387 = arg1;
		this.anInt1379 = arg3;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	@Override
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1382 >> 12;
		@Pc(21) int local21 = this.anInt1386 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt1387 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt1379 >> 12;
		Static232.method3633(this.anInt2895, local35, local28, local10, local21);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
	@Override
	public void method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt1382 >> 12;
		@Pc(33) int local33 = this.anInt1386 * arg1 >> 12;
		@Pc(40) int local40 = this.anInt1379 * arg0 >> 12;
		@Pc(47) int local47 = this.anInt1387 * arg0 >> 12;
		Static92.method1531(local6, local33, this.anInt2894, local47, local40, this.anInt2895, this.anInt2885);
	}
}
