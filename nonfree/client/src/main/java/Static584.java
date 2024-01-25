import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!le;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_62 = new Class244();

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Lclient!n;")
	public static Class225 aClass225_51 = null;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIB)Z")
	public static boolean method8298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([[[Lclient!cq;I)V")
	public static void method8300(@OriginalArg(0) Class53[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class53[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class53 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass1_Sub4_Sub4_1 instanceof Interface19) {
							((Interface19) local23.aClass1_Sub4_Sub4_1).method7828();
						}
						if (local23.aClass1_Sub4_Sub1_2 instanceof Interface19) {
							((Interface19) local23.aClass1_Sub4_Sub1_2).method7828();
						}
						if (local23.aClass1_Sub4_Sub1_1 instanceof Interface19) {
							((Interface19) local23.aClass1_Sub4_Sub1_1).method7828();
						}
						if (local23.aClass1_Sub4_Sub5_2 instanceof Interface19) {
							((Interface19) local23.aClass1_Sub4_Sub5_2).method7828();
						}
						if (local23.aClass1_Sub4_Sub5_1 instanceof Interface19) {
							((Interface19) local23.aClass1_Sub4_Sub5_1).method7828();
						}
						for (@Pc(73) Class289 local73 = local23.aClass289_1; local73 != null; local73 = local73.aClass289_3) {
							@Pc(78) Class1_Sub4_Sub2 local78 = local73.aClass1_Sub4_Sub2_1;
							if (local78 instanceof Interface19) {
								((Interface19) local78).method7828();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public static void method8301() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static594.anInt10250 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}
}
