import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!uga;")
	public static Class361 aClass361_8;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_212 = new Class156(110, 1);

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Z")
	public static boolean aBoolean757 = true;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
	public static int anInt10697 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIZ)B")
	public static byte method9023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!oi;I)V")
	public static void method9025(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt6893 - Static565.anInt8921;
		@Pc(28) int local28 = arg0.anInt6887 * 512 + arg0.method5932() * 256;
		@Pc(39) int local39 = arg0.anInt6828 * 512 + arg0.method5932() * 256;
		arg0.anInt9805 += (local28 - arg0.anInt9805) / local9;
		arg0.anInt9803 += (local39 - arg0.anInt9803) / local9;
		arg0.anInt6896 = 0;
		if (arg0.anInt6875 == 0) {
			arg0.method5928(8192);
		}
		if (arg0.anInt6875 == 1) {
			arg0.method5928(12288);
		}
		if (arg0.anInt6875 == 2) {
			arg0.method5928(0);
		}
		if (arg0.anInt6875 == 3) {
			arg0.method5928(4096);
		}
	}
}
