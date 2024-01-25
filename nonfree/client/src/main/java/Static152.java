import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "[[Lclient!sh;")
	public static Class186[][] aClass186ArrayArray1;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
	public static int anInt3054;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
	public static int anInt3053 = -1;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_78 = new Class140(30);

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	public static int anInt3055 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public static void method2897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static198.method3725(arg1)) {
			Static317.method5333(Static314.aClass177ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method2899(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static230.method4157(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static159.method2990(local7);
			local7 = Static290.method4940(":", local7, "%3a");
			local7 = Static290.method4940("@", local7, "%40");
			local7 = Static290.method4940("&", local7, "%26");
			local7 = Static290.method4940("#", local7, "%23");
			if (Static40.aClass110_8.anApplet1 != null) {
				@Pc(99) Class134 local99 = Static40.aClass110_8.method3359(new URL(Static40.aClass110_8.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static340.anInt3935 + "&u=" + Static195.aLong134 + "&v1=" + Static168.aString145 + "&v2=" + Static168.aString142 + "&e=" + local7));
				while (local99.anInt4033 == 0) {
					Static134.method2598(1L);
				}
				if (local99.anInt4033 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local99.anObject6;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}
