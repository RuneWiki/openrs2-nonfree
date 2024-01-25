import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class3_Sub3_Sub2_Sub2 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "[F")
	public static final float[] aFloatArray50 = new float[16384];

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16384];

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "Lclient!fj;")
	public Class97 aClass97_2;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
	public int anInt6204;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray51[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray50[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method5364() {
		if (super.aBoolean507) {
			throw new RuntimeException();
		}
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I")
	@Override
	public int method5363() {
		return super.aBoolean507 ? 0 : 100;
	}
}
