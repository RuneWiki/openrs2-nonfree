import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString49 = null;

	@OriginalMember(owner = "client!iha", name = "t", descriptor = "[S")
	public static short[] aShortArray81 = new short[256];

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)Lclient!cw;")
	public static Class4_Sub5 method3795() {
		@Pc(15) Class4_Sub5 local15 = (Class4_Sub5) Static295.aClass320_3.method7604();
		if (local15 == null) {
			return new Class4_Sub5();
		} else {
			Static489.anInt7866--;
			return local15;
		}
	}
}
