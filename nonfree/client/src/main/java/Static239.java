import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "Lclient!tj;")
	public static Class193 aClass193_83;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	public static int anInt4795;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_257 = new Class159("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	public static int anInt4794 = 0;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILclient!ml;II)Ljava/awt/Frame;")
	public static Frame method4227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class134 arg3) {
		if (!arg3.method3763()) {
			return null;
		}
		@Pc(20) Class101[] local20 = Static287.method3917(arg3);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg2 == local20[local28].anInt3228 && local20[local28].anInt3223 == arg0 && (!local26 || local20[local28].anInt3225 > arg1)) {
				local26 = true;
				arg1 = local20[local28].anInt3225;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(93) Class185 local93 = arg3.method3747(arg2, arg1, arg0);
		while (local93.anInt5682 == 0) {
			Static249.method4396(10L);
		}
		@Pc(108) Frame local108 = (Frame) local93.anObject4;
		if (local108 == null) {
			return null;
		} else if (local93.anInt5682 == 2) {
			Static311.method5120(local108, arg3);
			return null;
		} else {
			return local108;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!tj;)V")
	public static void method4228(@OriginalArg(1) Class193 arg0) {
		Static25.aClass193_7 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method4230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
