import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_76 = new Class218(51, 6);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIIII)V")
	public static void method5202(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) Static159.aClass375_4.method8638(); local15 != null; local15 = (Class2_Sub1) Static159.aClass375_4.method8635()) {
			if (local15.anInt15 <= Static251.anInt5580) {
				local15.method8558();
			} else {
				Static299.method7331(arg2 >> 1, local15.anInt20 * 2, (local15.anInt23 << 9) + 256, local15.anInt16, (local15.anInt18 << 9) + 256, arg0 >> 1);
				Static16.aClass25_1.method5843(Static379.anIntArray437[1] + arg1, 0, local15.anInt17 | 0xFF000000, local15.aString1, Static379.anIntArray437[0] + arg3);
			}
		}
	}
}
