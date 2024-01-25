import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
	private static int anInt1055;

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
	private static int anInt1056;

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "Z")
	private static boolean aBoolean48;

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "Z")
	private static boolean aBoolean49;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public static int anInt1026 = 0;

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_10 = new Class266();

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "[I")
	public static final int[] anIntArray70 = new int[14];

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_17 = new Class84("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_8 = new Class83(5);

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "[I")
	public static final int[] anIntArray71 = new int[16];

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
	public static int anInt1051 = 0;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
	public static int anInt1052 = -1;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
	public static int anInt1053 = 2;

	@OriginalMember(owner = "client!jg", name = "providesignlink", descriptor = "(Lclient!kj;)V")
	private static void method904(@OriginalArg(0) Class138 arg0) {
		Static119.aClass138_7 = arg0;
		Static293.aClass138_4 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZII)Lclient!wq;")
	public static Class1_Sub45 method906(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class1_Sub45) Static405.aClass27_40.method553(local17);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V")
	public static void method909() {
		if (Static244.aBoolean299) {
			Static244.aBoolean299 = false;
			Static337.aClass80_21 = null;
			Static424.aClass80_19 = null;
		}
	}
}
