import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
	public static int anInt5323;

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Z")
	public static final boolean aBoolean371 = false;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
	public static void method4151() {
		if (!Static430.aBoolean586) {
			return;
		}
		@Pc(11) Class155 local11 = Static539.method7544(Static286.anInt6126, Static569.anInt7644);
		if (local11 != null && local11.anObjectArray3 != null) {
			@Pc(20) Class4_Sub37 local20 = new Class4_Sub37();
			local20.aClass155_10 = local11;
			local20.anObjectArray31 = local11.anObjectArray3;
			Static471.method6884(local20);
		}
		Static430.aBoolean586 = false;
		Static117.anInt2703 = -1;
		Static231.anInt4893 = -1;
		if (local11 != null) {
			Static368.method5060(local11);
		}
	}
}
