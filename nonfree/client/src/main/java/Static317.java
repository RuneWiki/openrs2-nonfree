import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	public static int anInt6172;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!ij;")
	public static Class93 aClass93_120;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_132 = new Class85("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V")
	public static void method5539(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 7);
		local8.method856();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z")
	public static boolean method5541() {
		return Static250.anInt4969 == 0 ? Static188.aClass5_Sub16_Sub1_3.method1696() : true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method5542() {
		if (Static155.aBoolean230) {
			return;
		}
		Static155.aBoolean230 = true;
		Static289.aBoolean472 = true;
		if (Static131.aBoolean194) {
			Static29.aFloat7 = (int) Static29.aFloat7 + 47 & 0xFFFFFFF0;
		} else {
			Static215.aFloat55 += (12.0F - Static215.aFloat55) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLclient!ij;)Lclient!lk;")
	public static Class5_Sub24 method5543(@OriginalArg(0) int arg0, @OriginalArg(2) Class93 arg1) {
		@Pc(8) byte[] local8 = arg1.method2392(arg0);
		return local8 == null ? null : new Class5_Sub24(local8);
	}
}
