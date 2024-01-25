import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
	public static int anInt2495;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
	public static int anInt2490 = 0;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!fh;)Lclient!mm;")
	public static Class4_Sub4 method1968(@OriginalArg(1) Class4_Sub9 arg0) {
		arg0.method5007();
		@Pc(13) int local13 = arg0.method5007();
		@Pc(17) Class4_Sub4 local17 = Static207.method2906(local13);
		local17.anInt7633 = arg0.method5007();
		@Pc(26) int local26 = arg0.method5007();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method5007();
			local17.method6046(local34, arg0);
		}
		local17.method6038();
		return local17;
	}
}
