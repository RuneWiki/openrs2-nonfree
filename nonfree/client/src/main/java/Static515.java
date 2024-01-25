import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "J")
	public static long aLong77;

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
	public static int anInt3055;

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "Lclient!ht;")
	public static final Class137 aClass137_8 = new Class137("", 13);

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(B)V")
	public static void method2747() {
		for (@Pc(3) int local3 = 0; local3 < Static596.anInt9773; local3++) {
			@Pc(9) int local9 = Static70.anIntArray70[local3];
			@Pc(17) Class41_Sub2_Sub1_Sub4_Sub1 local17 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) local9)).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			@Pc(21) int local21 = Static532.aClass3_Sub11_Sub1_2.method5175();
			if ((local21 & 0x20) != 0) {
				local21 += Static532.aClass3_Sub11_Sub1_2.method5175() << 8;
			}
			@Pc(44) int local44;
			@Pc(48) int local48;
			if ((local21 & 0x4) != 0) {
				local44 = Static532.aClass3_Sub11_Sub1_2.method5217();
				local48 = Static532.aClass3_Sub11_Sub1_2.method5204();
				local17.method7867(local44, Static506.anInt8251, local48);
				local17.anInt9501 = Static506.anInt8251 + 300;
				local17.anInt9465 = Static532.aClass3_Sub11_Sub1_2.method5175();
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt9492 = Static532.aClass3_Sub11_Sub1_2.method5173();
				local17.anInt9453 = Static532.aClass3_Sub11_Sub1_2.method5187();
				local17.anInt9507 = Static532.aClass3_Sub11_Sub1_2.method5173();
				local17.anInt9516 = Static532.aClass3_Sub11_Sub1_2.method5173();
				local17.anInt9506 = Static532.aClass3_Sub11_Sub1_2.method5198() + Static506.anInt8251;
				local17.anInt9529 = Static532.aClass3_Sub11_Sub1_2.method5174() + Static506.anInt8251;
				local17.anInt9524 = Static532.aClass3_Sub11_Sub1_2.method5204();
				local17.anInt9492 += local17.anIntArray629[0];
				local17.anInt9535 = 1;
				local17.anInt9453 += local17.anIntArray628[0];
				local17.anInt9516 += local17.anIntArray628[0];
				local17.anInt9507 += local17.anIntArray629[0];
				local17.anInt9534 = 0;
			}
			@Pc(198) int local198;
			if ((local21 & 0x8) != 0) {
				@Pc(165) int[] local165 = new int[4];
				for (local48 = 0; local48 < 4; local48++) {
					local165[local48] = Static532.aClass3_Sub11_Sub1_2.method5198();
					if (local165[local48] == 65535) {
						local165[local48] = -1;
					}
				}
				local198 = Static532.aClass3_Sub11_Sub1_2.method5204();
				Static229.method3564(local17, local165, local198);
			}
			if ((local21 & 0x2000) != 0) {
				local44 = Static532.aClass3_Sub11_Sub1_2.method5205();
				local17.anInt9458 = Static532.aClass3_Sub11_Sub1_2.method5206();
				local17.anInt9469 = Static532.aClass3_Sub11_Sub1_2.method5185();
				local17.anInt9471 = local44 & 0x7FFF;
				local17.aBoolean738 = (local44 & 0x8000) != 0;
				local17.anInt9518 = local17.anInt9458 + local17.anInt9471 + Static506.anInt8251;
			}
			if ((local21 & 0x200) != 0) {
				local44 = Static532.aClass3_Sub11_Sub1_2.method5205();
				local48 = Static532.aClass3_Sub11_Sub1_2.method5228();
				if (local44 == 65535) {
					local44 = -1;
				}
				local198 = Static532.aClass3_Sub11_Sub1_2.method5206();
				local17.method7857(local48, local198, local44, true);
			}
			if ((local21 & 0x10) != 0) {
				if (local17.aClass264_1.method6002()) {
					Static184.method3145(local17);
				}
				local17.method5661(Static361.aClass229_13.method5396(Static532.aClass3_Sub11_Sub1_2.method5174()));
				local17.method7859(local17.aClass264_1.anInt7163);
				local17.anInt9499 = local17.aClass264_1.anInt7149 << 3;
				if (local17.aClass264_1.method6002()) {
					Static145.method2803(local17, null, 0, local17.anIntArray629[0], local17.aByte117, null, local17.anIntArray628[0]);
				}
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt9483 = Static532.aClass3_Sub11_Sub1_2.method5205();
				if (local17.anInt9483 == 65535) {
					local17.anInt9483 = -1;
				}
			}
			if ((local21 & 0x40) != 0) {
				local44 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local48 = Static532.aClass3_Sub11_Sub1_2.method5228();
				if (local44 == 65535) {
					local44 = -1;
				}
				local198 = Static532.aClass3_Sub11_Sub1_2.method5204();
				local17.method7857(local48, local198, local44, false);
			}
			if ((local21 & 0x1000) != 0) {
				local44 = Static532.aClass3_Sub11_Sub1_2.method5185();
				@Pc(403) int[] local403 = new int[local44];
				@Pc(406) int[] local406 = new int[local44];
				@Pc(409) int[] local409 = new int[local44];
				for (@Pc(411) int local411 = 0; local411 < local44; local411++) {
					@Pc(417) int local417 = Static532.aClass3_Sub11_Sub1_2.method5205();
					if (local417 == 65535) {
						local417 = -1;
					}
					local403[local411] = local417;
					local406[local411] = Static532.aClass3_Sub11_Sub1_2.method5204();
					local409[local411] = Static532.aClass3_Sub11_Sub1_2.method5178();
				}
				Static534.method7129(local17, local403, local409, local406);
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt6736 = Static532.aClass3_Sub11_Sub1_2.method5178();
				local17.anInt6751 = Static532.aClass3_Sub11_Sub1_2.method5198();
			}
			if ((local21 & 0x100) != 0) {
				local17.aByte122 = Static532.aClass3_Sub11_Sub1_2.method5173();
				local17.aByte121 = Static532.aClass3_Sub11_Sub1_2.method5187();
				local17.aByte123 = Static532.aClass3_Sub11_Sub1_2.method5187();
				local17.aByte120 = (byte) Static532.aClass3_Sub11_Sub1_2.method5185();
				local17.anInt9493 = Static506.anInt8251 + Static532.aClass3_Sub11_Sub1_2.method5198();
				local17.anInt9511 = Static506.anInt8251 + Static532.aClass3_Sub11_Sub1_2.method5205();
			}
			if ((local21 & 0x800) != 0) {
				local44 = Static532.aClass3_Sub11_Sub1_2.method5217();
				local48 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local17.method7867(local44, Static506.anInt8251, local48);
			}
			if ((local21 & 0x80) != 0) {
				local17.aString94 = Static532.aClass3_Sub11_Sub1_2.method5181();
				local17.anInt9494 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZBLclient!pi;Ljava/lang/String;Z)V")
	public static void method2749(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class258 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg0) {
			Static455.method6390(arg1, 3, arg2);
			return;
		}
		@Pc(26) String local26;
		if (Static408.aString61.startsWith("win") && arg1.aBoolean524) {
			local26 = null;
			if (Static31.anApplet1 != null) {
				local26 = Static31.anApplet1.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(44) Class39 local44 = Static455.method6390(arg1, 0, arg2);
				Static385.aClass39_2 = local44;
				Static461.aString72 = arg2;
				Static91.aClass258_1 = arg1;
				return;
			}
		}
		if (Static408.aString61.startsWith("mac")) {
			local26 = null;
			if (Static31.anApplet1 != null) {
				local26 = Static31.anApplet1.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg3) {
				Static455.method6390(arg1, 1, arg2);
				return;
			}
		}
		Static455.method6390(arg1, 2, arg2);
	}
}
