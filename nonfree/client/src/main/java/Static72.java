import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!m;")
	public static final Class235 aClass235_7 = new Class235(53);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method921(@OriginalArg(0) String arg0) {
		@Pc(13) String local13 = null;
		@Pc(19) int local19 = arg0.indexOf("--> ");
		if (local19 >= 0) {
			local13 = arg0.substring(0, local19 + 4);
			arg0 = arg0.substring(local19 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(48) int local48 = arg0.indexOf(" ", "directlogin ".length());
			if (local48 >= 0) {
				@Pc(53) int local53 = arg0.length();
				arg0 = arg0.substring(0, local48) + " ";
				for (@Pc(69) int local69 = local48 + 1; local69 < local53; local69++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local13 == null ? arg0 : local13 + arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ha;IILclient!av;II)V")
	public static void method922(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 7; local7 >= 0; local7--) {
			for (@Pc(13) int local13 = 127; local13 >= 0; local13--) {
				Static533.method7508(false, true);
				@Pc(37) int local37 = local13 & 0x7F | (arg3 & 0x3F) << 10 | (local7 & 0x7) << 7;
				@Pc(41) int local41 = Static305.anIntArray309[local37];
				Static246.method3750(false, true);
				arg0.aa(arg1 + (arg2.anInt509 * local13 >> 7), (arg2.anInt569 * (-local7 + 7) >> 3) + arg4, (arg2.anInt509 >> 7) + 1, (arg2.anInt569 >> 3) + 1, local41, 0);
			}
		}
		if (-856366297 != -856366297) {
			aBoolean91 = true;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!lb;)V")
	public static void method923(@OriginalArg(1) Class221 arg0) {
		Static25.anInt416 = arg0.method5096("hitbar_default");
		Static148.anInt2795 = arg0.method5096("timerbar_default");
		Static133.anInt3371 = arg0.method5096("headicons_pk");
		Static534.anInt8996 = arg0.method5096("headicons_prayer");
		Static8.anInt111 = arg0.method5096("hint_headicons");
		Static300.anInt5442 = arg0.method5096("hint_mapmarkers");
		Static274.anInt5019 = arg0.method5096("mapflag");
		Static16.anInt291 = arg0.method5096("cross");
		Static581.anInt9512 = arg0.method5096("mapdots");
		Static8.anInt109 = arg0.method5096("scrollbar");
		Static221.anInt4257 = arg0.method5096("name_icons");
		Static168.anInt10675 = arg0.method5096("floorshadows");
		Static330.anInt5761 = arg0.method5096("compass");
		Static145.anInt2755 = arg0.method5096("otherlevel");
		Static700.anInt10967 = arg0.method5096("hint_mapedge");
	}
}
