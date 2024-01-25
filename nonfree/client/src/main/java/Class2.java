import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public abstract class Class2 {

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	protected Class2() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFIIIII)V")
	private void method2625(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method2630() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method2630() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method2627() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method2627() - arg3) * local23) / 4096.0F + arg1;
		this.method2638(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFIIIII)V")
	public final void method2626(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2625(arg0, arg1, (float) this.method2630() / 2.0F, (float) this.method2627() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()I")
	public abstract int method2627();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFIILclient!q;II)V")
	public final void method2628(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class156 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method2631(arg0, arg1, (float) this.method2630() / 2.0F, (float) this.method2627() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFII)V")
	public final void method2629(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method2625(arg0, arg1, (float) this.method2630() / 2.0F, (float) this.method2627() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "()I")
	public abstract int method2630();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFIILclient!q;II)V")
	public final void method2631(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class156 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method2630() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method2630() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method2627() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method2627() - arg3) * local23) / 4096.0F + arg1;
		this.method2635(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
	public final void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method2637(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	public abstract void method2633(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIII)V")
	public abstract void method2634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFFFLclient!q;II)V")
	protected abstract void method2635(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class156 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!q;II)V")
	public abstract void method2636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method2638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "()I")
	public abstract int method2639();

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "()I")
	public abstract int method2640();

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method2641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public final void method2642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2643(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	public abstract void method2643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIII)V")
	public abstract void method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
