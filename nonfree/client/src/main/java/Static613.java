import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_207 = new Class151(121, 6);

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_142 = new Class216(78, -1);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public static void method8031() {
		@Pc(5) int local5 = 0;
		if (Static124.aClass4_Sub20_4 != null) {
			local5 = Static124.aClass4_Sub20_4.aClass8_Sub18_1.method6657();
		}
		@Pc(31) int local31;
		@Pc(40) int local40;
		if (local5 == 2) {
			local31 = Static553.anInt8551 <= 800 ? Static553.anInt8551 : 800;
			Static661.anInt9530 = (Static553.anInt8551 - local31) / 2;
			local40 = Static599.anInt9215 <= 600 ? Static599.anInt9215 : 600;
			Static632.anInt9867 = local31;
			Static357.anInt5421 = local40;
			Static435.anInt6854 = 0;
		} else if (local5 == 1) {
			local31 = Static553.anInt8551 > 1024 ? 1024 : Static553.anInt8551;
			local40 = Static599.anInt9215 > 768 ? 768 : Static599.anInt9215;
			Static632.anInt9867 = local31;
			Static661.anInt9530 = (Static553.anInt8551 - local31) / 2;
			Static435.anInt6854 = 0;
			Static357.anInt5421 = local40;
		} else {
			Static357.anInt5421 = Static599.anInt9215;
			Static661.anInt9530 = 0;
			Static632.anInt9867 = Static553.anInt8551;
			Static435.anInt6854 = 0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method8035(@OriginalArg(1) String arg0) {
		return Static259.method3757(10, arg0);
	}
}
