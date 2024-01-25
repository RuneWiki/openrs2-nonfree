import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_47 = new Class240(38, 15);

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
	public static int anInt4695 = 0;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_67 = new Class171(70, 4);

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIII)I")
	public static int method4022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static582.aClass35Array3 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(22) int local22 = arg2 >> 9;
			@Pc(26) int local26 = arg1 >> 9;
			if (arg0 < 0 || arg4 < 0 || arg0 > Static98.anInt361 - 1 || Static438.anInt7120 - 1 < arg4) {
				return 0;
			} else if (local22 >= 1 && local26 >= 1 && local22 <= Static98.anInt361 - 1 && Static438.anInt7120 - 1 >= local26) {
				@Pc(92) boolean local92 = (Static315.aByteArrayArrayArray13[1][arg2 >> 9][arg1 >> 9] & 0x2) != 0;
				@Pc(117) boolean local117;
				@Pc(136) boolean local136;
				if ((arg2 & 0x1FF) == 0) {
					local117 = (Static315.aByteArrayArrayArray13[1][local22 - 1][arg1 >> 9] & 0x2) != 0;
					local136 = (Static315.aByteArrayArrayArray13[1][local22][arg1 >> 9] & 0x2) != 0;
					if (local117 != local136) {
						local92 = (Static315.aByteArrayArrayArray13[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x1FF) == 0) {
					local117 = (Static315.aByteArrayArrayArray13[1][arg2 >> 9][local26 - 1] & 0x2) != 0;
					local136 = (Static315.aByteArrayArrayArray13[1][arg2 >> 9][local26] & 0x2) != 0;
					if (local136 != local117) {
						local92 = (Static315.aByteArrayArrayArray13[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local92) {
					arg3++;
				}
				return Static582.aClass35Array3[arg3].method7452(arg2, arg1);
			} else {
				return 0;
			}
		} else {
			return Static582.aClass35Array3[arg3].method7452(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z")
	public static boolean method4025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static663.method8844(arg1, arg0) || Static371.method5293(arg1, arg0);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!nq;)V")
	public static void method4029(@OriginalArg(0) Class255 arg0) {
		Static305.aClass255_2 = arg0;
	}
}
