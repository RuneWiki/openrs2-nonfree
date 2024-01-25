import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dp", name = "L", descriptor = "[Lclient!tw;")
	public static Class331[] aClass331Array1;

	@OriginalMember(owner = "client!dp", name = "M", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!dp", name = "D", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_27 = new Class185(24, -1);

	@OriginalMember(owner = "client!dp", name = "H", descriptor = "I")
	public static int anInt2930 = 104;

	@OriginalMember(owner = "client!dp", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString21 = null;

	@OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
	public static int anInt2934 = 0;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(II)Z")
	public static boolean method2479(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Lclient!vea;")
	public static Class352 method2481(@OriginalArg(0) int arg0) {
		@Pc(8) Class352[] local8 = Static243.method3834();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt10145) {
				return local8[local10];
			}
		}
		return null;
	}
}
