import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!ee;")
	public static Class81 aClass81_8;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	public static int anInt6191;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!rh;")
	public static final Class305 aClass305_2 = new Class305();

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!tq;")
	public static final Class342 aClass342_4 = new Class342();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public static void method5233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static506.method7223(arg1)) {
			Static215.method3135(arg0, Static109.aClass321ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z")
	public static boolean method5235() {
		try {
			return Static438.method2192();
		} catch (@Pc(14) IOException local14) {
			Static339.method4970();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static667.aClass179_372 == null ? -1 : Static667.aClass179_372.method4112()) + "," + (Static398.aClass179_257 == null ? -1 : Static398.aClass179_257.method4112()) + "," + (Static34.aClass179_39 == null ? -1 : Static34.aClass179_39.method4112()) + " - " + Static655.anInt10505 + "," + (Static534.anInt8753 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0]) + "," + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0] + Static234.anInt4239) + " - ";
			for (@Pc(80) int local80 = 0; Static655.anInt10505 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static204.aClass6_Sub23_Sub1_1.aByteArray101[local80] + ",";
			}
			Static664.method9007(local19, local78);
			Static483.method7043(false);
			return true;
		}
	}
}
