import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "[Lclient!rc;")
	public static final Class248[] aClass248Array1 = new Class248[8];

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
	public static int anInt5068 = -1;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	public static int anInt5069 = -1;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean377 = true;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method4699(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static53.anInt1356 > 0) {
			local21 = Static83.aByteArrayArray28[--Static53.anInt1356];
			Static83.aByteArrayArray28[Static53.anInt1356] = null;
			return local21;
		} else if (arg0 == 5000 && Static105.anInt2227 > 0) {
			local21 = Static502.aByteArrayArray27[--Static105.anInt2227];
			Static502.aByteArrayArray27[Static105.anInt2227] = null;
			return local21;
		} else if (arg0 == 30000 && Static83.anInt8926 > 0) {
			local21 = Static541.aByteArrayArray30[--Static83.anInt8926];
			Static541.aByteArrayArray30[Static83.anInt8926] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}
