import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt8201;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_165 = new Class239(53, -1);

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "[I")
	public static final int[] anIntArray627 = new int[4];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIIZII)V")
	public static void method6876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static36.aFrame1 != null && (arg1 != 3 || Static281.aClass2_Sub19_Sub1_1.anInt2182 != arg0 || Static281.aClass2_Sub19_Sub1_1.anInt2201 != arg3)) {
			Static396.method6325(Static531.aClass283_6, Static36.aFrame1);
			Static36.aFrame1 = null;
		}
		if (arg1 == 3 && Static36.aFrame1 == null) {
			Static36.aFrame1 = Static455.method6957(arg3, arg0, 0, Static531.aClass283_6);
			if (Static36.aFrame1 != null) {
				Static281.aClass2_Sub19_Sub1_1.anInt2201 = arg3;
				Static281.aClass2_Sub19_Sub1_1.anInt2182 = arg0;
				Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
			}
		}
		if (arg1 == 3 && Static36.aFrame1 == null) {
			method6876(-1, Static281.aClass2_Sub19_Sub1_1.anInt2198, true, -1, arg4);
			return;
		}
		@Pc(82) Container local82;
		@Pc(91) Insets local91;
		if (Static36.aFrame1 != null) {
			Static400.anInt7591 = arg0;
			local82 = Static36.aFrame1;
			Static116.anInt2331 = arg3;
		} else if (Static132.aFrame2 == null) {
			local82 = Static531.aClass283_6.anApplet1;
			Static400.anInt7591 = local82.getSize().width;
			Static116.anInt2331 = local82.getSize().height;
		} else {
			local91 = Static132.aFrame2.getInsets();
			Static400.anInt7591 = Static132.aFrame2.getSize().width - local91.right - local91.left;
			@Pc(109) int local109 = -local91.top;
			Static116.anInt2331 = Static132.aFrame2.getSize().height + local109 - local91.bottom;
			local82 = Static132.aFrame2;
		}
		@Pc(157) int local157;
		if (arg1 == 1) {
			Static276.anInt5006 = 0;
			Static223.anInt3996 = Static185.anInt3395;
			Static461.anInt8348 = Static318.anInt5962;
			Static343.anInt6345 = (Static400.anInt7591 - Static318.anInt5962) / 2;
		} else if (Static78.anInt1651 < 96 && Static266.anInt4923 == 0) {
			local157 = Static400.anInt7591 <= 1024 ? Static400.anInt7591 : 1024;
			Static461.anInt8348 = local157;
			Static343.anInt6345 = (Static400.anInt7591 - local157) / 2;
			@Pc(174) int local174 = Static116.anInt2331 <= 768 ? Static116.anInt2331 : 768;
			Static223.anInt3996 = local174;
			Static276.anInt5006 = 0;
		} else {
			Static276.anInt5006 = 0;
			Static343.anInt6345 = 0;
			Static461.anInt8348 = Static400.anInt7591;
			Static223.anInt3996 = Static116.anInt2331;
		}
		if (Static455.aClass320_15 != Static414.aClass320_17) {
			@Pc(207) boolean local207;
			if (Static461.anInt8348 < 1024 && Static223.anInt3996 < 768) {
				local207 = true;
			} else {
				local207 = false;
			}
		}
		if (arg2) {
			Static165.method2809();
		} else {
			Static517.aCanvas14.setSize(Static461.anInt8348, Static223.anInt3996);
			Static103.aClass39_3.method6057(Static517.aCanvas14);
			if (Static132.aFrame2 == local82) {
				local91 = Static132.aFrame2.getInsets();
				Static517.aCanvas14.setLocation(Static343.anInt6345 + local91.left, Static276.anInt5006 + local91.top);
			} else {
				Static517.aCanvas14.setLocation(Static343.anInt6345, Static276.anInt5006);
			}
		}
		if (arg1 < 2) {
			Static212.aBoolean301 = false;
		} else {
			Static212.aBoolean301 = true;
		}
		if (Static387.anInt7341 != -1) {
			Static191.method6947(true);
		}
		if (Static497.aClass173_2 != null && Static522.method7564(Static271.anInt8654)) {
			Static383.method5988();
		}
		for (local157 = 0; local157 < 100; local157++) {
			Static368.aBooleanArray32[local157] = true;
		}
		Static96.aBoolean133 = true;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z")
	public static boolean method6877(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method6878() {
		@Pc(14) int local14 = Static281.aClass2_Sub19_Sub1_1.method2160(Static266.anInt4923);
		if (local14 == 0) {
			Static139.aByteArrayArrayArray8 = null;
			Static414.method7246(0);
		} else if (local14 == 1) {
			Static32.method670((byte) 0);
			Static414.method7246(512);
			if (Static267.aByteArrayArrayArray19 != null) {
				Static434.method7674();
			}
		} else {
			Static32.method670((byte) (Static313.anInt6819 - 4 & 0xFF));
			Static414.method7246(2);
		}
		Static141.anInt8955 = Static208.anInt3742;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method6879() {
		for (@Pc(15) Class2_Sub46 local15 = (Class2_Sub46) Static160.aClass249_18.method6527(); local15 != null; local15 = (Class2_Sub46) Static160.aClass249_18.method6525()) {
			if (local15.aBoolean645) {
				local15.method7509();
			}
		}
		for (@Pc(35) Class2_Sub46 local35 = (Class2_Sub46) Static286.aClass249_25.method6527(); local35 != null; local35 = (Class2_Sub46) Static286.aClass249_25.method6525()) {
			if (local35.aBoolean645) {
				local35.method7509();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I")
	public static int method6881(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local13 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local13 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local13 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local13 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local13++;
		}
		return local13 + arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)V")
	public static void method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static281.aClass2_Sub19_Sub1_1.anInt2187 != 0 && arg2 != 0 && Static374.anInt6954 < 50 && arg3 != -1) {
			Static469.aClass141Array1[Static374.anInt6954++] = new Class141((byte) 2, arg3, arg2, arg0, arg1, 0);
		}
	}
}
