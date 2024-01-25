import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
	public static int anInt6800 = 0;

	@OriginalMember(owner = "client!jea", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString94 = null;

	@OriginalMember(owner = "client!jea", name = "q", descriptor = "[I")
	public static final int[] anIntArray425 = new int[8];

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!vl;BLclient!pp;)Lclient!qj;")
	public static Class3_Sub44 method5689(@OriginalArg(0) Class376 arg0, @OriginalArg(2) Class282 arg1) {
		@Pc(10) Class3_Sub44 local10 = Static485.method6945();
		local10.anInt8292 = arg0.anInt9895;
		local10.aClass376_114 = arg0;
		if (local10.anInt8292 == -1) {
			local10.aClass3_Sub17_Sub2_3 = new Class3_Sub17_Sub2(260);
		} else if (local10.anInt8292 == -2) {
			local10.aClass3_Sub17_Sub2_3 = new Class3_Sub17_Sub2(10000);
		} else if (local10.anInt8292 <= 18) {
			local10.aClass3_Sub17_Sub2_3 = new Class3_Sub17_Sub2(20);
		} else if (local10.anInt8292 <= 98) {
			local10.aClass3_Sub17_Sub2_3 = new Class3_Sub17_Sub2(100);
		} else {
			local10.aClass3_Sub17_Sub2_3 = new Class3_Sub17_Sub2(260);
		}
		local10.aClass3_Sub17_Sub2_3.method4898(arg1);
		local10.aClass3_Sub17_Sub2_3.method4899(local10.aClass376_114.method8427());
		local10.anInt8295 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!uv;)V")
	public static void method5690(@OriginalArg(1) Class23_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt10151 - Static621.anInt9665;
		@Pc(20) int local20 = arg0.anInt10129 * 512 + arg0.method8625() * 256;
		@Pc(31) int local31 = arg0.anInt10134 * 512 + arg0.method8625() * 256;
		arg0.anInt10109 += (local31 - arg0.anInt10109) / local8;
		arg0.anInt10108 += (local20 - arg0.anInt10108) / local8;
		arg0.anInt10191 = 0;
		if (arg0.anInt10139 == 0) {
			arg0.method8615(8192);
		}
		if (arg0.anInt10139 == 1) {
			arg0.method8615(12288);
		}
		if (arg0.anInt10139 == 2) {
			arg0.method8615(0);
		}
		if (arg0.anInt10139 == 3) {
			arg0.method8615(4096);
		}
	}
}
