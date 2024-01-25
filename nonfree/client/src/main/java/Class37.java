import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public abstract class Class37 {

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "()V")
	protected Class37() {
	}

	@OriginalMember(owner = "client!xa", name = "t", descriptor = "(III)V")
	public abstract void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFII)V")
	public final void method7075(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method7082(arg0, arg1, (float) this.AA() / 2.0F, (float) this.a() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!xa", name = "I", descriptor = "(IIIII)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(II)V")
	public final void method7076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.I(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILclient!fa;II)V")
	public abstract void method7077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "()I")
	public abstract int a();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIIIII)V")
	public final void method7078(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7082(arg0, arg1, (float) this.AA() / 2.0F, (float) this.a() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!xa", name = "GA", descriptor = "(IIIIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!xa", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!xa", name = "QA", descriptor = "()I")
	public abstract int QA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIILclient!fa;II)V")
	public final void method7079(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.AA() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.AA() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.a() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.a() - arg3) * local23) / 4096.0F + arg1;
		this.method7081(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!xa", name = "sa", descriptor = "(FFFFFFIII)V")
	protected abstract void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
	public final void method7080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.KA(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!xa", name = "KA", descriptor = "(IIIIIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!xa", name = "ba", descriptor = "(IIIIIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	protected abstract void method7081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class93 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!xa", name = "AA", descriptor = "()I")
	public abstract int AA();

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIIIII)V")
	private void method7082(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.AA() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.AA() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.a() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.a() - arg3) * local23) / 4096.0F + arg1;
		this.sa(local37, local50, local67, local85, local102, local118, arg6, arg7, 1);
	}

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "(IIII)V")
	public final void method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.ba(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIILclient!fa;II)V")
	public final void method7084(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class93 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method7079(arg0, arg1, (float) this.AA() / 2.0F, (float) this.a() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}
}
