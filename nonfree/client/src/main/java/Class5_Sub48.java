import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class5_Sub48 extends Class5 {

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
	private final int anInt9751;

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
	public final int anInt9756;

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
	public final int anInt9753;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
	private final int anInt9752;

	@OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
	private final int anInt9757;

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
	private final int anInt9762;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	public final int anInt9749;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	private final int anInt9748;

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
	public final int anInt9760;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9751 = arg4;
		this.anInt9756 = arg8;
		this.anInt9753 = arg7;
		this.anInt9752 = arg1;
		this.anInt9757 = arg3;
		this.anInt9762 = arg2;
		this.anInt9749 = arg5;
		this.anInt9748 = arg0;
		this.anInt9760 = arg6;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III[I)V")
	public void method8359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg1 + this.anInt9752 - this.anInt9749;
		arg2[2] = arg0 + this.anInt9762 - this.anInt9760;
		arg2[0] = this.anInt9748;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "([IIII)V")
	public void method8360(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[2] = this.anInt9760 + arg1 - this.anInt9762;
		arg0[1] = this.anInt9749 + arg2 - this.anInt9752;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIBI)Z")
	public boolean method8362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt9748 == arg2 && this.anInt9752 <= arg1 && this.anInt9757 >= arg1 && arg0 >= this.anInt9762 && arg0 <= this.anInt9751;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z")
	public boolean method8363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt9752 && arg1 <= this.anInt9757 && this.anInt9762 <= arg0 && arg0 <= this.anInt9751;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(III)Z")
	public boolean method8364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt9749 <= arg0 && arg0 <= this.anInt9753 && arg1 >= this.anInt9760 && arg1 <= this.anInt9756;
	}
}
