import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!q", name = "hb", descriptor = "Z")
	public static boolean aBoolean138;

	@OriginalMember(owner = "client!q", name = "jb", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_94;

	@OriginalMember(owner = "client!q", name = "kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1816 = Static107.method1838("logo");

	@OriginalMember(owner = "client!q", name = "lb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1817 = Static107.method1838("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!q", name = "ob", descriptor = "[I")
	public static int[] anIntArray277 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
	public static void method2108() {
		aClass28_1817 = null;
		aClass28_1816 = null;
		anIntArray277 = null;
		aClass40_Sub1_94 = null;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)Z")
	public static boolean method2109(@OriginalArg(1) int arg0) {
		if (Static14.aBooleanArray8[arg0]) {
			return true;
		} else if (Static84.aClass40_22.method1776(arg0)) {
			@Pc(23) int local23 = Static84.aClass40_22.method1785(arg0);
			if (local23 == 0) {
				Static14.aBooleanArray8[arg0] = true;
				return true;
			}
			if (Static23.aClass24ArrayArray1[arg0] == null) {
				Static23.aClass24ArrayArray1[arg0] = new Class24[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static23.aClass24ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static84.aClass40_22.method1771(arg0, local45);
					if (local59 != null) {
						Static23.aClass24ArrayArray1[arg0][local45] = new Class24();
						Static23.aClass24ArrayArray1[arg0][local45].anInt1367 = (arg0 << 16) + local45;
						if (local59[0] == -1) {
							Static23.aClass24ArrayArray1[arg0][local45].method991(new Class2_Sub2(local59));
						} else {
							Static23.aClass24ArrayArray1[arg0][local45].method988(new Class2_Sub2(local59));
						}
					}
				}
			}
			Static14.aBooleanArray8[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
