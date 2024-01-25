import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!vga", name = "J", descriptor = "I")
	public static int anInt10283;

	@OriginalMember(owner = "client!vga", name = "G", descriptor = "Lclient!el;")
	public static final Class109 aClass109_217 = new Class109(41, 7);

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V")
	public static void method8841() {
		for (@Pc(10) Class5_Sub5_Sub18 local10 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local10 != null; local10 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
			if (local10.anInt7610 > 1) {
				local10.anInt7610 = 0;
				Static488.aClass391_46.method9273(((Class5_Sub5_Sub19) local10.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66).aLong268, local10, 1);
				local10.aClass149_8.method2891();
			}
		}
		Static481.anInt8130 = 0;
		if (126 < 125) {
			return;
		}
		Static220.anInt3580 = 0;
		Static199.aClass102_63.method1932();
		Static595.aClass291_42.method6986(-99);
		Static86.aClass149_5.method2891();
		Static526.aBoolean669 = false;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method8844(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static302.aBoolean416) {
			try {
				@Pc(23) Class143 local23 = (Class143) Class.forName("in").getDeclaredConstructor().newInstance();
				local23.method3807(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static302.aBoolean416 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(IIB)Z")
	public static boolean method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
