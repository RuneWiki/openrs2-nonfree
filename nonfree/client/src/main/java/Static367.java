import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!oba", name = "Tb", descriptor = "I")
	public static int anInt7145;

	@OriginalMember(owner = "client!oba", name = "W", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_150 = new Class362(70, 8);

	@OriginalMember(owner = "client!oba", name = "Cb", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_151 = new Class362(60, 11);

	@OriginalMember(owner = "client!oba", name = "Db", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_1 = new Class140(14, 1);

	@OriginalMember(owner = "client!oba", name = "Fb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_2 = new Class140(15, 4);

	@OriginalMember(owner = "client!oba", name = "Gb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_3 = new Class140(16, -2);

	@OriginalMember(owner = "client!oba", name = "Hb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_4 = new Class140(17, 0);

	@OriginalMember(owner = "client!oba", name = "Ib", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_5 = new Class140(18, -2);

	@OriginalMember(owner = "client!oba", name = "Jb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_6 = new Class140(19, -2);

	@OriginalMember(owner = "client!oba", name = "Kb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_7 = new Class140(20, 6);

	@OriginalMember(owner = "client!oba", name = "Lb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_8 = new Class140(21, 9);

	@OriginalMember(owner = "client!oba", name = "Mb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_9 = new Class140(22, -2);

	@OriginalMember(owner = "client!oba", name = "Nb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_10 = new Class140(23, 4);

	@OriginalMember(owner = "client!oba", name = "Ob", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_11 = new Class140(24, -1);

	@OriginalMember(owner = "client!oba", name = "Pb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_12 = new Class140(25, -2);

	@OriginalMember(owner = "client!oba", name = "Qb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_13 = new Class140(26, 0);

	@OriginalMember(owner = "client!oba", name = "Rb", descriptor = "Lclient!hj;")
	public static final Class140 aClass140_14 = new Class140(27, 0);

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!hq;I)Z")
	public static boolean method5891(@OriginalArg(0) Class145 arg0) {
		return arg0 == Static465.aClass145_8 || Static308.aClass145_6 == arg0 || Static379.aClass145_7 == arg0 || arg0 == Static172.aClass145_3;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	public static void method5899() throws IOException {
		if (Static299.aClass241_3 == null || Static575.anInt10052 <= 0) {
			return;
		}
		@Pc(11) int local11 = 0;
		while (true) {
			@Pc(16) Class4_Sub14 local16 = (Class4_Sub14) Static86.aClass244_11.method5963();
			if (local16 == null) {
				Static12.anInt226 = 0;
				Static63.anInt994 += local11;
				break;
			}
			Static299.aClass241_3.method7088(local16.anInt2411, local16.aClass4_Sub11_Sub1_3.aByteArray68);
			Static575.anInt10052 -= local16.anInt2411;
			local11 += local16.anInt2411;
			local16.method8379();
			local16.aClass4_Sub11_Sub1_3.method4911();
			local16.method2281();
		}
	}
}
