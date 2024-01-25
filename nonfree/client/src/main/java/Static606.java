import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
	public static final int[] anIntArray609 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!kba;)V")
	public static void method8264(@OriginalArg(1) Class2_Sub3_Sub1_Sub2 arg0) {
		if (arg0.anIntArray372 == null && arg0.anIntArray373 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray372.length; local20++) {
			@Pc(24) int local24 = -1;
			if (arg0.anIntArray372 != null) {
				local24 = arg0.anIntArray372[local20];
			}
			if (local24 != -1) {
				local14 = false;
				@Pc(76) int local76;
				@Pc(93) int local93;
				@Pc(61) int local61;
				if ((local24 & -1073741824) == -1073741824) {
					local61 = local24 & 0xFFFFFFF;
					@Pc(65) int local65 = local61 >> 14;
					local76 = arg0.anInt10428 - (local65 - Static446.anInt8090) * 512 - 256;
					@Pc(80) int local80 = local61 & 0x3FFF;
					local93 = arg0.anInt10424 - (local80 - Static124.anInt3150) * 512 - 256;
				} else if ((local24 & 0x8000) == 0) {
					@Pc(139) Class3_Sub49 local139 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local24);
					if (local139 == null) {
						arg0.method5318(local20, -1);
						continue;
					}
					@Pc(152) Class2_Sub3_Sub1_Sub2_Sub1 local152 = local139.aClass2_Sub3_Sub1_Sub2_Sub1_2;
					local76 = arg0.anInt10428 - local152.anInt10428;
					local93 = arg0.anInt10424 - local152.anInt10424;
				} else {
					local61 = local24 & 0x7FFF;
					@Pc(107) Class2_Sub3_Sub1_Sub2_Sub2 local107 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local61];
					if (local107 == null) {
						arg0.method5318(local20, -1);
						continue;
					}
					local76 = arg0.anInt10428 - local107.anInt10428;
					local93 = arg0.anInt10424 - local107.anInt10424;
				}
				if (local76 != 0 || local93 != 0) {
					arg0.method5318(local20, (int) (Math.atan2((double) local76, (double) local93) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method5318(local20, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray372 = null;
			arg0.anIntArray373 = null;
		}
	}
}
