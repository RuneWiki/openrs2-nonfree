import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	public static int anInt9234;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "Lclient!ha;")
	public static Class95 aClass95_14;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "Lclient!pf;")
	public static final Class266 aClass266_4 = new Class266();

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "Lclient!kea;")
	public static final Class188 aClass188_13 = new Class188(3);

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
	public static int anInt9254 = -1;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)I")
	public static int method7760() {
		return Static396.anInt6228;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII)Lclient!bi;")
	public static Class2_Sub2_Sub4 method7763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub2_Sub4 local15 = (Class2_Sub2_Sub4) Static358.aClass118_34.method2595((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class2_Sub2_Sub4(arg1, arg0);
			Static358.aClass118_34.method2601(local15, local15.aLong280);
		}
		return local15;
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V")
	public static void method7765() {
		if (Static324.anInt5145 == 3) {
			Static158.method2370(4);
		} else if (Static324.anInt5145 == 7) {
			Static158.method2370(8);
		} else if (Static324.anInt5145 == 10) {
			Static158.method2370(11);
			return;
		}
	}
}
