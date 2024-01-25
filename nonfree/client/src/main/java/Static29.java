import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
	public static int anInt1007;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "Lclient!la;")
	public static Class196 aClass196_9;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "[Lclient!tga;")
	public static Interface21[] anInterface21Array1;

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "[I")
	public static final int[] anIntArray23 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BB)V")
	public static void method1087(@OriginalArg(1) byte arg0) {
		if (Static3.aByteArrayArrayArray1 == null) {
			Static3.aByteArrayArrayArray1 = new byte[4][Static634.anInt10129][Static638.anInt10172];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static634.anInt10129; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static638.anInt10172; local27++) {
					Static3.aByteArrayArrayArray1[local19][local23][local27] = arg0;
				}
			}
		}
	}
}
