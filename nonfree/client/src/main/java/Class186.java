import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class186 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[16384];

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[16384];

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray11[local11] = (float) Math.sin((double) local11 * local9);
			aFloatArray10[local11] = (float) Math.cos(local9 * (double) local11);
		}
		new Class55("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}
}
