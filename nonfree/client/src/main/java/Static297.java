import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
	public static int anInt5046 = -1;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
	public static void method4350(@OriginalArg(1) int arg0) {
		Static222.method3271();
		@Pc(11) int local11 = Static530.aClass237_1.method5374(arg0).anInt6691;
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static210.aClass262_1.anIntArray368[arg0];
		if (local11 == 6) {
			Static448.anInt7231 = local22;
		}
		if (local11 == 5) {
			Static218.anInt3740 = local22;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
	public static void method4351() {
		if (Static119.aClass95_4 == null) {
			return;
		}
		if (Static498.aBoolean757) {
			Static226.method3390();
		}
		Static305.aClass255_2.method5616();
		Static70.method1234();
		Static443.method6041();
		Static220.method3262();
		Static98.method403();
		Static111.method1721();
		if (Static481.aClass118_2 != null) {
			Static481.aClass118_2.method2797();
		}
		Static432.method5946();
		Static655.method8761();
		Static579.method7663();
		Static624.method8428();
		Static345.method5025(false);
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class34_Sub1_Sub1_Sub2_Sub1 local51 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local45];
			if (local51 != null) {
				for (@Pc(55) int local55 = 0; local55 < local51.aClass149Array3.length; local55++) {
					local51.aClass149Array3[local55] = null;
				}
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static331.anInt5501; local78++) {
			@Pc(85) Class34_Sub1_Sub1_Sub2_Sub2 local85 = Static129.aClass3_Sub52Array3[local78].aClass34_Sub1_Sub1_Sub2_Sub2_2;
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < local85.aClass149Array3.length; local89++) {
					local85.aClass149Array3[local89] = null;
				}
			}
		}
		Static586.aClass17_9 = null;
		Static360.aClass17_3 = null;
		Static119.aClass95_4.method8007();
		Static119.aClass95_4 = null;
	}
}
