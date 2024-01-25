import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "Lclient!gh;")
	public static Class76 aClass76_5;

	@OriginalMember(owner = "client!gp", name = "M", descriptor = "Lclient!wd;")
	public static Class212 aClass212_4;

	@OriginalMember(owner = "client!gp", name = "Q", descriptor = "I")
	public static int anInt2423 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZIFIIZII)[I")
	public static int[] method2348(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class14_Sub3_Sub31 local10 = new Class14_Sub3_Sub31();
		local10.anInt5154 = 8;
		local10.anInt5153 = 8;
		local10.anInt5161 = (int) (arg0 * 4096.0F);
		local10.anInt5148 = 4;
		local10.aBoolean346 = true;
		local10.anInt5156 = 35;
		local10.method5998();
		Static109.method2350(2048, 1);
		local10.method4608(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(IIIII)V")
	public static void method2349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class14_Sub28 local6 = (Class14_Sub28) Static257.aClass18_24.method459(); local6 != null; local6 = (Class14_Sub28) Static257.aClass18_24.method453()) {
			Static247.method4308(local6, arg1, arg3, arg2, arg0);
		}
		for (@Pc(31) Class14_Sub28 local31 = (Class14_Sub28) Static51.aClass18_3.method459(); local31 != null; local31 = (Class14_Sub28) Static51.aClass18_3.method453()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class128 local40 = local31.aClass10_Sub3_Sub3_Sub1_1.method5364();
			if (local31.aClass10_Sub3_Sub3_Sub1_1.aBoolean414) {
				local35 = 0;
			} else if (local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939 == local40.anInt3760 || local40.anInt3725 == local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939 || local40.anInt3733 == local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939 || local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939 == local40.anInt3743) {
				local35 = 2;
			} else if (local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939 == local40.anInt3754 || local40.anInt3718 == local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939 || local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939 == local40.anInt3749 || local40.anInt3741 == local31.aClass10_Sub3_Sub3_Sub1_1.anInt5939) {
				local35 = 3;
			}
			if (local31.anInt5297 != local35) {
				@Pc(119) int local119 = Static158.method3092(local31.aClass10_Sub3_Sub3_Sub1_1);
				if (local119 != local31.anInt5308) {
					if (local31.aClass14_Sub19_Sub3_2 != null) {
						Static49.aClass14_Sub19_Sub2_1.method4245(local31.aClass14_Sub19_Sub3_2);
						local31.aClass14_Sub19_Sub3_2 = null;
					}
					local31.anInt5308 = local119;
				}
				local31.anInt5297 = local35;
			}
			local31.anInt5307 = local31.aClass10_Sub3_Sub3_Sub1_1.anInt5910;
			local31.anInt5304 = local31.aClass10_Sub3_Sub3_Sub1_1.anInt5910 + local31.aClass10_Sub3_Sub3_Sub1_1.method5353() * 64;
			local31.anInt5298 = local31.aClass10_Sub3_Sub3_Sub1_1.anInt5908;
			local31.anInt5316 = local31.aClass10_Sub3_Sub3_Sub1_1.anInt5908 + local31.aClass10_Sub3_Sub3_Sub1_1.method5353() * 64;
			Static247.method4308(local31, arg1, arg3, arg2, arg0);
		}
		for (@Pc(196) Class14_Sub28 local196 = (Class14_Sub28) Static316.aClass25_16.method697(); local196 != null; local196 = (Class14_Sub28) Static316.aClass25_16.method694()) {
			@Pc(200) byte local200 = 1;
			@Pc(205) Class128 local205 = local196.aClass10_Sub3_Sub3_Sub2_2.method5364();
			if (local196.aClass10_Sub3_Sub3_Sub2_2.aBoolean414) {
				local200 = 0;
			} else if (local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939 == local205.anInt3760 || local205.anInt3725 == local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939 || local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939 == local205.anInt3733 || local205.anInt3743 == local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939) {
				local200 = 2;
			} else if (local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939 == local205.anInt3754 || local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939 == local205.anInt3718 || local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939 == local205.anInt3749 || local196.aClass10_Sub3_Sub3_Sub2_2.anInt5939 == local205.anInt3741) {
				local200 = 3;
			}
			if (local200 != local196.anInt5297) {
				@Pc(292) int local292 = Static220.method3963(local196.aClass10_Sub3_Sub3_Sub2_2);
				if (local292 != local196.anInt5308) {
					if (local196.aClass14_Sub19_Sub3_2 != null) {
						Static49.aClass14_Sub19_Sub2_1.method4245(local196.aClass14_Sub19_Sub3_2);
						local196.aClass14_Sub19_Sub3_2 = null;
					}
					local196.anInt5308 = local292;
				}
				local196.anInt5297 = local200;
			}
			local196.anInt5307 = local196.aClass10_Sub3_Sub3_Sub2_2.anInt5910;
			local196.anInt5304 = local196.aClass10_Sub3_Sub3_Sub2_2.anInt5910 + local196.aClass10_Sub3_Sub3_Sub2_2.method5353() * 64;
			local196.anInt5298 = local196.aClass10_Sub3_Sub3_Sub2_2.anInt5908;
			local196.anInt5316 = local196.aClass10_Sub3_Sub3_Sub2_2.anInt5908 + local196.aClass10_Sub3_Sub3_Sub2_2.method5353() * 64;
			Static247.method4308(local196, arg1, arg3, arg2, arg0);
		}
	}
}
