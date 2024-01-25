import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	public static boolean aBoolean464 = false;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!ew;")
	public static final Class72 aClass72_40 = new Class72(8);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLclient!at;I)V")
	public static void method5068(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1) {
		@Pc(12) int local12 = arg1.anInt321 == 0 ? arg1.anInt294 : arg1.anInt321;
		@Pc(22) int local22 = arg1.anInt319 == 0 ? arg1.anInt285 : arg1.anInt319;
		Static457.method5721(local12, local22, arg1.anInt293, arg0, Static151.aClass16ArrayArray1[arg1.anInt293 >> 16]);
		if (arg1.aClass16Array1 != null) {
			Static457.method5721(local12, local22, arg1.anInt293, arg0, arg1.aClass16Array1);
		}
		@Pc(55) Class2_Sub21 local55 = (Class2_Sub21) Static418.aClass72_44.method1659((long) arg1.anInt293);
		if (local55 != null) {
			Static235.method3046(local12, local55.anInt2585, local22, arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!at;)Lclient!at;")
	public static Class16 method5069(@OriginalArg(1) Class16 arg0) {
		if (arg0.anInt324 != -1) {
			return Static338.method4534(arg0.anInt324);
		}
		@Pc(22) int local22 = arg0.anInt293 >>> 16;
		@Pc(27) Class18 local27 = new Class18(Static418.aClass72_44);
		for (@Pc(37) Class2_Sub21 local37 = (Class2_Sub21) local27.method266(); local37 != null; local37 = (Class2_Sub21) local27.method269()) {
			if (local37.anInt2585 == local22) {
				return Static338.method4534((int) local37.aLong225);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIIIZII[B)V")
	public static void method5071(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(22) int local22 = -arg3; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg0++;
				arg7[local30] += arg1[arg2++];
				@Pc(42) int local42 = arg0++;
				arg7[local42] += arg1[arg2++];
				@Pc(54) int local54 = arg0++;
				arg7[local54] += arg1[arg2++];
				@Pc(66) int local66 = arg0++;
				arg7[local66] += arg1[arg2++];
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local30 = arg0++;
				arg7[local30] += arg1[arg2++];
			}
			arg2 += arg5;
			arg0 += arg4;
		}
	}
}
