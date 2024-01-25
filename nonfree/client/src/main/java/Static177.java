import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	public static int anInt3654;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!in", name = "g", descriptor = "I")
	public static int anInt3658 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Lclient!se;")
	public static Class24_Sub2 method2947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class24_Sub2 local14 = local7.aClass24_Sub2_1;
			local7.aClass24_Sub2_1 = null;
			return local14;
		}
	}
}
