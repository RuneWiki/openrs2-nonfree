import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
	public static final int[] anIntArray317 = new int[16384];

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "[I")
	public static final int[] anIntArray314 = new int[16384];

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
	public final int[] anIntArray315;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "[I")
	public final int[] anIntArray316;

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			anIntArray314[local13] = (int) (Math.sin(local11 * (double) local13) * 32768.0D);
			anIntArray317[local13] = (int) (Math.cos(local11 * (double) local13) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II[I[I)V")
	public Class118_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray315 = arg2;
		this.anIntArray316 = arg3;
	}
}
