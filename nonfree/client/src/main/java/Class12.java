import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public abstract class Class12 {

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	protected Class12() {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFIIIII)V")
	public final void method5652(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5657(arg0, arg1, (float) this.method5654() / 2.0F, (float) this.method5655() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFIILclient!be;II)V")
	public final void method5653(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5654() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5654() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5655() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5655() - arg3) * local23) / 4096.0F + arg1;
		this.method5671(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
	public abstract int method5654();

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()I")
	public abstract int method5655();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5657(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5654() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5654() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5655() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5655() - arg3) * local23) / 4096.0F + arg1;
		this.method5668(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	public abstract void method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public abstract void method5660(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFIILclient!be;II)V")
	public final void method5661(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class24 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5653(arg0, arg1, (float) this.method5654() / 2.0F, (float) this.method5655() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!be;II)V")
	public abstract void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
	public abstract void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()I")
	public abstract int method5664();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public final void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5658(arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIII)V")
	public final void method5666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5669(arg0, arg1, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(IIII)V")
	public final void method5667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5659(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5668(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFII)V")
	public final void method5670(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5657(arg0, arg1, (float) this.method5654() / 2.0F, (float) this.method5655() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFFFLclient!be;II)V")
	protected abstract void method5671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()I")
	public abstract int method5672();
}
