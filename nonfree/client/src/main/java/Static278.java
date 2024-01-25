import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)I")
	public static int method4540() {
		if (Static499.aClass220_17 == null) {
			if (!Static218.aBoolean250 && Static257.anInt5147 > 0) {
				if (Static2.aBoolean3 && Static59.aClass18_1.method5977(81) && Static257.anInt5147 > 2) {
					return ((Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283.aClass5_283).anInt8476;
				}
				return ((Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283).anInt8476;
			}
			@Pc(18) int local18 = Static280.aClass214_1.method6766();
			@Pc(22) int local22 = Static280.aClass214_1.method6770();
			@Pc(24) int local24 = Static159.anInt3261;
			@Pc(26) int local26 = Static122.anInt2575;
			@Pc(28) int local28 = Static142.anInt2984;
			if (local18 > local24 && local18 < local28 + local24) {
				@Pc(42) int local42 = -1;
				@Pc(61) int local61;
				for (@Pc(44) int local44 = 0; local44 < Static257.anInt5147; local44++) {
					if (Static8.aBoolean8) {
						local61 = local26 + (Static257.anInt5147 - local44 - 1) * 16 + 33;
						if (local61 - 13 < local22 && local61 + 3 >= local22) {
							local42 = local44;
						}
					} else {
						local61 = (Static257.anInt5147 - local44 - 1) * 16 + local26 + 31;
						if (local61 - 13 < local22 && local22 <= local61 + 3) {
							local42 = local44;
						}
					}
				}
				if (local42 != -1) {
					local61 = 0;
					@Pc(125) Class59 local125 = new Class59(Static521.aClass99_78);
					for (@Pc(132) Class5_Sub47 local132 = (Class5_Sub47) local125.method1397(); local132 != null; local132 = (Class5_Sub47) local125.method1396()) {
						if (local42 == local61++) {
							return local132.anInt8476;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(III)Z")
	public static boolean method4541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method4542(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static21.method5976(local13) : local13;
		} else if (arg1 instanceof Class216) {
			@Pc(32) Class216 local32 = (Class216) arg1;
			return local32.method5323();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IBI)Z")
	public static boolean method4544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | method4541(arg0, arg1) || Static376.method5638(arg1, arg0);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!hn;B)V")
	public static void method4545(@OriginalArg(0) Class15_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt4721 - Static481.anInt8318;
		@Pc(21) int local21 = arg0.anInt4684 * 128 + arg0.method4035() * 64;
		@Pc(33) int local33 = arg0.anInt4729 * 128 + arg0.method4035() * 64;
		arg0.anInt4755 = 0;
		arg0.anInt8492 += (local21 - arg0.anInt8492) / local9;
		arg0.anInt8493 += (local33 - arg0.anInt8493) / local9;
		if (arg0.anInt4680 == 0) {
			arg0.method4036(8192);
		}
		if (arg0.anInt4680 == 1) {
			arg0.method4036(12288);
		}
		if (arg0.anInt4680 == 2) {
			arg0.method4036(0);
		}
		if (arg0.anInt4680 == 3) {
			arg0.method4036(4096);
		}
	}
}
