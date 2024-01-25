import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public static int anInt5483;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	public static int anInt5492;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public static int anInt5473 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!cea;)Lclient!ou;")
	public static Class110_Sub3 method4723(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(7) Class110 local7 = Static240.method4487(arg0);
		@Pc(19) int local19 = arg0.method8381();
		@Pc(23) int local23 = arg0.method8381();
		return new Class110_Sub3(local7.aClass309_11, local7.aClass86_10, local7.anInt7742, local7.anInt7733, local7.anInt7743, local7.anInt7736, local7.anInt7739, local7.anInt7738, local7.anInt7735, local19, local23);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)Lclient!fe;")
	public static Class104 method4724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class104 local7 = new Class104();
		local7.anInt3570 = arg1 + 6;
		local7.anInt3585 = -1;
		local7.anInt3575 = arg0 + 1 + 5;
		local7.anInt3573 = -1;
		local7.anIntArrayArray17 = new int[local7.anInt3570][local7.anInt3575];
		local7.method3255();
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(III)Z")
	public static boolean method4725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static408.method6624(arg1, arg0) | (arg0 & 0x10000) != 0 || Static634.method9195(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static586.method8661(arg0, arg1);
		}
	}
}
