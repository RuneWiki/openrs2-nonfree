import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "[B")
	public static final byte[] aByteArray55 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLclient!dga;)Lclient!lw;")
	public static Class192 method3820(@OriginalArg(1) Class6_Sub14 arg0) {
		@Pc(7) Class192 local7 = new Class192();
		local7.anInt4838 = arg0.method6006();
		local7.aClass6_Sub1_Sub2_1 = Static283.aClass44_4.method690(local7.anInt4838);
		return local7;
	}
}
