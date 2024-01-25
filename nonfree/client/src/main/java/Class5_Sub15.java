import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
	private final int anInt2477;

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
	public final int anInt2480;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	public final int anInt2470;

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
	private final int anInt2481;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	private final int anInt2482;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
	public final int anInt2472;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
	public final int anInt2476;

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
	private final int anInt2474;

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
	private final int anInt2483;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2477 = arg4;
		this.anInt2480 = arg6;
		this.anInt2470 = arg8;
		this.anInt2481 = arg0;
		this.anInt2482 = arg1;
		this.anInt2472 = arg5;
		this.anInt2476 = arg7;
		this.anInt2474 = arg2;
		this.anInt2483 = arg3;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)Z")
	public boolean method2223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt2481 && arg2 >= this.anInt2482 && arg2 <= this.anInt2483 && this.anInt2474 <= arg1 && this.anInt2477 >= arg1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
	public boolean method2224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt2482 && this.anInt2483 >= arg1 && arg0 >= this.anInt2474 && arg0 <= this.anInt2477;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZI)Z")
	public boolean method2227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt2472 && this.anInt2476 >= arg1 && arg0 >= this.anInt2480 && arg0 <= this.anInt2470;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[II)V")
	public void method2228(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt2472 + arg0 - this.anInt2482;
		arg1[0] = 0;
		arg1[2] = this.anInt2480 + arg2 - this.anInt2474;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[IIB)V")
	public void method2230(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[0] = this.anInt2481;
		arg1[2] = arg0 + this.anInt2474 - this.anInt2480;
		arg1[1] = this.anInt2482 + arg2 - this.anInt2472;
	}
}
