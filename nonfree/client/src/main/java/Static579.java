import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public static int anInt9935;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_73 = new Class187(64);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method8266() {
		if (Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 0 && Static673.anInt11161 != Static586.anInt10060) {
			Static540.method8404(false, Static100.anInt2131, 11, Static403.anInt7392);
		} else {
			Static264.method3854(Static677.aClass137_47);
			if (Static586.anInt10060 != Static524.anInt9107) {
				Static514.method7474();
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/io/File;IB)[B")
	public static byte[] method8268(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static209.method3278(arg0, arg1, local6);
			return local6;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!js;)V")
	public static void method8269(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub29_Sub1 arg1) {
		Static537.anInt9246 = 0;
		Static647.aBoolean744 = false;
		Static55.method1187(arg1);
		Static102.method1824(arg1);
		if (Static647.aBoolean744) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt7264 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7264 + " psize:" + arg0);
		}
	}
}
