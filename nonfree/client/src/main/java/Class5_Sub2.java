import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!cca", name = "v", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16384];

	@OriginalMember(owner = "client!cca", name = "u", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16384];

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
	private final int anInt1964;

	@OriginalMember(owner = "client!cca", name = "w", descriptor = "I")
	private final int anInt1968;

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
	private final int anInt1966;

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
	private final int anInt1965;

	static {
		@Pc(17) double local17 = 3.834951969714103E-4D;
		for (@Pc(19) int local19 = 0; local19 < 16384; local19++) {
			aFloatArray24[local19] = (float) Math.sin(local17 * (double) local19);
			aFloatArray23[local19] = (float) Math.cos(local17 * (double) local19);
		}
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1964 = arg3;
		this.anInt1968 = arg2;
		this.anInt1966 = arg1;
		this.anInt1965 = arg0;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1965 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt1968 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt1966 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1964 >> 12;
		Static600.method8259(local24, local36, local10, super.anInt7726, local17);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
	@Override
	public void method6416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt1965 * arg1 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt1968 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt1966 >> 12;
		@Pc(37) int local37 = this.anInt1964 * arg0 >> 12;
		Static131.method2900(local37, local23, local16, super.anInt7726, local30, super.anInt7731, super.anInt7728);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
