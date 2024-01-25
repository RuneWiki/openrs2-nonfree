import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!im", name = "h", descriptor = "I")
	public static int anInt4987;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[I")
	public static final int[] anIntArray253 = new int[3];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLjava/lang/String;II)I")
	public static int method4508(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(43) char local43 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local43 == '-') {
					local24 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local43 >= '0' && local43 <= '9') {
				local84 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local84 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local84 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local84 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local84 = -local84;
			}
			@Pc(111) int local111 = local33 * arg1 + local84;
			if (local33 != local111 / arg1) {
				throw new NumberFormatException();
			}
			local33 = local111;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local33;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	public static void method4509() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static549.aClass314Array1.length; local3++) {
				if (Static549.aClass314Array1[local3].method7994()) {
					Static214.aLongArray11[local3] = Static549.aClass314Array1[local3].method7997();
				} else {
					synchronized (Static549.aClass314Array1[local3]) {
						Static549.aClass314Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static549.aClass314Array1[Static549.aClass314Array1.length - 1].method7992();
				Static229.method4170(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static549.aClass314Array1.length - 1; local3++) {
						if (!Static549.aClass314Array1[local3].method7994()) {
							synchronized (Static549.aClass314Array1[local3]) {
								Static549.aClass314Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static549.aClass314Array1.length - 2; local102++) {
							Static549.aClass314Array1[local102].method7992();
						}
						Static229.method4170(2);
						while (!Static549.aClass314Array1[0].method7994()) {
							synchronized (Static549.aClass314Array1[0]) {
								Static549.aClass314Array1[0].notify();
							}
							try {
								Static650.method9565(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static549.aClass314Array1[0].method7992();
						return;
					}
					try {
						Static650.method9565(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static650.method9565(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!us;ZI)V")
	public static void method4512(@OriginalArg(0) int arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(3) int arg2) {
		Static347.aClass363ArrayArray1[arg2][arg0] = arg1;
	}
}
