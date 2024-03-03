import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int anInt5899;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lclient!bp;", line = 29)
	public static Class28 method5368(@OriginalArg(0) int arg0) {
		@Pc(10) Class28 local10 = (Class28) Class86.aClass98_16.method2614((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static175.aClass197_52.method5090(arg0, 1);
		local10 = new Class28();
		local10.anInt749 = arg0;
		if (local20 != null) {
			local10.method949(new Class2_Sub4(local20));
		}
		local10.method945();
		if (local10.anInt737 == 2 && Class2.aClass4_151.method90((long) arg0) == null) {
			Class2.aClass4_151.method87(new Class2_Sub39(Class207.anInt5768), (long) arg0);
			Class2_Sub3_Sub26.aClass28Array1[Class207.anInt5768++] = local10;
		}
		Class86.aClass98_16.method2626((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nn;)V", line = 67)
	public static void method5369(@OriginalArg(0) Class2_Sub26_Sub1 arg0) {
		if (Static154.anInt3135 >= 65535) {
			return;
		}
		Static283.aClass2_Sub26_Sub1Array2[Static154.anInt3135] = arg0;
		Static326.aBooleanArray57[Static154.anInt3135] = false;
		Static154.anInt3135++;
		@Pc(18) int local18 = arg0.anInt4373;
		if (arg0.aBoolean300) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4373;
		if (arg0.aBoolean301) {
			local26 = Static86.anInt1912 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4364 + Static233.anInt4684 - arg0.anInt4367 >> Static299.anInt6017;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4364 + arg0.anInt4367 - Static233.anInt4684 >> Static299.anInt6017;
			if (local66 >= Static196.anInt3769) {
				local66 = Static196.anInt3769 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray91[local38++];
				@Pc(96) int local96 = (arg0.anInt4363 + Static233.anInt4684 - arg0.anInt4367 >> Static299.anInt6017) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static68.anInt1682) {
					local104 = Static68.anInt1682 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static48.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static48.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static154.anInt3135;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static48.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static154.anInt3135 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static48.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static154.anInt3135 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static48.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static154.anInt3135 << 48;
					}
				}
			}
		}
	}
}
