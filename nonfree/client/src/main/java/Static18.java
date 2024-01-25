import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_106 = new Class189("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
	public static final int[] anIntArray220 = new int[5];

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
	public static int anInt3394 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V")
	public static void method2730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 16);
		local8.method3248();
		local8.anInt4063 = arg1;
	}
}
