import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!le", name = "z", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method5531() {
		@Pc(7) Class320 local7 = null;
		try {
			@Pc(13) Class240 local13 = Static268.aClass370_3.method9068("");
			while (local13.anInt7566 == 0) {
				Static190.method3914(1L);
			}
			if (local13.anInt7566 == 1) {
				local7 = (Class320) local13.anObject13;
				@Pc(35) Class2_Sub11 local35 = Static74.aClass2_Sub13_5.method2605();
				local7.method7906(0, local35.anInt10066, local35.aByteArray128);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method7905();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
	public static int method5532() {
		if ((double) Static303.aFloat6 == 3.0D) {
			return 37;
		} else if ((double) Static303.aFloat6 == 4.0D) {
			return 50;
		} else if ((double) Static303.aFloat6 == 6.0D) {
			return 75;
		} else if ((double) Static303.aFloat6 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIB)Z")
	public static boolean method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Interface21 local14 = (Interface21) Static563.method8458(arg0, arg1, arg2);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static260.method7063(local14) & true;
		}
		local14 = (Interface21) Static440.method6961(arg0, arg1, arg2, se.class);
		if (local14 != null) {
			local16 &= Static260.method7063(local14);
		}
		local14 = (Interface21) Static336.method5820(arg0, arg1, arg2);
		if (local14 != null) {
			local16 &= Static260.method7063(local14);
		}
		return local16;
	}
}
