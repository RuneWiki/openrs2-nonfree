import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!la", name = "R", descriptor = "I")
	public static int anInt3477;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "Lclient!kb;")
	public static Class83 aClass83_107;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "I")
	public static int anInt3480;

	@OriginalMember(owner = "client!la", name = "X", descriptor = "I")
	public static int anInt3482;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)I")
	public static int method2766(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!kb;Lclient!nf;Lclient!kb;I)V")
	public static void method2767(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class83 arg2) {
		Static251.aClass83_173 = arg2;
		Static298.aClass83_204 = arg0;
		Static157.anInterface4_1 = arg1;
		if (Static251.aClass83_173 != null) {
			Static170.anInt6011 = Static251.aClass83_173.method2317(1);
		}
		if (Static298.aClass83_204 != null) {
			Static205.anInt4560 = Static298.aClass83_204.method2317(1);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	public static void method2768(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1 local5 = Static99.aClass117_7.method3441(); local5 != null; local5 = Static99.aClass117_7.method3444()) {
			if ((long) arg0 == (local5.aLong201 >> 48 & 0xFFFFL)) {
				local5.method4742();
			}
		}
	}
}
