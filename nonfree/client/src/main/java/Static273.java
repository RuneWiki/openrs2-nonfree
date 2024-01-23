import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!va", name = "u", descriptor = "Lclient!jd;")
	public static Class84 aClass84_117;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray115;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	public static int anInt5686;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString268 = "K";

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	public static void method4564() {
		Static44.anInterface2Array1 = null;
		Static132.method2294();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
	public static int method4566(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(29) int local29 = (local9 & 0x33333333) + (local9 >>> 2 & 0xB3333333);
		@Pc(37) int local37 = (local29 >>> 4) + local29 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)I")
	public static int method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Lclient!wm;")
	public static Class2_Sub26 method4568() {
		@Pc(4) Class2_Sub26 local4 = new Class2_Sub26(34);
		local4.method4239(11);
		local4.method4239(Static105.anInt2269);
		local4.method4239(Static124.aBoolean208 ? 1 : 0);
		local4.method4239(Static43.aBoolean77 ? 1 : 0);
		local4.method4239(Static106.aBoolean183 ? 1 : 0);
		local4.method4239(Static126.aBoolean211 ? 1 : 0);
		local4.method4239(Static150.aBoolean262 ? 1 : 0);
		local4.method4239(Static242.aBoolean414 ? 1 : 0);
		local4.method4239(Static96.aBoolean166 ? 1 : 0);
		local4.method4239(Static284.aBoolean475 ? 1 : 0);
		local4.method4239(Static195.anInt4041);
		local4.method4239(Static56.aBoolean96 ? 1 : 0);
		local4.method4239(Static233.aBoolean407 ? 1 : 0);
		local4.method4239(Static102.aBoolean176 ? 1 : 0);
		local4.method4239(Static84.anInt817);
		local4.method4239(Static183.aBoolean332 ? 1 : 0);
		local4.method4239(Static214.anInt4468);
		local4.method4239(Static91.anInt2030);
		local4.method4239(Static144.anInt3122);
		local4.method4231(Static163.anInt3419);
		local4.method4231(Static267.anInt4121);
		local4.method4239(Static179.method3104());
		local4.method4260(Static225.anInt4698);
		local4.method4239(Static2.anInt5946);
		local4.method4239(Static133.aBoolean220 ? 1 : 0);
		local4.method4239(Static236.aBoolean408 ? 1 : 0);
		local4.method4239(Static171.anInt3648);
		local4.method4239(Static97.aBoolean169 ? 1 : 0);
		local4.method4239(Static246.aBoolean422 ? 1 : 0);
		return local4;
	}
}
