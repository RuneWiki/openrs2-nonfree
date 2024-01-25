import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
	public static int anInt4171;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
	public static final int anInt4168 = 0;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)I")
	public static int method3354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}
}
