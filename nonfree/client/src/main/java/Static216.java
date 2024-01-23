import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "[[[Lclient!c;")
	public static Class17[][][] aClass17ArrayArrayArray1;

	@OriginalMember(owner = "client!pn", name = "K", descriptor = "Lclient!cg;")
	public static Class22 aClass22_73;

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "I")
	public static int anInt4186;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!pn", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString143 = " is already on your friend list.";

	@OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
	public static int anInt4184 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3385(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static175.aClass4_Sub24_Sub1_1.method3123(74);
		Static175.aClass4_Sub24_Sub1_1.method3073(Static193.method3171(arg0));
		Static175.aClass4_Sub24_Sub1_1.method3089(arg1);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZ)I")
	public static int method3387(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static61.method1150();
		for (@Pc(28) Class4_Sub4 local28 = arg0 ? (Class4_Sub4) Static278.aClass163_35.method4192() : (Class4_Sub4) Static278.aClass163_35.method4183(); local28 != null; local28 = (Class4_Sub4) Static278.aClass163_35.method4183()) {
			if ((local28.aLong16 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local28.aLong16 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local28.aLong211;
					Static298.anIntArray414[local53] = Static287.anIntArray454[local53];
					local28.method4690();
					return local53;
				}
				local28.method4690();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(II)V")
	public static void method3388() {
		Static98.aClass172_19.method4349(5);
	}
}
