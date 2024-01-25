import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
	public final int anInt6419;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	private final int anInt6406;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	private final int anInt6411;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	private final int anInt6415;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	private final int anInt6407;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public final int anInt6408;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
	public final int anInt6410;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
	private final int anInt6414;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	public final int anInt6409;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6419 = arg8;
		this.anInt6406 = arg0;
		this.anInt6411 = arg2;
		this.anInt6415 = arg3;
		this.anInt6407 = arg4;
		this.anInt6408 = arg6;
		this.anInt6410 = arg5;
		this.anInt6414 = arg1;
		this.anInt6409 = arg7;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([IIBI)V")
	public void method4993(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt6410 + arg2 - this.anInt6414;
		arg0[0] = 0;
		arg0[2] = arg1 + this.anInt6408 - this.anInt6411;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)Z")
	public boolean method4994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt6406 && this.anInt6414 <= arg0 && this.anInt6415 >= arg0 && this.anInt6411 <= arg2 && this.anInt6407 >= arg2;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z")
	public boolean method4996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6414 <= arg1 && this.anInt6415 >= arg1 && this.anInt6411 <= arg0 && this.anInt6407 >= arg0;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)Z")
	public boolean method4997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6410 <= arg0 && this.anInt6409 >= arg0 && this.anInt6408 <= arg1 && arg1 <= this.anInt6419;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[II)V")
	public void method4998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt6406;
		arg2[2] = arg0 + this.anInt6411 - this.anInt6408;
		arg2[1] = this.anInt6414 + arg1 - this.anInt6410;
	}
}
