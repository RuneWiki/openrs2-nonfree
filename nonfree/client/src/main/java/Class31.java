import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public abstract class Class31 {

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	protected Class31() {
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!hb;II)V")
	public abstract void method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method4375(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
	public abstract int method4376();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	public final void method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4379(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()I")
	public abstract int method4378();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
	public abstract void method4379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFFFLclient!hb;II)V")
	protected abstract void method4380(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class77 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	public abstract void method4381(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFIIIII)V")
	public final void method4383(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4389(arg0, arg1, (float) this.method4376() / 2.0F, (float) this.method4378() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFII)V")
	public final void method4384(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4389(arg0, arg1, (float) this.method4376() / 2.0F, (float) this.method4378() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFIILclient!hb;II)V")
	public final void method4385(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class77 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method4388(arg0, arg1, (float) this.method4376() / 2.0F, (float) this.method4378() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V")
	public abstract void method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFIILclient!hb;II)V")
	public final void method4388(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class77 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4376() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4376() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4378() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4378() - arg3) * local23) / 4096.0F + arg1;
		this.method4380(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFIIIII)V")
	private void method4389(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4376() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4376() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4378() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4378() - arg3) * local23) / 4096.0F + arg1;
		this.method4375(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIII)V")
	public final void method4390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4391(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
	public abstract int method4392();

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()I")
	public abstract int method4393();
}
