import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
	public final int anInt5001;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
	public final int anInt4995;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	private final int anInt4993;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
	private final int anInt5005;

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
	private final int anInt5002;

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
	public final int anInt5004;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
	private final int anInt4997;

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
	private final int anInt5003;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	public final int anInt5000;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5001 = arg5;
		this.anInt4995 = arg7;
		this.anInt4993 = arg2;
		this.anInt5005 = arg1;
		this.anInt5002 = arg4;
		this.anInt5004 = arg6;
		this.anInt4997 = arg3;
		this.anInt5003 = arg0;
		this.anInt5000 = arg8;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BII)Z")
	public boolean method4014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt5005 && this.anInt4997 >= arg0 && this.anInt4993 <= arg1 && this.anInt5002 >= arg1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II[IB)V")
	public void method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = arg0 + this.anInt5001 - this.anInt5005;
		arg2[2] = arg1 + this.anInt5004 - this.anInt4993;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI[I)V")
	public void method4017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt5005 + arg1 - this.anInt5001;
		arg2[2] = arg0 + this.anInt4993 - this.anInt5004;
		arg2[0] = this.anInt5003;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)Z")
	public boolean method4018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt5003 == arg1 && this.anInt5005 <= arg0 && this.anInt4997 >= arg0 && arg2 >= this.anInt4993 && this.anInt5002 >= arg2;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(BII)Z")
	public boolean method4020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5001 <= arg0 && arg0 <= this.anInt4995 && arg1 >= this.anInt5004 && arg1 <= this.anInt5000;
	}
}
