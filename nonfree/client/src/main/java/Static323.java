import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!va", name = "z", descriptor = "Lclient!v;")
	public static Class203 aClass203_11;

	@OriginalMember(owner = "client!va", name = "B", descriptor = "I")
	public static int anInt6731;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_110 = new Class37(64);

	@OriginalMember(owner = "client!va", name = "u", descriptor = "Ljava/lang/String;")
	public static final String aString273 = "purple:";

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	public static int anInt6730 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
	public static void method5830() {
		Static25.aClass37_11.method920(5);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!lm;)V")
	public static void method5832(@OriginalArg(1) Class134 arg0) {
		Static166.aClass134_75 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public static void method5833(@OriginalArg(1) int arg0) {
		Static147.anInt3048 = arg0;
		@Pc(11) Class37 local11 = Static239.aClass37_46;
		synchronized (Static239.aClass37_46) {
			Static239.aClass37_46.method919();
		}
	}
}
