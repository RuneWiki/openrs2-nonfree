import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!kba;")
	public static Class163 aClass163_8;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_5 = new Class73(35, -1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!sba;II)V")
	public static void method549(@OriginalArg(1) Class302 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static141.aBoolean262) {
			@Pc(18) Class164 local18 = Static26.anInt771 == -1 ? null : Static69.aClass369_1.method8523(Static26.anInt771);
			if (Static75.method2151(arg0).method8491() && (Static38.anInt1411 & 0x20) != 0 && (local18 == null || arg0.method7359(local18.anInt5972, Static26.anInt771) != local18.anInt5972)) {
				Static513.method7357(true, 0L, Static574.anInt9810, arg0.anInt8898, Static275.aString109 + " -> " + arg0.aString89, false, arg0.anInt8867, 59, (long) (arg0.anInt8898 << 0 | arg0.anInt8867), arg0.anInt8899, false, Static381.aString72);
			}
		}
		@Pc(98) String local98;
		for (@Pc(91) int local91 = 9; local91 >= 5; local91--) {
			local98 = Static76.method2153(arg0, local91);
			if (local98 != null) {
				Static513.method7357(true, (long) (local91 + 1), Static642.method8748(arg0, local91), arg0.anInt8898, arg0.aString89, false, arg0.anInt8867, 1006, (long) (arg0.anInt8867 | arg0.anInt8898 << 0), arg0.anInt8899, false, local98);
			}
		}
		local98 = Static316.method5294(arg0);
		if (local98 != null) {
			Static513.method7357(true, 0L, arg0.anInt8870, arg0.anInt8898, arg0.aString89, false, arg0.anInt8867, 21, (long) (arg0.anInt8898 << 0 | arg0.anInt8867), arg0.anInt8899, false, local98);
		}
		for (@Pc(177) int local177 = 4; local177 >= 0; local177--) {
			@Pc(184) String local184 = Static76.method2153(arg0, local177);
			if (local184 != null) {
				Static513.method7357(true, (long) (local177 + 1), Static642.method8748(arg0, local177), arg0.anInt8898, arg0.aString89, false, arg0.anInt8867, 49, (long) (arg0.anInt8867 | arg0.anInt8898 << 0), arg0.anInt8899, false, local184);
			}
		}
		if (!Static75.method2151(arg0).method8493()) {
			return;
		}
		if (arg0.aString92 == null) {
			Static513.method7357(true, 0L, -1, arg0.anInt8898, "", false, arg0.anInt8867, 9, (long) (arg0.anInt8867 | arg0.anInt8898 << 0), arg0.anInt8899, false, Static536.aClass316_11.method7577(Static638.anInt10709));
		} else {
			Static513.method7357(true, 0L, -1, arg0.anInt8898, "", false, arg0.anInt8867, 9, (long) (arg0.anInt8867 | arg0.anInt8898 << 0), arg0.anInt8899, false, arg0.aString92);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	public static void method550() {
		Static182.aBoolean328 = false;
		Static486.method8547();
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Z")
	public static boolean method551() {
		return Static453.anInt8163 == 0 ? Static623.aClass6_Sub4_Sub2_4.method4795() : true;
	}
}
