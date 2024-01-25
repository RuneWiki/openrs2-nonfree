import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)Z")
	public static boolean method4730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static335.method5420(arg0, arg1) & Static107.method2393(arg1, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)Lclient!fd;")
	public static Class98_Sub1 method4731() {
		Static288.anInt4208 = 0;
		return Static101.method2307();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLclient!tp;I)V")
	public static void method4732(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class331 arg1) {
		@Pc(15) int local15 = arg1.anInt9525 == 0 ? arg1.anInt9553 : arg1.anInt9525;
		@Pc(27) int local27 = arg1.anInt9575 == 0 ? arg1.anInt9505 : arg1.anInt9575;
		Static478.method7069(local15, local27, arg0, arg1.anInt9578, Static368.aClass331ArrayArray2[arg1.anInt9578 >> 16]);
		if (arg1.aClass331Array2 != null) {
			Static478.method7069(local15, local27, arg0, arg1.anInt9578, arg1.aClass331Array2);
		}
		@Pc(64) Class8_Sub51 local64 = (Class8_Sub51) Static218.aClass253_14.method6594((long) arg1.anInt9578);
		if (local64 != null) {
			Static209.method4021(local15, arg0, local64.anInt10454, local27);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(III)V")
	public static void method4733(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static498.method7246(arg0)) {
			Static126.method2800(arg1, Static368.aClass331ArrayArray2[arg0]);
		}
	}
}
