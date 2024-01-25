import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class160 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	private int anInt4542;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	private int anInt4545;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	private int anInt4544;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	private int anInt4553;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public int anInt4541;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public int anInt4549;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "I")
	public int anInt4556;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public int anInt4547;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public int anInt4550;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	public int anInt4546;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4542 = arg3 * arg3;
		this.anInt4545 = arg0;
		this.anInt4544 = arg2;
		this.anInt4553 = arg1;
		this.anInt4541 = this.anInt4545 + arg4;
		this.anInt4549 = arg6 + this.anInt4553;
		this.anInt4556 = this.anInt4553 + arg7;
		this.anInt4547 = arg8 + this.anInt4544;
		this.anInt4550 = arg9 + this.anInt4544;
		this.anInt4546 = this.anInt4545 + arg5;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z")
	public boolean method3850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt4541 || arg0 > this.anInt4546) {
			return false;
		} else if (arg2 < this.anInt4549 || this.anInt4556 < arg2) {
			return false;
		} else if (this.anInt4547 <= arg1 && arg1 <= this.anInt4550) {
			@Pc(43) int local43 = arg0 - this.anInt4545;
			@Pc(48) int local48 = arg1 - this.anInt4544;
			return local48 * local48 + local43 * local43 < this.anInt4542;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method3852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt4553 = arg3;
		this.anInt4544 = arg1;
		this.anInt4545 = arg4;
		this.anInt4542 = arg8 * arg8;
		this.anInt4556 = arg6 + this.anInt4553;
		this.anInt4541 = arg7 + this.anInt4545;
		this.anInt4550 = arg5 + this.anInt4544;
		this.anInt4546 = this.anInt4545 + arg0;
		this.anInt4549 = this.anInt4553 + arg2;
		this.anInt4547 = arg9 + this.anInt4544;
	}
}
