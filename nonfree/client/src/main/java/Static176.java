import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "[I")
	public static final int[] anIntArray231 = new int[3];

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
	public static int anInt4174 = 0;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLclient!dia;)Lclient!dia;")
	public static Class8_Sub16_Sub1 method3414(@OriginalArg(1) Class8_Sub16_Sub1 arg0) {
		@Pc(19) Class8_Sub16_Sub1 local19 = arg0 == null ? new Class8_Sub16_Sub1() : new Class8_Sub16_Sub1(arg0);
		local19.method2286();
		return local19;
	}
}
