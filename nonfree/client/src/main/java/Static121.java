import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
	public static final boolean aBoolean568 = false;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Ljava/util/Random;")
	public static final Random aRandom2 = new Random();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!dv;[III)V")
	public static void method5577(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray376 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray376.length; local12++) {
				if (arg1[local12] != arg0.anIntArray376[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt6306 != -1) {
				@Pc(48) Class290 local48 = Static618.aClass222_2.method5867(arg0.anInt6306);
				@Pc(51) int local51 = local48.anInt8682;
				if (local51 == 1) {
					arg0.anInt6315 = 0;
					arg0.anInt6267 = 0;
					arg0.anInt6297 = arg2;
					arg0.anInt6313 = 1;
					arg0.anInt6283 = 0;
					if (!arg0.aBoolean533) {
						Static349.method5726(arg0.anInt6315, local48, arg0);
					}
				}
				if (local51 == 2) {
					arg0.anInt6283 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray376 == null || arg0.anIntArray376[local12] == -1 || Static618.aClass222_2.method5867(arg1[local12]).anInt8688 >= Static618.aClass222_2.method5867(arg0.anIntArray376[local12]).anInt8688) {
				arg0.anIntArray376 = arg1;
				arg0.anInt6297 = arg2;
				arg0.anInt6346 = arg0.anInt6343;
			}
		}
		if (local10) {
			arg0.anInt6346 = arg0.anInt6343;
			arg0.anInt6297 = arg2;
			arg0.anIntArray376 = arg1;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
	public static void method5579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg0 > arg2) {
			for (local15 = arg2; local15 < arg0; local15++) {
				Static104.anIntArrayArray24[local15][arg3] = arg1;
			}
		} else {
			for (local15 = arg0; local15 < arg2; local15++) {
				Static104.anIntArrayArray24[local15][arg3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ha;ILclient!kha;)V")
	public static void method5580(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class181 arg1) {
		@Pc(10) Class28[] local10 = Static649.method607(arg1, Static580.anInt9711);
		Static370.aClass5Array10 = new Class5[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static370.aClass5Array10[local16] = arg0.method6161(local10[local16], true);
		}
		local10 = Static649.method607(arg1, Static350.anInt6875);
		Static622.aClass5Array18 = new Class5[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static622.aClass5Array18[local47] = arg0.method6161(local10[local47], true);
		}
		local10 = Static649.method607(arg1, Static88.anInt2307);
		Static417.aClass5Array11 = new Class5[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static417.aClass5Array11[local74] = arg0.method6161(local10[local74], true);
		}
		local10 = Static649.method607(arg1, Static462.anInt8392);
		Static214.aClass5Array9 = new Class5[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static214.aClass5Array9[local105] = arg0.method6161(local10[local105], true);
		}
		local10 = Static649.method607(arg1, Static256.anInt5671);
		Static488.aClass5Array16 = new Class5[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static488.aClass5Array16[local136] = arg0.method6161(local10[local136], true);
		}
		local10 = Static649.method607(arg1, Static74.anInt1923);
		Static474.aClass5Array14 = new Class5[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static474.aClass5Array14[local163] = arg0.method6161(local10[local163], true);
		}
		local10 = Static649.method607(arg1, Static368.anInt7028);
		Static104.aClass5Array5 = new Class5[local10.length];
		for (@Pc(190) int local190 = 0; local190 < local10.length; local190++) {
			Static104.aClass5Array5[local190] = arg0.method6161(local10[local190], true);
		}
		local10 = Static649.method607(arg1, Static565.anInt9609);
		Static484.aClass5Array15 = new Class5[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static484.aClass5Array15[local221] = arg0.method6161(local10[local221], true);
		}
		local10 = Static649.method607(arg1, Static32.anInt603);
		Static513.aClass5Array17 = new Class5[local10.length];
		for (@Pc(248) int local248 = 0; local248 < local10.length; local248++) {
			Static513.aClass5Array17[local248] = arg0.method6161(local10[local248], true);
		}
		local10 = Static649.method607(arg1, Static559.anInt9554);
		Static457.aClass5Array13 = new Class5[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static457.aClass5Array13[local275] = arg0.method6161(local10[local275], true);
		}
		local10 = Static649.method607(arg1, Static112.anInt2937);
		Static16.aClass5Array1 = new Class5[local10.length];
		for (@Pc(302) int local302 = 0; local302 < local10.length; local302++) {
			Static16.aClass5Array1[local302] = arg0.method6161(local10[local302], true);
		}
		local10 = Static649.method607(arg1, Static251.anInt5579);
		Static583.aClass5Array19 = new Class5[local10.length];
		for (@Pc(329) int local329 = 0; local329 < local10.length; local329++) {
			Static583.aClass5Array19[local329] = arg0.method6161(local10[local329], true);
		}
		Static266.aClass5_35 = arg0.method6161(Static649.method613(arg1, Static53.anInt1126, 0), true);
		Static112.aClass5_9 = arg0.method6161(Static649.method613(arg1, Static22.anInt236, 0), true);
		local10 = Static649.method607(arg1, Static498.anInt8829);
		Static452.aClass5Array12 = new Class5[local10.length];
		for (@Pc(372) int local372 = 0; local372 < local10.length; local372++) {
			Static452.aClass5Array12[local372] = arg0.method6161(local10[local372], true);
		}
	}
}
