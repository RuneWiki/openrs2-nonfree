import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Z")
	public static boolean aBoolean831 = true;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method8547() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static366.aBooleanArray16[local1] = true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!cea;I[I)V")
	public static void method8549(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub4_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg1.anIntArray189 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg1.anIntArray189.length; local8++) {
				if (arg1.anIntArray189[local8] != arg2[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg1.anInt4341 != -1) {
				@Pc(44) Class113 local44 = Static528.aClass198_2.method5706(arg1.anInt4341);
				@Pc(47) int local47 = local44.anInt3849;
				if (local47 == 1) {
					arg1.anInt4332 = 0;
					arg1.anInt4326 = arg0;
					arg1.anInt4319 = 0;
					arg1.lb = 0;
					arg1.anInt4290 = 1;
					if (!arg1.aBoolean350) {
						Static598.method8288(arg1, arg1.anInt4319, local44);
					}
				}
				if (local47 == 2) {
					arg1.anInt4332 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg1.anIntArray189 == null || arg1.anIntArray189[local8] == -1 || Static528.aClass198_2.method5706(arg2[local8]).anInt3857 >= Static528.aClass198_2.method5706(arg1.anIntArray189[local8]).anInt3857) {
				arg1.anIntArray189 = arg2;
				arg1.anInt4361 = arg1.anInt4359;
				arg1.anInt4326 = arg0;
			}
		}
		if (local6) {
			arg1.anInt4326 = arg0;
			arg1.anInt4361 = arg1.anInt4359;
			arg1.anIntArray189 = arg2;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)[Lclient!oe;")
	public static Class238[] method8550() {
		return new Class238[] { Static519.aClass238_1, Static519.aClass238_2, Static519.aClass238_3, Static519.aClass238_4, Static519.aClass238_5, Static519.aClass238_6, Static519.aClass238_7, Static519.aClass238_8, Static519.aClass238_9, Static519.aClass238_10, Static519.aClass238_11, Static519.aClass238_12 };
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public static void method8551() {
		if (!Static533.aBoolean740) {
			Static533.aBoolean740 = true;
			Static94.aBoolean215 = true;
			Static529.aFloat136 += (-12.0F - Static529.aFloat136) / 2.0F;
		}
	}
}
