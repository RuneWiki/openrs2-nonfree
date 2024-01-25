import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class9 implements Interface4 {

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	protected Class9() {
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFIILclient!aa;II)V")
	public final void method8914(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method8937() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method8937() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method8930() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method8930() - arg3) * local23) / 4096.0F + arg1;
		this.method8921(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	protected abstract void method8916(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFII)V")
	public final void method8917(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method8934(arg0, arg1, (float) this.method8937() / 2.0F, (float) this.method8930() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()I")
	public abstract int method8918();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIII)V")
	public abstract void method8919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V")
	public final void method8920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8919(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFLclient!aa;II)V")
	private void method8921(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method8916(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFIILclient!aa;II)V")
	public final void method8922(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method8914(arg0, arg1, (float) this.method8937() / 2.0F, (float) this.method8930() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([I)V")
	public abstract void method8923(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)V")
	public final void method8924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8915(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIII)V")
	private void method8925(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.method8929(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method8926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFIIIII)V")
	public final void method8927(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method8934(arg0, arg1, (float) this.method8937() / 2.0F, (float) this.method8930() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V")
	public final void method8928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method8926(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIIII)V")
	protected abstract void method8929(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "()I")
	public abstract int method8930();

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIII)V")
	public abstract void method8931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
	public abstract void method8932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFIIIII)V")
	private void method8934(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method8937() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method8937() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method8930() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method8930() - arg3) * local23) / 4096.0F + arg1;
		this.method8925(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public abstract void method8935(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(IIII)V")
	public final void method8936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method8915(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "()I")
	public abstract int method8937();

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "()I")
	public abstract int method8938();
}
