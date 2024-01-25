import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!tq;")
	public static Class191 aClass191_182;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public static int anInt5657;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int anInt5654 = 0;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!fk;")
	public static final Class67 aClass67_8 = new Class67();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method5040() {
		Static345.aClass119_21.method3312();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I")
	public static int method5041() {
		return 6;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!li;")
	public static Class120 method5042(@OriginalArg(1) int arg0) {
		@Pc(12) Class120 local12 = (Class120) Static47.aClass119_29.method3311((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static255.aClass191_165.method5459(36, arg0);
		local12 = new Class120();
		local12.anInt3635 = arg0;
		if (local22 != null) {
			local12.method3333(new Class2_Sub10(local22));
		}
		local12.method3331();
		Static47.aClass119_29.method3308(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!aq;IIIB)V")
	public static void method5044(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg2 << 14 | arg1 << 28);
		@Pc(22) Class2_Sub1 local22 = (Class2_Sub1) Static136.aClass199_12.method5751(local16);
		if (local22 == null) {
			local22 = new Class2_Sub1();
			Static136.aClass199_12.method5749(local22, local16);
			local22.aClass216_1.method5995(arg0);
			return;
		}
		@Pc(48) Class208 local48 = Static282.method5080(arg0.anInt379);
		@Pc(55) int local55 = local48.anInt6802;
		if (local48.anInt6792 == 1) {
			local55 *= arg0.anInt380 + 1;
		}
		for (@Pc(74) Class2_Sub4 local74 = (Class2_Sub4) local22.aClass216_1.method5992(); local74 != null; local74 = (Class2_Sub4) local22.aClass216_1.method6000()) {
			local48 = Static282.method5080(local74.anInt379);
			@Pc(86) int local86 = local48.anInt6802;
			if (local48.anInt6792 == 1) {
				local86 *= local74.anInt380 + 1;
			}
			if (local55 > local86) {
				Static147.method418(arg0, local74);
				return;
			}
		}
		local22.aClass216_1.method5995(arg0);
	}
}
