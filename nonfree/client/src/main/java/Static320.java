import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
	public static int anInt5956;

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
	public static int anInt5959;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_15 = new Class201(0, 8);

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_14 = new Class387(15, 0, 1, 0);

	@OriginalMember(owner = "client!kt", name = "G", descriptor = "[Lclient!fr;")
	public static final Class131[] aClass131Array1 = new Class131[100];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)V")
	public static void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static577.anInt9150 = arg0 - Static574.anInt8361;
		Static296.anInt8194 = arg1 - Static574.anInt8366;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method5019(@OriginalArg(1) Class208 arg0) {
		if (arg0.anInt5659 != Static631.anInt9337) {
			return;
		}
		if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34 == null) {
			arg0.anInt5636 = 0;
			arg0.anInt5603 = 0;
			return;
		}
		arg0.anInt5614 = 150;
		arg0.anInt5679 = (int) (Math.sin((double) Static621.anInt9665 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt5636 = Static251.anInt4687;
		arg0.anInt5599 = 5;
		arg0.anInt5603 = Static104.method2037(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34);
		arg0.anInt5656 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10183;
		arg0.anInt5591 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10177;
		arg0.anInt5596 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10148;
		arg0.anInt5655 = 0;
		@Pc(80) Class48 local80 = arg0.anInt5596 == -1 ? null : Static483.aClass373_2.method8323(arg0.anInt5596);
		if (local80 != null) {
			Static4.method46(local80, arg0.anInt5656);
		}
	}
}
