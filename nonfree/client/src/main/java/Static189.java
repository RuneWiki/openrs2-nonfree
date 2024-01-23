import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	public static int anInt3965;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public static int anInt3958 = 0;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!mn;")
	public static Class115 aClass115_12 = null;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method3190() {
		Static74.aClass46_10.method1077();
		Static285.aClass46_41.method1077();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIIZI[Lclient!mn;)V")
	public static void method3191(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class115[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(15) Class115 local15 = arg4[local3];
			if (local15 != null && arg2 == local15.anInt3525) {
				Static14.method309(arg0, local15, arg3, arg1);
				Static229.method4361(local15, arg1, arg3);
				if (local15.anInt3464 - local15.anInt3487 < local15.anInt3514) {
					local15.anInt3514 = local15.anInt3464 - local15.anInt3487;
				}
				if (local15.anInt3514 < 0) {
					local15.anInt3514 = 0;
				}
				if (local15.anInt3558 - local15.anInt3555 < local15.anInt3529) {
					local15.anInt3529 = local15.anInt3558 - local15.anInt3555;
				}
				if (local15.anInt3529 < 0) {
					local15.anInt3529 = 0;
				}
				if (local15.anInt3538 == 0) {
					Static126.method2252(local15, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	public static void method3194() {
		if (Static198.aFloat41 < 128.0F) {
			Static198.aFloat41 = 128.0F;
		}
		if (Static198.aFloat41 > 383.0F) {
			Static198.aFloat41 = 383.0F;
		}
		while (Static142.aFloat31 >= 2048.0F) {
			Static142.aFloat31 -= 2048.0F;
		}
		@Pc(38) int local38 = Static280.anInt5827 >> 7;
		@Pc(42) int local42 = Static247.anInt4924 >> 7;
		while (Static142.aFloat31 < 0.0F) {
			Static142.aFloat31 += 2048.0F;
		}
		@Pc(60) int local60 = Static99.method1894(Static208.anInt4335, Static247.anInt4924, Static280.anInt5827);
		@Pc(62) int local62 = 0;
		@Pc(87) int local87;
		if (local38 > 3 && local42 > 3 && local38 < 100 && local42 < 100) {
			for (local87 = local38 - 4; local87 <= local38 + 4; local87++) {
				for (@Pc(100) int local100 = local42 - 4; local100 <= local42 + 4; local100++) {
					@Pc(111) int local111 = Static208.anInt4335;
					if (local111 < 3 && (Static134.aByteArrayArrayArray9[1][local87][local100] & 0x2) == 2) {
						local111++;
					}
					@Pc(150) int local150 = local60 + (Static157.aByteArrayArrayArray10[local111][local87][local100] & 0xFF) * 8 - Static141.anIntArrayArrayArray4[local111][local87][local100];
					if (local150 > local62) {
						local62 = local150;
					}
				}
			}
		}
		local87 = local62 * 192;
		if (local87 > 98048) {
			local87 = 98048;
		}
		if (local87 < 32768) {
			local87 = 32768;
		}
		if (local87 > Static182.anInt3886) {
			Static182.anInt3886 += (local87 - Static182.anInt3886) / 24;
		} else if (Static182.anInt3886 > local87) {
			Static182.anInt3886 += (local87 - Static182.anInt3886) / 80;
		}
	}
}
