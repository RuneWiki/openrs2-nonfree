import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "I", descriptor = "I")
	public static int anInt194;

	@OriginalMember(owner = "client!af", name = "N", descriptor = "I")
	public static int anInt197 = 0;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
	public static int anInt200 = 0;

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_1 = new Class87(500);

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
	public static int anInt208 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lclient!dj;")
	public static Class1_Sub4_Sub8 method190(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub4_Sub8 local15 = (Class1_Sub4_Sub8) Static96.aClass92_9.method2606((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static356.aClass216_99.method5648(Static126.method2613(arg0), Static23.method658(arg0));
		local15 = new Class1_Sub4_Sub8();
		if (local29 != null) {
			local15.method1432(new Class1_Sub8(local29));
		}
		Static96.aClass92_9.method2601((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BII)I")
	public static int method192(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static239.method4369(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)I")
	public static int method195(@OriginalArg(1) int arg0) {
		@Pc(12) Class116 local12 = Static102.method2118(arg0);
		@Pc(15) int local15 = local12.anInt3530;
		@Pc(18) int local18 = local12.anInt3529;
		@Pc(21) int local21 = local12.anInt3531;
		@Pc(27) int local27 = Class1_Sub25.anIntArray365[local21 - local18];
		return Static30.anIntArray104[local15] >> local18 & local27;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!aq;III)V")
	public static void method196(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte4 == 0) {
			arg0.anInt423 = arg0.anInt464;
		} else if (arg0.aByte4 == 1) {
			arg0.anInt423 = arg0.anInt464 + (arg1 - arg0.lb) / 2;
		} else if (arg0.aByte4 == 2) {
			arg0.anInt423 = arg1 - arg0.lb - arg0.anInt464;
		} else if (arg0.aByte4 == 3) {
			arg0.anInt423 = arg0.anInt464 * arg1 >> 14;
		} else if (arg0.aByte4 == 4) {
			arg0.anInt423 = (arg1 - arg0.lb) / 2 + (arg1 * arg0.anInt464 >> 14);
		} else {
			arg0.anInt423 = arg1 - arg0.lb - (arg0.anInt464 * arg1 >> 14);
		}
		if (arg0.aByte5 == 0) {
			arg0.anInt447 = arg0.anInt414;
		} else if (arg0.aByte5 == 1) {
			arg0.anInt447 = arg0.anInt414 + (arg2 - arg0.anInt446) / 2;
		} else if (arg0.aByte5 == 2) {
			arg0.anInt447 = arg2 - arg0.anInt414 - arg0.anInt446;
		} else if (arg0.aByte5 == 3) {
			arg0.anInt447 = arg2 * arg0.anInt414 >> 14;
		} else if (arg0.aByte5 == 4) {
			arg0.anInt447 = (arg0.anInt414 * arg2 >> 14) + (arg2 - arg0.anInt446) / 2;
		} else {
			arg0.anInt447 = arg2 - (arg0.anInt414 * arg2 >> 14) - arg0.anInt446;
		}
		if (!Static185.aBoolean369) {
			return;
		}
		if (Static44.method1023(arg0).anInt6683 == 0 && arg0.anInt416 != 0) {
			return;
		}
		if (arg0.anInt447 < 0) {
			arg0.anInt447 = 0;
		} else if (arg0.anInt447 + arg0.anInt446 > arg2) {
			arg0.anInt447 = arg2 - arg0.anInt446;
		}
		if (arg0.anInt423 < 0) {
			arg0.anInt423 = 0;
			return;
		}
		if (arg1 < arg0.anInt423 + arg0.lb) {
			arg0.anInt423 = arg1 - arg0.lb;
			return;
		}
	}
}
