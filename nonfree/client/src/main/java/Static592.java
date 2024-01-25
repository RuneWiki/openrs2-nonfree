import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!sja", name = "e", descriptor = "Lclient!hf;")
	public static Class155 aClass155_2;

	@OriginalMember(owner = "client!sja", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!sja", name = "i", descriptor = "F")
	public static float aFloat138;

	@OriginalMember(owner = "client!sja", name = "k", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_161 = new Class397(101, -1);

	@OriginalMember(owner = "client!sja", name = "f", descriptor = "I")
	public static final int anInt9022 = 1401;

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "([ILclient!ik;ILclient!ik;)V")
	public static void method7645(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(3) Class182 arg2) {
		Static725.aClass182_131 = arg1;
		if (arg0 != null) {
			Static690.anIntArray771 = arg0;
		}
		Static175.aClass182_46 = arg2;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IBI)V")
	public static void method7648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static599.anInt9088 != 0) {
			if (arg0 < 0) {
				for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
					Static489.anIntArray780[local9] = arg1;
				}
			} else {
				Static489.anIntArray780[arg0] = arg1;
			}
		}
		Static708.aClass3_Sub33_Sub3_4.method7912(arg1, arg0);
	}
}
