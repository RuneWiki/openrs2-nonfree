import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)Z")
	public static boolean method1999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class68 local10 = Static259.method3899(arg2, arg0);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray15 != null) {
			@Pc(20) Class2_Sub30 local20 = new Class2_Sub30();
			local20.aString49 = arg1;
			local20.anObjectArray35 = local10.anObjectArray15;
			local20.aClass68_12 = local10;
			local20.anInt5108 = arg3;
			Static168.method2731(local20);
		}
		@Pc(37) boolean local37 = true;
		if (local10.anInt2236 != 0) {
			local37 = Static372.method2353(local10);
		}
		if (!local37 || !Static47.method787(local10).method5399(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static159.method2586(Static85.aClass54_28);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 2) {
			Static159.method2586(Static1.aClass54_18);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 3) {
			Static159.method2586(Static144.aClass54_45);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 4) {
			Static159.method2586(Static127.aClass54_41);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 5) {
			Static159.method2586(Static422.aClass54_102);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 6) {
			Static159.method2586(Static165.aClass54_48);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 7) {
			Static159.method2586(Static277.aClass54_70);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 8) {
			Static159.method2586(Static150.aClass54_59);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 9) {
			Static159.method2586(Static321.aClass54_78);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
		if (arg3 == 10) {
			Static159.method2586(Static212.aClass54_58);
			Static268.method4010(local10.anInt2208, arg0, arg2);
		}
	}
}
