import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!lp;")
	public static final Class140 aClass140_25 = new Class140(512);

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
	public static final int anInt3814 = 1337;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	public static final int anInt3817 = 1338;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_99 = new Class163(9, 2);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ga;IIB)V")
	public static void method3280(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static207.anInt3659 = arg1;
		Static186.anInt3413 = arg2;
		Static124.aClass82_8 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!dq;ILclient!nj;B)V")
	public static void method3282(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub25 arg2) {
		@Pc(9) Class3_Sub45 local9 = new Class3_Sub45();
		local9.anInt7117 = arg2.method4096();
		local9.anInt7115 = arg2.method4108();
		local9.aClass181Array1 = new Class181[local9.anInt7117];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt7117][][];
		local9.anIntArray455 = new int[local9.anInt7117];
		local9.anIntArray457 = new int[local9.anInt7117];
		local9.aClass181Array2 = new Class181[local9.anInt7117];
		local9.anIntArray456 = new int[local9.anInt7117];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt7117; local56++) {
			try {
				@Pc(62) int local62 = arg2.method4096();
				@Pc(91) String local91;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local91 = arg2.method4073();
					local95 = arg2.method4073();
					local99 = 0;
					if (local62 == 1) {
						local99 = arg2.method4108();
					}
					local9.anIntArray457[local56] = local62;
					local9.anIntArray455[local56] = local99;
					local9.aClass181Array2[local56] = arg0.method1360(local95, Static362.method5072(local91));
				} else if (local62 == 3 || local62 == 4) {
					local91 = arg2.method4073();
					local95 = arg2.method4073();
					local99 = arg2.method4096();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = arg2.method4073();
					}
					@Pc(119) byte[][] local119 = new byte[local99][];
					@Pc(130) int local130;
					if (local62 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
							local130 = arg2.method4108();
							local119[local124] = new byte[local130];
							arg2.method4118(local119[local124], local130);
						}
					}
					local9.anIntArray457[local56] = local62;
					@Pc(155) Class[] local155 = new Class[local99];
					for (local130 = 0; local130 < local99; local130++) {
						local155[local130] = Static362.method5072(local102[local130]);
					}
					local9.aClass181Array1[local56] = arg0.method1371(local155, local95, Static362.method5072(local91));
					local9.aByteArrayArrayArray17[local56] = local119;
				}
			} catch (@Pc(230) ClassNotFoundException local230) {
				local9.anIntArray456[local56] = -1;
			} catch (@Pc(237) SecurityException local237) {
				local9.anIntArray456[local56] = -2;
			} catch (@Pc(244) NullPointerException local244) {
				local9.anIntArray456[local56] = -3;
			} catch (@Pc(251) Exception local251) {
				local9.anIntArray456[local56] = -4;
			} catch (@Pc(258) Throwable local258) {
				local9.anIntArray456[local56] = -5;
			}
		}
		Static254.aClass193_57.method4527(local9);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!uu;ZLclient!uu;)V")
	public static void method3283(@OriginalArg(0) Class250 arg0, @OriginalArg(2) Class250 arg1) {
		Static269.aClass250_57 = arg1;
		Static356.aClass250_100 = arg0;
	}
}
