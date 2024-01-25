import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array2;

	@OriginalMember(owner = "client!qp", name = "S", descriptor = "Lclient!sh;")
	public static Class221 aClass221_4;

	@OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
	public static int anInt5840 = 0;

	@OriginalMember(owner = "client!qp", name = "M", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_12 = new Class180(14, 7);

	@OriginalMember(owner = "client!qp", name = "T", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_147 = new Class81(104, 7);

	@OriginalMember(owner = "client!qp", name = "U", descriptor = "[I")
	public static final int[] anIntArray377 = new int[6];

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Lclient!pe;")
	public static Class4_Sub3 method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass4_Sub3_1 == null ? null : local7.aClass4_Sub3_1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZII)I")
	public static int method4669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static385.anIntArray453[arg0 & 0x3] : 256;
	}
}
