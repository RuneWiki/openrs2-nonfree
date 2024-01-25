import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!wm", name = "R", descriptor = "Lclient!ui;")
	public static Class230 aClass230_90;

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "Lclient!o;")
	public static final Class169 aClass169_340 = new Class169("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!wm", name = "S", descriptor = "[I")
	public static final int[] anIntArray744 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBI)V")
	public static void method5515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub6_Sub11 local13 = Static295.method4455(arg0, 14);
		local13.method3004();
		local13.anInt3686 = arg1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!jb;[[B)V")
	public static void method5516(@OriginalArg(1) Class115_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt2995; local3++) {
			Static44.method683();
			for (@Pc(9) int local9 = 0; local9 < Static92.anInt1675 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static262.anInt6340 >> 3; local13++) {
					@Pc(23) int local23 = Static384.anIntArrayArrayArray14[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean255 || local32 == 0) {
							@Pc(43) int local43 = local23 >> 1 & 0x3;
							@Pc(49) int local49 = local23 >> 14 & 0x3FF;
							@Pc(55) int local55 = local23 >> 3 & 0x7FF;
							@Pc(65) int local65 = local55 / 8 + (local49 / 8 << 8);
							for (@Pc(67) int local67 = 0; local67 < Static223.anIntArray480.length; local67++) {
								if (local65 == Static223.anIntArray480[local67] && arg1[local67] != null) {
									arg0.method2465((local55 & 0x7) * 8, Static257.aClass222Array1, local32, local3, local43, arg1[local67], Static66.aClass164_2, local9 * 8, (local49 & 0x7) * 8, local13 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
	public static void method5517() {
		Static212.method2974(25);
		Static130.method1901();
		System.gc();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILclient!re;Lclient!ng;)V")
	public static void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub33 arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(9) Class1_Sub36 local9 = new Class1_Sub36();
		local9.anInt4595 = arg1.method5174();
		local9.anInt4593 = arg1.method5150();
		local9.aClass112Array2 = new Class112[local9.anInt4595];
		local9.aByteArrayArrayArray15 = new byte[local9.anInt4595][][];
		local9.anIntArray565 = new int[local9.anInt4595];
		local9.aClass112Array1 = new Class112[local9.anInt4595];
		local9.anIntArray566 = new int[local9.anInt4595];
		local9.anIntArray564 = new int[local9.anInt4595];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt4595; local58++) {
			try {
				@Pc(64) int local64 = arg1.method5174();
				@Pc(91) String local91;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local91 = arg1.method5128();
					local95 = arg1.method5128();
					local99 = 0;
					if (local64 == 1) {
						local99 = arg1.method5150();
					}
					local9.anIntArray566[local58] = local64;
					local9.anIntArray565[local58] = local99;
					local9.aClass112Array2[local58] = arg2.method3279(Static253.method3891(local91), local95);
				} else if (local64 == 3 || local64 == 4) {
					local91 = arg1.method5128();
					local95 = arg1.method5128();
					local99 = arg1.method5174();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = arg1.method5128();
					}
					@Pc(119) byte[][] local119 = new byte[local99][];
					@Pc(130) int local130;
					if (local64 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
							local130 = arg1.method5150();
							local119[local124] = new byte[local130];
							arg1.method5135(local130, local119[local124]);
						}
					}
					local9.anIntArray566[local58] = local64;
					@Pc(161) Class[] local161 = new Class[local99];
					for (local130 = 0; local130 < local99; local130++) {
						local161[local130] = Static253.method3891(local102[local130]);
					}
					local9.aClass112Array1[local58] = arg2.method3270(local95, Static253.method3891(local91), local161);
					local9.aByteArrayArrayArray15[local58] = local119;
				}
			} catch (@Pc(242) ClassNotFoundException local242) {
				local9.anIntArray564[local58] = -1;
			} catch (@Pc(249) SecurityException local249) {
				local9.anIntArray564[local58] = -2;
			} catch (@Pc(256) NullPointerException local256) {
				local9.anIntArray564[local58] = -3;
			} catch (@Pc(263) Exception local263) {
				local9.anIntArray564[local58] = -4;
			} catch (@Pc(270) Throwable local270) {
				local9.anIntArray564[local58] = -5;
			}
		}
		Static8.aClass17_1.method199(local9);
	}
}
