import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	public static int anInt9786 = 0;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger10 = new BigInteger("9ee6fdffb44a54288d53549a7c7d3172d32f373488181dff35624f78d51bdfd75b6484348bf479abb6e7eddbb8892e47b9b197a1e88948012a73765d7c5141d5", 16);

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray71 = new String[100];

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	public static int anInt9788 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!tia;IIB)V")
	public static void method8410(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.aClass5_Sub23_Sub2_2.method8486(arg0);
		arg1.aClass5_Sub23_Sub2_2.method8520(arg2);
		arg1.aClass5_Sub23_Sub2_2.method8480(arg3);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V")
	public static void method8412(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static390.anInt6669 != -1) {
				Static607.method8681(Static390.anInt6669);
			}
			for (@Pc(18) Class5_Sub49 local18 = (Class5_Sub49) Static549.aClass291_37.method6987(); local18 != null; local18 = (Class5_Sub49) Static549.aClass291_37.method6989()) {
				if (!local18.method9326()) {
					local18 = (Class5_Sub49) Static549.aClass291_37.method6987();
					if (local18 == null) {
						break;
					}
				}
				Static372.method7048(local18, true, false);
			}
			Static390.anInt6669 = -1;
			Static549.aClass291_37 = new Class291(8);
			Static466.method6819();
			Static390.anInt6669 = Static259.anInt4502;
			Static294.method4358(false);
			Static437.method6493();
			Static173.method2523(Static390.anInt6669);
		}
		Static377.method5517();
		Static541.aBoolean711 = false;
		Static301.method7741();
		Static446.anInt7686 = -1;
		Static106.method1540(Static273.anInt4776);
		Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 = new Class8_Sub1_Sub3_Sub2_Sub1();
		Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 = Static544.anInt9261 * 512 / 2;
		Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] = Static544.anInt9261 / 2;
		Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 = Static282.anInt4887 * 512 / 2;
		Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] = Static282.anInt4887 / 2;
		Static489.anInt8202 = 0;
		Static532.anInt9189 = 0;
		if (Static79.anInt1216 == 2) {
			Static489.anInt8202 = Static650.anInt2304 << 9;
			Static532.anInt9189 = Static576.anInt9663 << 9;
		} else {
			Static159.method2170();
		}
		Static277.method4082();
	}
}
