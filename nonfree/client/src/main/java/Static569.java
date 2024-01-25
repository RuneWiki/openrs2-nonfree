import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_166 = new Class73(109, 11);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)I")
	public static int method7615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static133.aClass59Array3 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(19) int local19 = arg0 >> 9;
			@Pc(23) int local23 = arg3 >> 9;
			if (arg2 < 0 || arg4 < 0 || Static473.anInt8075 - 1 < arg2 || Static165.anInt6749 - 1 < arg4) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && Static473.anInt8075 - 1 >= local19 && Static165.anInt6749 - 1 >= local23) {
				@Pc(90) boolean local90 = (Static154.aByteArrayArrayArray4[1][arg0 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(128) boolean local128;
				if ((arg0 & 0x1FF) == 0) {
					local112 = (Static154.aByteArrayArrayArray4[1][local19 - 1][arg3 >> 9] & 0x2) != 0;
					local128 = (Static154.aByteArrayArrayArray4[1][local19][arg3 >> 9] & 0x2) != 0;
					if (local112 != local128) {
						local90 = (Static154.aByteArrayArrayArray4[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local112 = (Static154.aByteArrayArrayArray4[1][arg0 >> 9][local23 - 1] & 0x2) != 0;
					local128 = (Static154.aByteArrayArrayArray4[1][arg0 >> 9][local23] & 0x2) != 0;
					if (local128 != local112) {
						local90 = (Static154.aByteArrayArrayArray4[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if (local90) {
					arg1++;
				}
				return Static133.aClass59Array3[arg1].sa(arg0, arg3);
			} else {
				return 0;
			}
		} else {
			return Static133.aClass59Array3[arg1].sa(arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([Ljava/lang/Object;B[I)V")
	public static void method7616(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static533.method7239(arg0, 0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)Z")
	public static boolean method7617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BII)Z")
	public static boolean method7618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static160.method2952(arg0, arg1) & Static195.method3543(arg0, arg1);
	}
}
