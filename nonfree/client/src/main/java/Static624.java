import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
	public static boolean aBoolean868 = false;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!ga;")
	public static final Class107 aClass107_7 = new Class107("LIVE", "", "", 0);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBI)V")
	public static void method8484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub25 local6 = (Class3_Sub25) Static598.aClass276_62.method6907(); local6 != null; local6 = (Class3_Sub25) Static598.aClass276_62.method6912()) {
			Static524.method7478(arg3, arg0, arg1, arg2, local6);
		}
		@Pc(175) boolean local175;
		for (@Pc(31) Class3_Sub25 local31 = (Class3_Sub25) Static342.aClass276_43.method6907(); local31 != null; local31 = (Class3_Sub25) Static342.aClass276_43.method6912()) {
			@Pc(35) byte local35 = 1;
			@Pc(42) Class232 local42 = local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.method5304();
			if (local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 == -1 || local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.aBoolean531) {
				local35 = 0;
			} else if (local42.anInt7157 == local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 || local42.anInt7185 == local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 || local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 == local42.anInt7153 || local42.anInt7161 == local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273) {
				local35 = 2;
			} else if (local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 == local42.anInt7175 || local42.anInt7188 == local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 || local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 == local42.anInt7178 || local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt6273 == local42.anInt7150) {
				local35 = 3;
			}
			if (local35 != local31.anInt4653) {
				@Pc(127) int local127 = Static545.method7729(local31.aClass2_Sub3_Sub1_Sub2_Sub1_1);
				@Pc(131) Class22 local131 = local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.aClass22_1;
				if (local131.anIntArray29 != null) {
					local131 = local131.method425(Static514.aClass166_1);
				}
				if (local131 == null || local127 == -1) {
					local31.anInt4657 = -1;
					local31.aBoolean401 = false;
					local31.anInt4653 = local35;
				} else if (local31.anInt4657 == local127 && local31.aBoolean401 == local131.aBoolean36) {
					local31.anInt4653 = local35;
					local31.anInt4645 = local131.anInt417;
				} else {
					local175 = false;
					if (local31.aClass3_Sub7_Sub1_3 == null) {
						local175 = true;
					} else {
						local31.anInt4645 -= 512;
						if (local31.anInt4645 <= 0) {
							Static581.aClass3_Sub7_Sub3_2.method2210(local31.aClass3_Sub7_Sub1_3);
							local175 = true;
							local31.aClass3_Sub7_Sub1_3 = null;
						}
					}
					if (local175) {
						local31.aClass3_Sub12_Sub1_2 = null;
						local31.aBoolean401 = local131.aBoolean36;
						local31.anInt4653 = local35;
						local31.anInt4645 = local131.anInt417;
						local31.aClass3_Sub47_2 = null;
						local31.anInt4657 = local127;
					}
				}
			}
			local31.anInt4649 = local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt10428;
			local31.anInt4660 = local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt10428 + (local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.method5308() << 8);
			local31.anInt4655 = local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt10424;
			local31.anInt4658 = local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.anInt10424 + (local31.aClass2_Sub3_Sub1_Sub2_Sub1_1.method5308() << 8);
			Static524.method7478(arg3, arg0, arg1, arg2, local31);
		}
		for (@Pc(279) Class3_Sub25 local279 = (Class3_Sub25) Static470.aClass307_42.method7421(); local279 != null; local279 = (Class3_Sub25) Static470.aClass307_42.method7428()) {
			@Pc(283) byte local283 = 1;
			@Pc(288) Class232 local288 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.method5304();
			if (local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == -1 || local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.aBoolean531) {
				local283 = 0;
			} else if (local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == local288.anInt7157 || local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == local288.anInt7185 || local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == local288.anInt7153 || local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == local288.anInt7161) {
				local283 = 2;
			} else if (local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == local288.anInt7175 || local288.anInt7188 == local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 || local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == local288.anInt7178 || local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6273 == local288.anInt7150) {
				local283 = 3;
			}
			if (local283 != local279.anInt4653) {
				@Pc(394) int local394 = Static499.method7288(local279.aClass2_Sub3_Sub1_Sub2_Sub2_3);
				if (local394 == local279.anInt4657 && local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.aBoolean542 == local279.aBoolean401) {
					local279.anInt4653 = local283;
					local279.anInt4645 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6360;
				} else {
					local175 = false;
					if (local279.aClass3_Sub7_Sub1_3 == null) {
						local175 = true;
					} else {
						local279.anInt4645 -= 512;
						if (local279.anInt4645 <= 0) {
							Static581.aClass3_Sub7_Sub3_2.method2210(local279.aClass3_Sub7_Sub1_3);
							local175 = true;
							local279.aClass3_Sub7_Sub1_3 = null;
						}
					}
					if (local175) {
						local279.anInt4645 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6360;
						local279.aClass3_Sub12_Sub1_2 = null;
						local279.aClass3_Sub47_2 = null;
						local279.anInt4653 = local283;
						local279.anInt4657 = local394;
						local279.aBoolean401 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.aBoolean542;
					}
				}
			}
			local279.anInt4649 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt10428;
			local279.anInt4660 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt10428 + (local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.method5308() << 8);
			local279.anInt4655 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt10424;
			local279.anInt4658 = local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt10424 + (local279.aClass2_Sub3_Sub1_Sub2_Sub2_3.method5308() << 8);
			Static524.method7478(arg3, arg0, arg1, arg2, local279);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method8486() {
		Static127.aClass307_21.method7427();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!nga;Ljava/awt/Frame;)V")
	public static void method8487(@OriginalArg(1) Class228 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(14) Class376 local14 = arg0.method5944(arg1);
			while (local14.anInt10510 == 0) {
				Static500.method7308(10L);
			}
			if (local14.anInt10510 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static500.method7308(100L);
		}
	}
}
