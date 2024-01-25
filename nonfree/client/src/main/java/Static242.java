import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jfa", name = "Eb", descriptor = "I")
	public static int anInt5064 = 0;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!fd;)Lclient!nl;")
	public static Class43_Sub3 method4279(@OriginalArg(1) Class3_Sub7 arg0) {
		return new Class43_Sub3(arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6506(), arg0.method6538());
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!cp;III)V")
	public static void method4280(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static272.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt8057 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass3_Sub28Array6[arg0.anInt8057++] = Static464.aClass212Array1[local21 - 1].aClass3_Sub28_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt8057; local21 < 4; local21++) {
			arg0.aClass3_Sub28Array6[local21] = null;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!gda;")
	public static Class116 method4281(@OriginalArg(0) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class116_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class116) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class116_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIB)V")
	public static void method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class3_Sub4_Sub6 local10 = Static367.method6025(11, arg2);
		local10.method1898();
		local10.anInt1946 = arg0;
		local10.anInt1945 = arg1;
	}
}
