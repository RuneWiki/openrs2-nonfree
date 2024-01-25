import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_71 = new Class231("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "[I")
	public static final int[] anIntArray352 = new int[13];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/String;ILclient!pb;)Lclient!jl;")
	public static Class136 method3158(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class194 arg2) {
		if (arg1 == 0) {
			return arg2.method4397(arg0);
		}
		@Pc(41) Class136 local41;
		if (arg1 == 1) {
			try {
				Static471.method4355(arg2.anApplet1, new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg0)).toString() }, "openjs");
				local41 = new Class136();
				local41.anInt3418 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class136();
				local41.anInt3418 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_blank");
				local41 = new Class136();
				local41.anInt3418 = 1;
				return local41;
			} catch (@Pc(83) Exception local83) {
				local41 = new Class136();
				local41.anInt3418 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static471.method4356(arg2.anApplet1, "loggedout");
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_top");
				local41 = new Class136();
				local41.anInt3418 = 1;
				return local41;
			} catch (@Pc(125) Exception local125) {
				local41 = new Class136();
				local41.anInt3418 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
