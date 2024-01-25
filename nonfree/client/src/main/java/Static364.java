import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!ik;")
	public static Class182 aClass182_78;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method5039(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(15) int local15 = arg2.indexOf(arg0); local15 != -1; local15 = arg2.indexOf(arg0, arg1.length() + local15)) {
			arg2 = arg2.substring(0, local15) + arg1 + arg2.substring(arg0.length() + local15);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBILclient!kt;)V")
	public static void method5040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub1_Sub1_Sub2 arg3) {
		@Pc(20) Class226 local20 = arg3.method7489();
		@Pc(23) Class45 local23 = arg3.aClass45_9;
		@Pc(33) int local33 = arg3.anInt8803 - arg3.aClass365_7.anInt9846 & 0x3FFF;
		if (arg2 == -1) {
			if (local33 == 0 && arg3.anInt8809 <= 25) {
				if (!arg3.aBoolean593 || !local20.method5090(local23.method6577())) {
					local23.method6576(local20.method5088());
					arg3.aBoolean593 = local23.method6572();
				}
			} else if (arg0 < 0 && local20.anInt5783 != -1) {
				local23.method6576(local20.anInt5783);
				arg3.aBoolean593 = false;
			} else if (arg0 > 0 && local20.anInt5807 != -1) {
				local23.method6576(local20.anInt5807);
				arg3.aBoolean593 = false;
			} else if (!arg3.aBoolean593 || !local20.method5090(local23.method6577())) {
				local23.method6576(local20.method5088());
				arg3.aBoolean593 = arg3.aClass45_9.method6572();
			}
		} else if (arg3.anInt8767 != -1 && (local33 >= 10240 || local33 <= 2048)) {
			@Pc(428) int local428 = Static373.anIntArray175[arg1] - arg3.aClass365_7.anInt9846 & 0x3FFF;
			if (arg2 == 2 && local20.anInt5787 != -1) {
				if (local428 > 2048 && local428 <= 6144 && local20.anInt5815 != -1) {
					local23.method6576(local20.anInt5815);
				} else if (local428 >= 10240 && local428 < 14336 && local20.anInt5780 != -1) {
					local23.method6576(local20.anInt5780);
				} else if (local428 <= 6144 || local428 >= 10240 || local20.anInt5819 == -1) {
					local23.method6576(local20.anInt5787);
				} else {
					local23.method6576(local20.anInt5819);
				}
			} else if (arg2 == 0 && local20.anInt5793 != -1) {
				if (local428 > 2048 && local428 <= 6144 && local20.anInt5802 != -1) {
					local23.method6576(local20.anInt5802);
				} else if (local428 >= 10240 && local428 < 14336 && local20.anInt5800 != -1) {
					local23.method6576(local20.anInt5800);
				} else if (local428 <= 6144 || local428 >= 10240 || local20.anInt5812 == -1) {
					local23.method6576(local20.anInt5793);
				} else {
					local23.method6576(local20.anInt5812);
				}
			} else if (local428 > 2048 && local428 <= 6144 && local20.anInt5810 != -1) {
				local23.method6576(local20.anInt5810);
			} else if (local428 >= 10240 && local428 < 14336 && local20.anInt5786 != -1) {
				local23.method6576(local20.anInt5786);
			} else if (local428 <= 6144 || local428 >= 10240 || local20.anInt5782 == -1) {
				local23.method6576(local20.anInt5816);
			} else {
				local23.method6576(local20.anInt5782);
			}
			arg3.aBoolean593 = false;
		} else if (local33 == 0 && arg3.anInt8809 <= 25) {
			if (arg2 == 2 && local20.anInt5787 != -1) {
				local23.method6576(local20.anInt5787);
			} else if (arg2 == 0 && local20.anInt5793 != -1) {
				local23.method6576(local20.anInt5793);
			} else {
				local23.method6576(local20.anInt5816);
			}
			arg3.aBoolean593 = false;
		} else {
			if (arg2 == 2 && local20.anInt5787 != -1) {
				if (arg0 < 0 && local20.anInt5779 != -1) {
					local23.method6576(local20.anInt5779);
				} else if (arg0 <= 0 || local20.anInt5797 == -1) {
					local23.method6576(local20.anInt5787);
				} else {
					local23.method6576(local20.anInt5797);
				}
			} else if (arg2 == 0 && local20.anInt5793 != -1) {
				if (arg0 < 0 && local20.anInt5817 != -1) {
					local23.method6576(local20.anInt5817);
				} else if (arg0 <= 0 || local20.anInt5792 == -1) {
					local23.method6576(local20.anInt5793);
				} else {
					local23.method6576(local20.anInt5792);
				}
			} else if (arg0 < 0 && local20.anInt5799 != -1) {
				local23.method6576(local20.anInt5799);
			} else if (arg0 <= 0 || local20.anInt5776 == -1) {
				local23.method6576(local20.anInt5816);
			} else {
				local23.method6576(local20.anInt5776);
			}
			arg3.aBoolean593 = false;
		}
	}
}
