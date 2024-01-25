import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hp", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
	public static int anInt2593 = 0;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)I")
	public static int method2119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static245.anIntArrayArray46 == null ? 0 : Static245.anIntArrayArray46[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIII)I")
	public static int method2120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static69.aClass22Array1 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(18) int local18 = arg2 >> 7;
			@Pc(22) int local22 = arg3 >> 7;
			if (arg4 < 0 || arg0 < 0 || arg4 > Static162.anInt2152 - 1 || arg0 > Static122.anInt2632 - 1) {
				return 0;
			} else if (local18 >= 1 && local22 >= 1 && Static162.anInt2152 - 1 >= local18 && local22 <= Static122.anInt2632 - 1) {
				@Pc(90) boolean local90 = (Static160.aByteArrayArrayArray9[1][arg2 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(131) boolean local131;
				if ((arg2 & 0x7F) == 0) {
					local112 = (Static160.aByteArrayArrayArray9[1][local18 - 1][arg3 >> 7] & 0x2) != 0;
					local131 = (Static160.aByteArrayArrayArray9[1][local18][arg3 >> 7] & 0x2) != 0;
					if (local112 != local131) {
						local90 = (Static160.aByteArrayArrayArray9[1][arg4][arg0] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local112 = (Static160.aByteArrayArrayArray9[1][arg2 >> 7][local22 - 1] & 0x2) != 0;
					local131 = (Static160.aByteArrayArrayArray9[1][arg2 >> 7][local22] & 0x2) != 0;
					if (local112 != local131) {
						local90 = (Static160.aByteArrayArrayArray9[1][arg4][arg0] & 0x2) != 0;
					}
				}
				if (local90) {
					arg1++;
				}
				return Static69.aClass22Array1[arg1].method4678(arg2, arg3);
			} else {
				return 0;
			}
		} else {
			return Static69.aClass22Array1[arg1].method4678(arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Lclient!p;")
	public static Class8_Sub6 method2122() {
		@Pc(15) Class8_Sub6 local15 = (Class8_Sub6) Static69.aClass65_4.method1460();
		if (local15 == null) {
			return new Class8_Sub6();
		} else {
			Static167.anInt3453--;
			return local15;
		}
	}
}
