import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!gga;")
	public static Class124 aClass124_83;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public static int anInt7383;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)Z")
	public static boolean method6562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIILclient!uf;)V")
	public static void method6563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class357 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray26 != null) {
			@Pc(18) Class2_Sub45 local18 = new Class2_Sub45();
			local18.aClass357_131 = arg2;
			local18.anObjectArray2 = arg2.anObjectArray26;
			Static518.method8031(local18);
		}
		Static590.anInt10293 = arg2.anInt10432;
		Static188.anInt8300 = arg2.anInt10396;
		Static113.anInt2045 = arg2.anInt10478;
		Static156.anInt3415 = arg0;
		Static537.aBoolean683 = true;
		Static125.anInt2444 = arg1;
		Static397.anInt11031 = arg2.anInt10420;
		Static135.anInt2564 = arg2.anInt10460;
		Static473.method7526(arg2);
	}
}
