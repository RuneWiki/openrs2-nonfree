import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!os", name = "g", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Lclient!qj;")
	public static Class290 aClass290_2;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_2 = new Class48(6, 7);

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_2 = new Class305(29, 2);

	@OriginalMember(owner = "client!os", name = "l", descriptor = "I")
	public static int anInt57 = 0;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	public static int anInt58 = 4;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)V")
	public static void method58(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		Static178.aString23 = arg1;
		Static511.aString83 = arg0;
		Static461.aBoolean669 = arg2;
		if (!Static461.aBoolean669 && (Static178.aString23.equals("") || Static511.aString83.equals(""))) {
			Static221.method8979(3);
			return;
		}
		Static419.aBoolean638 = false;
		if (Static245.anInt780 != 1) {
			Static283.anInt5420 = -1;
			Static134.anInt1984 = 0;
		}
		Static221.method8979(-3);
		Static354.anInt6414 = 0;
		Static273.anInt5015 = 1;
		Static467.anInt7867 = 0;
	}
}
