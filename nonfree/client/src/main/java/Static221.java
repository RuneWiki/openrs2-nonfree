import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!l", name = "s", descriptor = "I")
	public static int anInt7650;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!hh;")
	public static Class109 aClass109_98;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	public static int anInt7649 = 1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5879(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	public static int method5880(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Z")
	public static boolean method5881() {
		if (Static189.aBoolean273) {
			try {
				Static455.method622("showVideoAd", Static403.aClass42_6.anApplet1);
				return true;
			} catch (@Pc(16) Throwable local16) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public static void method5883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static131.aClass137ArrayArrayArray2[0][arg1][arg2] != null && Static131.aClass137ArrayArrayArray2[0][arg1][arg2].aClass137_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static131.aClass137ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class137 local46 = Static131.aClass137ArrayArrayArray2[local22][arg1][arg2] = new Class137(local22, arg1, arg2);
				if (local20) {
					local46.aByte44++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZII)V")
	public static void method5884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static327.aClass230_Sub1_1.anInt7298 != 0 && arg2 != 0 && Static381.anInt436 < 50 && arg1 != -1) {
			Static426.aClass239Array1[Static381.anInt436++] = new Class239((byte) 2, arg1, arg2, arg0, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ti;)Lclient!jq;")
	public static Class1_Sub2 method5885(@OriginalArg(1) Class1_Sub14 arg0) {
		arg0.method4548();
		@Pc(18) int local18 = arg0.method4548();
		@Pc(22) Class1_Sub2 local22 = Static193.method3490(local18);
		local22.anInt7615 = arg0.method4548();
		@Pc(31) int local31 = arg0.method4548();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method4548();
			local22.method5863(arg0, local39);
		}
		local22.method5864();
		return local22;
	}
}
