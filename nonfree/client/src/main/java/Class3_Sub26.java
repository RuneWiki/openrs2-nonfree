import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
	private final int anInt4230;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	private final int anInt4226;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
	public final int anInt4217;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	private final int anInt4214;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
	public final int anInt4218;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
	public final int anInt4224;

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
	private final int anInt4215;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
	public final int anInt4221;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
	private final int anInt4216;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4230 = arg3;
		this.anInt4226 = arg0;
		this.anInt4217 = arg6;
		this.anInt4214 = arg4;
		this.anInt4218 = arg5;
		this.anInt4224 = arg7;
		this.anInt4215 = arg2;
		this.anInt4221 = arg8;
		this.anInt4216 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIZ)Z")
	public boolean method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt4216 && arg0 <= this.anInt4230 && arg1 >= this.anInt4215 && arg1 <= this.anInt4214;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
	public boolean method3481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4218 <= arg1 && this.anInt4224 >= arg1 && this.anInt4217 <= arg0 && this.anInt4221 >= arg0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([IBII)V")
	public void method3482(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[1] = this.anInt4218 + arg1 - this.anInt4216;
		arg0[2] = arg2 + this.anInt4217 - this.anInt4215;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([IIII)V")
	public void method3483(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[2] = arg1 + this.anInt4215 - this.anInt4217;
		arg0[1] = arg2 + this.anInt4216 - this.anInt4218;
		arg0[0] = this.anInt4226;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)Z")
	public boolean method3484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt4226 && arg0 >= this.anInt4216 && arg0 <= this.anInt4230 && this.anInt4215 <= arg1 && this.anInt4214 >= arg1;
	}
}
