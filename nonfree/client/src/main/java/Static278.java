import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_45 = new Class344(51, 12);

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
	public static final int[] anIntArray299 = new int[25];

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!hp;")
	public static final Class143 aClass143_2 = new Class143();

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	public static int anInt5785 = 0;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_46 = new Class344(50, 3);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_20 = new Class167(4);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)V")
	public static void method4469(@OriginalArg(0) int arg0) {
		if (Static298.anInt6033 == arg0) {
			return;
		}
		Static338.anInt6508 = Static390.anInt7654 = Static143.anIntArray147[arg0];
		Static199.method3260();
		Static118.anIntArrayArray12 = new int[Static338.anInt6508][Static390.anInt7654];
		Static119.anIntArrayArrayArray4 = new int[4][Static338.anInt6508 >> 3][Static390.anInt7654 >> 3];
		Static528.anIntArrayArray57 = new int[Static338.anInt6508][Static390.anInt7654];
		for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
			Static526.aClass232Array1[local48] = Static375.method5817(Static338.anInt6508, Static390.anInt7654);
		}
		Static159.aByteArrayArrayArray3 = new byte[4][Static338.anInt6508][Static390.anInt7654];
		Static339.method5167(Static390.anInt7654, Static338.anInt6508);
		Static396.method6080(Static390.anInt7654 >> 3, Static338.anInt6508 >> 3, Static39.aClass7_2);
		Static298.anInt6033 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLclient!ek;)Lclient!pga;")
	public static Class261 method4470(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(12) int local12 = arg0.method6990();
		return new Class261(local12);
	}
}
