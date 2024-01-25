import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public abstract class Class46 {

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	protected Class46() {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public final void method5016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5034(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILclient!or;II)V")
	public abstract void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "()I")
	public abstract int method5019();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
	public abstract void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIII)V")
	public final void method5021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5026(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "()I")
	public abstract int method5022();

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "()I")
	public abstract int method5023();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)V")
	public abstract void method5024(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5031() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5031() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5022() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5022() - arg3) * local23) / 4096.0F + arg1;
		this.method5028(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFIILclient!or;II)V")
	public final void method5027(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class124 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5031() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5031() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5022() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5022() - arg3) * local23) / 4096.0F + arg1;
		this.method5035(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5028(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFII)V")
	public final void method5030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5025(arg0, arg1, (float) this.method5031() / 2.0F, (float) this.method5022() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "()I")
	public abstract int method5031();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIILclient!or;II)V")
	public final void method5032(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class124 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5027(arg0, arg1, (float) this.method5031() / 2.0F, (float) this.method5022() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIIIII)V")
	public final void method5033(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5025(arg0, arg1, (float) this.method5031() / 2.0F, (float) this.method5022() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
	public abstract void method5034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFLclient!or;II)V")
	protected abstract void method5035(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class124 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);
}
