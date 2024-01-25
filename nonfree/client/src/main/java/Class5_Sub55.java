import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class5_Sub55 extends Class5 {

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	public final int anInt10620;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	private final int anInt10622;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	public final int anInt10626;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	private final int anInt10629;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	public final int anInt10623;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	private final int anInt10624;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	public final int anInt10613;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	private final int anInt10614;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	private final int anInt10616;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10620 = arg8;
		this.anInt10622 = arg0;
		this.anInt10626 = arg6;
		this.anInt10629 = arg1;
		this.anInt10623 = arg7;
		this.anInt10624 = arg4;
		this.anInt10613 = arg5;
		this.anInt10614 = arg2;
		this.anInt10616 = arg3;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)Z")
	public boolean method9149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt10613 <= arg0 && this.anInt10623 >= arg0 && arg1 >= this.anInt10626 && arg1 <= this.anInt10620;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI[II)V")
	public void method9150(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt10626 + arg0 - this.anInt10614;
		arg1[0] = 0;
		arg1[1] = arg2 + this.anInt10613 - this.anInt10629;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[I)V")
	public void method9151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = arg0 + this.anInt10614 - this.anInt10626;
		arg2[1] = arg1 + this.anInt10629 - this.anInt10613;
		arg2[0] = this.anInt10622;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)Z")
	public boolean method9153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt10622 && arg2 >= this.anInt10629 && this.anInt10616 >= arg2 && arg1 >= this.anInt10614 && this.anInt10624 >= arg1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt10629 <= arg0 && this.anInt10616 >= arg0 && arg1 >= this.anInt10614 && arg1 <= this.anInt10624;
	}
}
