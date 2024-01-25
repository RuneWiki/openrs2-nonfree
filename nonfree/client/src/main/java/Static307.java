import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_108 = new Class55("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	public static void method4065(@OriginalArg(0) boolean arg0) {
		for (@Pc(14) Class7_Sub13 local14 = (Class7_Sub13) Static423.aClass85_47.method2010(); local14 != null; local14 = (Class7_Sub13) Static423.aClass85_47.method2000()) {
			if (local14.aClass7_Sub8_Sub4_3 != null) {
				Static452.aClass7_Sub8_Sub1_2.method2428(local14.aClass7_Sub8_Sub4_3);
				local14.aClass7_Sub8_Sub4_3 = null;
			}
			if (local14.aClass7_Sub8_Sub4_2 != null) {
				Static452.aClass7_Sub8_Sub1_2.method2428(local14.aClass7_Sub8_Sub4_2);
				local14.aClass7_Sub8_Sub4_2 = null;
			}
			local14.method5802();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class7_Sub13 local53 = (Class7_Sub13) Static26.aClass85_4.method2010(); local53 != null; local53 = (Class7_Sub13) Static26.aClass85_4.method2000()) {
			if (local53.aClass7_Sub8_Sub4_3 != null) {
				Static452.aClass7_Sub8_Sub1_2.method2428(local53.aClass7_Sub8_Sub4_3);
				local53.aClass7_Sub8_Sub4_3 = null;
			}
			local53.method5802();
		}
		for (@Pc(82) Class7_Sub13 local82 = (Class7_Sub13) Static338.aClass164_31.method3514(); local82 != null; local82 = (Class7_Sub13) Static338.aClass164_31.method3519()) {
			if (local82.aClass7_Sub8_Sub4_3 != null) {
				Static452.aClass7_Sub8_Sub1_2.method2428(local82.aClass7_Sub8_Sub4_3);
				local82.aClass7_Sub8_Sub4_3 = null;
			}
			local82.method5802();
		}
	}
}
