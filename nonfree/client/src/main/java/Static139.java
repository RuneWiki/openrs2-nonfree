import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public static int anInt2147;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	public static int anInt2153 = 0;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "[I")
	public static final int[] anIntArray186 = new int[32];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method1755() {
		Static440.aClass14_21.method204();
		for (@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) Static57.aClass14_3.method203(); local15 != null; local15 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			if (local15.anInt1057 < 1000) {
				local15.method5953();
				Static440.aClass14_21.method205(local15);
			}
		}
		Static440.aClass14_21.method207(Static57.aClass14_3);
		@Pc(41) int local41 = -1;
		@Pc(50) Class1_Sub22 local50 = (Class1_Sub22) Static378.aClass14_45.method203();
		if (local50 != null) {
			local41 = local50.method4156();
		}
		if (!Static170.aBoolean282) {
			if (local41 == 0 && (Static371.anInt5991 == 1 && Static76.anInt1078 > 2 || Static373.method5948())) {
				local41 = 2;
			}
			if (local41 == 2 && Static76.anInt1078 > 0 && local50 != null) {
				if (Static364.aClass107_13 == null && Static302.anInt5060 == 0) {
					Static460.method5927(local50.method4162(), local50.method4161());
				} else {
					Static264.anInt4588 = 2;
				}
			}
			if (local41 == 0 && Static76.anInt1078 > 0) {
				Static58.method816();
			}
			if (Static364.aClass107_13 != null || Static302.anInt5060 != 0) {
				return;
			}
			Static264.anInt4588 = 0;
			Static150.aClass1_Sub10_6 = null;
			return;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if (local41 == -1) {
			local66 = Static181.aClass224_1.method5613();
			local70 = Static181.aClass224_1.method5615();
			if (Static64.anInt995 - 10 > local66 || Static273.anInt4719 + Static64.anInt995 + 10 < local66 || local70 < Static25.anInt358 - 10 || local70 > Static25.anInt358 + Static361.anInt5833 + 10) {
				Static220.method3164();
			}
		}
		if (local41 != 0) {
			return;
		}
		local66 = Static64.anInt995;
		local70 = Static25.anInt358;
		@Pc(107) int local107 = Static273.anInt4719;
		@Pc(111) int local111 = local50.method4162();
		@Pc(117) int local117 = local50.method4161();
		@Pc(119) int local119 = -1;
		@Pc(139) int local139;
		for (@Pc(121) int local121 = 0; local121 < Static76.anInt1078; local121++) {
			if (Static51.aBoolean102) {
				local139 = (Static76.anInt1078 - local121 - 1) * 16 + local70 + 33;
				if (local66 < local111 && local111 < local66 + local107 && local117 > local139 - 13 && local117 < local139 + 4) {
					local119 = local121;
				}
			} else {
				local139 = local70 + (-local121 + -1 + Static76.anInt1078) * 16 + 31;
				if (local111 > local66 && local111 < local66 + local107 && local139 - 13 < local117 && local117 < local139 + 3) {
					local119 = local121;
				}
			}
		}
		if (local119 != -1) {
			local139 = 0;
			@Pc(226) Class228 local226 = new Class228(Static57.aClass14_3);
			for (@Pc(231) Class1_Sub10 local231 = (Class1_Sub10) local226.method4804(); local231 != null; local231 = (Class1_Sub10) local226.method4808()) {
				if (local119 == local139) {
					Static331.method4349(local231, local117, local111);
				}
				local139++;
			}
		}
		Static220.method3164();
		return;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z")
	public static boolean method1759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static59.method836(arg1, arg0) | (arg0 & 0x800) != 0 || Static275.method3737(arg1, arg0);
	}
}
