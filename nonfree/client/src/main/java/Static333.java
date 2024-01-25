import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array13;

	@OriginalMember(owner = "client!qu", name = "Fb", descriptor = "I")
	public static int anInt5769;

	@OriginalMember(owner = "client!qu", name = "sb", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_128 = new Class265(9, -2);

	@OriginalMember(owner = "client!qu", name = "Db", descriptor = "Z")
	public static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!qu", name = "Eb", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!qu", name = "Gb", descriptor = "I")
	public static int anInt5770 = 0;

	@OriginalMember(owner = "client!qu", name = "Hb", descriptor = "[B")
	public static final byte[] aByteArray110 = new byte[16384];

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
	public static void method4624() {
		if (Static10.anInt258 == 0) {
			return;
		}
		try {
			if (++Static449.anInt7307 > 2000) {
				if (Static34.aClass34_2 != null) {
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
				}
				if (Static103.anInt2416 >= 1) {
					Static10.anInt258 = 0;
					Static3.anInt113 = -5;
					return;
				}
				Static103.anInt2416++;
				Static449.anInt7307 = 0;
				if (Static45.anInt816 == Static395.anInt6580) {
					Static45.anInt816 = Static432.anInt7151;
				} else {
					Static45.anInt816 = Static395.anInt6580;
				}
				Static10.anInt258 = 1;
			}
			if (Static10.anInt258 == 1) {
				Static145.aClass138_5 = Static43.aClass59_5.method1353(Static45.anInt816, Static266.aString47);
				Static10.anInt258 = 2;
			}
			@Pc(117) int local117;
			if (Static10.anInt258 == 2) {
				if (Static145.aClass138_5.anInt3723 == 2) {
					throw new IOException();
				}
				if (Static145.aClass138_5.anInt3723 != 1) {
					return;
				}
				Static34.aClass34_2 = new Class34((Socket) Static145.aClass138_5.anObject7, Static43.aClass59_5);
				Static145.aClass138_5 = null;
				Static34.aClass34_2.method606(Static424.aClass2_Sub23_Sub2_1.anInt6952, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
				Static148.method2441();
				local117 = Static34.aClass34_2.method615();
				Static148.method2441();
				if (local117 != 21) {
					Static10.anInt258 = 0;
					Static3.anInt113 = local117;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
					return;
				}
				Static10.anInt258 = 3;
			}
			if (Static10.anInt258 == 3) {
				if (Static34.aClass34_2.method613() < 1) {
					return;
				}
				Static92.aStringArray18 = new String[Static34.aClass34_2.method615()];
				Static10.anInt258 = 4;
			}
			if (Static10.anInt258 == 4 && Static34.aClass34_2.method613() >= Static92.aStringArray18.length * 8) {
				Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
				Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, Static92.aStringArray18.length * 8);
				for (local117 = 0; local117 < Static92.aStringArray18.length; local117++) {
					Static92.aStringArray18[local117] = Static302.method4326(Static438.aClass2_Sub23_Sub2_2.method5453());
				}
				Static3.anInt113 = 21;
				Static10.anInt258 = 0;
				Static34.aClass34_2.method610();
				Static34.aClass34_2 = null;
			}
		} catch (@Pc(213) IOException local213) {
			if (Static34.aClass34_2 != null) {
				Static34.aClass34_2.method610();
				Static34.aClass34_2 = null;
			}
			if (Static103.anInt2416 >= 1) {
				Static3.anInt113 = -4;
				Static10.anInt258 = 0;
			} else {
				Static10.anInt258 = 1;
				Static449.anInt7307 = 0;
				Static103.anInt2416++;
				if (Static395.anInt6580 == Static45.anInt816) {
					Static45.anInt816 = Static432.anInt7151;
				} else {
					Static45.anInt816 = Static395.anInt6580;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(III)I")
	public static int method4644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method4655(@OriginalArg(1) Class49 arg0) {
		if (Static123.aBoolean212) {
			Static291.method4185(arg0);
		} else {
			Static351.method5159(arg0);
		}
	}
}
