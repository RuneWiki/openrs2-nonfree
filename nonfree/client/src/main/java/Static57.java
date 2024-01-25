import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "Lclient!nl;")
	public static Class171 aClass171_48;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_79 = new Class205(50, -1);

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!fg;")
	public static Class69 method3257(@OriginalArg(0) Component arg0) {
		return new Class69_Sub1(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!bn;Lclient!nl;Lclient!nl;)V")
	public static void method3258(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) Class171 arg2) {
		Static331.aClass171_86 = arg1;
		Static212.anInterface1_1 = arg0;
		Static265.aClass171_66 = arg2;
		if (Static265.aClass171_66 != null) {
			Static65.anInt4695 = Static265.aClass171_66.method3750(1);
		}
		if (Static331.aClass171_86 != null) {
			Static18.anInt425 = Static331.aClass171_86.method3750(1);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)Z")
	public static boolean method3259(@OriginalArg(1) int arg0) {
		return arg0 == 13 || arg0 == 47 || arg0 == 1002 || arg0 == 2 || arg0 == 59;
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
	public static void method3260() {
		for (@Pc(15) Class10_Sub1 local15 = (Class10_Sub1) Static71.aClass154_2.method3479(); local15 != null; local15 = (Class10_Sub1) Static71.aClass154_2.method3483()) {
			local15.method230();
		}
	}
}
