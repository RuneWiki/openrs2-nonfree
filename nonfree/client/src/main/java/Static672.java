import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static672 {

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "Lclient!lga;")
	public static Class223 aClass223_120;

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "Lclient!lga;")
	public static Class223 aClass223_121;

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "[Lclient!vo;")
	public static Class381[] aClass381Array3;

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_200 = new Class322(81, 16);

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_201 = new Class322(87, 3);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)Z")
	public static boolean method8907(@OriginalArg(1) int arg0) {
		return arg0 == 9 || arg0 == 10;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(CI)I")
	public static int method8908(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class6_Sub8_Sub24.anIntArray362.length ? Class6_Sub8_Sub24.anIntArray362[arg0] : -1;
	}
}
