import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
	public static int anInt5226 = -1;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_54 = new Class269(75, 8);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4373(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZZ)V")
	public static void method4375(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static246.anInt9828;
		@Pc(11) int local11 = Static579.anInt9538;
		if (arg0 && Static172.aBoolean322) {
			local5 <<= 0x1;
			local11 = -local5;
		}
		Static600.aClass87_15.f(local11, local5);
	}
}
