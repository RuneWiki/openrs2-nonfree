import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "[Lclient!kr;")
	public static Class185[] aClass185Array1 = new Class185[50];

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!hw;II[I)V")
	public static void method4060(@OriginalArg(0) Class21_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray205 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray205.length; local8++) {
				if (arg0.anIntArray205[local8] != arg2[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt4209 != -1) {
				@Pc(45) Class111 local45 = Static17.aClass254_1.method5936(arg0.anInt4209);
				@Pc(48) int local48 = local45.anInt3148;
				if (local48 == 1) {
					arg0.anInt4214 = arg1;
					arg0.anInt4197 = 0;
					arg0.anInt4252 = 0;
					arg0.anInt4272 = 0;
					arg0.anInt4257 = 1;
					if (!arg0.aBoolean295) {
						Static593.method8263(arg0.anInt4272, arg0, local45);
					}
				}
				if (local48 == 2) {
					arg0.anInt4197 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray205 == null || arg0.anIntArray205[local8] == -1 || Static17.aClass254_1.method5936(arg2[local8]).anInt3152 >= Static17.aClass254_1.method5936(arg0.anIntArray205[local8]).anInt3152) {
				arg0.anIntArray205 = arg2;
				arg0.anInt4214 = arg1;
				break;
			}
		}
		if (local6) {
			arg0.anIntArray205 = arg2;
			arg0.anInt4214 = arg1;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIILclient!nf;)V")
	public static void method4061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class233 arg3) {
		for (@Pc(10) Class4_Sub43 local10 = (Class4_Sub43) Static10.aClass22_11.method895(); local10 != null; local10 = (Class4_Sub43) Static10.aClass22_11.method889()) {
			if (local10.anInt8721 == arg0 && arg2 << 9 == local10.anInt8735 && local10.anInt8726 == arg1 << 9 && local10.aClass233_1.anInt6713 == arg3.anInt6713) {
				if (local10.aClass4_Sub21_Sub2_3 != null) {
					Static472.aClass4_Sub21_Sub3_2.method5931(local10.aClass4_Sub21_Sub2_3);
					local10.aClass4_Sub21_Sub2_3 = null;
				}
				if (local10.aClass4_Sub21_Sub2_2 != null) {
					Static472.aClass4_Sub21_Sub3_2.method5931(local10.aClass4_Sub21_Sub2_2);
					local10.aClass4_Sub21_Sub2_2 = null;
				}
				local10.method8193();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4063(@OriginalArg(1) String arg0) {
		return Static287.method4584(arg0);
	}
}
