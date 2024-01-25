import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString211;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_140 = new Class90(4, 6);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z")
	public static boolean method7577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[ILclient!d;I)V")
	public static void method7578(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class21_Sub1_Sub1_Sub1_Sub1 arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg2.anIntArray205 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg2.anIntArray205.length; local8++) {
				if (arg2.anIntArray205[local8] != arg1[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg2.anInt4209 != -1) {
				@Pc(45) Class111 local45 = Static17.aClass254_1.method5936(arg2.anInt4209);
				@Pc(48) int local48 = local45.anInt3148;
				if (local48 == 1) {
					arg2.anInt4214 = arg0;
					arg2.anInt4272 = 0;
					arg2.anInt4252 = 0;
					arg2.anInt4257 = 1;
					arg2.anInt4197 = 0;
					if (!arg2.aBoolean295) {
						Static593.method8263(arg2.anInt4272, arg2, local45);
					}
				}
				if (local48 == 2) {
					arg2.anInt4197 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg2.anIntArray205 == null || arg2.anIntArray205[local8] == -1 || Static17.aClass254_1.method5936(arg1[local8]).anInt3152 >= Static17.aClass254_1.method5936(arg2.anIntArray205[local8]).anInt3152) {
				arg2.anIntArray205 = arg1;
				arg2.anInt4280 = arg2.anInt4277;
				arg2.anInt4214 = arg0;
			}
		}
		if (local6) {
			arg2.anIntArray205 = arg1;
			arg2.anInt4214 = arg0;
			arg2.anInt4280 = arg2.anInt4277;
		}
	}
}
