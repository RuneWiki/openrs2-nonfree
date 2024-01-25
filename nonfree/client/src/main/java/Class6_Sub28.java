import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	public final int anInt5562;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
	private final int anInt5565;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
	public final int anInt5556;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	public final int anInt5560;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
	private final int anInt5563;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
	public final int anInt5557;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
	private final int anInt5564;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
	private final int anInt5567;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
	private final int anInt5568;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5562 = arg7;
		this.anInt5565 = arg0;
		this.anInt5556 = arg5;
		this.anInt5560 = arg8;
		this.anInt5563 = arg1;
		this.anInt5557 = arg6;
		this.anInt5564 = arg3;
		this.anInt5567 = arg2;
		this.anInt5568 = arg4;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BIII)Z")
	public boolean method4575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt5565 == arg2 && this.anInt5563 <= arg1 && arg1 <= this.anInt5564 && arg0 >= this.anInt5567 && this.anInt5568 >= arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)Z")
	public boolean method4576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5563 <= arg1 && arg1 <= this.anInt5564 && arg0 >= this.anInt5567 && arg0 <= this.anInt5568;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[III)V")
	public void method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[2] = this.anInt5557 + arg0 - this.anInt5567;
		arg1[1] = this.anInt5556 + arg2 - this.anInt5563;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III[I)V")
	public void method4579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt5563 - this.anInt5556;
		arg2[0] = this.anInt5565;
		arg2[2] = arg1 + this.anInt5567 - this.anInt5557;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(III)Z")
	public boolean method4580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt5556 && this.anInt5562 >= arg1 && arg0 >= this.anInt5557 && arg0 <= this.anInt5560;
	}
}
