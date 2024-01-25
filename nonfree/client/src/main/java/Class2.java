import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	protected Class2() {
	}

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!aa", name = "ta", descriptor = "(FFFFFFIII)V")
	protected abstract void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "(IIIII)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)V")
	public final void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.PA(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public final void method5829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.E(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFIILclient!i;II)V")
	public final void method5830(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5837(arg0, arg1, (float) this.d() / 2.0F, (float) this.ga() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.d() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.d() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.ga() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.ga() - arg3) * local23) / 4096.0F + arg1;
		this.ta(local37, local50, local67, local85, local102, local118, arg6, arg7, 1);
	}

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "(IIIIII)V")
	public abstract void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "(IIII)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFII)V")
	public final void method5832(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5831(arg0, arg1, (float) this.d() / 2.0F, (float) this.ga() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "(III)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "()I")
	public abstract int d();

	@OriginalMember(owner = "client!aa", name = "PA", descriptor = "(IIIIIII)V")
	public abstract void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!i;II)V")
	public abstract void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aa", name = "ga", descriptor = "()I")
	public abstract int ga();

	@OriginalMember(owner = "client!aa", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFIIIII)V")
	public final void method5834(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5831(arg0, arg1, (float) this.d() / 2.0F, (float) this.ga() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)V")
	public final void method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.XA(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	protected abstract void method5836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!aa", name = "XA", descriptor = "(IIIIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFIILclient!i;II)V")
	public final void method5837(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.d() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.d() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.ga() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.ga() - arg3) * local23) / 4096.0F + arg1;
		this.method5836(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}
}
