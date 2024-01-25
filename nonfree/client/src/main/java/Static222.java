import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_75 = new Class156(138, 10);

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "[Lclient!cka;")
	public static final Class62[] aClass62Array1 = new Class62[37];

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public static void method3529() {
		if (Static78.anInt1382 == 0) {
			return;
		}
		try {
			if (++Static659.anInt10733 > 2000) {
				Static4.aClass389_16.method9073();
				if (Static405.anInt10910 >= 2) {
					Static447.anInt7320 = -5;
					Static78.anInt1382 = 0;
					return;
				}
				Static291.aClass258_4.method5843();
				Static659.anInt10733 = 0;
				Static405.anInt10910++;
				Static78.anInt1382 = 1;
			}
			if (Static78.anInt1382 == 1) {
				Static4.aClass389_16.aClass361_9 = Static291.aClass258_4.method5846(Static681.aClass349_6);
				Static78.anInt1382 = 2;
			}
			if (Static78.anInt1382 == 2) {
				if (Static4.aClass389_16.aClass361_9.anInt9720 == 2) {
					throw new IOException();
				}
				if (Static4.aClass389_16.aClass361_9.anInt9720 != 1) {
					return;
				}
				Static4.aClass389_16.aClass50_2 = Static363.method5291((Socket) Static4.aClass389_16.aClass361_9.anObject20);
				Static4.aClass389_16.aClass361_9 = null;
				Static4.aClass389_16.method9078(86);
				Static78.anInt1382 = 4;
			}
			if (Static78.anInt1382 == 4) {
				if (!Static4.aClass389_16.aClass50_2.method6169(1)) {
					return;
				}
				Static4.aClass389_16.aClass50_2.method6170(Static4.aClass389_16.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
				@Pc(135) int local135 = Static4.aClass389_16.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF;
				Static78.anInt1382 = 0;
				Static447.anInt7320 = local135;
				Static4.aClass389_16.method9073();
				return;
			}
		} catch (@Pc(144) IOException local144) {
			Static4.aClass389_16.method9073();
			if (Static405.anInt10910 >= 2) {
				Static447.anInt7320 = -4;
				Static78.anInt1382 = 0;
			} else {
				Static291.aClass258_4.method5843();
				Static405.anInt10910++;
				Static78.anInt1382 = 1;
				Static659.anInt10733 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
	public static void method3530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg1, 13);
		local9.method7441();
		local9.anInt8635 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
	public static void method3531() {
		if (Static134.aBoolean151) {
			return;
		}
		Static581.method8013(Static451.aClass128ArrayArrayArray2);
		if (Static681.aClass128ArrayArrayArray3 != null) {
			Static581.method8013(Static681.aClass128ArrayArrayArray3);
		}
		Static134.aBoolean151 = true;
	}
}
