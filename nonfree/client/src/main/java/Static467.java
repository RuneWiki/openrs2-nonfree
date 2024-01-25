import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "[B")
	public static byte[] aByteArray74;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_78 = new Class269(53, 2);

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Lclient!ap;")
	public static final Class21 aClass21_3 = new Class21("WIP", 2);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[SI)[S")
	public static short[] method6736(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static649.method4859(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
