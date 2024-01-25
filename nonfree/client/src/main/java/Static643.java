import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public static int anInt10682;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_189 = new Class268(121, 3);

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
	public static boolean aBoolean726 = false;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	public static int anInt10677 = -1;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Z")
	public static boolean method8973() {
		try {
			@Pc(7) Class109 local7 = new Class109();
			@Pc(20) byte[] local20 = local7.method3151(Static25.aByteArray3);
			Static483.method7218(local20);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BZ)V")
	public static void method8975(@OriginalArg(1) boolean arg0) {
		Static54.method911();
		if (!Static283.method5439(Static554.anInt1821)) {
			return;
		}
		Static475.anInt8297++;
		if (Static475.anInt8297 < 50 && !arg0) {
			return;
		}
		Static475.anInt8297 = 0;
		if (!Static243.aBoolean343 && Static97.aClass29_1 != null) {
			@Pc(42) Class6_Sub9 local42 = Static560.method8089(Static391.aClass126_1, Static538.aClass208_81);
			Static263.method4681(local42);
			try {
				Static265.method3201();
			} catch (@Pc(51) IOException local51) {
				Static243.aBoolean343 = true;
			}
		}
		Static54.method911();
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
	public static void method8977() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static501.aBooleanArray46[local12] = true;
		}
	}
}
