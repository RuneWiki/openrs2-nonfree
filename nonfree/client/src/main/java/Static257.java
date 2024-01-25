import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
	public static int anInt5340;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
	public static int anInt5344 = 64;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZI)Z")
	public static boolean method4644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static146.aBoolean308) {
			return false;
		}
		@Pc(19) int local19 = arg1 >> 16;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		if (Static348.aClass12ArrayArray1[local19] == null || Static348.aClass12ArrayArray1[local19][local23] == null) {
			return false;
		}
		@Pc(41) Class12 local41 = Static348.aClass12ArrayArray1[local19][local23];
		@Pc(53) Class1_Sub23 local53;
		if (arg0 == -1 && local41.anInt416 == 0) {
			for (local53 = (Class1_Sub23) Static188.aClass16_22.method410(); local53 != null; local53 = (Class1_Sub23) Static188.aClass16_22.method419()) {
				if (local53.anInt3588 == 57 || local53.anInt3588 == 1010 || local53.anInt3588 == 10 || local53.anInt3588 == 58 || local53.anInt3588 == 2) {
					for (@Pc(84) Class12 local84 = Static9.method319(local53.anInt3589); local84 != null; local84 = Static286.method4906(local84)) {
						if (local41.anInt465 == local84.anInt465) {
							return true;
						}
					}
				}
			}
		} else {
			for (local53 = (Class1_Sub23) Static188.aClass16_22.method410(); local53 != null; local53 = (Class1_Sub23) Static188.aClass16_22.method419()) {
				if (arg0 == local53.anInt3587 && local41.anInt465 == local53.anInt3589 && (local53.anInt3588 == 57 || local53.anInt3588 == 1010 || local53.anInt3588 == 10 || local53.anInt3588 == 58 || local53.anInt3588 == 2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I")
	public static int method4646() {
		@Pc(7) Class32 local7 = Static208.aClass32_11;
		@Pc(9) boolean local9 = false;
		if (Static306.anInt6046 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static326.method2152(null, 0, local15, null, 0);
			local9 = true;
		}
		@Pc(34) long local34 = Static162.method3252();
		for (@Pc(36) int local36 = 0; local36 < 10000; local36++) {
			local7.method2196();
		}
		@Pc(63) int local63 = (int) (Static162.method3252() - local34);
		local7.method2191(-16777216, 0, 100, 0, 100);
		if (local9) {
			local7.method2197();
		}
		return local63;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method4647(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static341.method5494(arg1, 0, arg0.length - 1, arg0);
	}
}
