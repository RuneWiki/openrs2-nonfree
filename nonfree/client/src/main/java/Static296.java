import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	public static int anInt4855;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Z")
	public static boolean aBoolean353 = false;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_168 = new Class288(78, 6);

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "[Lclient!bc;")
	public static final Class25[] aClass25Array1 = new Class25[100];

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
	public static void method4089(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static147.anInt2652;
		@Pc(11) int local11 = Static309.anInt4985;
		if (arg0 && Static449.aBoolean538) {
			local5 <<= 0x1;
			local11 = -local5;
		}
		Static192.aClass95_4.f(local11, local5);
	}
}
