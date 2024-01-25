import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
	public static final boolean aBoolean300 = false;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	public static int anInt4131 = 64;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3644(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static287.method4731(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static158.anInt3256; local30++) {
			@Pc(36) String local36 = Static45.aStringArray37[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static287.method4731(local36);
			if (local36 != null && local36.equals(local25)) {
				Static158.anInt3256--;
				for (@Pc(60) int local60 = local30; local60 < Static158.anInt3256; local60++) {
					Static45.aStringArray37[local60] = Static45.aStringArray37[local60 + 1];
					Static190.aStringArray19[local60] = Static190.aStringArray19[local60 + 1];
					Static134.aStringArray14[local60] = Static134.aStringArray14[local60 + 1];
					Static68.aStringArray9[local60] = Static68.aStringArray9[local60 + 1];
					Static302.aBooleanArray24[local60] = Static302.aBooleanArray24[local60 + 1];
				}
				Static342.anInt6304 = Static245.anInt4796;
				Static77.method1332(Static118.aClass183_81);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(arg0));
				Static76.aClass2_Sub24_Sub2_7.method5772(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public static void method3646() {
		if (Static35.anInt619 == 0) {
			return;
		}
		try {
			if (++Static178.anInt3760 > 2000) {
				if (Static386.aClass226_4 != null) {
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
				}
				if (Static179.anInt3762 >= 1) {
					Static70.anInt1555 = -5;
					Static35.anInt619 = 0;
					return;
				}
				Static179.anInt3762++;
				if (Static114.anInt2525 == Static384.anInt6975) {
					Static384.anInt6975 = Static167.anInt3451;
				} else {
					Static384.anInt6975 = Static114.anInt2525;
				}
				Static178.anInt3760 = 0;
				Static35.anInt619 = 1;
			}
			if (Static35.anInt619 == 1) {
				Static228.aClass86_7 = Static154.aClass123_2.method3269(Static384.anInt6975, Static283.aString49);
				Static35.anInt619 = 2;
			}
			if (Static35.anInt619 == 2) {
				if (Static228.aClass86_7.anInt2590 == 2) {
					throw new IOException();
				}
				if (Static228.aClass86_7.anInt2590 != 1) {
					return;
				}
				Static386.aClass226_4 = new Class226((Socket) Static228.aClass86_7.anObject2, Static154.aClass123_2);
				Static228.aClass86_7 = null;
				Static386.aClass226_4.method5549(Static76.aClass2_Sub24_Sub2_7.anInt6669, Static76.aClass2_Sub24_Sub2_7.aByteArray100);
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				@Pc(113) int local113 = Static386.aClass226_4.method5547();
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				if (local113 != 21) {
					Static35.anInt619 = 0;
					Static70.anInt1555 = local113;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
					return;
				}
				Static35.anInt619 = 3;
			}
			if (Static35.anInt619 == 3) {
				if (Static386.aClass226_4.method5550() < 1) {
					return;
				}
				Static204.aStringArray21 = new String[Static386.aClass226_4.method5547()];
				Static35.anInt619 = 4;
			}
			if (Static35.anInt619 == 4 && Static386.aClass226_4.method5550() >= Static204.aStringArray21.length * 8) {
				Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
				Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, Static204.aStringArray21.length * 8);
				for (@Pc(197) int local197 = 0; local197 < Static204.aStringArray21.length; local197++) {
					Static204.aStringArray21[local197] = Static7.method71(Static321.aClass2_Sub24_Sub2_34.method5740());
				}
				Static70.anInt1555 = 21;
				Static35.anInt619 = 0;
				Static386.aClass226_4.method5543();
				Static386.aClass226_4 = null;
			}
		} catch (@Pc(223) IOException local223) {
			if (Static386.aClass226_4 != null) {
				Static386.aClass226_4.method5543();
				Static386.aClass226_4 = null;
			}
			if (Static179.anInt3762 >= 1) {
				Static35.anInt619 = 0;
				Static70.anInt1555 = -4;
			} else {
				if (Static114.anInt2525 == Static384.anInt6975) {
					Static384.anInt6975 = Static167.anInt3451;
				} else {
					Static384.anInt6975 = Static114.anInt2525;
				}
				Static35.anInt619 = 1;
				Static178.anInt3760 = 0;
				Static179.anInt3762++;
			}
		}
	}
}
