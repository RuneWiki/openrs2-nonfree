import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static406 {

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_92 = new Class134("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	public static int anInt6642 = 2;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
	public static boolean method5145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
	public static int method5146(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
