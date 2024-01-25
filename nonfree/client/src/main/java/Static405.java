import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "Lclient!dn;")
	public static Class56 aClass56_84;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_226 = new Class175("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "[S")
	public static final short[] aShortArray88 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "[Lclient!un;")
	public static final Class239[] aClass239Array1 = new Class239[2048];

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_227 = new Class175("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[C")
	public static final char[] aCharArray11 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
	public static int anInt7048 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!bt;I)Lclient!dw;")
	public static Class3_Sub4 method5473(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.method6053();
		@Pc(20) int local20 = arg0.method6053();
		@Pc(24) Class3_Sub4 local24 = Static135.method2468(local20);
		local24.anInt7582 = arg0.method6053();
		@Pc(33) int local33 = arg0.method6053();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method6053();
			local24.method5958(local41, arg0);
		}
		local24.method5963();
		return local24;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZII)I")
	public static int method5474(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub30 local8 = Static9.method237(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local8.anIntArray362.length; local26++) {
				if (local8.anIntArray360[local26] == arg0) {
					local24 += local8.anIntArray362[local26];
				}
			}
			return local24;
		}
	}
}
