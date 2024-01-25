import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!po", name = "h", descriptor = "I")
	public static int anInt7458;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_62 = new Class181(71, 8);

	@OriginalMember(owner = "client!po", name = "j", descriptor = "F")
	public static float aFloat151 = 0.25F;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIZ)V")
	public static void method6574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(43) String local43 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local43);
		Static444.method6596(true, false, local43);
	}
}
