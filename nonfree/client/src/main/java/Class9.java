import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public abstract class Class9 implements Interface25 {

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "()V")
	protected Class9() {
	}

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "()I")
	public abstract int method8602();

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFIIIII)V")
	private void method8603(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method8619() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method8619() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method8613() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method8613() - arg3) * local23) / 4096.0F + arg1;
		this.method8609(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(IIIIIII)V")
	public final void method8604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8626(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(III)V")
	public abstract void method8605();

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFII)V")
	public final void method8606(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method8603(arg0, arg1, (float) this.method8619() / 2.0F, (float) this.method8613() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIIII)V")
	public abstract void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIII)V")
	public abstract void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFFFIII)V")
	private void method8609(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.method8623(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFFFLclient!aa;II)V")
	private void method8610(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method8618(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "()I")
	public abstract int method8611();

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFIILclient!aa;II)V")
	public final void method8612(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method8622(arg0, arg1, (float) this.method8619() / 2.0F, (float) this.method8613() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "()I")
	public abstract int method8613();

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(IIII)V")
	public final void method8614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method8625(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "([I)V")
	public abstract void method8616(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(II)V")
	public final void method8617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8621(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	protected abstract void method8618(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8);

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "()I")
	public abstract int method8619();

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(IIII)V")
	public final void method8620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method8626(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIII)V")
	public abstract void method8621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFIILclient!aa;II)V")
	public final void method8622(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method8619() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method8619() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method8613() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method8613() - arg3) * local23) / 4096.0F + arg1;
		this.method8610(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFFFFFIIII)V")
	protected abstract void method8623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(FFIIIII)V")
	public final void method8624(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method8603(arg0, arg1, (float) this.method8619() / 2.0F, (float) this.method8613() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
