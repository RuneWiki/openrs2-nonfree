import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!po", name = "T", descriptor = "[Lclient!la;")
	public static Class99[] aClass99Array1;

	@OriginalMember(owner = "client!po", name = "O", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!po", name = "Q", descriptor = "Z")
	public static boolean aBoolean307 = true;

	@OriginalMember(owner = "client!po", name = "S", descriptor = "Lclient!l;")
	public static Class98 aClass98_38 = new Class98(4);

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(IB)Lclient!nn;")
	public static Class124 method3602(@OriginalArg(0) int arg0) {
		@Pc(10) Class124 local10 = (Class124) Static29.aClass98_7.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(33) byte[] local33 = Static18.aClass155_13.method4121(Static314.method5011(arg0), Static287.method4737(arg0));
		local10 = new Class124();
		local10.anInt3767 = arg0;
		if (local33 != null) {
			local10.method3193(new Class3_Sub26(local33));
		}
		local10.method3198();
		Static29.aClass98_7.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3603(@OriginalArg(1) String arg0) {
		return Static45.method682(arg0, 10);
	}
}
