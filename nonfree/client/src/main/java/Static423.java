import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!oda", name = "u", descriptor = "[Lclient!ld;")
	public static Class211[] aClass211Array1;

	@OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
	public static int anInt7781;

	@OriginalMember(owner = "client!oda", name = "y", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "Lclient!in;")
	public static final Class169 aClass169_187 = new Class169(104, -2);

	@OriginalMember(owner = "client!oda", name = "t", descriptor = "J")
	public static long aLong213 = 20000000L;

	@OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
	public static int anInt7782 = 100;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(FIFIF[BIIBIIFFLclient!lt;)V")
	public static void method6953(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(9) int arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7, @OriginalArg(13) Class225 arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg5;
			arg8.method6353(0, arg0 / (float) 128, arg1, arg3 * 127.0F, local12, arg2 / (float) 16, arg6 / (float) 128);
			arg2 *= 2.0F;
			for (local48 = 0; local48 < 16384; local48++) {
				arg4[local18] = (byte) (int) ((float) arg4[local18] + local12[local48]);
				local18++;
			}
			arg3 *= arg7;
			arg6 *= 2.0F;
			arg0 *= 2.0F;
		}
		local18 = arg5;
		for (local48 = 0; local48 < 16384; local48++) {
			arg4[local18] = (byte) (arg4[local18] + 127);
			local18++;
		}
	}

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "(I)V")
	public static void method6955() {
		Static34.method585();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static196.aClass200Array1[local8].method5299();
		}
		Static218.method4047();
		Static58.method1113();
		Static382.method9029();
		System.gc();
		Static607.aClass101_15.ya();
	}
}
