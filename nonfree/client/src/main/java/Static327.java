import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!nn", name = "gb", descriptor = "I")
	public static int anInt6160;

	@OriginalMember(owner = "client!nn", name = "hb", descriptor = "[I")
	public static final int[] anIntArray608 = new int[3];

	@OriginalMember(owner = "client!nn", name = "mb", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_307 = new Class305(108, 10);

	@OriginalMember(owner = "client!nn", name = "qb", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZII)V")
	public static void method5592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static121.anInt2501 == 1) {
			Static318.method5462(arg1, Static32.aClass1_Sub25_1, arg0);
		} else if (Static121.anInt2501 == 2) {
			Static367.method5955(arg0, arg1);
		}
		Static32.aClass1_Sub25_1 = null;
		Static121.anInt2501 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBLjava/net/Socket;)Lclient!ia;")
	public static Class134 method5593(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class134_Sub1(arg0, 5000);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
	public static int method5594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 31 & arg0 - 1;
		return local11 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)Z")
	public static boolean method5595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static20.method592(arg1, arg0) | (arg1 & 0x60000) != 0 || Static420.method6572(arg0, arg1) || Static170.method3194(arg1, arg0);
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
	public static void method5596() {
		@Pc(16) Class1_Sub2_Sub16 local16 = Static422.method6588(15, 0);
		local16.method6700();
	}
}
