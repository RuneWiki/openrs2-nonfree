import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static272 {

	@OriginalMember(owner = "client!kba", name = "v", descriptor = "Lclient!oh;")
	public static Class237 aClass237_73;

	@OriginalMember(owner = "client!kba", name = "u", descriptor = "Lclient!of;")
	public static final Class236 aClass236_51 = new Class236(8);

	@OriginalMember(owner = "client!kba", name = "w", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_30 = new Class43();

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
	public static void method4682() {
		Static580.aClass16_10.method6066(Static499.aClass54_9);
		Static580.aClass16_10.DA(Static564.anInt9726, Static370.anInt7049, Static591.anInt10108, Static270.anInt9893);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method4685(@OriginalArg(0) File arg0) {
		return Static146.method3031(arg0, (int) arg0.length());
	}
}
