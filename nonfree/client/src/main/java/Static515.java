import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static515 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(JJ)J")
	public static long method6651(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
	public static void method6652() {
		if (Static189.aBoolean199) {
			return;
		}
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean638) {
			Static313.aFloat157 = (int) Static313.aFloat157 + 191 & 0xFFFFFF80;
		} else {
			Static216.aFloat246 += (24.0F - Static216.aFloat246) / 2.0F;
		}
		Static122.aBoolean139 = true;
		Static189.aBoolean199 = true;
	}
}
