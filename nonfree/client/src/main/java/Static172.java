import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!lga;")
	public static Class223 aClass223_34;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Lclient!uu;")
	public static final Class369 aClass369_7 = new Class369(3, 2);

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "[I")
	public static final int[] anIntArray190 = new int[4];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)Z")
	public static boolean method3336(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (Static319.aBooleanArray17[arg0]) {
			return true;
		} else if (Static552.aClass223_106.method5270(arg0)) {
			@Pc(25) int local25 = Static552.aClass223_106.method5264(arg0);
			if (local25 == 0) {
				Static319.aBooleanArray17[arg0] = true;
				return true;
			}
			if (Static686.aClass381ArrayArray2[arg0] == null) {
				Static686.aClass381ArrayArray2[arg0] = new Class381[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static686.aClass381ArrayArray2[arg0][local47] == null) {
					@Pc(63) byte[] local63 = Static552.aClass223_106.method5267(local47, arg0);
					if (local63 != null) {
						@Pc(75) Class381 local75 = Static686.aClass381ArrayArray2[arg0][local47] = new Class381();
						local75.anInt10089 = local47 + (arg0 << 16);
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method8756(new Class6_Sub15(local63));
					}
				}
			}
			if (arg1 != -31) {
				method3336(-1, (byte) -45);
			}
			Static319.aBooleanArray17[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLclient!jka;)V")
	public static void method3337(@OriginalArg(1) Class6_Sub2_Sub11 arg0) {
		if (Static484.aBoolean623) {
			return;
		}
		arg0.method9051();
		Static539.anInt8776--;
		if (!arg0.aBoolean392) {
			@Pc(97) long local97 = arg0.aLong170;
			@Pc(103) Class6_Sub2_Sub2 local103;
			for (local103 = (Class6_Sub2_Sub2) Static548.aClass74_63.method1401(local97); local103 != null && !local103.aString10.equals(arg0.aString55); local103 = (Class6_Sub2_Sub2) Static548.aClass74_63.method1407()) {
			}
			if (local103 != null && local103.method615(arg0)) {
				Static101.method1968(local103);
			}
			return;
		}
		for (@Pc(24) Class6_Sub2_Sub2 local24 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local24 != null; local24 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
			if (local24.aString10.equals(arg0.aString55)) {
				@Pc(36) boolean local36 = false;
				for (@Pc(42) Class6_Sub2_Sub11 local42 = (Class6_Sub2_Sub11) local24.aClass82_1.method2071(); local42 != null; local42 = (Class6_Sub2_Sub11) local24.aClass82_1.method2078()) {
					if (arg0 == local42) {
						if (local24.method615(arg0)) {
							Static101.method1968(local24);
						}
						local36 = true;
						break;
					}
				}
				if (local36) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!qo;)V")
	public static void method3339(@OriginalArg(1) Class60_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anIntArray255 == null && arg0.anIntArray262 == null) {
			return;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray255.length; local19++) {
			@Pc(25) int local25 = -1;
			if (arg0.anIntArray255 != null) {
				local25 = arg0.anIntArray255[local19];
			}
			if (local25 != -1) {
				local17 = false;
				@Pc(96) int local96;
				@Pc(102) int local102;
				@Pc(108) int local108;
				if ((local25 & 0xC0000000) == -1073741824) {
					local108 = local25 & 0xFFFFFFF;
					@Pc(147) int local147 = local108 >> 14;
					@Pc(151) int local151 = local108 & 0x3FFF;
					local96 = arg0.anInt9048 - (local147 - Static50.anInt606) * 512 - 256;
					local102 = arg0.anInt9057 - (local151 - Static404.anInt7039) * 512 - 256;
				} else if ((local25 & 0x8000) == 0) {
					@Pc(74) Class6_Sub11 local74 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local25);
					if (local74 == null) {
						arg0.method4429(-1, local19);
						continue;
					}
					@Pc(89) Class60_Sub1_Sub1_Sub3_Sub2 local89 = local74.aClass60_Sub1_Sub1_Sub3_Sub2_1;
					local96 = arg0.anInt9048 - local89.anInt9048;
					local102 = arg0.anInt9057 - local89.anInt9057;
				} else {
					local108 = local25 & 0x7FFF;
					@Pc(112) Class60_Sub1_Sub1_Sub3_Sub1 local112 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local108];
					if (local112 == null) {
						arg0.method4429(-1, local19);
						continue;
					}
					local96 = arg0.anInt9048 - local112.anInt9048;
					local102 = arg0.anInt9057 - local112.anInt9057;
				}
				if (local96 != 0 || local102 != 0) {
					arg0.method4429((int) (Math.atan2((double) local96, (double) local102) * 2607.5945876176133D) & 0x3FFF, local19);
				}
			} else if (!arg0.method4429(-1, local19)) {
				local17 = false;
			}
		}
		if (local17) {
			arg0.anIntArray262 = null;
			arg0.anIntArray255 = null;
		}
	}
}
