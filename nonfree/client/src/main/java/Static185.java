import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
	public static final int[] anIntArray227 = new int[14];

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	public static final int anInt3788 = 1337;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method3352() {
		Static409.method6503(Static348.aClass6_Sub22_19.aClass15_Sub3_1.method1042() == 1);
		Static4.aClass190_6 = Static431.method6735(0, Static529.aClass112_6, 22050, Static271.aCanvas6);
		Static647.method8998(Static504.method8522((Class6_Sub3_Sub4) null));
		Static586.aClass190_7 = Static431.method6735(1, Static529.aClass112_6, 2048, Static271.aCanvas6);
		Static196.aClass6_Sub3_Sub1_1 = new Class6_Sub3_Sub1();
		Static586.aClass190_7.method7490(Static196.aClass6_Sub3_Sub1_1);
		Static17.aClass194_1 = new Class194(22050, Static78.anInt1661);
		Static259.method4619();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)I")
	public static int method3355() {
		return Static469.anInt8256 == 1 ? Static164.anInt3399 : Static609.anInt10076;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[[BLclient!jda;)V")
	public static void method3356(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class96_Sub1 arg1) {
		@Pc(14) int local14 = Static510.aByteArrayArray140.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(22) byte[] local22 = arg0[local16];
			if (local22 != null) {
				@Pc(35) int local35 = (Static480.anIntArray523[local16] >> 8) * 64 - Static606.anInt8651;
				@Pc(45) int local45 = (Static480.anIntArray523[local16] & 0xFF) * 64 - Static195.anInt3961;
				Static54.method911();
				arg1.method4579(Static619.aClass319Array1, local22, local35, Static162.aClass100_7, local45);
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
	public static void method3357(@OriginalArg(1) int arg0) {
		Static526.anInt9146 = arg0;
		Static414.anInt7551 = -1;
		Static497.anInt8613 = -1;
		Static287.method7460();
	}
}
