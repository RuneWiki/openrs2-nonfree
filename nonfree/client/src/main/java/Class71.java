import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public abstract class Class71 implements Interface11 {

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	protected Class71() {
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFIII)V")
	private void method7687(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.method7705(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFII)V")
	public final void method7688(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method7700(arg0, arg1, (float) this.method7709() / 2.0F, (float) this.method7711() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([I)V")
	public abstract void method7689(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)V")
	public abstract void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "()I")
	public abstract int method7691();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFIILclient!aa;II)V")
	public final void method7692(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method7693(arg0, arg1, (float) this.method7709() / 2.0F, (float) this.method7711() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFIILclient!aa;II)V")
	public final void method7693(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method7709() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method7709() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method7711() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method7711() - arg3) * local23) / 4096.0F + arg1;
		this.method7695(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFLclient!aa;II)V")
	private void method7695(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method7704(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
	public abstract void method7696(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V")
	public abstract void method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIII)V")
	public final void method7699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method7694(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFIIIII)V")
	private void method7700(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method7709() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method7709() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method7711() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method7711() - arg3) * local23) / 4096.0F + arg1;
		this.method7687(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(IIII)V")
	public final void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method7698(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIII)V")
	public final void method7702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7694(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public final void method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method7697(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	protected abstract void method7704(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFIIII)V")
	protected abstract void method7705(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "()I")
	public abstract int method7707();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "()I")
	public abstract int method7709();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFIIIII)V")
	public final void method7710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7700(arg0, arg1, (float) this.method7709() / 2.0F, (float) this.method7711() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "()I")
	public abstract int method7711();
}
