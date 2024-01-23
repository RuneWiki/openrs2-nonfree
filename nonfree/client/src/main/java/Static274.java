import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!ua;")
	public static Class176 aClass176_4;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!l;")
	public static Class98 aClass98_44 = new Class98(64);

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!df;")
	public static Class33 aClass33_14 = new Class33(64);

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString206 = "wave2:";

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString207 = "Please remove ";

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method4499() {
		while (true) {
			@Pc(6) Class3_Sub1 local6 = (Class3_Sub1) Static307.aClass56_28.method1279();
			if (local6 == null) {
				return;
			}
			@Pc(31) Class10_Sub5 local31;
			@Pc(22) int local22;
			if (local6.anInt55 < 0) {
				local22 = -local6.anInt55 - 1;
				if (local22 == Static273.anInt5556) {
					local31 = Static136.aClass10_Sub5_Sub1_1;
				} else {
					local31 = Static52.aClass10_Sub5_Sub1Array1[local22];
				}
			} else {
				local22 = local6.anInt55 - 1;
				local31 = Static110.aClass10_Sub5_Sub2Array1[local22];
			}
			if (local31 != null) {
				@Pc(56) Class49 local56 = Static175.method2874(local6.anInt69);
				if (Static99.anInt1826 < 3) {
				}
				@Pc(75) int local75;
				@Pc(72) int local72;
				if (local6.anInt50 == 1 || local6.anInt50 == 3) {
					local75 = local56.anInt1329;
					local72 = local56.anInt1360;
				} else {
					local72 = local56.anInt1329;
					local75 = local56.anInt1360;
				}
				@Pc(91) int local91 = local6.anInt54 + (local75 >> 1);
				@Pc(98) int local98 = local6.anInt67 + (local72 >> 1);
				@Pc(107) int local107 = (local75 + 1 >> 1) + local6.anInt54;
				@Pc(111) int[][] local111 = Static256.anIntArrayArrayArray14[Static99.anInt1826];
				@Pc(120) int local120 = local6.anInt67 + (local72 + 1 >> 1);
				@Pc(146) int local146 = local111[local107][local120] + local111[local107][local98] + local111[local91][local98] + local111[local91][local120] >> 2;
				@Pc(148) Class10 local148 = null;
				@Pc(153) int local153 = Static254.anIntArray550[local6.anInt63];
				if (local153 == 0) {
					@Pc(217) Class19 local217 = Static201.method3343(Static99.anInt1826, local6.anInt54, local6.anInt67);
					if (local217 != null) {
						local148 = local217.aClass10_3;
					}
				} else if (local153 == 1) {
					@Pc(202) Class95 local202 = Static155.method2591(Static99.anInt1826, local6.anInt54, local6.anInt67);
					if (local202 != null) {
						local148 = local202.aClass10_9;
					}
				} else if (local153 == 2) {
					@Pc(188) Class85 local188 = Static108.method1768(Static99.anInt1826, local6.anInt54, local6.anInt67);
					if (local188 != null) {
						local148 = local188.aClass10_7;
					}
				} else if (local153 == 3) {
					@Pc(173) Class13 local173 = Static313.method5004(Static99.anInt1826, local6.anInt54, local6.anInt67);
					if (local173 != null) {
						local148 = local173.aClass10_1;
					}
				}
				if (local148 != null) {
					Static37.method552(local6.anInt54, local153, local6.anInt65 + 1, Static99.anInt1826, local6.anInt53 + 1, 0, 0, -1, local6.anInt67);
					local31.anInt5098 = local6.anInt65 + Static124.anInt2371;
					local31.anObject5 = local148;
					@Pc(258) int local258 = local6.anInt68;
					local31.anInt5055 = local146;
					local31.anInt5082 = local6.anInt53 + Static124.anInt2371;
					local31.anInt5087 = local6.anInt54 * 128 + local75 * 64;
					@Pc(282) int local282 = local6.anInt62;
					local31.anInt5089 = local72 * 64 + local6.anInt67 * 128;
					@Pc(295) int local295 = local6.anInt58;
					@Pc(300) int local300;
					if (local282 < local258) {
						local300 = local258;
						local258 = local282;
						local282 = local300;
					}
					local31.anInt5038 = local6.anInt54 + local258;
					local31.anInt5041 = local282 + local6.anInt54;
					@Pc(320) int local320 = local6.anInt57;
					if (local320 > local295) {
						local300 = local320;
						local320 = local295;
						local295 = local300;
					}
					local31.anInt5036 = local295 + local6.anInt67;
					local31.anInt5077 = local320 + local6.anInt67;
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!rn;I)Lclient!ho;")
	public static Class3_Sub4_Sub12 method4500(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1) {
		return Static115.method1878(0, arg1, arg0) ? Static21.method348() : null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)I")
	public static int method4501(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IC)C")
	public static char method4502(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public static void method4503() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glDisableClientState(32886);
		Static283.method4651(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static283.method4641();
		for (@Pc(19) int local19 = 0; local19 < Static62.aClass3_Sub21ArrayArray2[0].length; local19++) {
			@Pc(31) Class3_Sub21 local31 = Static62.aClass3_Sub21ArrayArray2[0][local19];
			if (local31.anInt3242 >= 0 && Static308.method4938(Static16.anInterface4_1.method2901(local31.anInt3242))) {
				local1.glColor4fv(Static175.method2878(local31.anInt3238), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean233 ? 1.0F : 0.5F);
				local31.method2859(Static146.aClass3_Sub25ArrayArrayArray7, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static283.method4662();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static283.method4653();
	}
}
