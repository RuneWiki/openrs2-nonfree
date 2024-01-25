import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!wo", name = "K", descriptor = "Z")
	public static boolean aBoolean768;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Z")
	public static boolean aBoolean769;

	@OriginalMember(owner = "client!wo", name = "gb", descriptor = "Lclient!lga;")
	public static Class223 aClass223_125;

	@OriginalMember(owner = "client!wo", name = "ib", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_125 = new Class241(33, -1);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BII)Z")
	public static boolean method8957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
	public static void method8959() {
		Static599.anImage12 = null;
		Static191.aFont2 = null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ft;Lclient!jc;I)V")
	public static void method8963(@OriginalArg(1) Class122 arg0, @OriginalArg(2) Class6_Sub15 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class6_Sub42 local9 = new Class6_Sub42();
		local9.anInt7710 = arg1.method3030();
		local9.anInt7709 = arg1.method3015();
		local9.aByteArrayArrayArray19 = new byte[local9.anInt7710][][];
		local9.anIntArray489 = new int[local9.anInt7710];
		local9.anIntArray488 = new int[local9.anInt7710];
		local9.anIntArray487 = new int[local9.anInt7710];
		local9.aClass380Array1 = new Class380[local9.anInt7710];
		local9.aClass380Array2 = new Class380[local9.anInt7710];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt7710; local56++) {
			try {
				@Pc(62) int local62 = arg1.method3030();
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(93) int local93;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local87 = arg1.method3046();
					local91 = arg1.method3046();
					local93 = 0;
					if (local62 == 1) {
						local93 = arg1.method3015();
					}
					local9.anIntArray487[local56] = local62;
					local9.anIntArray488[local56] = local93;
					local9.aClass380Array2[local56] = arg0.method3361(local91, Static623.method8540(local87));
				} else if (local62 == 3 || local62 == 4) {
					local87 = arg1.method3046();
					local91 = arg1.method3046();
					local93 = arg1.method3030();
					@Pc(154) String[] local154 = new String[local93];
					for (@Pc(156) int local156 = 0; local156 < local93; local156++) {
						local154[local156] = arg1.method3046();
					}
					@Pc(173) byte[][] local173 = new byte[local93][];
					@Pc(188) int local188;
					if (local62 == 3) {
						for (@Pc(182) int local182 = 0; local182 < local93; local182++) {
							local188 = arg1.method3015();
							local173[local182] = new byte[local188];
							arg1.method3019(local188, 0, local173[local182]);
						}
					}
					local9.anIntArray487[local56] = local62;
					@Pc(215) Class[] local215 = new Class[local93];
					for (local188 = 0; local188 < local93; local188++) {
						local215[local188] = Static623.method8540(local154[local188]);
					}
					local9.aClass380Array1[local56] = arg0.method3351(local215, local91, Static623.method8540(local87));
					local9.aByteArrayArrayArray19[local56] = local173;
				}
			} catch (@Pc(258) ClassNotFoundException local258) {
				local9.anIntArray489[local56] = -1;
			} catch (@Pc(265) SecurityException local265) {
				local9.anIntArray489[local56] = -2;
			} catch (@Pc(272) NullPointerException local272) {
				local9.anIntArray489[local56] = -3;
			} catch (@Pc(279) Exception local279) {
				local9.anIntArray489[local56] = -4;
			} catch (@Pc(286) Throwable local286) {
				local9.anIntArray489[local56] = -5;
			}
		}
		Static336.aClass340_40.method8131(local9);
	}
}
