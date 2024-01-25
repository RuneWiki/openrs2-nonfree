import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public static int anInt343;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Lclient!um;")
	public static Class243 aClass243_12;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_4 = new Class198("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_6 = new Class194(47, 3);

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_8 = new Class129(29, -1);

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public static int anInt344 = 0;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Z")
	public static boolean method264(@OriginalArg(1) int arg0) {
		Static31.anInt615 = arg0 + 1 & 0xFFFF;
		Static297.aBoolean330 = true;
		return true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[Lclient!fi;I)V")
	public static void method265(@OriginalArg(1) Class76[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) Class76 local16 = arg0[local10];
			if (local16 != null) {
				if (local16.anInt2060 == 0) {
					if (local16.aClass76Array2 != null) {
						method265(local16.aClass76Array2, arg1);
					}
					@Pc(40) Class5_Sub44 local40 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local16.anInt2100);
					if (local40 != null) {
						Static391.method5105(local40.anInt6981, arg1);
					}
				}
				@Pc(56) Class5_Sub33 local56;
				if (arg1 == 0 && local16.anObjectArray30 != null) {
					local56 = new Class5_Sub33();
					local56.aClass76_12 = local16;
					local56.anObjectArray35 = local16.anObjectArray30;
					Static181.method2470(local56);
				}
				if (arg1 == 1 && local16.anObjectArray17 != null) {
					if (local16.anInt2115 >= 0) {
						@Pc(84) Class76 local84 = Static213.method2817(local16.anInt2100);
						if (local84 == null || local84.aClass76Array2 == null || local16.anInt2115 >= local84.aClass76Array2.length || local84.aClass76Array2[local16.anInt2115] != local16) {
							continue;
						}
					}
					local56 = new Class5_Sub33();
					local56.aClass76_12 = local16;
					local56.anObjectArray35 = local16.anObjectArray17;
					Static181.method2470(local56);
				}
			}
		}
	}
}
