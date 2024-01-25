import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public abstract class Class4 {

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	protected Class4() {
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public final void method5948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5957(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public abstract void method5949(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()I")
	public abstract int method5952();

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFFFLclient!tm;II)V")
	protected abstract void method5953(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class92 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFIILclient!tm;II)V")
	public final void method5954(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class92 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5958(arg0, arg1, (float) this.method5961() / 2.0F, (float) this.method5963() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFIIIII)V")
	public final void method5956(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5966(arg0, arg1, (float) this.method5961() / 2.0F, (float) this.method5963() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
	public abstract void method5957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFIILclient!tm;II)V")
	public final void method5958(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class92 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5961() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5961() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5963() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5963() - arg3) * local23) / 4096.0F + arg1;
		this.method5953(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5959(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!tm;II)V")
	public abstract void method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()I")
	public abstract int method5961();

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "()I")
	public abstract int method5962();

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "()I")
	public abstract int method5963();

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
	public final void method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5955(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIII)V")
	public abstract void method5965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5966(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5961() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5961() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5963() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5963() - arg3) * local23) / 4096.0F + arg1;
		this.method5959(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFII)V")
	public final void method5967(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5966(arg0, arg1, (float) this.method5961() / 2.0F, (float) this.method5963() / 2.0F, arg2, arg3, 0, 0);
	}
}
