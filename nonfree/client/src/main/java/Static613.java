import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!via", name = "j", descriptor = "I")
	public static int anInt10082;

	@OriginalMember(owner = "client!via", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!via", name = "r", descriptor = "Lclient!ha;")
	public static Class13 aClass13_82;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II)I")
	public static int method8565(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(24) int local24 = local10 | local10 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
	public static void method8566() {
		for (@Pc(15) Class2_Sub52 local15 = (Class2_Sub52) Static560.aClass323_36.method7480(); local15 != null; local15 = (Class2_Sub52) Static560.aClass323_36.method7482()) {
			if (local15.aClass161_Sub1_1.method3855()) {
				Static141.method2564(local15.anInt10449);
			} else {
				local15.aClass161_Sub1_1.method3868();
				try {
					local15.aClass161_Sub1_1.method3863();
				} catch (@Pc(38) Exception local38) {
					Static25.method7457(local38, "TV: " + local15.anInt10449);
					Static141.method2564(local15.anInt10449);
				}
				if (!local15.aBoolean760 && !local15.aBoolean759) {
					@Pc(64) Class2_Sub20_Sub3 local64 = local15.aClass161_Sub1_1.method3861();
					if (local64 != null) {
						@Pc(70) Class2_Sub11_Sub3 local70 = local64.method5079();
						if (local70 != null) {
							local70.method3292(local15.anInt10448);
							Static622.aClass2_Sub11_Sub2_2.method2952(local70);
							local15.aBoolean760 = true;
						}
					}
				}
			}
		}
	}
}
