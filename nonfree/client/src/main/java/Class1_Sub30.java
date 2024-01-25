import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
	private final int anInt5367;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	private final int anInt5373;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
	public final int anInt5361;

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
	public final int anInt5363;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
	private final int anInt5360;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
	private final int anInt5358;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	public final int anInt5371;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
	public final int anInt5359;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
	private final int anInt5364;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5367 = arg1;
		this.anInt5373 = arg3;
		this.anInt5361 = arg8;
		this.anInt5363 = arg6;
		this.anInt5360 = arg2;
		this.anInt5358 = arg4;
		this.anInt5371 = arg5;
		this.anInt5359 = arg7;
		this.anInt5364 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([IZII)V")
	public void method4097(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg2 + this.anInt5371 - this.anInt5367;
		arg0[2] = this.anInt5363 + arg1 - this.anInt5360;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([IIBI)V")
	public void method4100(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt5360 + arg1 - this.anInt5363;
		arg0[0] = this.anInt5364;
		arg0[1] = arg2 + this.anInt5367 - this.anInt5371;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BII)Z")
	public boolean method4101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5367 <= arg1 && arg1 <= this.anInt5373 && this.anInt5360 <= arg0 && arg0 <= this.anInt5358;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
	public boolean method4102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt5371 && this.anInt5359 >= arg0 && this.anInt5363 <= arg1 && arg1 <= this.anInt5361;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIII)Z")
	public boolean method4103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt5364 && arg0 >= this.anInt5367 && arg0 <= this.anInt5373 && arg1 >= this.anInt5360 && arg1 <= this.anInt5358;
	}
}
