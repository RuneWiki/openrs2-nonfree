import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	public final int anInt5523;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "I")
	private final int anInt5527;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	private final int anInt5519;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	private final int anInt5517;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	private final int anInt5526;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "I")
	public final int anInt5532;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	private final int anInt5518;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "I")
	public final int anInt5529;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	public final int anInt5524;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5523 = arg8;
		this.anInt5527 = arg2;
		this.anInt5519 = arg3;
		this.anInt5517 = arg4;
		this.anInt5526 = arg1;
		this.anInt5532 = arg6;
		this.anInt5518 = arg0;
		this.anInt5529 = arg7;
		this.anInt5524 = arg5;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III[I)V")
	public void method4736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt5518;
		arg2[2] = this.anInt5527 + arg0 - this.anInt5532;
		arg2[1] = this.anInt5526 + arg1 - this.anInt5524;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III[I)V")
	public void method4738(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = this.anInt5532 + arg1 - this.anInt5527;
		arg2[1] = this.anInt5524 + arg0 - this.anInt5526;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)Z")
	public boolean method4739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5526 <= arg1 && arg1 <= this.anInt5519 && arg0 >= this.anInt5527 && arg0 <= this.anInt5517;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)Z")
	public boolean method4740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt5524 && this.anInt5529 >= arg1 && this.anInt5532 <= arg0 && this.anInt5523 >= arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BIII)Z")
	public boolean method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt5518 && arg0 >= this.anInt5526 && arg0 <= this.anInt5519 && this.anInt5527 <= arg1 && this.anInt5517 >= arg1;
	}
}
