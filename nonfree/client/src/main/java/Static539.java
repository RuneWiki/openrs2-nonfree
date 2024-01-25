import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIB)V")
	public static void method7370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 > Static451.anInt7775 || Static514.anInt8722 > arg4) {
			return;
		}
		@Pc(16) boolean local16;
		if (Static270.anInt4759 > arg1) {
			local16 = false;
			arg1 = Static270.anInt4759;
		} else if (Static162.anInt2935 < arg1) {
			local16 = false;
			arg1 = Static162.anInt2935;
		} else {
			local16 = true;
		}
		@Pc(42) boolean local42;
		if (arg2 < Static270.anInt4759) {
			arg2 = Static270.anInt4759;
			local42 = false;
		} else if (Static162.anInt2935 < arg2) {
			local42 = false;
			arg2 = Static162.anInt2935;
		} else {
			local42 = true;
		}
		if (Static514.anInt8722 > arg0) {
			arg0 = Static514.anInt8722;
		} else {
			Static433.method6039(arg3, arg2, Static171.anIntArrayArray79[arg0++], arg1);
		}
		if (Static451.anInt7775 >= arg4) {
			Static433.method6039(arg3, arg2, Static171.anIntArrayArray79[arg4--], arg1);
		} else {
			arg4 = Static451.anInt7775;
		}
		@Pc(93) int local93;
		if (local16 && local42) {
			for (local93 = arg0; local93 <= arg4; local93++) {
				@Pc(99) int[] local99 = Static171.anIntArrayArray79[local93];
				local99[arg1] = local99[arg2] = arg3;
			}
		} else if (local16) {
			for (local93 = arg0; local93 <= arg4; local93++) {
				Static171.anIntArrayArray79[local93][arg1] = arg3;
			}
		} else if (local42) {
			for (local93 = arg0; local93 <= arg4; local93++) {
				Static171.anIntArrayArray79[local93][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
	public static void method7373() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static218.aClass144Array1.length; local3++) {
				if (Static218.aClass144Array1[local3].method3250()) {
					Static569.aLongArray26[local3] = Static218.aClass144Array1[local3].method3251();
				} else {
					synchronized (Static218.aClass144Array1[local3]) {
						Static218.aClass144Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static218.aClass144Array1[Static218.aClass144Array1.length - 1].method3249();
				Static262.method3784(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static218.aClass144Array1.length - 1; local3++) {
						if (!Static218.aClass144Array1[local3].method3250()) {
							synchronized (Static218.aClass144Array1[local3]) {
								Static218.aClass144Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static218.aClass144Array1.length - 2; local102++) {
							Static218.aClass144Array1[local102].method3249();
						}
						Static262.method3784(2);
						while (!Static218.aClass144Array1[0].method3250()) {
							synchronized (Static218.aClass144Array1[0]) {
								Static218.aClass144Array1[0].notify();
							}
							try {
								Static391.method5400(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static218.aClass144Array1[0].method3249();
						return;
					}
					try {
						Static391.method5400(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static391.method5400(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
