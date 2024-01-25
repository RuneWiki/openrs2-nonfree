import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public abstract class Class60 {

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	protected Class60() {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public final void method5675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5682(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFIILclient!go;II)V")
	public final void method5676(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class84 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5694(arg0, arg1, (float) this.method5683() / 2.0F, (float) this.method5691() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFFFLclient!go;II)V")
	protected abstract void method5678(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class84 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()I")
	public abstract int method5679();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5680(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFIIIII)V")
	public final void method5681(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5684(arg0, arg1, (float) this.method5683() / 2.0F, (float) this.method5691() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
	public abstract void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
	public abstract int method5683();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5683() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5683() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5691() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5691() - arg3) * local23) / 4096.0F + arg1;
		this.method5680(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFII)V")
	public final void method5685(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5684(arg0, arg1, (float) this.method5683() / 2.0F, (float) this.method5691() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILclient!go;II)V")
	public abstract void method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "()I")
	public abstract int method5687();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
	public final void method5688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5692(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIII)V")
	public abstract void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "()I")
	public abstract int method5691();

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	public abstract void method5693(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFIILclient!go;II)V")
	public final void method5694(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class84 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5683() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5683() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5691() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5691() - arg3) * local23) / 4096.0F + arg1;
		this.method5678(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}
}
