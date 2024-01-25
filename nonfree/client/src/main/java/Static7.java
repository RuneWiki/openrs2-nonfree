import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "gb", descriptor = "Z")
	public static volatile boolean aBoolean12 = true;

	@OriginalMember(owner = "client!ag", name = "xb", descriptor = "[I")
	public static final int[] anIntArray23 = new int[2];

	@OriginalMember(owner = "client!ag", name = "ac", descriptor = "J")
	public static long aLong8 = 0L;

	@OriginalMember(owner = "client!ag", name = "mc", descriptor = "Lclient!er;")
	public static final Class69 aClass69_3 = new Class69(64);

	@OriginalMember(owner = "client!ag", name = "rc", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_3 = new Class242("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ut;IIIF[BIFIFFFII)V")
	public static void method259(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7, @OriginalArg(12) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg1;
			arg0.method5286(arg2 / (float) 128, arg5 / (float) 16, arg4 / (float) 128, arg6 * 127.0F, 0, local12, arg8);
			arg2 *= 2.0F;
			for (local48 = 0; local48 < 16384; local48++) {
				arg3[local18] = (byte) ((float) arg3[local18] + local12[local48]);
				local18++;
			}
			arg5 *= 2.0F;
			arg4 *= 2.0F;
			arg6 *= arg7;
		}
		local18 = arg1;
		for (local48 = 0; local48 < 16384; local48++) {
			arg3[local18] -= -127;
			local18++;
		}
	}
}
