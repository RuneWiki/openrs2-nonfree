import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class8 implements Interface9 {

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "[I")
	public static final int[] anIntArray4 = new int[120];

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "[I")
	public static final int[] anIntArray5;

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
	public static int anInt57;

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "[F")
	public static final float[] aFloatArray1;

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "[F")
	public static final float[] aFloatArray2;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
	public final int anInt52;

	static {
		@Pc(6) int local6 = 0;
		@Pc(13) int local13;
		for (@Pc(8) int local8 = 0; local8 < 120; local8++) {
			local13 = local8 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local6 += local26;
			anIntArray4[local8] = local6 / 4;
		}
		anIntArray5 = new int[14];
		anInt57 = 0;
		aFloatArray1 = new float[16384];
		aFloatArray2 = new float[16384];
		@Pc(53) double local53 = 3.834951969714103E-4D;
		for (local13 = 0; local13 < 16384; local13++) {
			aFloatArray1[local13] = (float) Math.sin(local53 * (double) local13);
			aFloatArray2[local13] = (float) Math.cos(local53 * (double) local13);
		}
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(I)V")
	public Class8(@OriginalArg(0) int arg0) {
		this.anInt52 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static150.aClass95_3;
	}
}
