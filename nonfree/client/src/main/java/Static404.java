import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_133 = new Class133(113, 0);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z")
	public static boolean method6137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static365.method5730(arg0, arg1) || Static318.method4379(arg0, arg1) || Static382.method5920(arg0, arg1);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)Z")
	public static boolean method6139() {
		try {
			return Static180.method3436();
		} catch (@Pc(14) IOException local14) {
			Static492.method7175();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static522.aClass133_166 == null ? -1 : Static522.aClass133_166.method3770()) + "," + (Static358.aClass133_117 == null ? -1 : Static358.aClass133_117.method3770()) + "," + (Static159.aClass133_67 == null ? -1 : Static159.aClass133_67.method3770()) + " - " + Static35.anInt921 + "," + (Static223.anInt4827 + Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0]) + "," + (Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] + Static150.anInt3027) + " - ";
			for (@Pc(79) int local79 = 0; Static35.anInt921 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static90.aClass3_Sub27_Sub1_1.aByteArray114[local79] + ",";
			}
			Static2.method220(local19, local77);
			Static180.method3441(false);
			return true;
		}
	}
}
