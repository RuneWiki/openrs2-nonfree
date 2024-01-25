import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!tka", name = "e", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!tka", name = "j", descriptor = "Lclient!kw;")
	public static Class178 aClass178_27;

	@OriginalMember(owner = "client!tka", name = "h", descriptor = "Z")
	public static boolean aBoolean651 = false;

	@OriginalMember(owner = "client!tka", name = "f", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_37 = new Class320(255);

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(III)Z")
	public static boolean method8254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static530.aBoolean556) {
			return false;
		}
		@Pc(14) int local14 = arg1 >> 16;
		@Pc(18) int local18 = arg1 & 0xFFFF;
		if (Static172.aClass270ArrayArray2[local14] == null || Static172.aClass270ArrayArray2[local14][local18] == null) {
			return false;
		}
		@Pc(39) Class270 local39 = Static172.aClass270ArrayArray2[local14][local18];
		@Pc(61) Class3_Sub7_Sub10 local61;
		if (arg0 == -1 && local39.anInt7008 == 0) {
			for (local61 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local61 != null; local61 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
				if (local61.anInt3913 == 48 || local61.anInt3913 == 1002 || local61.anInt3913 == 25 || local61.anInt3913 == 20 || local61.anInt3913 == 23) {
					for (@Pc(108) Class270 local108 = Static254.method3544(local61.anInt3911); local108 != null; local108 = Static518.method6970(local108)) {
						if (local39.anInt6973 == local108.anInt6973) {
							return true;
						}
					}
				}
			}
		} else {
			for (local61 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local61 != null; local61 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
				if (arg0 == local61.anInt3909 && local39.anInt6973 == local61.anInt3911 && (local61.anInt3913 == 48 || local61.anInt3913 == 1002 || local61.anInt3913 == 25 || local61.anInt3913 == 20 || local61.anInt3913 == 23)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(I)V")
	public static void method8257() throws Exception_Sub1 {
		if (Static488.anInt7680 == 1) {
			Static536.aClass22_11.method9391(Static245.anInt3872, Static511.anInt8098);
		} else {
			Static536.aClass22_11.method9391(0, 0);
		}
	}
}
