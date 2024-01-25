import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_50 = new Class67("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_42 = new Class158(57, 6);

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_9 = new Class117(2, 4);

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
	public static int anInt3699 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!cm;I)I")
	public static int method3099(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) String local7 = Static409.method6186(arg0);
		@Pc(9) int[] local9 = null;
		if (Static95.method1856(arg0.anInt1419)) {
			local9 = Static99.aClass96_7.method2508((int) arg0.aLong48).anIntArray132;
		} else if (arg0.anInt1422 != -1) {
			local9 = Static99.aClass96_7.method2508(arg0.anInt1422).anIntArray132;
		} else if (Static153.method2639(arg0.anInt1419)) {
			@Pc(92) Class3_Sub3 local92 = (Class3_Sub3) Static240.aClass267_20.method6644((long) arg0.aLong48);
			if (local92 != null) {
				@Pc(97) Class6_Sub1_Sub2_Sub2 local97 = local92.aClass6_Sub1_Sub2_Sub2_1;
				@Pc(100) Class230 local100 = local97.aClass230_1;
				if (local100.anIntArray627 != null) {
					local100 = local100.method5898(Static127.aClass215_1);
				}
				if (local100 != null) {
					local9 = local100.anIntArray629;
				}
			}
		} else if (Static359.method5619(arg0.anInt1419)) {
			@Pc(59) Class242 local59;
			if (arg0.anInt1419 == 1008) {
				local59 = Static454.aClass298_3.method7185((int) arg0.aLong48);
			} else {
				local59 = Static454.aClass298_3.method7185((int) (arg0.aLong48 >>> 32 & 0x7FFFFFFFL));
			}
			if (local59.anIntArray632 != null) {
				local59 = local59.method5975(Static127.aClass215_1);
			}
			if (local59 != null) {
				local9 = local59.anIntArray636;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static180.method3434(local9);
		}
		@Pc(140) int local140 = Static25.aClass53_6.method1384(local7, Static525.aClass119Array16);
		if (arg0.aBoolean116) {
			local140 += Static35.aClass119_3.QA() + 4;
		}
		return local140;
	}
}
