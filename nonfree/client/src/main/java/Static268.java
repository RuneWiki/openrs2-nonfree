import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "Lclient!wea;")
	public static Class370 aClass370_3;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!ka;III)Lclient!hw;")
	public static Class142 method4930(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg1 == null ? null : new Class142(arg0, arg3, arg2, arg1.na(), arg1.V(), arg1.RA(), arg1.fa(), arg1.EA(), arg1.HA(), arg1.G());
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!cea;)Lclient!hc;")
	public static Class114_Sub3 method4933(@OriginalArg(1) Class2_Sub11 arg0) {
		return new Class114_Sub3(arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8347(), arg0.method8383());
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method4935(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass370_3.aBoolean739) {
			Static185.aClass255_2 = new Class255();
			Static185.aClass255_2.anInt7912 = arg1;
			Static185.aClass255_2.aString89 = arg0;
			if (Static193.aClass107_2 != Static448.aClass107_7) {
				Static185.aClass255_2.anInt7908 = Static185.aClass255_2.anInt7912 + 50000;
				Static185.aClass255_2.anInt7914 = Static185.aClass255_2.anInt7912 + 40000;
			}
			if (arg1 < Static281.aClass206_Sub1Array1.length && Static281.aClass206_Sub1Array1[arg1] != null) {
				Static553.anInt9912 = Static281.aClass206_Sub1Array1[arg1].anInt6902;
			}
			return true;
		}
		@Pc(50) String local50 = "";
		if (Static448.aClass107_7 != Static193.aClass107_2) {
			local50 = ":" + (arg1 + 7000);
		}
		@Pc(65) String local65 = "";
		if (Static26.aString7 != null) {
			local65 = "/p=" + Static26.aString7;
		}
		@Pc(113) String local113 = "http://" + arg0 + local50 + "/l=" + Static476.anInt8915 + "/a=" + Static482.anInt8988 + local65 + "/j" + (Static612.aBoolean729 ? "1" : "0") + ",o" + (Static503.aBoolean663 ? "1" : "0") + ",a2";
		try {
			Static30.aClient1.getAppletContext().showDocument(new URL(local113), "_self");
			return true;
		} catch (@Pc(128) Exception local128) {
			return false;
		}
	}
}
