import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
	public static int anInt4006 = 0;

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_206 = new Class159("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

	@OriginalMember(owner = "client!ma", name = "bb", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_207 = new Class159("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
	public static int anInt4020 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!bk;II)Lclient!vq;")
	public static Class47 method3630(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		return new Class47_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
	public static void method3632() {
		@Pc(5) Class198 local5 = Static334.aClass198_141;
		synchronized (Static334.aClass198_141) {
			Static334.aClass198_141.method5213();
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)V")
	public static void method3633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class28 local7 = Static344.method2698(arg1);
		@Pc(10) int local10 = local7.anInt1023;
		@Pc(13) int local13 = local7.anInt1017;
		@Pc(16) int local16 = local7.anInt1022;
		@Pc(23) int local23 = Class187.anIntArray458[local16 - local13];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static245.method4358(arg0 << local13 & local23 | Static341.anIntArray9[local10] & ~local23, local10);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method3635(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString66 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(62) BufferedReader local62 = new BufferedReader(new StringReader(local45));
		@Pc(65) String local65 = local62.readLine();
		while (true) {
			@Pc(68) String local68 = local62.readLine();
			if (local68 == null) {
				return local10 + "| " + local65;
			}
			@Pc(74) int local74 = local68.indexOf(40);
			@Pc(81) int local81 = local68.indexOf(41, local74 + 1);
			@Pc(90) String local90;
			if (local74 == -1) {
				local90 = local68;
			} else {
				local90 = local68.substring(0, local74);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local10 = local10 + local90;
			if (local74 != -1 && local81 != -1) {
				@Pc(134) int local134 = local68.indexOf(".java:", local74);
				if (local134 >= 0) {
					local10 = local10 + local68.substring(local134 + 5, local81);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
