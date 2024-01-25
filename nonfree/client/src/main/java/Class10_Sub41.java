import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class10_Sub41 extends Class10 {

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	public final int anInt6719;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
	private final int anInt6724;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	private final int anInt6716;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
	private final int anInt6725;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	private final int anInt6727;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	public final int anInt6728;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
	public final int anInt6733;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	public final int anInt6718;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
	private final int anInt6734;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class10_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6719 = arg6;
		this.anInt6724 = arg4;
		this.anInt6716 = arg3;
		this.anInt6725 = arg0;
		this.anInt6727 = arg1;
		this.anInt6728 = arg8;
		this.anInt6733 = arg5;
		this.anInt6718 = arg7;
		this.anInt6734 = arg2;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III[I)V")
	public void method5268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = arg0 + this.anInt6719 - this.anInt6734;
		arg2[1] = arg1 + this.anInt6733 - this.anInt6727;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBI[I)V")
	public void method5269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt6727 + arg1 - this.anInt6733;
		arg2[0] = this.anInt6725;
		arg2[2] = this.anInt6734 + arg0 - this.anInt6719;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z")
	public boolean method5270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt6733 <= arg0 && arg0 <= this.anInt6718 && arg1 >= this.anInt6719 && this.anInt6728 >= arg1;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)Z")
	public boolean method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt6727 && arg0 <= this.anInt6716 && this.anInt6734 <= arg1 && arg1 <= this.anInt6724;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIII)Z")
	public boolean method5276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt6725 == arg0 && arg2 >= this.anInt6727 && this.anInt6716 >= arg2 && arg1 >= this.anInt6734 && this.anInt6724 >= arg1;
	}
}
