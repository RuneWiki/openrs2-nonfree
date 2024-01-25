import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "[B")
	public static byte[] aByteArray69;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
	public static int anInt5964 = 0;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_60 = new Class230(53, 8);

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_73 = new Class276(36, 1);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)V")
	public static void method4918(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub4_Sub6 local12 = Static367.method6025(2, arg0);
		local12.method1896();
	}
}
