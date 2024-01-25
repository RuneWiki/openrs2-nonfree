import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public abstract class Class18 {

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	protected Class18() {
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)V")
	public abstract void method4552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFIIIII)V")
	private void method4554(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4564() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4564() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4560() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4560() - arg3) * local23) / 4096.0F + arg1;
		this.method4567(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFFFLclient!oj;II)V")
	protected abstract void method4555(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class165 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFII)V")
	public final void method4556(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4554(arg0, arg1, (float) this.method4564() / 2.0F, (float) this.method4560() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V")
	public abstract void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public final void method4558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4557(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!oj;II)V")
	public abstract void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "()I")
	public abstract int method4560();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFIILclient!oj;II)V")
	public final void method4561(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class165 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method4568(arg0, arg1, (float) this.method4564() / 2.0F, (float) this.method4560() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFIIIII)V")
	public final void method4562(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4554(arg0, arg1, (float) this.method4564() / 2.0F, (float) this.method4560() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "()I")
	public abstract int method4563();

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "()I")
	public abstract int method4564();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
	public abstract void method4565(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method4567(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFIILclient!oj;II)V")
	public final void method4568(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class165 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4564() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4564() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4560() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4560() - arg3) * local23) / 4096.0F + arg1;
		this.method4555(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIII)V")
	public final void method4570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4569(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "()I")
	public abstract int method4571();
}
