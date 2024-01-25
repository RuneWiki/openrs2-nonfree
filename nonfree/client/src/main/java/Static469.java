import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
	public static int anInt8088;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public static int anInt8085 = 0;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "[I")
	public static final int[] anIntArray626 = new int[3];

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_137 = new Class40("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString73 = "";

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Lclient!kd;")
	public static Class15_Sub5 method6581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass15_Sub5_1 == null ? null : local7.aClass15_Sub5_1;
	}
}
