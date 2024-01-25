import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
	public static int anInt6823;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Lclient!vd;")
	public static final Class335 aClass335_3 = new Class335("stellardawn", 1);

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public static int anInt6829 = 0;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Lclient!nv;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IZ)V")
	public static void method5689(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static25.anInt779 != -1) {
				Static595.method8405(Static25.anInt779);
			}
			for (@Pc(13) Class3_Sub18 local13 = (Class3_Sub18) Static283.aClass25_23.method949(); local13 != null; local13 = (Class3_Sub18) Static283.aClass25_23.method947()) {
				if (!local13.method8414()) {
					local13 = (Class3_Sub18) Static283.aClass25_23.method949();
					if (local13 == null) {
						break;
					}
				}
				Static146.method8079(false, true, local13);
			}
			Static25.anInt779 = -1;
			Static283.aClass25_23 = new Class25(8);
			Static174.method3122();
			Static25.anInt779 = Static25.anInt773;
			Static48.method1238(false);
			Static210.method3686();
			Static597.method8428(Static25.anInt779);
		}
		Static452.aBoolean253 = true;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V")
	public static void method5690(@OriginalArg(1) int arg0) {
		if (Static178.anInt3592 == 0) {
			Static547.aClass3_Sub14_Sub4_3.method7830(arg0);
		} else {
			Static274.anInt5814 = arg0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Z")
	public static boolean method5691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I")
	public static int method5692(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	public static void method5693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(8, arg1);
		local8.method1898();
		local8.anInt1946 = arg0;
		local8.anInt1945 = arg3;
		local8.anInt1951 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)V")
	public static void method5694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 + 1;
		Static426.method6794(arg1, Static333.anIntArrayArray56[arg0], arg2, arg4);
		@Pc(17) int local17 = arg3 - 1;
		Static426.method6794(arg1, Static333.anIntArrayArray56[arg3], arg2, arg4);
		for (@Pc(23) int local23 = local8; local23 <= local17; local23++) {
			@Pc(33) int[] local33 = Static333.anIntArrayArray56[local23];
			local33[arg2] = local33[arg1] = arg4;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!ut;II)J")
	public static long method5695(@OriginalArg(0) int arg0, @OriginalArg(1) Interface22 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class292 local16 = Static253.aClass146_2.method3356(arg1.method8398());
		@Pc(37) long local37 = (long) (arg1.method8399() << 14 | arg0 << 7 | arg2 | arg1.method8402() << 20 | 0x40000000);
		if (local16.anInt8778 == 0) {
			local37 |= local9;
		}
		if (local16.anInt8760 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean728) {
			local37 |= local7;
		}
		return local37 | (long) arg1.method8398() << 32;
	}
}
