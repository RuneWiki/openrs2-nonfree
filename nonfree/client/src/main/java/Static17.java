import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	public static int anInt401;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_8 = new Class256("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_9 = new Class256("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)S")
	public static short method243(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(23) int local23 = arg0 >> 3 & 0x70;
		@Pc(27) int local27 = arg0 & 0x7F;
		@Pc(47) int local47 = local27 <= 64 ? local27 * local23 >> 7 : (127 - local27) * local23 >> 7;
		@Pc(52) int local52 = local27 + local47;
		@Pc(60) int local60;
		if (local52 == 0) {
			local60 = local47 << 1;
		} else {
			local60 = (local47 << 8) / local52;
		}
		return (short) (local52 | local60 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)Lclient!sj;")
	public static Class2_Sub2_Sub16 method245(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub2_Sub16 local17 = (Class2_Sub2_Sub16) Static365.aClass164_2.method3874((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static317.aClass188_86.method4283(arg0, 0);
		if (local27 == null || local27.length <= 1) {
			return null;
		} else {
			local17 = Static321.method4606(local27);
			Static365.aClass164_2.method3877(local17, (long) arg0);
			return local17;
		}
	}
}
