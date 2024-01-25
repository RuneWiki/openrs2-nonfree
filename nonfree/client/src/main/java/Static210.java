import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard5;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	public static void method7462(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static390.anInt6669 != -1) {
				Static607.method8681(Static390.anInt6669);
			}
			for (@Pc(30) Class5_Sub49 local30 = (Class5_Sub49) Static549.aClass291_37.method6987(); local30 != null; local30 = (Class5_Sub49) Static549.aClass291_37.method6989()) {
				if (!local30.method9326()) {
					local30 = (Class5_Sub49) Static549.aClass291_37.method6987();
					if (local30 == null) {
						break;
					}
				}
				Static372.method7048(local30, true, false);
			}
			Static390.anInt6669 = -1;
			Static549.aClass291_37 = new Class291(8);
			Static466.method6819();
			Static390.anInt6669 = Static164.anInt2526;
			Static294.method4358(false);
			Static437.method6493();
			Static173.method2523(Static390.anInt6669);
		}
		Static541.aBoolean711 = true;
	}
}
