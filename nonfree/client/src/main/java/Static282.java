import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
	public static int anInt5836 = -1;

	@OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
	public static int anInt5837 = 0;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILclient!ha;)Lclient!hu;")
	public static Class21 method4761(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(15) Class8_Sub52 local15 = (Class8_Sub52) Static16.aClass253_3.method6594((long) arg0);
		if (local15 != null) {
			@Pc(22) Class8_Sub19_Sub4 local22 = local15.aClass2_Sub1_1.method4230();
			local15.aBoolean757 = true;
			if (local22 != null) {
				return local22.method7899(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)V")
	public static void method4762() {
		if (Static246.anIntArray317 != null && Static308.anIntArray360 != null) {
			return;
		}
		Static246.anIntArray317 = new int[256];
		Static308.anIntArray360 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static246.anIntArray317[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static308.anIntArray360[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "([BII)[B")
	public static byte[] method4763(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static649.method5532(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IZLclient!tp;I)V")
	public static void method4764(@OriginalArg(0) int arg0, @OriginalArg(2) Class331 arg1, @OriginalArg(3) int arg2) {
		if (Static10.aClass331_3 != null || Static211.aBoolean370 || (arg1 == null || Static632.method8494(arg1) == null)) {
			return;
		}
		Static10.aClass331_3 = arg1;
		Static514.aClass331_15 = Static632.method8494(arg1);
		Static599.aBoolean733 = false;
		Static432.anInt8162 = 0;
		Static632.anInt10539 = arg0;
		Static39.anInt1469 = arg2;
	}
}
