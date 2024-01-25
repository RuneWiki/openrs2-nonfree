import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public abstract class Class103 implements Interface19 {

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	protected Class103() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
	public abstract int method7440();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
	public abstract void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFIIIII)V")
	private void method7442(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method7454() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method7454() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method7451() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method7451() - arg3) * local23) / 4096.0F + arg1;
		this.method7447(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)V")
	public abstract void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()I")
	public abstract int method7445();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFIILclient!aa;II)V")
	public final void method7446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method7454() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method7454() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method7451() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method7451() - arg3) * local23) / 4096.0F + arg1;
		this.method7448(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFIII)V")
	private void method7447(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.method7457(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFLclient!aa;II)V")
	private void method7448(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method7453(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V")
	public final void method7449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method7452(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFII)V")
	public final void method7450(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method7442(arg0, arg1, (float) this.method7454() / 2.0F, (float) this.method7451() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()I")
	public abstract int method7451();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	protected abstract void method7453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8);

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()I")
	public abstract int method7454();

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(IIII)V")
	public final void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method7456(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFIIII)V")
	protected abstract void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public abstract void method7458(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([I)V")
	public abstract void method7459(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFIIIII)V")
	public final void method7460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7442(arg0, arg1, (float) this.method7454() / 2.0F, (float) this.method7451() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIIIII)V")
	public final void method7461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7452(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public final void method7462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method7444(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFIILclient!aa;II)V")
	public final void method7463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method7446(arg0, arg1, (float) this.method7454() / 2.0F, (float) this.method7451() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}
}
