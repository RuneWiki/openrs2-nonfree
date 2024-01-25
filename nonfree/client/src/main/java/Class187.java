import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class187 {

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	private int anInt4394;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "I")
	private int anInt4406;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "I")
	private int anInt4401;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "I")
	private int anInt4403;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public int anInt4404;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "I")
	public int anInt4402;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "I")
	public int anInt4400;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "I")
	public int anInt4396;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public int anInt4397;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "I")
	public int anInt4407;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4394 = arg2;
		this.anInt4406 = arg3 * arg3;
		this.anInt4401 = arg0;
		this.anInt4403 = arg1;
		this.anInt4404 = this.anInt4401 + arg4;
		this.anInt4402 = arg7 + this.anInt4403;
		this.anInt4400 = arg6 + this.anInt4403;
		this.anInt4396 = arg9 + this.anInt4394;
		this.anInt4397 = this.anInt4394 + arg8;
		this.anInt4407 = arg5 + this.anInt4401;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIIBIII)V")
	public void method3977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt4406 = arg2 * arg2;
		this.anInt4401 = arg3;
		this.anInt4394 = arg0;
		this.anInt4403 = arg4;
		this.anInt4404 = arg5 + this.anInt4401;
		this.anInt4396 = arg7 + this.anInt4394;
		this.anInt4402 = arg8 + this.anInt4403;
		this.anInt4397 = arg1 + this.anInt4394;
		this.anInt4407 = arg9 + this.anInt4401;
		this.anInt4400 = arg6 + this.anInt4403;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZII)Z")
	public boolean method3978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt4404 > arg2 || arg2 > this.anInt4407) {
			return false;
		} else if (this.anInt4400 > arg1 || arg1 > this.anInt4402) {
			return false;
		} else if (arg0 >= this.anInt4397 && this.anInt4396 >= arg0) {
			@Pc(59) int local59 = arg2 - this.anInt4401;
			@Pc(64) int local64 = arg0 - this.anInt4394;
			return local59 * local59 + local64 * local64 < this.anInt4406;
		} else {
			return false;
		}
	}
}
