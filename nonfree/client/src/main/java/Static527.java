import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static527 {

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	public static int anInt10839;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "Lclient!mu;")
	public static Class215 aClass215_250;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "Lclient!in;")
	public static Class157 aClass157_304;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "Lclient!pg;")
	public static Class260 aClass260_31;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_248 = new Class215(108, 5);

	@OriginalMember(owner = "client!su", name = "j", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_249 = new Class215(7, 3);

	@OriginalMember(owner = "client!su", name = "k", descriptor = "[B")
	public static final byte[] aByteArray134 = new byte[520];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)[Lclient!sk;")
	public static Class317[] method9028() {
		return new Class317[] { Static29.aClass317_1, Static494.aClass317_3, Static611.aClass317_5 };
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!in;ILclient!in;)V")
	public static void method9030(@OriginalArg(1) Class157 arg0, @OriginalArg(3) Class157 arg1) {
		Static280.aClass157_136 = arg1;
		Static388.aClass157_196 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
	public static void method9032(@OriginalArg(0) boolean arg0) {
		Static252.method4677(Static423.anInt7984, Static475.anInt10143, arg0, Static81.anInt2497);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIII)V")
	public static void method9036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static476.aByteArrayArrayArray5 = new byte[4][arg1][arg0];
	}
}
