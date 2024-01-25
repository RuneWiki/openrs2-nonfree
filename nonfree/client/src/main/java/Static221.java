import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!jca", name = "P", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!jca", name = "S", descriptor = "Lclient!vk;")
	public static Class302 aClass302_2;

	@OriginalMember(owner = "client!jca", name = "I", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_188 = new Class296(8, 0);

	@OriginalMember(owner = "client!jca", name = "Q", descriptor = "I")
	public static int anInt4390 = -1;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!dc;B)V")
	public static void method3828(@OriginalArg(0) Class49_Sub2_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt4322 - Static436.anInt6850;
		@Pc(24) int local24 = arg0.anInt4267 * 512 + arg0.method3788() * 256;
		@Pc(36) int local36 = arg0.anInt4285 * 512 + arg0.method3788() * 256;
		arg0.anInt7141 += (local36 - arg0.anInt7141) / local9;
		arg0.anInt4337 = 0;
		arg0.anInt7137 += (local24 - arg0.anInt7137) / local9;
		if (arg0.anInt4271 == 0) {
			arg0.method3783(8192);
		}
		if (arg0.anInt4271 == 1) {
			arg0.method3783(12288);
		}
		if (arg0.anInt4271 == 2) {
			arg0.method3783(0);
		}
		if (arg0.anInt4271 == 3) {
			arg0.method3783(4096);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V")
	public static void method3829() {
		Static91.aClass1_Sub24_2 = new Class1_Sub24(Static95.aClass306_27.method7165(Static179.anInt3168), "", Static108.anInt2198, 1007, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBLclient!kr;)Lclient!pe;")
	public static Class232 method3830(@OriginalArg(0) int arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(8) byte[] local8 = arg1.method4361(arg0);
		return local8 == null ? null : new Class232(local8);
	}
}
