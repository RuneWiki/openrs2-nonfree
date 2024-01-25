import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "[I")
	public static final int[] anIntArray88 = new int[3];

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z")
	public static boolean method1941() {
		return Static570.anInt9813 == 0 ? Static608.aClass8_Sub16_Sub1_4.method2290() : true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([BZI)V")
	public static void method1944(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static72.aClass8_Sub8_1 == null) {
			Static72.aClass8_Sub8_1 = new Class8_Sub8(20000);
		}
		Static72.aClass8_Sub8_1.method8532(arg0.length, 0, arg0);
		if (!arg1) {
			return;
		}
		Static330.method3427(Static72.aClass8_Sub8_1.aByteArray107);
		Static313.aClass98_Sub1Array1 = new Class98_Sub1[Static493.anInt8729];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static46.anInt1577; local38 <= Static599.anInt10217; local38++) {
			@Pc(44) Class98_Sub1 local44 = Static309.method5083(local38);
			if (local44 != null) {
				Static313.aClass98_Sub1Array1[local36++] = local44;
			}
		}
		Static161.aBoolean290 = false;
		Static10.aLong5 = Static342.method5463();
		Static72.aClass8_Sub8_1 = null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ig;I)V")
	public static void method1945(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static289.aClass235_4 != null) {
			@Pc(24) int local24;
			try {
				Static289.aClass235_4.method6166(0L);
				Static289.aClass235_4.method6169(local8);
				for (local24 = 0; local24 < 24 && local8[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local24 = 0; local24 < 24; local24++) {
					local8[local24] = -1;
				}
			}
		}
		arg0.method8532(24, 0, local8);
	}
}
