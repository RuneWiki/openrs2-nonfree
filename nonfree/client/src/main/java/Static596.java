import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public static int anInt10144;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_177 = new Class73(16, -2);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!ji;)Lclient!tu;")
	public static Class109_Sub2 method8279(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(7) Class109 local7 = Static191.method3517(arg0);
		@Pc(16) int local16 = arg0.method8236();
		@Pc(20) int local20 = arg0.method8236();
		@Pc(24) int local24 = arg0.method8220();
		return new Class109_Sub2(local7.aClass79_21, local7.aClass127_18, local7.anInt9905, local7.anInt9908, local7.anInt9913, local7.anInt9904, local7.anInt9909, local7.anInt9907, local7.anInt9912, local16, local20, local24);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)I")
	public static int method8280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static148.aClass245Array1 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(19) int local19 = arg3 >> 9;
			@Pc(23) int local23 = arg0 >> 9;
			if (arg4 < 0 || arg1 < 0 || arg4 > Static306.anInt6176 - 1 || Static108.anInt2930 - 1 < arg1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static306.anInt6176 - 1 && Static108.anInt2930 - 1 >= local23) {
				@Pc(91) boolean local91 = (Static495.aByteArrayArrayArray17[1][arg3 >> 9][arg0 >> 9] & 0x2) != 0;
				@Pc(116) boolean local116;
				@Pc(135) boolean local135;
				if ((arg3 & 0x1FF) == 0) {
					local116 = (Static495.aByteArrayArrayArray17[1][local19 - 1][arg0 >> 9] & 0x2) != 0;
					local135 = (Static495.aByteArrayArrayArray17[1][local19][arg0 >> 9] & 0x2) != 0;
					if (local135 != local116) {
						local91 = (Static495.aByteArrayArrayArray17[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x1FF) == 0) {
					local116 = (Static495.aByteArrayArrayArray17[1][arg3 >> 9][local23 - 1] & 0x2) != 0;
					local135 = (Static495.aByteArrayArrayArray17[1][arg3 >> 9][local23] & 0x2) != 0;
					if (local116 != local135) {
						local91 = (Static495.aByteArrayArrayArray17[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if (local91) {
					arg2++;
				}
				return Static148.aClass245Array1[arg2].method7580(arg3, arg0);
			} else {
				return 0;
			}
		} else {
			return Static148.aClass245Array1[arg2].method7580(arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ru;")
	public static RuntimeException_Sub1 method8283(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString87 = local12.aString87 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
