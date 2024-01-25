import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
	public static final int[] anIntArray153 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "[B")
	public static final byte[] aByteArray21 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "[I")
	public static final int[] anIntArray154 = new int[13];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V")
	public static void method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) Static455.aClass229_37.method5328(); local15 != null; local15 = (Class3_Sub36) Static455.aClass229_37.method5325()) {
			Static251.method3837(local15, arg3, arg1, arg0, arg2);
		}
		for (@Pc(36) Class3_Sub36 local36 = (Class3_Sub36) Static437.aClass229_47.method5328(); local36 != null; local36 = (Class3_Sub36) Static437.aClass229_47.method5325()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class137 local45 = local36.aClass1_Sub3_Sub3_Sub2_1.method4837();
			if (local36.aClass1_Sub3_Sub3_Sub2_1.aBoolean429) {
				local40 = 0;
			} else if (local45.anInt4208 == local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080 || local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080 == local45.anInt4213 || local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080 == local45.anInt4187 || local45.anInt4207 == local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080) {
				local40 = 2;
			} else if (local45.anInt4216 == local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080 || local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080 == local45.anInt4191 || local45.anInt4193 == local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080 || local45.anInt4188 == local36.aClass1_Sub3_Sub3_Sub2_1.anInt6080) {
				local40 = 3;
			}
			if (local40 != local36.anInt6174) {
				@Pc(136) int local136 = Static133.method2297(local36.aClass1_Sub3_Sub3_Sub2_1);
				if (local136 != local36.anInt6176) {
					if (local36.aClass3_Sub5_Sub3_3 != null) {
						Static251.aClass3_Sub5_Sub4_1.method5196(local36.aClass3_Sub5_Sub3_3);
						local36.aClass3_Sub5_Sub3_3 = null;
					}
					local36.anInt6176 = local136;
				}
				local36.anInt6174 = local40;
			}
			local36.anInt6171 = local36.aClass1_Sub3_Sub3_Sub2_1.anInt6053;
			local36.anInt6165 = local36.aClass1_Sub3_Sub3_Sub2_1.anInt6053 + (local36.aClass1_Sub3_Sub3_Sub2_1.method4831() << 6);
			local36.anInt6180 = local36.aClass1_Sub3_Sub3_Sub2_1.anInt6055;
			local36.anInt6172 = local36.aClass1_Sub3_Sub3_Sub2_1.anInt6055 + (local36.aClass1_Sub3_Sub3_Sub2_1.method4831() << 6);
			Static251.method3837(local36, arg3, arg1, arg0, arg2);
		}
		for (@Pc(210) Class3_Sub36 local210 = (Class3_Sub36) Static222.aClass127_23.method3248(); local210 != null; local210 = (Class3_Sub36) Static222.aClass127_23.method3252()) {
			@Pc(214) byte local214 = 1;
			@Pc(219) Class137 local219 = local210.aClass1_Sub3_Sub3_Sub1_3.method4837();
			if (local210.aClass1_Sub3_Sub3_Sub1_3.aBoolean429) {
				local214 = 0;
			} else if (local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 == local219.anInt4208 || local219.anInt4213 == local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 || local219.anInt4187 == local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 || local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 == local219.anInt4207) {
				local214 = 2;
			} else if (local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 == local219.anInt4216 || local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 == local219.anInt4191 || local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 == local219.anInt4193 || local210.aClass1_Sub3_Sub3_Sub1_3.anInt6080 == local219.anInt4188) {
				local214 = 3;
			}
			if (local214 != local210.anInt6174) {
				@Pc(314) int local314 = Static151.method2693(local210.aClass1_Sub3_Sub3_Sub1_3);
				if (local314 != local210.anInt6176) {
					if (local210.aClass3_Sub5_Sub3_3 != null) {
						Static251.aClass3_Sub5_Sub4_1.method5196(local210.aClass3_Sub5_Sub3_3);
						local210.aClass3_Sub5_Sub3_3 = null;
					}
					local210.anInt6176 = local314;
				}
				local210.anInt6174 = local214;
			}
			local210.anInt6171 = local210.aClass1_Sub3_Sub3_Sub1_3.anInt6053;
			local210.anInt6165 = local210.aClass1_Sub3_Sub3_Sub1_3.anInt6053 + (local210.aClass1_Sub3_Sub3_Sub1_3.method4831() << 6);
			local210.anInt6180 = local210.aClass1_Sub3_Sub3_Sub1_3.anInt6055;
			local210.anInt6172 = local210.aClass1_Sub3_Sub3_Sub1_3.anInt6055 + (local210.aClass1_Sub3_Sub3_Sub1_3.method4831() << 6);
			Static251.method3837(local210, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I")
	public static int method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZZILclient!hs;Ljava/lang/String;)V")
	public static void method1418(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class103 arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static130.method4841(3, arg2, arg3);
			return;
		}
		@Pc(23) String local23;
		if (Static162.aString37.startsWith("win") && Static162.anInt3462 != 3) {
			local23 = null;
			if (arg2.anApplet1 != null) {
				local23 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local23 == null || !local23.equals("1")) {
				@Pc(43) Class190 local43 = Static130.method4841(0, arg2, arg3);
				Static411.aClass190_10 = local43;
				Static304.aString54 = arg3;
				Static112.aClass103_6 = arg2;
				return;
			}
		}
		if (Static162.aString37.startsWith("mac")) {
			local23 = null;
			if (arg2.anApplet1 != null) {
				local23 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local23 != null && local23.equals("1") && arg0) {
				Static130.method4841(1, arg2, arg3);
				return;
			}
		}
		Static130.method4841(2, arg2, arg3);
	}
}
