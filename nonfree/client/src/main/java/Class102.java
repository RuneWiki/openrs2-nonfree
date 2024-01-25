import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public abstract class Class102 implements Interface10 {

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	protected Class102() {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
	public final void method6947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6968(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFLclient!aa;II)V")
	private void method6948(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method6960(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIII)V")
	public final void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6964(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFIIIII)V")
	private void method6950(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method6951() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method6951() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method6958() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method6958() - arg3) * local23) / 4096.0F + arg1;
		this.method6969(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
	public abstract int method6951();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFIILclient!aa;II)V")
	public final void method6952(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method6951() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method6951() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method6958() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method6958() - arg3) * local23) / 4096.0F + arg1;
		this.method6948(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([I)V")
	public abstract void method6953(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
	public abstract void method6955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFIIIII)V")
	public final void method6956(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6950(arg0, arg1, (float) this.method6951() / 2.0F, (float) this.method6958() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()I")
	public abstract int method6957();

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()I")
	public abstract int method6958();

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIII)V")
	public abstract void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	protected abstract void method6960(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	public final void method6961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6955(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "()I")
	public abstract int method6962();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFII)V")
	public final void method6963(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6950(arg0, arg1, (float) this.method6951() / 2.0F, (float) this.method6958() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFIIII)V")
	protected abstract void method6965(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	public abstract void method6967(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFIII)V")
	private void method6969(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.method6965(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIIIII)V")
	public final void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method6968(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFIILclient!aa;II)V")
	public final void method6971(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method6952(arg0, arg1, (float) this.method6951() / 2.0F, (float) this.method6958() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}
}
