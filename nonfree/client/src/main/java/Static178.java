import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
	public static int anInt3184;

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "[I")
	public static final int[] anIntArray356 = new int[1000];

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ms;IIZ)V")
	public static void method2898(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class201 local8 = arg0.method3760(Static304.aClass82_4);
		if (local8 == null) {
			return;
		}
		Static304.aClass82_4.method4477(arg1, arg2, arg0.anInt4170 + arg1, arg2 - -arg0.anInt4214);
		if (Static279.anInt4939 >= 3) {
			Static304.aClass82_4.method4494(local8, arg1, arg2);
		} else {
			Static347.aClass5_14.method5003((float) arg1 + (float) arg0.anInt4170 / 2.0F, (float) arg0.anInt4214 / 2.0F + (float) arg2, ((int) -Static18.aFloat8 & 0x3FFF) << 2, local8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!to;)V")
	public static void method2899(@OriginalArg(1) Class22_Sub8 arg0) {
		arg0.aClass12_1 = null;
		@Pc(17) int local17 = arg0.aClass22_Sub1Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass22_Sub1Array1[local19].aBoolean37 = false;
		}
		@Pc(33) Class56[] local33 = Class107.aClass56Array1;
		synchronized (Class107.aClass56Array1) {
			if (local17 < Class107.aClass56Array1.length && Static357.anIntArray128[local17] < 200) {
				Class107.aClass56Array1[local17].method1253(arg0);
				@Pc(56) int local56 = Static357.anIntArray128[local17]++;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method2900(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)Lclient!wt;")
	public static Class2_Sub1_Sub17 method2901() {
		return Static302.aClass2_Sub1_Sub17_2;
	}
}
