import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "[[Lclient!vj;")
	public static Class21_Sub1[][] aClass21_Sub1ArrayArray2;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "Lclient!bc;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "Lclient!qk;")
	public static Class278 aClass278_1;

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
	public static int anInt6508 = 104;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!wv;ILclient!ek;B)V")
	public static void method5150(@OriginalArg(0) Class366 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub13 arg2) {
		@Pc(23) Class4_Sub10 local23 = new Class4_Sub10();
		local23.anInt2313 = arg2.method7004();
		local23.anInt2312 = arg2.method6990();
		local23.aClass316Array2 = new Class316[local23.anInt2313];
		local23.aClass316Array1 = new Class316[local23.anInt2313];
		local23.anIntArray110 = new int[local23.anInt2313];
		local23.aByteArrayArrayArray1 = new byte[local23.anInt2313][][];
		local23.anIntArray111 = new int[local23.anInt2313];
		local23.anIntArray112 = new int[local23.anInt2313];
		for (@Pc(65) int local65 = 0; local65 < local23.anInt2313; local65++) {
			try {
				@Pc(71) int local71 = arg2.method7004();
				@Pc(91) String local91;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local91 = arg2.method7016();
					local95 = arg2.method7016();
					local99 = 0;
					if (local71 == 1) {
						local99 = arg2.method6990();
					}
					local23.anIntArray112[local65] = local71;
					local23.anIntArray110[local65] = local99;
					local23.aClass316Array2[local65] = arg0.method8277(Static253.method4038(local91), local95);
				} else if (local71 == 3 || local71 == 4) {
					local91 = arg2.method7016();
					local95 = arg2.method7016();
					local99 = arg2.method7004();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = arg2.method7016();
					}
					@Pc(119) byte[][] local119 = new byte[local99][];
					@Pc(130) int local130;
					if (local71 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
							local130 = arg2.method6990();
							local119[local124] = new byte[local130];
							arg2.method7049(local119[local124], local130);
						}
					}
					local23.anIntArray112[local65] = local71;
					@Pc(155) Class[] local155 = new Class[local99];
					for (local130 = 0; local130 < local99; local130++) {
						local155[local130] = Static253.method4038(local102[local130]);
					}
					local23.aClass316Array1[local65] = arg0.method8272(Static253.method4038(local91), local95, local155);
					local23.aByteArrayArrayArray1[local65] = local119;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local23.anIntArray111[local65] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local23.anIntArray111[local65] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local23.anIntArray111[local65] = -3;
			} catch (@Pc(255) Exception local255) {
				local23.anIntArray111[local65] = -4;
			} catch (@Pc(262) Throwable local262) {
				local23.anIntArray111[local65] = -5;
			}
		}
		Static438.aClass22_55.method894(local23);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIBIIIZF)[[I")
	public static int[][] method5151(@OriginalArg(8) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class4_Sub2_Sub23 local18 = new Class4_Sub2_Sub23();
		local18.anInt7952 = 4;
		local18.aBoolean571 = false;
		local18.anInt7957 = (int) (arg0 * 4096.0F);
		local18.anInt7956 = 3;
		local18.anInt7950 = 4;
		local18.method8210();
		Static407.method6144(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method6224(local14[local45], local45);
		}
		return local14;
	}
}
