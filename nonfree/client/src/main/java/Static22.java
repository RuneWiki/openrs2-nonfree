import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public static int anInt422;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public static int anInt425;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Z")
	public static final boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_9 = new Class231("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_10 = new Class231("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method400() {
		Static456.aClass188_59.method4156();
		Static54.aClass188_11.method4156();
		Static264.aClass188_39.method4156();
		Static164.aClass188_30.method4156();
		Static97.aClass188_17.method4156();
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method401() {
		Static255.aBoolean324 = true;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method402(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static48.method744(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static75.method1139(local7);
			local7 = Static318.method4521("%3a", local7, ":");
			local7 = Static318.method4521("%40", local7, "@");
			local7 = Static318.method4521("%26", local7, "&");
			local7 = Static318.method4521("%23", local7, "#");
			if (Static243.aClass194_4.anApplet1 == null) {
				return;
			}
			@Pc(99) Class136 local99 = Static243.aClass194_4.method4411(new URL(Static243.aClass194_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static441.anInt7393 + "&u=" + Static333.aLong307 + "&v1=" + Static307.aString52 + "&v2=" + Static307.aString46 + "&e=" + local7));
			while (local99.anInt3418 == 0) {
				Static167.method6157(1L);
			}
			if (local99.anInt3418 == 1) {
				@Pc(118) DataInputStream local118 = (DataInputStream) local99.anObject10;
				local118.read();
				local118.close();
			}
		} catch (@Pc(125) Exception local125) {
		}
	}
}
