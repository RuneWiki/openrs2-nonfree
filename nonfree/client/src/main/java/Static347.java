import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "Lclient!jf;")
	public static Class96 aClass96_21;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	public static int anInt6471;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
	public static int anInt6472;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "Lclient!ra;")
	public static Class170 aClass170_122;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIIIILclient!mj;IILclient!en;I)Lclient!mj;")
	public static Class101 method5721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class101 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class59 arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class101 local12 = (Class101) Static131.aClass66_45.method1939(local6);
		if (local12 == null) {
			@Pc(30) Class150 local30 = Static17.method5326(arg0, Static276.aClass170_91);
			if (local30 == null) {
				return null;
			}
			local12 = arg8.method4804(local30, 1031, Static156.anInt3125, 64, 768);
			Static131.aClass66_45.method1936(local6, local12);
		}
		local12 = local12.method5184((byte) 2, 1031, true);
		if (arg7 != 0) {
			local12.method5177(arg7);
		}
		if (arg6 != 0) {
			local12.method5144(arg6);
		}
		if (arg2 != 0) {
			local12.method5186(arg2);
		}
		if (arg9 != 0) {
			local12.method5194(0, arg9, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)V")
	public static void method5723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class5_Sub9_Sub16 local10 = Static239.method4052(1, arg0);
		local10.method4140();
		local10.anInt4723 = arg1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB[B)I")
	public static int method5724(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static63.method1317(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	public static void method5726() {
		if (Static195.aBoolean270) {
			return;
		}
		Static255.aBoolean381 = true;
		Static195.aBoolean270 = true;
		if (Static139.aBoolean462) {
			Static155.aFloat64 = (int) Static155.aFloat64 + 191 & 0xFFFFFF80;
		} else {
			Static183.aFloat46 += (24.0F - Static183.aFloat46) / 2.0F;
		}
	}
}
