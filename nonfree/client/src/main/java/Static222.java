import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_90 = new Class84("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	public static int anInt6920 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)Lclient!vq;")
	public static Class196_Sub1 method5415() {
		Static78.anInt1546 = 0;
		return Static179.method2767();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!lh;Lclient!kj;II)V")
	public static void method5417(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub34 local9 = new Class1_Sub34();
		local9.anInt5002 = arg0.method4130();
		local9.anInt5004 = arg0.method4087();
		local9.anIntArray404 = new int[local9.anInt5002];
		local9.anIntArray402 = new int[local9.anInt5002];
		local9.aByteArrayArrayArray16 = new byte[local9.anInt5002][][];
		local9.aClass100Array2 = new Class100[local9.anInt5002];
		local9.anIntArray403 = new int[local9.anInt5002];
		local9.aClass100Array1 = new Class100[local9.anInt5002];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt5002; local59++) {
			try {
				@Pc(65) int local65 = arg0.method4130();
				@Pc(85) String local85;
				@Pc(89) String local89;
				@Pc(93) int local93;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local85 = arg0.method4137();
					local89 = arg0.method4137();
					local93 = 0;
					if (local65 == 1) {
						local93 = arg0.method4087();
					}
					local9.anIntArray403[local59] = local65;
					local9.anIntArray402[local59] = local93;
					local9.aClass100Array1[local59] = arg1.method3218(Static208.method3191(local85), local89);
				} else if (local65 == 3 || local65 == 4) {
					local85 = arg0.method4137();
					local89 = arg0.method4137();
					local93 = arg0.method4130();
					@Pc(96) String[] local96 = new String[local93];
					for (@Pc(98) int local98 = 0; local98 < local93; local98++) {
						local96[local98] = arg0.method4137();
					}
					@Pc(113) byte[][] local113 = new byte[local93][];
					@Pc(124) int local124;
					if (local65 == 3) {
						for (@Pc(118) int local118 = 0; local118 < local93; local118++) {
							local124 = arg0.method4087();
							local113[local118] = new byte[local124];
							arg0.method4102(local113[local118], local124);
						}
					}
					local9.anIntArray403[local59] = local65;
					@Pc(153) Class[] local153 = new Class[local93];
					for (local124 = 0; local124 < local93; local124++) {
						local153[local124] = Static208.method3191(local96[local124]);
					}
					local9.aClass100Array2[local59] = arg1.method3195(local153, local89, Static208.method3191(local85));
					local9.aByteArrayArrayArray16[local59] = local113;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local9.anIntArray404[local59] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local9.anIntArray404[local59] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local9.anIntArray404[local59] = -3;
			} catch (@Pc(255) Exception local255) {
				local9.anIntArray404[local59] = -4;
			} catch (@Pc(262) Throwable local262) {
				local9.anIntArray404[local59] = -5;
			}
		}
		Static152.aClass266_19.method5998(local9);
	}
}
