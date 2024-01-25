import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "Lclient!og;")
	public static final Class266 aClass266_4 = new Class266();

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_14 = new Class171(69, -2);

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "[I")
	public static final int[] anIntArray75 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)Z")
	public static boolean method1221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method1223() {
		for (@Pc(14) Class3_Sub15 local14 = (Class3_Sub15) Static484.aClass333_30.method7490(); local14 != null; local14 = (Class3_Sub15) Static484.aClass333_30.method7487()) {
			if (local14.aClass207_Sub1_1.method8469()) {
				Static344.method5009(local14.anInt2738);
			} else {
				local14.aClass207_Sub1_1.method8478();
				try {
					local14.aClass207_Sub1_1.method8461();
				} catch (@Pc(37) Exception local37) {
					Static456.method6140("TV: " + local14.anInt2738, local37);
					Static344.method5009(local14.anInt2738);
				}
				if (!local14.aBoolean206 && !local14.aBoolean204) {
					@Pc(63) Class3_Sub14_Sub2 local63 = local14.aClass207_Sub1_1.method8474();
					if (local63 != null) {
						@Pc(69) Class3_Sub12_Sub5 local69 = local63.method3086();
						if (local69 != null) {
							local69.method8959(local14.anInt2737);
							Static156.aClass3_Sub12_Sub1_1.method1765(local69);
							local14.aBoolean206 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!fq;Z[[[BIB)Z")
	public static boolean method1226(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static75.aBoolean105) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9614 >> Static571.anInt9216;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt9619 >> Static571.anInt9216;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class34_Sub1_Sub1) {
			local10 = ((Class34_Sub1_Sub1) arg0).aShort97;
			local17 = ((Class34_Sub1_Sub1) arg0).aShort96;
			local8 = ((Class34_Sub1_Sub1) arg0).aShort98;
			local15 = ((Class34_Sub1_Sub1) arg0).aShort99;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte131 < Static247.anInt4367 && local38 >= Static72.anInt1420 && local38 < Static196.anInt3541 && local41 >= Static608.anInt10133 && local41 < Static120.anInt2148) {
					if ((arg2 == null || arg0.aByte132 < arg3 || arg2[arg0.aByte132][local38][local41] != arg4) && arg0.method7836() && !arg0.method7852(Static50.aClass95_1)) {
						return false;
					}
					if (!arg1 && local38 >= Static88.anInt1826 - 16 && local38 <= Static88.anInt1826 + 16 && local41 >= Static353.anInt6041 - 16 && local41 <= Static353.anInt6041 + 16) {
						if (Static626.aBoolean718) {
							Static304.aClass283Array1[Static23.anInt558++].method6203(arg0);
							Static23.anInt558 %= Static356.anInt6077;
						} else {
							arg0.method7849(Static50.aClass95_1);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Z")
	public static boolean method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
