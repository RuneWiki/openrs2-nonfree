import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
	public static int anInt8220;

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_83 = new Class230(64, -1);

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
	public static int anInt8217 = -1;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
	public static void method6761() {
		Static386.aBoolean632 = true;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I[S)[S")
	public static short[] method6762(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static602.method4668(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public static void method6764() {
		Static168.method3104(11);
		Static467.method7181();
		System.gc();
	}
}
