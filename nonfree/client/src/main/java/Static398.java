import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static398 {

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_115 = new Class237(76, 7);

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_91 = new Class84("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
	public static int anInt6923 = 0;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	public static int anInt6924 = 0;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_174 = new Class131(19, -1);

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_116 = new Class237(93, 12);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
	public static boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static108.method1668(arg1, arg0) | (arg1 & 0x70000) != 0 || Static243.method3589(arg1, arg0);
	}
}
