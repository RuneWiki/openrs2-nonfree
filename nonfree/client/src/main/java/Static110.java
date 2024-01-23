import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_23;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "Lclient!nc;")
	public static Class2_Sub3_Sub7 aClass2_Sub3_Sub7_2;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
	public static int[] anIntArray420;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
	public static int[] anIntArray419 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public static int anInt2433 = 127;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
	public static int anInt2438 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIZII)Lclient!gd;")
	public static Class2_Sub3_Sub8 method1905(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(27) long local27 = ((long) arg3 << 40) + ((long) arg2 << 38) + (arg0 ? 137438953472L : 0L) + ((long) arg1 << 16) + (long) arg4;
		@Pc(33) Class2_Sub3_Sub8 local33 = (Class2_Sub3_Sub8) Static154.aClass110_14.method3891(local27);
		if (local33 != null) {
			return local33;
		}
		Static163.aBoolean162 = false;
		local33 = Static75.method1250(arg1, arg0, false, arg4, arg3, arg2);
		if (local33 != null && !Static163.aBoolean162) {
			Static154.aClass110_14.method3894(local33, local27);
		}
		return local33;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public static void method1908() {
		Static208.anInt4610 = 0;
		Static129.aByteArrayArrayArray9 = null;
		Static38.aByteArrayArrayArray3 = null;
		Static35.anIntArrayArrayArray2 = null;
		Static142.aByteArrayArrayArray11 = null;
		Static188.aByteArrayArrayArray14 = null;
		Static118.aClass64_8 = null;
		anIntArray420 = null;
		Static159.anIntArrayArrayArray12 = null;
		Static164.aByteArrayArrayArray12 = null;
		Static78.aByteArrayArrayArray6 = null;
		Static114.aClass44_27.method1362();
		Static81.aClass44_17.method1362();
		Static37.aClass111_5 = null;
		Static71.aClass111_19 = null;
		Static201.aClass111_40 = null;
		Static22.aClass2_Sub3_Sub8_2 = null;
		Static161.aClass111_35 = null;
		Static54.aClass111_9 = null;
		Static205.aClass111_8 = null;
		Static183.aClass111_38 = null;
		Static127.aClass111_42 = null;
	}
}
