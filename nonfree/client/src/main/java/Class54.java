import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public abstract class Class54 {

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	protected Class54() {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
	public abstract int method5560();

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFIILclient!hm;II)V")
	public final void method5561(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class15 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method5570(arg0, arg1, (float) this.method5560() / 2.0F, (float) this.method5576() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFIIIII)V")
	private void method5563(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5560() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5560() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5576() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5576() - arg3) * local23) / 4096.0F + arg1;
		this.method5572(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFLclient!hm;II)V")
	protected abstract void method5564(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "()I")
	public abstract int method5565();

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	public abstract void method5566(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
	public abstract void method5567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public final void method5569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5575(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFIILclient!hm;II)V")
	public final void method5570(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method5560() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method5560() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method5576() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method5576() - arg3) * local23) / 4096.0F + arg1;
		this.method5564(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFIIIII)V")
	public final void method5571(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5563(arg0, arg1, (float) this.method5560() / 2.0F, (float) this.method5576() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method5572(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!hm;II)V")
	public abstract void method5574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
	public abstract void method5575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "()I")
	public abstract int method5576();

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "()I")
	public abstract int method5577();

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)V")
	public final void method5578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5573(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFII)V")
	public final void method5579(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5563(arg0, arg1, (float) this.method5560() / 2.0F, (float) this.method5576() / 2.0F, arg2, arg3, 0, 0);
	}
}
