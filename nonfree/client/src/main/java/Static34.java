import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!be", name = "y", descriptor = "I")
	public static int anInt511;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	public static int anInt514;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public static void method557(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class5_Sub1_Sub20 local6 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local6 != null; local6 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
			if (local6.anInt9857 > 1) {
				local6.anInt9857 = 0;
				Static529.aClass168_75.method3853(((Class5_Sub1_Sub13) local6.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65).aLong177, local6);
				local6.aClass388_14.method9021();
			}
		}
		Static651.anInt10662 = 0;
		Static530.anInt8424 = 0;
		Static399.aClass20_33.method374();
		Static99.aClass306_8.method6936();
		Static244.aClass388_5.method9021();
		Static490.aBoolean536 = false;
		if (arg0 <= 48) {
			method559((byte) 54);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	public static void method559(@OriginalArg(0) byte arg0) {
		if (arg0 < -95) {
			Static334.method8474();
			Static455.method6423();
		}
	}
}
