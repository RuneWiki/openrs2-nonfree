import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
	public static int anInt10676;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_125 = new Class257(57, 7);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)Z")
	public static boolean method8603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILclient!efa;[I)V")
	public static void method8612(@OriginalArg(0) int arg0, @OriginalArg(2) Class15_Sub1_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(14) boolean local14;
		@Pc(16) int local16;
		if (arg1.anIntArray434 != null) {
			local14 = true;
			for (local16 = 0; local16 < arg1.anIntArray434.length; local16++) {
				if (arg1.anIntArray434[local16] != arg2[local16]) {
					local14 = false;
					break;
				}
			}
			if (local14 && arg1.anInt8105 != -1) {
				@Pc(57) Class97 local57 = Static28.aClass220_1.method5670(arg1.anInt8105);
				@Pc(60) int local60 = local57.anInt3603;
				if (local60 == 1) {
					arg1.anInt8119 = 0;
					arg1.anInt8080 = 0;
					arg1.anInt8094 = arg0;
					arg1.anInt8049 = 1;
					arg1.anInt8063 = 0;
					if (!arg1.aBoolean583) {
						Static522.method7447(arg1, local57, arg1.anInt8063);
					}
				}
				if (local60 == 2) {
					arg1.anInt8119 = 0;
				}
			}
		}
		local14 = true;
		for (local16 = 0; local16 < arg2.length; local16++) {
			if (arg2[local16] != -1) {
				local14 = false;
			}
			if (arg1.anIntArray434 == null || arg1.anIntArray434[local16] == -1 || Static28.aClass220_1.method5670(arg2[local16]).anInt3613 >= Static28.aClass220_1.method5670(arg1.anIntArray434[local16]).anInt3613) {
				arg1.anIntArray434 = arg2;
				arg1.anInt8094 = arg0;
				break;
			}
		}
		if (local14) {
			arg1.anIntArray434 = arg2;
			arg1.anInt8094 = arg0;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method8613(@OriginalArg(0) byte[] arg0) {
		return Static287.method4822(0, arg0, arg0.length);
	}
}
