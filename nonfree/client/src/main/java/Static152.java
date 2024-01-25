import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!gca", name = "ic", descriptor = "I")
	public static int anInt3124 = -1;

	@OriginalMember(owner = "client!gca", name = "zc", descriptor = "Lclient!ks;")
	public static final Class168 aClass168_1 = new Class168(128);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)Lclient!ui;")
	public static Class294 method2629(@OriginalArg(0) int arg0) {
		@Pc(10) Class294 local10 = (Class294) Static451.aClass125_52.method3512((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static366.aClass161_83.method4243(arg0, 0);
		local10 = new Class294();
		if (local25 != null) {
			local10.method7177(arg0, new Class3_Sub27(local25));
		}
		Static451.aClass125_52.method3519((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(IIII)V")
	public static void method2631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static351.method5389(local35, true, false);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IC)Z")
	public static boolean method2632(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static81.aCharArray4;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(37) char local37 = local29[local31];
				if (local37 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
