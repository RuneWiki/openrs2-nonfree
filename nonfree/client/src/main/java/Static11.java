import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!am", name = "L", descriptor = "I")
	public static int anInt246;

	@OriginalMember(owner = "client!am", name = "B", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_21 = new Class159("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!am", name = "D", descriptor = "I")
	public static int anInt241 = 0;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "[S")
	public static short[] aShortArray5 = new short[256];

	@OriginalMember(owner = "client!am", name = "H", descriptor = "[I")
	public static final int[] anIntArray7 = new int[64];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lclient!mq;")
	public static Class136 method223(@OriginalArg(1) int arg0) {
		@Pc(10) Class136 local10 = (Class136) Static168.aClass198_247.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static255.aClass193_90.method5047(36, arg0);
		local10 = new Class136();
		local10.anInt4272 = arg0;
		if (local25 != null) {
			local10.method3852(new Class4_Sub11(local25));
		}
		local10.method3846();
		Static168.aClass198_247.method5201(local10, (long) arg0);
		return local10;
	}
}
