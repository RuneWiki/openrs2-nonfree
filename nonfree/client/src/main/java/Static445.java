import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	public static int anInt2588;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_45 = new Class198("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "Lclient!d;")
	public static final Class44 aClass44_25 = new Class44(4);

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_35 = new Class194(58, 2);

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!jp;")
	public static Class129 aClass129_65 = null;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	public static int method2063(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
	public static void method2066() {
		Static288.method3576(Static330.aClass194_89);
		for (@Pc(23) Class5_Sub44 local23 = (Class5_Sub44) Static151.aClass252_42.method5660(); local23 != null; local23 = (Class5_Sub44) Static151.aClass252_42.method5666()) {
			if (!local23.method6005()) {
				local23 = (Class5_Sub44) Static151.aClass252_42.method5660();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt6979 == 0) {
				Static456.method5988(true, true, local23);
			}
		}
		if (Static192.aClass76_9 != null) {
			Static53.method833(Static192.aClass76_9);
			Static192.aClass76_9 = null;
		}
	}
}
