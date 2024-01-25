import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
	private final int anInt6499;

	@OriginalMember(owner = "client!pba", name = "t", descriptor = "I")
	public final int anInt6507;

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
	private final int anInt6503;

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
	private final int anInt6497;

	@OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
	private final int anInt6508;

	@OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
	private final int anInt6511;

	@OriginalMember(owner = "client!pba", name = "z", descriptor = "I")
	public final int anInt6512;

	@OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
	public final int anInt6509;

	@OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
	public final int anInt6502;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6499 = arg3;
		this.anInt6507 = arg5;
		this.anInt6503 = arg2;
		this.anInt6497 = arg0;
		this.anInt6508 = arg1;
		this.anInt6511 = arg4;
		this.anInt6512 = arg6;
		this.anInt6509 = arg8;
		this.anInt6502 = arg7;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI[II)V")
	public void method5645(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg2 + this.anInt6503 - this.anInt6512;
		arg1[0] = this.anInt6497;
		arg1[1] = arg0 + this.anInt6508 - this.anInt6507;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIII)Z")
	public boolean method5646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt6497 && arg1 >= this.anInt6508 && arg1 <= this.anInt6499 && this.anInt6503 <= arg2 && arg2 <= this.anInt6511;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BII)Z")
	public boolean method5647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6508 <= arg0 && this.anInt6499 >= arg0 && this.anInt6503 <= arg1 && arg1 <= this.anInt6511;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II[II)V")
	public void method5649(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[1] = arg2 + this.anInt6507 - this.anInt6508;
		arg1[2] = this.anInt6512 + arg0 - this.anInt6503;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)Z")
	public boolean method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt6507 <= arg1 && this.anInt6502 >= arg1 && this.anInt6512 <= arg0 && arg0 <= this.anInt6509;
	}
}
