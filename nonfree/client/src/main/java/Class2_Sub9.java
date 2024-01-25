import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[16384];

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16384];

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "[Lclient!ea;")
	public Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Z")
	public boolean aBoolean590;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Lclient!oq;")
	public Class2_Sub1 aClass2_Sub1_20;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray57[local15] = (float) Math.sin((double) local15 * local13);
			aFloatArray58[local15] = (float) Math.cos(local13 * (double) local15);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBILclient!ha;)Z")
	public boolean method7266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2) {
		@Pc(15) int local15 = this.aClass2_Sub1_20.method8443();
		if (this.aClass2_Sub5Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass2_Sub5Array1.length; local20++) {
				this.aClass2_Sub5Array1[local20].anInt2085 <<= local15;
				if (this.aClass2_Sub5Array1[local20].method1829(arg0, arg1) && this.aClass2_Sub1_20.method8441(arg0, arg2, arg1)) {
					this.aClass2_Sub5Array1[local20].anInt2085 >>= local15;
					return true;
				}
				this.aClass2_Sub5Array1[local20].anInt2085 >>= local15;
			}
		}
		return false;
	}
}
