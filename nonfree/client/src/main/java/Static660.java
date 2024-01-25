import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "Lclient!cr;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray716 = new int[14];

	@OriginalMember(owner = "client!wfa", name = "m", descriptor = "[I")
	public static int[] anIntArray717 = new int[4];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZIIII)V")
	public static void method8783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class4_Sub23 local14 = (Class4_Sub23) Static328.aClass163_30.method3639(); local14 != null; local14 = (Class4_Sub23) Static328.aClass163_30.method3640()) {
			Static44.method813(arg2, arg1, local14, arg3, arg0);
		}
		@Pc(193) boolean local193;
		for (@Pc(35) Class4_Sub23 local35 = (Class4_Sub23) Static611.aClass163_65.method3639(); local35 != null; local35 = (Class4_Sub23) Static611.aClass163_65.method3640()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class377 local44 = local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.method8525();
			if (local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967 == -1 || local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.aBoolean776) {
				local39 = 0;
			} else if (local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967 == local44.anInt10039 || local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967 == local44.anInt10035 || local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967 == local44.anInt10051 || local44.anInt10062 == local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967) {
				local39 = 2;
			} else if (local44.anInt10063 == local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967 || local44.anInt10068 == local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967 || local44.anInt10054 == local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967 || local44.anInt10044 == local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9967) {
				local39 = 3;
			}
			if (local39 != local35.anInt4146) {
				@Pc(136) int local136 = Static617.method8307(local35.aClass3_Sub1_Sub2_Sub2_Sub2_1);
				@Pc(140) Class345 local140 = local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.aClass345_1;
				if (local140.anIntArray624 != null) {
					local140 = local140.method7529(Static526.aClass293_1);
				}
				if (local140 == null || local136 == -1) {
					local35.aBoolean306 = false;
					local35.anInt4146 = local39;
					local35.anInt4145 = -1;
				} else if (local35.anInt4145 == local136 && local35.aBoolean306 == local140.aBoolean698) {
					local35.anInt4148 = local140.anInt8779;
					local35.anInt4146 = local39;
				} else {
					local193 = false;
					if (local35.aClass4_Sub3_Sub3_2 == null) {
						local193 = true;
					} else {
						local35.anInt4148 -= 512;
						if (local35.anInt4148 <= 0) {
							Static162.aClass4_Sub3_Sub5_3.method7723(local35.aClass4_Sub3_Sub3_2);
							local35.aClass4_Sub3_Sub3_2 = null;
							local193 = true;
						}
					}
					if (local193) {
						local35.anInt4148 = local140.anInt8779;
						local35.aClass4_Sub4_Sub1_3 = null;
						local35.aClass4_Sub16_3 = null;
						local35.aBoolean306 = local140.aBoolean698;
						local35.anInt4145 = local136;
						local35.anInt4146 = local39;
					}
				}
			}
			local35.anInt4135 = local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9925;
			local35.anInt4142 = local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9925 + (local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.method8514() << 8);
			local35.anInt4140 = local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9917;
			local35.anInt4143 = local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.anInt9917 + (local35.aClass3_Sub1_Sub2_Sub2_Sub2_1.method8514() << 8);
			Static44.method813(arg2, arg1, local35, arg3, arg0);
		}
		for (@Pc(296) Class4_Sub23 local296 = (Class4_Sub23) Static124.aClass66_10.method1992(); local296 != null; local296 = (Class4_Sub23) Static124.aClass66_10.method1984()) {
			@Pc(300) byte local300 = 1;
			@Pc(305) Class377 local305 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.method8525();
			if (local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 == -1 || local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.aBoolean776) {
				local300 = 0;
			} else if (local305.anInt10039 == local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 || local305.anInt10035 == local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 || local305.anInt10051 == local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 || local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 == local305.anInt10062) {
				local300 = 2;
			} else if (local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 == local305.anInt10063 || local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 == local305.anInt10068 || local305.anInt10054 == local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967 || local305.anInt10044 == local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9967) {
				local300 = 3;
			}
			if (local296.anInt4146 != local300) {
				@Pc(393) int local393 = Static225.method3273(local296.aClass3_Sub1_Sub2_Sub2_Sub1_1);
				if (local393 == local296.anInt4145 && local296.aBoolean306 == local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.aBoolean294) {
					local296.anInt4146 = local300;
					local296.anInt4148 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt3942;
				} else {
					local193 = false;
					if (local296.aClass4_Sub3_Sub3_2 == null) {
						local193 = true;
					} else {
						local296.anInt4148 -= 512;
						if (local296.anInt4148 <= 0) {
							Static162.aClass4_Sub3_Sub5_3.method7723(local296.aClass4_Sub3_Sub3_2);
							local193 = true;
							local296.aClass4_Sub3_Sub3_2 = null;
						}
					}
					if (local193) {
						local296.anInt4145 = local393;
						local296.aBoolean306 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.aBoolean294;
						local296.aClass4_Sub16_3 = null;
						local296.anInt4146 = local300;
						local296.anInt4148 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt3942;
						local296.aClass4_Sub4_Sub1_3 = null;
					}
				}
			}
			local296.anInt4135 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9925;
			local296.anInt4142 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9925 + (local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.method8514() << 8);
			local296.anInt4140 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9917;
			local296.anInt4143 = local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt9917 + (local296.aClass3_Sub1_Sub2_Sub2_Sub1_1.method8514() << 8);
			Static44.method813(arg2, arg1, local296, arg3, arg0);
		}
	}
}
