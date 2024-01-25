import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vv", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_105 = new Class146(20, 8);

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "Lclient!um;")
	public static final Class248 aClass248_8 = new Class248();

	@OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
	public static final int anInt7237 = 1403;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!qn;ZILjava/lang/String;)Lclient!al;")
	public static Class11 method5811(@OriginalArg(0) Class211 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(15) int local15 = arg0.method4384(arg2);
		if (local15 == -1) {
			return new Class11(0);
		}
		@Pc(28) int[] local28 = arg0.method4352(local15);
		@Pc(34) Class11 local34 = new Class11(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt186) {
				@Pc(52) Class4_Sub9 local52 = new Class4_Sub9(arg0.method4377(local15, local28[local38++]));
				@Pc(56) int local56 = local52.method4997();
				@Pc(60) int local60 = local52.method5028();
				@Pc(64) int local64 = local52.method5007();
				if (!arg1 && local64 == 1) {
					local34.anInt186--;
				} else {
					local34.anIntArray7[local36] = local56;
					local34.anIntArray9[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}
}
