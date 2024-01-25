import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
	private final int anInt5731;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
	public final int anInt5724;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public final int anInt5728;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
	private final int anInt5718;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
	private final int anInt5722;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	private final int anInt5720;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	private final int anInt5721;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
	public final int anInt5732;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
	public final int anInt5725;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5731 = arg0;
		this.anInt5724 = arg6;
		this.anInt5728 = arg7;
		this.anInt5718 = arg2;
		this.anInt5722 = arg4;
		this.anInt5720 = arg1;
		this.anInt5721 = arg3;
		this.anInt5732 = arg5;
		this.anInt5725 = arg8;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIII)Z")
	public boolean method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == this.anInt5731 && arg1 >= this.anInt5720 && this.anInt5721 >= arg1 && this.anInt5718 <= arg2 && this.anInt5722 >= arg2;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z")
	public boolean method4600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt5720 && this.anInt5721 >= arg1 && this.anInt5718 <= arg0 && arg0 <= this.anInt5722;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)Z")
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5732 <= arg0 && arg0 <= this.anInt5728 && this.anInt5724 <= arg1 && arg1 <= this.anInt5725;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[III)V")
	public void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt5731;
		arg1[1] = arg2 + this.anInt5720 - this.anInt5732;
		arg1[2] = arg0 + this.anInt5718 - this.anInt5724;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I)V")
	public void method4606(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt5732 + arg1 - this.anInt5720;
		arg2[0] = 0;
		arg2[2] = arg0 + this.anInt5724 - this.anInt5718;
	}
}
