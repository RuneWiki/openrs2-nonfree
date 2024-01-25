import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public abstract class Class254 {

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "[F")
	public static final float[] aFloatArray85 = new float[16384];

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "[F")
	public static final float[] aFloatArray86 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray86[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray85[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public abstract void method7346(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
	public abstract void method7347(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(III[I)V")
	public abstract void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
	public abstract void method7350(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "([I)V")
	public abstract void method7351(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)V")
	public abstract void method7352(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "()Lclient!oha;")
	public abstract Class254 method7353();

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "(I)V")
	public abstract void method7354(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(III[I)V")
	public abstract void method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lclient!oha;)V")
	public abstract void method7356(@OriginalArg(0) Class254 arg0);

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "()V")
	public abstract void method7357();

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
	public abstract void method7358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "(III[I)V")
	public abstract void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(III)V")
	public abstract void method7361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "(I)V")
	public abstract void method7363(@OriginalArg(0) int arg0);
}
