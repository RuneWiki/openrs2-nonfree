import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "[I")
	public static final int[] anIntArray304 = new int[16384];

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
	public static final int[] anIntArray303 = new int[16384];

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	private final int anInt2898;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	private final int anInt2892;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	private final int anInt2895;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	private final int anInt2897;

	static {
		@Pc(17) double local17 = 3.834951969714103E-4D;
		for (@Pc(19) int local19 = 0; local19 < 16384; local19++) {
			anIntArray304[local19] = (int) (Math.sin(local17 * (double) local19) * 32768.0D);
			anIntArray303[local19] = (int) (Math.cos(local17 * (double) local19) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class90_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2898 = arg2;
		this.anInt2892 = arg1;
		this.anInt2895 = arg0;
		this.anInt2897 = arg3;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt2895 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt2898 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt2892 >> 12;
		@Pc(37) int local37 = this.anInt2897 * arg1 >> 12;
		Static18.method368(local30, local37, local16, local23, super.anInt7688);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	@Override
	public void method5868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2895 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2898 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt2892 >> 12;
		@Pc(39) int local39 = this.anInt2897 * arg0 >> 12;
		Static330.method4665(local39, local17, local10, super.anInt7688, local32, super.anInt7686, super.anInt7684);
	}
}
