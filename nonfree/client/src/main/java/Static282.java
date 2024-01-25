import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[128][128];

	@OriginalMember(owner = "client!nv", name = "M", descriptor = "Lclient!os;")
	public static final Class182 aClass182_175 = new Class182("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLclient!nn;)V")
	public static void method4002(@OriginalArg(1) Class10_Sub8 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static48.aClass227_1 != null) {
			@Pc(20) int local20;
			try {
				Static48.aClass227_1.method4997(0L);
				Static48.aClass227_1.method4999(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method2457(24, local8);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
	public static boolean method4003() {
		@Pc(7) Class10 local7 = Static70.aClass163_13.aClass10_149.aClass10_264;
		if (local7 == null || local7 == Static70.aClass163_13.aClass10_149) {
			return false;
		}
		@Pc(18) Class10_Sub45 local18 = (Class10_Sub45) local7;
		if (local18.anInt7505 >= 2000) {
			local18.anInt7505 -= 2000;
		}
		return local18.anInt7505 == 1001;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIC)I")
	public static int method4004(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
