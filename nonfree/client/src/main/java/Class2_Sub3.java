import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
	public static final int[] anIntArray620 = new int[16384];

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "[I")
	public static final int[] anIntArray621 = new int[16384];

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
	public final int anInt9491;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public int anInt9489;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
	public final int anInt9498;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
	protected final int anInt9487;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
	public int anInt9494;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public int anInt9486;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	public int anInt9497;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray620[local11] = (int) (Math.sin((double) local11 * local9) * 16384.0D);
			anIntArray621[local11] = (int) (Math.cos(local9 * (double) local11) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9491 = arg6;
		this.anInt9489 = arg4;
		this.anInt9498 = arg3;
		this.anInt9487 = arg1;
		this.anInt9494 = arg0;
		this.anInt9486 = arg2;
		this.anInt9497 = arg5;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public final void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
	@Override
	public final void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)I")
	public abstract int method7700();
}
