import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[16384];

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[16384];

	@OriginalMember(owner = "client!a", name = "e", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public int anInt4 = 1;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray1[local11] = (float) Math.sin(local9 * (double) local11);
			aFloatArray2[local11] = (float) Math.cos(local9 * (double) local11);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBLclient!np;)V")
	private void method1(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static231.method3591(arg1.method5212());
		} else if (arg0 == 2) {
			this.anInt4 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!np;I)V")
	public void method2(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5175();
			if (local14 == 0) {
				return;
			}
			this.method1(local14, arg0);
		}
	}
}
