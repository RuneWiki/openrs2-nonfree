import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "[B")
	public static final byte[] aByteArray25 = new byte[16384];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BILclient!hs;)Lclient!uf;")
	public static Class242 method1826(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		@Pc(17) Class242 local17;
		if (Static183.aClass242_3 == null) {
			local17 = new Class242();
		} else {
			local17 = Static183.aClass242_3;
			Static183.aClass242_3 = Static183.aClass242_3.aClass242_4;
			local17.aClass242_4 = null;
			Static417.anInt6988--;
		}
		local17.aClass3_Sub3_2 = arg1;
		local17.anInt6605 = arg0;
		return local17;
	}
}
