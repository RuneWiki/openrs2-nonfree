import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "Lclient!fi;")
	public static Class109 aClass109_4;

	@OriginalMember(owner = "client!sg", name = "Q", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_71 = new Class181(34, 3);

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "Z")
	public static final boolean aBoolean711 = false;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lclient!lu;")
	public static Class219 method7450(@OriginalArg(0) int arg0) {
		@Pc(8) Class219[] local8 = Static206.method3190();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class219 local16 = local8[local10];
			if (arg0 == local16.anInt5809) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ee;IBLclient!kk;)V")
	public static void method7452(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class192 arg2) {
		@Pc(9) Class5_Sub42 local9 = new Class5_Sub42();
		local9.anInt7484 = arg0.method8645();
		local9.anInt7485 = arg0.method8623();
		local9.aClass330Array1 = new Class330[local9.anInt7484];
		local9.aByteArrayArrayArray20 = new byte[local9.anInt7484][][];
		local9.anIntArray601 = new int[local9.anInt7484];
		local9.aClass330Array2 = new Class330[local9.anInt7484];
		local9.anIntArray602 = new int[local9.anInt7484];
		local9.anIntArray600 = new int[local9.anInt7484];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt7484; local55++) {
			try {
				@Pc(61) int local61 = arg0.method8645();
				@Pc(85) String local85;
				@Pc(89) String local89;
				@Pc(93) int local93;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local85 = arg0.method8617();
					local89 = arg0.method8617();
					local93 = 0;
					if (local61 == 1) {
						local93 = arg0.method8623();
					}
					local9.anIntArray600[local55] = local61;
					local9.anIntArray602[local55] = local93;
					local9.aClass330Array1[local55] = arg2.method4329(Static650.method8915(local85), local89);
				} else if (local61 == 3 || local61 == 4) {
					local85 = arg0.method8617();
					local89 = arg0.method8617();
					local93 = arg0.method8645();
					@Pc(96) String[] local96 = new String[local93];
					for (@Pc(98) int local98 = 0; local98 < local93; local98++) {
						local96[local98] = arg0.method8617();
					}
					@Pc(117) byte[][] local117 = new byte[local93][];
					@Pc(130) int local130;
					if (local61 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local93; local124++) {
							local130 = arg0.method8623();
							local117[local124] = new byte[local130];
							arg0.method8625(local117[local124], 0, local130);
						}
					}
					local9.anIntArray600[local55] = local61;
					@Pc(159) Class[] local159 = new Class[local93];
					for (local130 = 0; local130 < local93; local130++) {
						local159[local130] = Static650.method8915(local96[local130]);
					}
					local9.aClass330Array2[local55] = arg2.method4338(Static650.method8915(local85), local89, local159);
					local9.aByteArrayArrayArray20[local55] = local117;
				}
			} catch (@Pc(238) ClassNotFoundException local238) {
				local9.anIntArray601[local55] = -1;
			} catch (@Pc(245) SecurityException local245) {
				local9.anIntArray601[local55] = -2;
			} catch (@Pc(252) NullPointerException local252) {
				local9.anIntArray601[local55] = -3;
			} catch (@Pc(259) Exception local259) {
				local9.anIntArray601[local55] = -4;
			} catch (@Pc(266) Throwable local266) {
				local9.anIntArray601[local55] = -5;
			}
		}
		Static35.aClass306_7.method7303(local9);
	}
}
