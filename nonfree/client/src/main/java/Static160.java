import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
	public static int anInt3615;

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
	public static int anInt3616;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	public static void method3094() {
		@Pc(7) Class212 local7 = null;
		try {
			@Pc(11) Class51 local11 = Static212.aClass120_3.method3223();
			while (local11.anInt1229 == 0) {
				Static270.method5481(1L);
			}
			if (local11.anInt1229 == 1) {
				local7 = (Class212) local11.anObject1;
				@Pc(33) byte[] local33 = new byte[(int) local7.method5531()];
				@Pc(48) int local48;
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35 += local48) {
					local48 = local7.method5532(local33, local35, local33.length - local35);
					if (local48 == -1) {
						throw new IOException("EOF");
					}
				}
				Static221.method3805(new Class4_Sub7(local33));
			}
		} catch (@Pc(77) Exception local77) {
		}
		try {
			if (local7 != null) {
				local7.method5533();
			}
		} catch (@Pc(92) Exception local92) {
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIILclient!vm;IIIILclient!jn;I)Lclient!jn;")
	public static Class5 method3095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class92 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class5 arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg7;
		@Pc(12) Class5 local12 = (Class5) Static164.aClass154_59.method4222(local6);
		if (local12 == null) {
			@Pc(22) Class153 local22 = Static169.method3173(Static67.aClass11_31, arg7);
			if (local22 == null) {
				return null;
			}
			local12 = arg3.method4513(local22, 1031, Static109.anInt2406, 64, 768);
			Static164.aClass154_59.method4221(local6, local12);
		}
		local12 = local12.method4018((byte) 2, 1031, true);
		if (arg9 != 0) {
			local12.method3997(arg9);
		}
		if (arg4 != 0) {
			local12.method4003(arg4);
		}
		if (arg6 != 0) {
			local12.method3987(arg6);
		}
		if (arg0 != 0) {
			local12.method4026(0, arg0, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLclient!am;Lclient!am;)V")
	public static void method3096(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static93.aClass11_45 = arg1;
		Static59.aClass11_25 = arg0;
		Static59.aClass11_25.method292(34);
	}
}
