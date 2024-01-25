import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	private final int anInt5731;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
	public final int anInt5730;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
	private final int anInt5742;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
	private final int anInt5737;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
	public final int anInt5736;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
	public final int anInt5732;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
	public final int anInt5738;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private final int anInt5727;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
	private final int anInt5735;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5731 = arg0;
		this.anInt5730 = arg6;
		this.anInt5742 = arg2;
		this.anInt5737 = arg3;
		this.anInt5736 = arg5;
		this.anInt5732 = arg7;
		this.anInt5738 = arg8;
		this.anInt5727 = arg1;
		this.anInt5735 = arg4;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[IBI)V")
	public void method5223(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt5742 + arg0 - this.anInt5730;
		arg1[1] = this.anInt5727 + arg2 - this.anInt5736;
		arg1[0] = this.anInt5731;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[III)V")
	public void method5225(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[0] = 0;
		arg1[1] = this.anInt5736 + arg0 - this.anInt5727;
		arg1[2] = arg2 + this.anInt5730 - this.anInt5742;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)Z")
	public boolean method5227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt5731 == arg2 && arg1 >= this.anInt5727 && this.anInt5737 >= arg1 && this.anInt5742 <= arg0 && this.anInt5735 >= arg0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)Z")
	public boolean method5228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt5736 && arg1 <= this.anInt5732 && arg0 >= this.anInt5730 && this.anInt5738 >= arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBI)Z")
	public boolean method5229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt5727 && this.anInt5737 >= arg0 && this.anInt5742 <= arg1 && arg1 <= this.anInt5735;
	}
}
