import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_172 = new Class268(56, 4);

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_87 = new Class208(54, 3);

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray53 = new boolean[100];

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_30 = new Class89(15, 0, 1, 0);

	@OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
	public static int anInt9578 = 100;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
	public static int method8129(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZII)I")
	public static int method8131(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub16 local14 = Static148.method2357(false, arg0);
		if (local14 == null) {
			return Static485.aClass265_1.method6938(arg0).anInt8760;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray171.length; local31++) {
			if (local14.anIntArray171[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static485.aClass265_1.method6938(arg0).anInt8760 - local14.anIntArray171.length;
	}
}
