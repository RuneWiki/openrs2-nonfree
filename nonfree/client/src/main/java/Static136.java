import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!ir;")
	public static Class100 aClass100_62;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lclient!w;")
	public static Class211 method2268(@OriginalArg(1) int arg0) {
		@Pc(17) Class211 local17 = (Class211) Static60.aClass198_16.method5242((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static82.aClass100_33.method2319(36, arg0);
		local17 = new Class211();
		local17.anInt6590 = arg0;
		if (local27 != null) {
			local17.method5557(new Class3_Sub4(local27));
		}
		local17.method5561();
		Static60.aClass198_16.method5231((long) arg0, local17);
		return local17;
	}
}
