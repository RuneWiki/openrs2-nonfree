import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!ht;)Lclient!fe;")
	public static Class105 method5812(@OriginalArg(1) Class9_Sub2_Sub1 arg0) {
		@Pc(7) Class105 local7;
		if (Static521.aClass105_2 == null) {
			local7 = new Class105();
		} else {
			local7 = Static521.aClass105_2;
			Static521.aClass105_2 = Static521.aClass105_2.aClass105_1;
			Static153.anInt3137--;
			local7.aClass105_1 = null;
		}
		local7.aClass9_Sub2_Sub1_1 = arg0;
		return local7;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Lclient!fi;")
	public static Class3_Sub7_Sub10 method5814(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7_Sub10 local10 = (Class3_Sub7_Sub10) Static219.aClass282_2.method6855((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static22.aClass343_17.method8132(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static280.method4570(local20);
		} catch (@Pc(44) Exception local44) {
			throw new RuntimeException(local44.getMessage() + " S: " + arg0);
		}
		Static219.aClass282_2.method6850(local10, (long) arg0);
		return local10;
	}
}
