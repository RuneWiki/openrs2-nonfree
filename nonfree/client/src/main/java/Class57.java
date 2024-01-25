import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public abstract class Class57 {

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	protected Class57() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	public final void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5449(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()I")
	public abstract int method5433();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5434(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5433() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5433() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5441() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5441() - arg3) * local23) / 4096.0F + arg1;
		this.method5436(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFII)V")
	public final void method5435(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5434(arg0, arg1, (float) this.method5433() / 2.0F, (float) this.method5441() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5436(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIIIII)V")
	public final void method5437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5434(arg0, arg1, (float) this.method5433() / 2.0F, (float) this.method5441() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V")
	public abstract void method5438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFLclient!sf;II)V")
	protected abstract void method5439(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public abstract int method5440();

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()I")
	public abstract int method5441();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIILclient!sf;II)V")
	public final void method5442(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class74 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5450(arg0, arg1, (float) this.method5433() / 2.0F, (float) this.method5441() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!sf;II)V")
	public abstract void method5444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public abstract void method5445(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
	public abstract void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()I")
	public abstract int method5447();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public final void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5446(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIILclient!sf;II)V")
	public final void method5450(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5433() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5433() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5441() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5441() - arg3) * local23) / 4096.0F + arg1;
		this.method5439(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}
}
