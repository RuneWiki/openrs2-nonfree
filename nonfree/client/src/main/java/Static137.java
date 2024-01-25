import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_50 = new Class180(4, 7);

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!wc;[II)V")
	public static void method2522(@OriginalArg(1) Class28_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) boolean local15;
		@Pc(17) int local17;
		if (arg0.lb != null) {
			local15 = true;
			for (local17 = 0; local17 < arg0.lb.length; local17++) {
				if (arg1[local17] != arg0.lb[local17]) {
					local15 = false;
					break;
				}
			}
			if (local15 && arg0.anInt10773 != -1) {
				@Pc(53) Class372 local53 = Static243.aClass343_3.method8356(arg0.anInt10773);
				@Pc(56) int local56 = local53.anInt10254;
				if (local56 == 1) {
					arg0.anInt10767 = 0;
					arg0.anInt10775 = arg2;
					arg0.anInt10758 = 0;
					arg0.anInt10804 = 1;
					arg0.anInt10750 = 0;
					if (!arg0.aBoolean819) {
						Static548.method7844(arg0, local53, arg0.anInt10750);
					}
				}
				if (local56 == 2) {
					arg0.anInt10767 = 0;
				}
			}
		}
		local15 = true;
		for (local17 = 0; local17 < arg1.length; local17++) {
			if (arg1[local17] != -1) {
				local15 = false;
			}
			if (arg0.lb == null || arg0.lb[local17] == -1 || Static243.aClass343_3.method8356(arg1[local17]).anInt10249 >= Static243.aClass343_3.method8356(arg0.lb[local17]).anInt10249) {
				arg0.lb = arg1;
				arg0.anInt10775 = arg2;
				break;
			}
		}
		if (local15) {
			arg0.anInt10775 = arg2;
			arg0.lb = arg1;
		}
	}
}
