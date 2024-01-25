import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Lclient!wn;")
	public static Class89 aClass89_25;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_82 = new Class139(20);

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "[I")
	public static final int[] anIntArray700 = new int[32];

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "J")
	public static long aLong232 = -1L;

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!rp;Ljava/lang/String;Z)I")
	public static int method5670(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) String arg1) {
		@Pc(14) int local14 = arg0.anInt3121;
		@Pc(18) byte[] local18 = Static264.method4214(arg1);
		arg0.method2745(local18.length);
		arg0.anInt3121 += Static261.aClass198_1.method4518(local18.length, arg0.anInt3121, 0, local18, arg0.aByteArray42);
		return arg0.anInt3121 - local14;
	}
}
