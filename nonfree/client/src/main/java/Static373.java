import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
	public static int anInt6340 = 0;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_14 = new Class187(12, 2);

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "[I")
	public static final int[] anIntArray506 = new int[3];

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
	public static boolean method5516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!saa;B)I")
	public static int method5518(@OriginalArg(0) Class3_Sub44 arg0) {
		@Pc(12) String local12 = Static581.method7689(arg0);
		@Pc(14) int[] local14 = null;
		if (Static336.method5142(arg0.anInt7685)) {
			local14 = Static517.aClass145_1.method3798((int) arg0.aLong219).anIntArray646;
		} else if (arg0.anInt7688 != -1) {
			local14 = Static517.aClass145_1.method3798(arg0.anInt7688).anIntArray646;
		} else if (Static505.method2637(arg0.anInt7685)) {
			@Pc(83) Class3_Sub39 local83 = (Class3_Sub39) Static243.aClass310_16.method6601((long) arg0.aLong219);
			if (local83 != null) {
				@Pc(88) Class9_Sub1_Sub1_Sub2_Sub1 local88 = local83.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				@Pc(91) Class294 local91 = local88.aClass294_1;
				if (local91.anIntArray588 != null) {
					local91 = local91.method6429(Static427.aClass56_1);
				}
				if (local91 != null) {
					local14 = local91.lb;
				}
			}
		} else if (Static377.method5578(arg0.anInt7685)) {
			@Pc(52) Class23 local52;
			if (arg0.anInt7685 == 1001) {
				local52 = Static476.aClass69_5.method2181((int) arg0.aLong219);
			} else {
				local52 = Static476.aClass69_5.method2181((int) (arg0.aLong219 >>> 32 & 0x7FFFFFFFL));
			}
			if (local52.anIntArray78 != null) {
				local52 = local52.method587(Static427.aClass56_1);
			}
			if (local52 != null) {
				local14 = local52.anIntArray79;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static480.method6570(local14);
		}
		@Pc(142) int local142 = Static159.aClass58_7.method1776(local12, Static187.aClass46Array6);
		if (arg0.aBoolean607) {
			local142 += Static569.aClass46_33.E() + 4;
		}
		return local142;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)Lclient!ja;")
	public static Class158 method5520(@OriginalArg(0) int arg0) {
		@Pc(8) Class158[] local8 = Static203.method3660();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt4461) {
				return local8[local10];
			}
		}
		return null;
	}
}
