import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class14_Sub33 extends Class14 {

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
	public final int anInt5889;

	@OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
	public final int anInt5893;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	private final int anInt5882;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
	private final int anInt5888;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
	private final int anInt5891;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
	public final int anInt5894;

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
	private final int anInt5895;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
	private final int anInt5884;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
	public final int anInt5887;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class14_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5889 = arg7;
		this.anInt5893 = arg5;
		this.anInt5882 = arg3;
		this.anInt5888 = arg1;
		this.anInt5891 = arg4;
		this.anInt5894 = arg8;
		this.anInt5895 = arg2;
		this.anInt5884 = arg0;
		this.anInt5887 = arg6;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
	public boolean method5326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt5893 && this.anInt5889 >= arg0 && this.anInt5887 <= arg1 && this.anInt5894 >= arg1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)Z")
	public boolean method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt5884 == arg0 && this.anInt5888 <= arg1 && this.anInt5882 >= arg1 && arg2 >= this.anInt5895 && arg2 <= this.anInt5891;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II[II)V")
	public void method5329(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg0 + this.anInt5887 - this.anInt5895;
		arg1[1] = arg2 + this.anInt5893 - this.anInt5888;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[III)V")
	public void method5331(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt5895 + arg1 - this.anInt5887;
		arg0[0] = this.anInt5884;
		arg0[1] = this.anInt5888 + arg2 - this.anInt5893;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)Z")
	public boolean method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5888 <= arg0 && arg0 <= this.anInt5882 && this.anInt5895 <= arg1 && arg1 <= this.anInt5891;
	}
}
