import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!saa", name = "Db", descriptor = "Lclient!nc;")
	public static Class80 aClass80_2;

	@OriginalMember(owner = "client!saa", name = "A", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_120 = new Class71(46, 5);

	@OriginalMember(owner = "client!saa", name = "tb", descriptor = "I")
	public static int anInt8909 = -1;

	@OriginalMember(owner = "client!saa", name = "Bb", descriptor = "Lclient!of;")
	public static final Class236 aClass236_85 = new Class236(32);

	@OriginalMember(owner = "client!saa", name = "Cb", descriptor = "Z")
	public static boolean aBoolean635 = false;

	@OriginalMember(owner = "client!saa", name = "Eb", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
	public static void method7310() {
		for (@Pc(11) Class8_Sub52 local11 = (Class8_Sub52) Static16.aClass253_3.method6593(); local11 != null; local11 = (Class8_Sub52) Static16.aClass253_3.method6595()) {
			Static373.method7299(local11.anInt10660);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method7312(@OriginalArg(0) Class8_Sub5_Sub7 arg0) {
		if (Static211.aBoolean370) {
			return;
		}
		arg0.method8640();
		Static548.anInt9471--;
		if (!arg0.aBoolean278) {
			@Pc(83) long local83 = arg0.aLong92;
			@Pc(89) Class8_Sub5_Sub6 local89;
			for (local89 = (Class8_Sub5_Sub6) Static555.aClass253_37.method6594(local83); local89 != null && !local89.aString37.equals(arg0.aString42); local89 = (Class8_Sub5_Sub6) Static555.aClass253_37.method6599()) {
			}
			if (local89 != null && local89.method2814(arg0)) {
				Static193.method3637(local89);
			}
			return;
		}
		for (@Pc(28) Class8_Sub5_Sub6 local28 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local28 != null; local28 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
			if (local28.aString37.equals(arg0.aString42)) {
				@Pc(38) boolean local38 = false;
				for (@Pc(44) Class8_Sub5_Sub7 local44 = (Class8_Sub5_Sub7) local28.aClass302_2.method7327(); local44 != null; local44 = (Class8_Sub5_Sub7) local28.aClass302_2.method7326()) {
					if (arg0 == local44) {
						if (local28.method2814(arg0)) {
							Static193.method3637(local28);
						}
						local38 = true;
						break;
					}
				}
				if (local38) {
					return;
				}
			}
		}
	}
}
