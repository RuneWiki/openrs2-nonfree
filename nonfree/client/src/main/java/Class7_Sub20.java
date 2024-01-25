import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class7_Sub20 extends Class7 {

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
	public final int anInt2686;

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
	public final int anInt2695;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
	private final int anInt2688;

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
	private final int anInt2696;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	public final int anInt2684;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	private final int anInt2680;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
	private final int anInt2693;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	private final int anInt2683;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
	public final int anInt2692;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class7_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2686 = arg6;
		this.anInt2695 = arg8;
		this.anInt2688 = arg4;
		this.anInt2696 = arg0;
		this.anInt2684 = arg5;
		this.anInt2680 = arg2;
		this.anInt2693 = arg3;
		this.anInt2683 = arg1;
		this.anInt2692 = arg7;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIB)Z")
	public boolean method2174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt2696 == arg0 && this.anInt2683 <= arg1 && arg1 <= this.anInt2693 && arg2 >= this.anInt2680 && this.anInt2688 >= arg2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[III)V")
	public void method2176(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt2686 + arg1 - this.anInt2680;
		arg0[1] = this.anInt2684 + arg2 - this.anInt2683;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I[III)V")
	public void method2177(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt2683 + arg0 - this.anInt2684;
		arg1[2] = this.anInt2680 + arg2 - this.anInt2686;
		arg1[0] = this.anInt2696;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)Z")
	public boolean method2178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt2683 <= arg0 && arg0 <= this.anInt2693 && arg1 >= this.anInt2680 && arg1 <= this.anInt2688;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(III)Z")
	public boolean method2179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt2684 <= arg1 && arg1 <= this.anInt2692 && arg0 >= this.anInt2686 && this.anInt2695 >= arg0;
	}
}
