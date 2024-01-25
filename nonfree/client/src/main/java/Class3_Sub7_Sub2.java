import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "[I")
	public static final int[] anIntArray171 = new int[16384];

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "[I")
	public static final int[] anIntArray170 = new int[16384];

	static {
		@Pc(17) double local17 = 3.834951969714103E-4D;
		for (@Pc(19) int local19 = 0; local19 < 16384; local19++) {
			anIntArray171[local19] = (int) (Math.sin((double) local19 * local17) * 16384.0D);
			anIntArray170[local19] = (int) (Math.cos(local17 * (double) local19) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BF)V")
	@Override
	public void method6347(@OriginalArg(1) float arg0) {
		super.aFloat174 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7571 = arg0;
		super.anInt7584 = arg2;
		super.anInt7574 = arg1;
	}
}
