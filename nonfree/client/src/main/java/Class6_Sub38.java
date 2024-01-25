import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	private final int anInt6741;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
	public final int anInt6752;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	private final int anInt6737;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public final int anInt6743;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	private final int anInt6748;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public final int anInt6749;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	private final int anInt6751;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
	public final int anInt6738;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
	private final int anInt6747;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6741 = arg0;
		this.anInt6752 = arg7;
		this.anInt6737 = arg2;
		this.anInt6743 = arg6;
		this.anInt6748 = arg4;
		this.anInt6749 = arg8;
		this.anInt6751 = arg1;
		this.anInt6738 = arg5;
		this.anInt6747 = arg3;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIII)Z")
	public boolean method5996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt6741 && arg1 >= this.anInt6751 && this.anInt6747 >= arg1 && arg0 >= this.anInt6737 && this.anInt6748 >= arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[III)V")
	public void method5999(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = arg1 + this.anInt6737 - this.anInt6743;
		arg0[1] = arg2 + this.anInt6751 - this.anInt6738;
		arg0[0] = this.anInt6741;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)Z")
	public boolean method6000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt6738 && arg0 <= this.anInt6752 && arg1 >= this.anInt6743 && arg1 <= this.anInt6749;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I[III)V")
	public void method6001(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg2 + this.anInt6738 - this.anInt6751;
		arg0[0] = 0;
		arg0[2] = arg1 + this.anInt6743 - this.anInt6737;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
	public boolean method6002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6751 <= arg1 && arg1 <= this.anInt6747 && this.anInt6737 <= arg0 && arg0 <= this.anInt6748;
	}
}
