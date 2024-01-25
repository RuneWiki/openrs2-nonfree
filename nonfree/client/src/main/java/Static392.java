import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
	public static int anInt3635;

	@OriginalMember(owner = "client!pba", name = "q", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_63 = new Class90(65, 1);

	@OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
	public static int anInt3639 = -1;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZIZI)V")
	public static void method2874(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static384.aClass348_92.anInt10233 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(27) Class275 local27 = Static245.aClass107_2.method2503(arg5);
			if (local27 == null || arg4 != local27.method6374()) {
				return;
			}
			if (local27.method6374()) {
				local18 = local27.aString170;
			} else {
				local16 = local27.anInt8186;
			}
		}
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < Static338.aClass29_1.anInt1147; local50++) {
			@Pc(57) Class236 local57 = Static338.aClass29_1.method977(local50);
			if ((!arg3 || local57.aBoolean470) && local57.anInt6776 == -1 && local57.anInt6783 == -1 && local57.anInt6808 == 0 && local57.aString139.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg4) {
						if (!arg1.equals(local57.method5337(local18, arg5))) {
							continue;
						}
					} else if (arg0 != local57.method5330(arg5, local16)) {
						continue;
					}
				}
				if (local48 >= 250) {
					Static393.anInt7666 = -1;
					Static519.aShortArray130 = null;
					return;
				}
				if (local14.length <= local48) {
					@Pc(137) short[] local137 = new short[local14.length * 2];
					for (@Pc(139) int local139 = 0; local139 < local48; local139++) {
						local137[local139] = local14[local139];
					}
					local14 = local137;
				}
				local14[local48++] = (short) local50;
			}
		}
		Static519.aShortArray130 = local14;
		Static393.anInt7666 = local48;
		Static191.anInt3979 = 0;
		@Pc(177) String[] local177 = new String[Static393.anInt7666];
		for (@Pc(179) int local179 = 0; local179 < Static393.anInt7666; local179++) {
			local177[local179] = Static338.aClass29_1.method977(local14[local179]).aString139;
		}
		Static292.method4721(Static519.aShortArray130, local177);
		Static384.aClass348_92.method7980();
		Static384.aClass348_92.anInt10233 = 2;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "()V")
	public static void method2876() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static574.aClass180Array1.length; local3++) {
				if (Static574.aClass180Array1[local3].method4447()) {
					Static376.aLongArray15[local3] = Static574.aClass180Array1[local3].method4449();
				} else {
					synchronized (Static574.aClass180Array1[local3]) {
						Static574.aClass180Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static574.aClass180Array1[Static574.aClass180Array1.length - 1].method4448();
				Static233.method3766(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static574.aClass180Array1.length - 1; local3++) {
						if (!Static574.aClass180Array1[local3].method4447()) {
							synchronized (Static574.aClass180Array1[local3]) {
								Static574.aClass180Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static574.aClass180Array1.length - 2; local102++) {
							Static574.aClass180Array1[local102].method4448();
						}
						Static233.method3766(2);
						while (!Static574.aClass180Array1[0].method4447()) {
							synchronized (Static574.aClass180Array1[0]) {
								Static574.aClass180Array1[0].notify();
							}
							try {
								Static214.method3478(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static574.aClass180Array1[0].method4448();
						return;
					}
					try {
						Static214.method3478(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static214.method3478(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!n;[[BI)V")
	public static void method2879(@OriginalArg(0) Class123_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static33.aByteArrayArray1.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) byte[] local21 = arg1[local15];
			if (local21 != null) {
				@Pc(33) int local33 = (Static322.anIntArray351[local15] >> 8) * 64 - Static242.anInt10133;
				@Pc(44) int local44 = (Static322.anIntArray351[local15] & 0xFF) * 64 - Static157.anInt3323;
				Static487.method7088();
				arg0.method5166(Static39.aClass7_2, local33, Static526.aClass232Array1, local21, local44);
			}
		}
	}
}
