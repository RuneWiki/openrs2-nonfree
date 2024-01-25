import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "[I")
	public static int[] anIntArray492 = new int[2];

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method6940(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = arg1 ? 32768 : 0;
		@Pc(31) int local31 = (arg1 ? Static35.aClass276_1.anInt7772 : Static35.aClass276_1.anInt7771) + local20;
		for (@Pc(33) int local33 = local20; local33 < local31; local33++) {
			@Pc(40) Class6_Sub2_Sub20 local40 = Static35.aClass276_1.method6929(local33);
			if (local40.aBoolean713 && local40.method8375().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static327.anInt5649 = -1;
					Static141.aShortArray139 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(79) short[] local79 = new short[local11.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local13; local81++) {
						local79[local81] = local11[local81];
					}
					local11 = local79;
				}
				local11[local13++] = (short) local33;
			}
		}
		Static141.aShortArray139 = local11;
		Static327.anInt5649 = local13;
		Static12.anInt187 = 0;
		@Pc(128) String[] local128 = new String[Static327.anInt5649];
		for (@Pc(130) int local130 = 0; local130 < Static327.anInt5649; local130++) {
			local128[local130] = Static35.aClass276_1.method6929(local11[local130]).method8375();
		}
		if (72 <= 67) {
			anIntArray492 = null;
		}
		Static608.method8374(Static141.aShortArray139, local128);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!oba;)I")
	public static int method6946(@OriginalArg(1) Class261 arg0) {
		if (arg0 == Static24.aClass261_1) {
			return 5890;
		} else if (Static51.aClass261_2 == arg0) {
			return 34167;
		} else if (Static110.aClass261_3 == arg0) {
			return 34168;
		} else if (arg0 == Static389.aClass261_8) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
