import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class22 {

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	protected Class22() {
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILclient!ea;II)V")
	public final void method6067(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class32 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method6076(arg0, arg1, (float) this.ja() / 2.0F, (float) this.JA() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V")
	public final void method6068(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6071(arg0, arg1, (float) this.ja() / 2.0F, (float) this.JA() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!f", name = "ja", descriptor = "()I")
	public abstract int ja();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V")
	public final void method6069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6071(arg0, arg1, (float) this.ja() / 2.0F, (float) this.JA() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!f", name = "UA", descriptor = "()I")
	public abstract int UA();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V")
	private void method6071(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.ja() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.ja() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.JA() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.JA() - arg3) * local23) / 4096.0F + arg1;
		this.aa(local37, local50, local67, local85, local102, local118, arg6, arg7, 1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	public final void method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.D(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	protected abstract void method6073(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class32 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!f", name = "D", descriptor = "(IIIIIII)V")
	public abstract void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!f", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!f", name = "qa", descriptor = "()I")
	public abstract int qa();

	@OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!f", name = "W", descriptor = "(IIIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public final void method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.YA(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
	public final void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.M(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!f", name = "JA", descriptor = "()I")
	public abstract int JA();

	@OriginalMember(owner = "client!f", name = "ka", descriptor = "(IIII)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILclient!ea;II)V")
	public final void method6076(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class32 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.ja() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.ja() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.JA() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.JA() - arg3) * local23) / 4096.0F + arg1;
		this.method6073(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!f", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!f", name = "aa", descriptor = "(FFFFFFIII)V")
	protected abstract void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);
}
