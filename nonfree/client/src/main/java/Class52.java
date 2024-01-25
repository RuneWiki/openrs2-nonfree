import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public abstract class Class52 {

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	protected Class52() {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!vj;II)V")
	public abstract void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public final void method4123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4131(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
	public abstract int method4124();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFIIIII)V")
	public final void method4125(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4128(arg0, arg1, (float) this.method4141() / 2.0F, (float) this.method4140() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFIILclient!vj;II)V")
	public final void method4126(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class64 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4141() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4141() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4140() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4140() - arg3) * local23) / 4096.0F + arg1;
		this.method4133(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFIIIII)V")
	private void method4128(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4141() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4141() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4140() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4140() - arg3) * local23) / 4096.0F + arg1;
		this.method4136(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFII)V")
	public final void method4129(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4128(arg0, arg1, (float) this.method4141() / 2.0F, (float) this.method4140() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public final void method4130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4127(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
	public abstract void method4131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFIILclient!vj;II)V")
	public final void method4132(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class64 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method4126(arg0, arg1, (float) this.method4141() / 2.0F, (float) this.method4140() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFFFLclient!vj;II)V")
	protected abstract void method4133(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class64 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
	public abstract int method4134();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public abstract void method4135(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method4136(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)V")
	public abstract void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public abstract int method4140();

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()I")
	public abstract int method4141();
}
