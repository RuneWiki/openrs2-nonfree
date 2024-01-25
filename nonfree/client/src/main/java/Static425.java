import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
	public static int anInt7177;

	@OriginalMember(owner = "client!vh", name = "R", descriptor = "Lclient!ke;")
	public static Class131 aClass131_4;

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "Lclient!qh;")
	public static Class199 aClass199_179 = new Class199(64);

	@OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
	public static int anInt7184 = 0;

	@OriginalMember(owner = "client!vh", name = "Q", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_171 = new Class119("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)I")
	public static int method5631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static94.aClass157Array1 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(14) int local14 = arg4 >> 7;
			@Pc(18) int local18 = arg0 >> 7;
			if (arg2 < 0 || arg3 < 0 || Static296.anInt5187 - 1 < arg2 || Static206.anInt3607 - 1 < arg3) {
				return 0;
			}
			if (local14 < 1 || local18 < 1 || Static296.anInt5187 - 1 < local14 || Static206.anInt3607 - 1 < local18) {
				return 0;
			}
			@Pc(90) boolean local90 = (Static147.aByteArrayArrayArray22[1][arg4 >> 7][arg0 >> 7] & 0x2) != 0;
			@Pc(112) boolean local112;
			@Pc(128) boolean local128;
			if ((arg4 & 0x7F) == 0) {
				local112 = (Static147.aByteArrayArrayArray22[1][local14 - 1][arg0 >> 7] & 0x2) != 0;
				local128 = (Static147.aByteArrayArrayArray22[1][local14][arg0 >> 7] & 0x2) != 0;
				if (local128 != local112) {
					local90 = (Static147.aByteArrayArrayArray22[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg0 & 0x7F) == 0) {
				local112 = (Static147.aByteArrayArrayArray22[1][arg4 >> 7][local18 - 1] & 0x2) != 0;
				local128 = (Static147.aByteArrayArrayArray22[1][arg4 >> 7][local18] & 0x2) != 0;
				if (local128 != local112) {
					local90 = (Static147.aByteArrayArrayArray22[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (local90) {
				arg1++;
			}
		}
		return Static94.aClass157Array1[arg1].ca(arg4, arg0);
	}
}
