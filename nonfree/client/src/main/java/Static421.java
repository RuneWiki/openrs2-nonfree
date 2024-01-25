import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!qba", name = "W", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLclient!ek;)Lclient!om;")
	public static Class251 method6314(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(7) Class251 local7 = new Class251();
		local7.anInt7473 = arg0.method7054();
		local7.aClass4_Sub6_Sub3_1 = Static115.aClass213_2.method5000(local7.anInt7473);
		return local7;
	}
}
