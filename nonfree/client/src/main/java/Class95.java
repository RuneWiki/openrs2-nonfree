import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public abstract class Class95 {

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	protected Class95() {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFFFLclient!de;II)V")
	protected abstract void method5489(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class46 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V")
	public final void method5490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5493(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public final void method5491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5492(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)V")
	public abstract void method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "()I")
	public abstract int method5494();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIILclient!de;II)V")
	public final void method5495(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5501(arg0, arg1, (float) this.method5507() / 2.0F, (float) this.method5494() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(IIII)V")
	public abstract void method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!de;II)V")
	public abstract void method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	public abstract void method5499(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5500(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5507() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5507() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5494() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5494() - arg3) * local23) / 4096.0F + arg1;
		this.method5508(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFIILclient!de;II)V")
	public final void method5501(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class46 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5507() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5507() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5494() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5494() - arg3) * local23) / 4096.0F + arg1;
		this.method5489(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "()I")
	public abstract int method5503();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIIIII)V")
	public final void method5504(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5500(arg0, arg1, (float) this.method5507() / 2.0F, (float) this.method5494() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFII)V")
	public final void method5505(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5500(arg0, arg1, (float) this.method5507() / 2.0F, (float) this.method5494() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "()I")
	public abstract int method5506();

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "()I")
	public abstract int method5507();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5508(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
