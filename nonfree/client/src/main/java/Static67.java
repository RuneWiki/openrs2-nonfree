import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ci", name = "M", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_23 = new Class90(32, 11);

	@OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!ci", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString22 = null;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!od;)I")
	public static int method1483(@OriginalArg(1) Class4_Sub36 arg0) {
		@Pc(7) String local7 = Static576.method8116(arg0);
		@Pc(9) int[] local9 = null;
		if (Static221.method956(arg0.anInt7137)) {
			local9 = Static338.aClass29_1.method977((int) arg0.aLong194).anIntArray384;
		} else if (arg0.anInt7142 != -1) {
			local9 = Static338.aClass29_1.method977(arg0.anInt7142).anIntArray384;
		} else if (Static208.method3402(arg0.anInt7137)) {
			@Pc(91) Class4_Sub29 local91 = (Class4_Sub29) Static144.aClass221_6.method5075((long) arg0.aLong194);
			if (local91 != null) {
				@Pc(96) Class21_Sub1_Sub1_Sub1_Sub1 local96 = local91.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				@Pc(99) Class51 local99 = local96.aClass51_1;
				if (local99.anIntArray61 != null) {
					local99 = local99.method1371(Static523.aClass173_1);
				}
				if (local99 != null) {
					local9 = local99.anIntArray63;
				}
			}
		} else if (Static324.method5022(arg0.anInt7137)) {
			@Pc(54) Class233 local54;
			if (arg0.anInt7137 == 1008) {
				local54 = Static103.aClass298_1.method6822((int) arg0.aLong194);
			} else {
				local54 = Static103.aClass298_1.method6822((int) (arg0.aLong194 >>> 32 & 0x7FFFFFFFL));
			}
			if (local54.anIntArray374 != null) {
				local54 = local54.method5295(Static523.aClass173_1);
			}
			if (local54 != null) {
				local9 = local54.anIntArray376;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static282.method4486(local9);
		}
		@Pc(141) int local141 = Static503.aClass198_12.method4772(local7, Static393.aClass88Array9);
		if (arg0.aBoolean509) {
			local141 += Static575.aClass88_37.E() + 4;
		}
		return local141;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZC)Z")
	public static boolean method1484(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(31) char[] local31 = Static101.aCharArray3;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(39) char local39 = local31[local33];
				if (arg0 == local39) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)I")
	public static int method1486() {
		return Static521.aClass258_1.method5973();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1487(@OriginalArg(0) Class7 arg0) {
		if (Static393.aClass22_52.method880() == 0) {
			return;
		}
		@Pc(23) Class4_Sub19 local23;
		if (Static453.anInt8614 == 0) {
			for (local23 = (Class4_Sub19) Static393.aClass22_52.method895(); local23 != null; local23 = (Class4_Sub19) Static393.aClass22_52.method889()) {
				Static338.aClass29_1.method982(local23.anInt3218, local23.anInt3219, local23.anInt3222, false, local23.anInt3221, false, local23.anInt3220, arg0, local23.aBoolean238 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1 : null, Static464.aClass45_9, arg0);
				local23.method8193();
			}
			Static533.method7519();
			return;
		}
		if (Static154.aClass7_9 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Static154.aClass7_9 = Static447.method7798(0, Static18.aClass348_10, local72, 0, Static361.anInterface7_8);
			Static411.aClass45_7 = Static154.aClass7_9.method7837(Static375.method5821(Static478.aClass348_114, Static9.anInt757), Static598.method2456(Static159.aClass348_38, Static9.anInt757));
		}
		for (local23 = (Class4_Sub19) Static393.aClass22_52.method895(); local23 != null; local23 = (Class4_Sub19) Static393.aClass22_52.method889()) {
			Static338.aClass29_1.method982(local23.anInt3218, local23.anInt3219, local23.anInt3222, false, local23.anInt3221, false, local23.anInt3220, arg0, local23.aBoolean238 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1 : null, Static411.aClass45_7, Static154.aClass7_9);
			local23.method8193();
		}
	}
}
