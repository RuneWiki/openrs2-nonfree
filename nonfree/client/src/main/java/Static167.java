import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fka", name = "j", descriptor = "Z")
	public static boolean aBoolean180;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(I[ILclient!nh;IZ)V")
	public static void method2423(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class4_Sub3_Sub3_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(4) boolean local4;
		@Pc(6) int local6;
		if (arg1.anIntArray198 != null) {
			local4 = true;
			for (local6 = 0; local6 < arg1.anIntArray198.length; local6++) {
				if (arg1.anIntArray198[local6] != arg0[local6]) {
					local4 = false;
					break;
				}
			}
			@Pc(31) Class181 local31 = arg1.aClass181_8;
			if (local4 && local31.method8970()) {
				@Pc(44) Class259 local44 = arg1.aClass181_8.method8952();
				@Pc(47) int local47 = local44.anInt7194;
				if (local47 == 1) {
					local31.method8965(arg2);
				}
				if (local47 == 2) {
					local31.method8945();
				}
			}
		}
		local4 = true;
		for (local6 = 0; local6 < arg0.length; local6++) {
			if (arg0[local6] != -1) {
				local4 = false;
			}
			if (arg1.anIntArray198 == null || arg1.anIntArray198[local6] == -1 || Static59.aClass204_1.method5041(arg0[local6]).anInt7201 >= Static59.aClass204_1.method5041(arg1.anIntArray198[local6]).anInt7201) {
				arg1.anIntArray198 = arg0;
				arg1.aClass181_8.method8953(arg2);
				if (arg3) {
					arg1.anInt3297 = arg1.anInt3298;
				}
			}
		}
		if (!local4) {
			return;
		}
		arg1.anIntArray198 = arg0;
		arg1.aClass181_8.method8953(arg2);
		if (arg3) {
			arg1.anInt3297 = arg1.anInt3298;
			return;
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(BI)V")
	public static void method2424(@OriginalArg(0) byte arg0) {
		if (Static436.aByteArrayArrayArray11 == null) {
			Static436.aByteArrayArrayArray11 = new byte[4][Static380.anInt6689][Static542.anInt9214];
		}
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (@Pc(28) int local28 = 0; local28 < Static380.anInt6689; local28++) {
				for (@Pc(31) int local31 = 0; local31 < Static542.anInt9214; local31++) {
					Static436.aByteArrayArrayArray11[local25][local28][local31] = arg0;
				}
			}
		}
	}
}
