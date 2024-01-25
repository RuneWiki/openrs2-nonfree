import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public abstract class Class87 {

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	protected Class87() {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method6553(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()I")
	public abstract int method6554();

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
	public abstract int method6555();

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
	public abstract void method6556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFIIIII)V")
	public final void method6557(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6572(arg0, arg1, (float) this.method6565() / 2.0F, (float) this.method6561() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFLclient!fs;II)V")
	protected abstract void method6558(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class22 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)V")
	public final void method6559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6573(arg0, arg1, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
	public abstract void method6560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "()I")
	public abstract int method6561();

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!fs;II)V")
	public abstract void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	public abstract void method6563(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(IIII)V")
	public final void method6564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6571(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()I")
	public abstract int method6565();

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
	public final void method6567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6560(arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFII)V")
	public final void method6568(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6572(arg0, arg1, (float) this.method6565() / 2.0F, (float) this.method6561() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFIILclient!fs;II)V")
	public final void method6569(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class22 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method6565() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method6565() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method6561() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method6561() - arg3) * local23) / 4096.0F + arg1;
		this.method6558(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFIILclient!fs;II)V")
	public final void method6570(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method6569(arg0, arg1, (float) this.method6565() / 2.0F, (float) this.method6561() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFIIIII)V")
	private void method6572(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method6565() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method6565() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method6561() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method6561() - arg3) * local23) / 4096.0F + arg1;
		this.method6553(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
