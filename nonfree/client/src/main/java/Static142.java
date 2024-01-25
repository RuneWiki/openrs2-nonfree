import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_5 = new Class376(13, 5);

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public static void method2050() {
		@Pc(8) Class5_Sub13 local8 = (Class5_Sub13) Static75.aClass330_5.method7908();
		@Pc(16) boolean local16 = Static443.aClass295_14 != null || Static349.anInt5874 > 0;
		@Pc(25) int local25 = local8.method5403();
		@Pc(29) int local29 = local8.method5401();
		if (local16) {
			Static150.anInt2604 = 1;
		}
		if (local16) {
			Static35.aClass5_Sub5_Sub15_2 = Static12.aClass5_Sub5_Sub15_1;
		} else {
			Static557.method8108(local29, local25, Static12.aClass5_Sub5_Sub15_1);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZB)V")
	public static void method2051(@OriginalArg(0) boolean arg0) {
		Static182.aClass113_3.method8456(Static9.aClass133_1.method7299());
		@Pc(14) int[] local14 = Static9.aClass133_1.Y();
		Static42.anInt934 = local14[3];
		Static440.anInt7532 = local14[0];
		Static18.anInt266 = local14[1];
		Static239.anInt4420 = local14[2];
		if (arg0) {
			Static9.aClass133_1.DA(Static223.anInt4189, Static591.anInt9904, Static633.anInt10532, Static87.anInt1748);
			Static96.method1591(Static86.aDouble6);
		} else {
			Static9.aClass133_1.DA(Static540.anInt9190, Static603.anInt8787, Static555.anInt9377, Static570.anInt9619);
			Static96.method1591(Static460.aDouble16);
		}
	}
}
