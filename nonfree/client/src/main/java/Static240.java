import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
	public static int anInt4167;

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lclient!gv;")
	public static Class141 aClass141_4;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "Lclient!ak;")
	public static final Class16 aClass16_19 = new Class16();

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_80 = new Class156(25, 0);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)I")
	public static int method3812() {
		return Static206.method3382(false);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!wq;Lclient!tga;B)V")
	public static void method3813(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1, @OriginalArg(2) Class349 arg2) {
		@Pc(9) Class5_Sub26 local9 = new Class5_Sub26();
		local9.anInt4753 = arg1.method7291();
		local9.anInt4751 = arg1.method7268();
		local9.aByteArrayArrayArray13 = new byte[local9.anInt4753][][];
		local9.aClass361Array1 = new Class361[local9.anInt4753];
		local9.anIntArray259 = new int[local9.anInt4753];
		local9.aClass361Array2 = new Class361[local9.anInt4753];
		local9.anIntArray260 = new int[local9.anInt4753];
		local9.anIntArray261 = new int[local9.anInt4753];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt4753; local58++) {
			try {
				@Pc(64) int local64 = arg1.method7291();
				@Pc(97) String local97;
				@Pc(101) String local101;
				@Pc(105) int local105;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local97 = arg1.method7281();
					local101 = arg1.method7281();
					local105 = 0;
					if (local64 == 1) {
						local105 = arg1.method7268();
					}
					local9.anIntArray259[local58] = local64;
					local9.anIntArray260[local58] = local105;
					local9.aClass361Array2[local58] = arg2.method7748(Static257.method4231(local97), local101);
				} else if (local64 == 3 || local64 == 4) {
					local97 = arg1.method7281();
					local101 = arg1.method7281();
					local105 = arg1.method7291();
					@Pc(108) String[] local108 = new String[local105];
					for (@Pc(110) int local110 = 0; local110 < local105; local110++) {
						local108[local110] = arg1.method7281();
					}
					@Pc(131) byte[][] local131 = new byte[local105][];
					@Pc(144) int local144;
					if (local64 == 3) {
						for (@Pc(138) int local138 = 0; local138 < local105; local138++) {
							local144 = arg1.method7268();
							local131[local138] = new byte[local144];
							arg1.method7297(local131[local138], 0, local144);
						}
					}
					local9.anIntArray259[local58] = local64;
					@Pc(169) Class[] local169 = new Class[local105];
					for (local144 = 0; local144 < local105; local144++) {
						local169[local144] = Static257.method4231(local108[local144]);
					}
					local9.aClass361Array1[local58] = arg2.method7737(local101, local169, Static257.method4231(local97));
					local9.aByteArrayArrayArray13[local58] = local131;
				}
			} catch (@Pc(252) ClassNotFoundException local252) {
				local9.anIntArray261[local58] = -1;
			} catch (@Pc(259) SecurityException local259) {
				local9.anIntArray261[local58] = -2;
			} catch (@Pc(266) NullPointerException local266) {
				local9.anIntArray261[local58] = -3;
			} catch (@Pc(273) Exception local273) {
				local9.anIntArray261[local58] = -4;
			} catch (@Pc(280) Throwable local280) {
				local9.anIntArray261[local58] = -5;
			}
		}
		Static119.aClass20_7.method370(local9);
	}
}
