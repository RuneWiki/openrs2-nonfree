import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	public static int anInt9294;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_291 = new Class123(89, 10);

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	public static int method7303() {
		@Pc(7) Class31 local7 = Static319.aClass31_11;
		@Pc(9) boolean local9 = false;
		if (Static37.anInt1122 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static448.method8065(0, local18, 0, null, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static96.method2000();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method8081();
		}
		@Pc(72) int local72 = (int) (Static96.method2000() - local35);
		local7.method8094(0, 0, 100, 100, -16777216);
		if (local9) {
			local7.method8053();
		}
		return local72;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([BZI)V")
	public static void method7304(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static366.aClass3_Sub26_5 == null) {
			Static366.aClass3_Sub26_5 = new Class3_Sub26(20000);
		}
		Static366.aClass3_Sub26_5.method6824(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static575.method7825(Static366.aClass3_Sub26_5.aByteArray213);
		Static497.aClass48_Sub1Array2 = new Class48_Sub1[Static291.anInt5439];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static229.anInt4664; local35 <= Static467.anInt8130; local35++) {
			@Pc(41) Class48_Sub1 local41 = Static197.method3443(local35);
			if (local41 != null) {
				Static497.aClass48_Sub1Array2[local33++] = local41;
			}
		}
		Static25.aBoolean17 = false;
		Static358.aLong171 = Static96.method2000();
		Static366.aClass3_Sub26_5 = null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Z")
	public static boolean method7309(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ri;I)V")
	public static void method7310(@OriginalArg(0) Class284 arg0) {
		Static360.aClass284_170 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public static void method7314() {
		if (Static107.method2198(Static409.anInt1461) || Static438.method3441(Static409.anInt1461)) {
			Static527.method8127(5000, Static418.anInt7466 >> 12, Static407.anInt7345 >> 12);
		} else {
			@Pc(20) int local20 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] >> 3;
			@Pc(27) int local27 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0] >> 3;
			if (local20 >= 0 && local20 < Static345.anInt6228 >> 3 && local27 >= 0 && local27 < Static535.anInt9341 >> 3) {
				Static527.method8127(5000, local27, local20);
			} else {
				Static527.method8127(0, Static535.anInt9341 >> 4, Static345.anInt6228 >> 4);
			}
		}
		Static579.method7896();
		Static406.method5726();
		Static118.method2319();
		Static31.method474();
	}
}
