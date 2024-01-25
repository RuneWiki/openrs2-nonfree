import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "Lclient!vd;")
	public static Class353 aClass353_46;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
	public static int anInt5032 = 0;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(FI[BIFIILclient!oia;FFIIFI)V")
	public static void method4485(@OriginalArg(0) float arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(7) Class206 arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6, @OriginalArg(11) int arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg4.method5572(arg8 / (float) 128, arg6 / (float) 16, local12, arg5 * 127.0F, arg7, arg3 / (float) 128, 0);
			local42 = arg2;
			arg5 *= arg0;
			for (local48 = 0; local48 < 16384; local48++) {
				arg1[local42] = (byte) (int) ((float) arg1[local42] + local12[local48]);
				local42++;
			}
			arg8 *= 2.0F;
			arg3 *= 2.0F;
			arg6 *= 2.0F;
		}
		local42 = arg2;
		for (local48 = 0; local48 < 16384; local48++) {
			arg1[local42] = (byte) (arg1[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
	public static void method4489() {
		Static501.anInt8669 = 0;
		Static335.anInt6362 = 0;
		Static341.anInt6420 = 0;
		Static190.anInt3819 = 0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(JLclient!ha;I)V")
	public static void method4490(@OriginalArg(0) long arg0, @OriginalArg(1) Class100 arg1) {
		Static184.anInt3781 = Static373.anInt6851;
		Static626.anInt10301 = 0;
		Static410.anInt7537 = 0;
		Static373.anInt6851 = 0;
		@Pc(21) long local21 = Static32.method595();
		for (@Pc(26) Class20_Sub8 local26 = (Class20_Sub8) Static361.aClass81_6.method2118(); local26 != null; local26 = (Class20_Sub8) Static361.aClass81_6.method2128()) {
			if (local26.method6644(arg1, arg0)) {
				Static410.anInt7537++;
			}
		}
		if (Static397.aBoolean502 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static361.aClass81_6.method2125() + ", running: " + Static410.anInt7537);
			System.out.println("Emitters: " + Static626.anInt10301 + " Particles: " + Static373.anInt6851 + ". Time taken: " + (Static32.method595() - local21) + "ms");
		}
	}
}
