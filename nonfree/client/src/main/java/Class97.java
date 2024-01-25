import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public abstract class Class97 {

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	protected Class97() {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
	public abstract int method5542();

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()I")
	public abstract int method5543();

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V")
	public abstract void method5544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFIIIII)V")
	public final void method5545(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5560(arg0, arg1, (float) this.method5542() / 2.0F, (float) this.method5557() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5546(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
	public abstract void method5547(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
	public final void method5548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5550(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)V")
	public abstract void method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!ep;II)V")
	public abstract void method5552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFII)V")
	public final void method5553(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5560(arg0, arg1, (float) this.method5542() / 2.0F, (float) this.method5557() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFIILclient!ep;II)V")
	public final void method5554(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5556(arg0, arg1, (float) this.method5542() / 2.0F, (float) this.method5557() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public final void method5555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5544(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFIILclient!ep;II)V")
	public final void method5556(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class66 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5542() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5542() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5557() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5557() - arg3) * local23) / 4096.0F + arg1;
		this.method5561(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()I")
	public abstract int method5557();

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "()I")
	public abstract int method5558();

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5560(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5542() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5542() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5557() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5557() - arg3) * local23) / 4096.0F + arg1;
		this.method5546(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFFFLclient!ep;II)V")
	protected abstract void method5561(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class66 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);
}
