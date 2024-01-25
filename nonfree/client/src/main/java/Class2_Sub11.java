import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
	public final int anInt1515;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	private final int anInt1504;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
	private final int anInt1512;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
	public final int anInt1503;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
	private final int anInt1506;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
	public final int anInt1513;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
	private final int anInt1499;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
	private final int anInt1507;

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
	public final int anInt1510;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1515 = arg7;
		this.anInt1504 = arg0;
		this.anInt1512 = arg1;
		this.anInt1503 = arg8;
		this.anInt1506 = arg4;
		this.anInt1513 = arg5;
		this.anInt1499 = arg3;
		this.anInt1507 = arg2;
		this.anInt1510 = arg6;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([IIIB)V")
	public void method1404(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[1] = this.anInt1513 + arg2 - this.anInt1512;
		arg0[0] = 0;
		arg0[2] = arg1 + this.anInt1510 - this.anInt1507;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZ)Z")
	public boolean method1408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt1512 && this.anInt1499 >= arg1 && this.anInt1507 <= arg0 && arg0 <= this.anInt1506;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Z")
	public boolean method1409(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt1513 && arg0 <= this.anInt1515 && arg1 >= this.anInt1510 && arg1 <= this.anInt1503;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)Z")
	public boolean method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt1504 == arg1 && arg2 >= this.anInt1512 && arg2 <= this.anInt1499 && this.anInt1507 <= arg0 && this.anInt1506 >= arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B[III)V")
	public void method1411(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg1 + this.anInt1512 - this.anInt1513;
		arg0[0] = this.anInt1504;
		arg0[2] = this.anInt1507 + arg2 - this.anInt1510;
	}
}
