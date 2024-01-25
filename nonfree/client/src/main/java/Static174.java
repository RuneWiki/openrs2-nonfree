import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
	public static int anInt4169;

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
	public static int anInt4170;

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
	public static int anInt4171;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BB)V")
	public static void method3392(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class8_Sub8 local12 = new Class8_Sub8(arg0);
		while (true) {
			@Pc(16) int local16 = local12.method8525();
			if (local16 == 0) {
				return;
			}
			if (local16 == 2) {
				Static574.anInt9869 = local12.method8578();
			}
		}
	}
}
