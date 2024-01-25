import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static490 {

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "F")
	public static float aFloat236;

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "Z")
	public static boolean aBoolean796 = false;

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_156 = new Class216(75, 3);

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_45 = new Class268("", 16);

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray34 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)Z")
	public static boolean method8899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)Z")
	public static boolean method8900(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;IB)Lclient!ha;")
	public static Class33 method8902(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		return new Class33_Sub3(arg1, arg0, arg2);
	}
}
