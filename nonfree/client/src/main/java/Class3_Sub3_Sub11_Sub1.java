import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class3_Sub3_Sub11_Sub1 extends Class3_Sub3_Sub11 {

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[16384];

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[16384];

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "B")
	public byte aByte33;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
	public int anInt2799;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "Lclient!nj;")
	public Class3_Sub25 aClass3_Sub25_3;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray9[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray10[local9] = (float) Math.cos((double) local9 * local7);
		}
		new Class174("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)I")
	@Override
	public int method5282() {
		return this.aClass3_Sub25_3 == null ? 0 : this.aClass3_Sub25_3.anInt4974 * 100 / (this.aClass3_Sub25_3.aByteArray88.length - this.aByte33);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method5280() {
		if (super.aBoolean437 || this.aClass3_Sub25_3.anInt4974 < this.aClass3_Sub25_3.aByteArray88.length - this.aByte33) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub25_3.aByteArray88;
	}
}
