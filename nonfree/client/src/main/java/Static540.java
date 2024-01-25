import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "[Lclient!qga;")
	public static Class299[] aClass299Array3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Ljava/lang/Class;")
	private static Class aClass47;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_219 = new Class251(69, 4);

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	public static final int anInt9207 = 1405;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBIII)I")
	public static int method7938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(15) int local15 = local7 < 8 ? arg3 : arg0;
		@Pc(43) int local43 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg1) : arg0;
		return ((local7 & 0x1) == 0 ? local15 : -local15) + ((local7 & 0x2) == 0 ? local43 : -local43);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z")
	public static boolean method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!sga;")
	public static Class118 method7941(@OriginalArg(1) Component arg0) {
		try {
			@Pc(34) Constructor local34 = Class.forName("fk").getDeclaredConstructor(aClass47 == null ? (aClass47 = Class322.a("java.awt.Component")) : aClass47, Boolean.TYPE);
			return (Class118) local34.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(52) Throwable local52) {
			return new Class118_Sub2(arg0, true);
		}
	}
}
