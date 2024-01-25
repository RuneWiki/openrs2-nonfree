import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Lclient!ht;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "I")
	public static int anInt372 = 0;

	@OriginalMember(owner = "client!at", name = "b", descriptor = "[B")
	public static final byte[] aByteArray4 = new byte[2048];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!qo;B)V")
	public static void method334(@OriginalArg(0) Class60_Sub1_Sub1_Sub3 arg0) {
		@Pc(16) int local16 = arg0.anInt4869 - Static141.anInt8737;
		@Pc(27) int local27 = arg0.anInt4867 * 512 + arg0.method4424((byte) -28) * 256;
		@Pc(38) int local38 = arg0.anInt4873 * 512 + arg0.method4424((byte) -28) * 256;
		arg0.anInt9048 += (local27 - arg0.anInt9048) / local16;
		arg0.anInt9057 += (local38 - arg0.anInt9057) / local16;
		arg0.anInt4881 = 0;
		if (arg0.anInt4870 == 0) {
			arg0.method4419(8192);
		}
		if (arg0.anInt4870 == 1) {
			arg0.method4419(12288);
		}
		if (arg0.anInt4870 == 2) {
			arg0.method4419(0);
		}
		if (arg0.anInt4870 == 3) {
			arg0.method4419(4096);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public static void method335(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static470.anInt8040 = arg0;
		Static239.aClass60_Sub4Array1 = new Class60_Sub4[Static493.anIntArray525[Static470.anInt8040] + 1];
		Static450.anInt7768 = 0;
		Static688.anInt10535 = 0;
	}
}
