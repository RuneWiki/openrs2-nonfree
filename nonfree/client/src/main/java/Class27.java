import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public abstract class Class27 {

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	protected Class27() {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFIIIII)V")
	public final void method5316(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5332(arg0, arg1, (float) this.method5317() / 2.0F, (float) this.method5328() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()I")
	public abstract int method5317();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public final void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5319(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
	public abstract void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "()I")
	public abstract int method5320();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
	public final void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5334(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5322(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFIILclient!hg;II)V")
	public final void method5324(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5317() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5317() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5328() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5328() - arg3) * local23) / 4096.0F + arg1;
		this.method5326(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIII)V")
	public abstract void method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFFFLclient!hg;II)V")
	protected abstract void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class8 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "()I")
	public abstract int method5327();

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "()I")
	public abstract int method5328();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFII)V")
	public final void method5329(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5332(arg0, arg1, (float) this.method5317() / 2.0F, (float) this.method5328() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFIILclient!hg;II)V")
	public final void method5330(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5324(arg0, arg1, (float) this.method5317() / 2.0F, (float) this.method5328() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5332(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5317() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5317() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5328() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5328() - arg3) * local23) / 4096.0F + arg1;
		this.method5322(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public abstract void method5333(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILclient!hg;II)V")
	public abstract void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
