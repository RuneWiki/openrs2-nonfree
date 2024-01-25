import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class136 implements Interface13 {

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[16384];

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[16384];

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Lclient!fd;")
	private final Class109 aClass109_1;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "Lclient!qia;")
	private final Class303 aClass303_2;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray19[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray18[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!qia;Lclient!fd;)V")
	public Class136(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class109 arg1) {
		this.aClass109_1 = arg1;
		this.aClass303_2 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8636() {
		return this.aClass303_2.method6683();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8637() {
		@Pc(11) Class338 local11 = this.aClass303_2.method6684(this.aClass109_1.anInt2736);
		if (local11 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass109_1.aClass291_4.method6524(Static606.anInt9314, this.aClass109_1.anInt2741) + this.aClass109_1.anInt2742;
		@Pc(50) int local50 = this.aClass109_1.aClass125_6.method2842(this.aClass109_1.anInt2740, Static353.anInt5368) + this.aClass109_1.anInt2739;
		if (this.aClass109_1.aBoolean200) {
			Static582.aClass33_13.method8142(local35, local50, this.aClass109_1.anInt2741, this.aClass109_1.anInt2740, this.aClass109_1.anInt2735, 0);
		}
		local50 += this.method3052(Static344.aClass56_10, local50, local11.aString104, local35) * 12;
		local50 += 8;
		if (this.aClass109_1.aBoolean200) {
			Static582.aClass33_13.method8096(local35, local50, this.aClass109_1.anInt2741 + local35 - 1, local50, this.aClass109_1.anInt2735, 0);
		}
		local50++;
		local50 += this.method3052(Static344.aClass56_10, local50, local11.aString103, local35) * 12;
		local50 += 5;
		@Pc(132) int local132 = local50 + this.method3052(Static344.aClass56_10, local50, local11.aString102, local35) * 12;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	@Override
	public void method8638() {
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBLclient!da;ILjava/lang/String;I)I")
	private int method3052(@OriginalArg(2) Class56 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		return arg0.method8065(0, this.aClass109_1.anInt2734, 0, 0, arg1 + 5, 0, arg2, 0, this.aClass109_1.anInt2740 - 10, (Class17[]) null, (Class1) null, this.aClass109_1.anInt2741 - 10, (int[]) null, arg3 + 5, this.aClass109_1.anInt2737);
	}
}
