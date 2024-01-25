import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
	public static int anInt7636;

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_103 = new Class160(59, 3);

	@OriginalMember(owner = "client!rda", name = "t", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!dw;)I")
	public static int method6316(@OriginalArg(1) Class29_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) Class257 local8 = arg0.aClass257_1;
		if (local8.anIntArray571 != null) {
			local8 = local8.method5935(Static505.aClass30_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local8.anInt7159;
		@Pc(35) Class120 local35 = arg0.method7009();
		if (arg0.aBoolean597) {
			local31 = local8.anInt7133;
		} else if (local35.anInt2874 == arg0.anInt8535 || arg0.anInt8535 == local35.anInt2905 || arg0.anInt8535 == local35.anInt2904 || arg0.anInt8535 == local35.anInt2882) {
			local31 = local8.anInt7136;
		} else if (local35.anInt2909 == arg0.anInt8535 || arg0.anInt8535 == local35.anInt2867 || arg0.anInt8535 == local35.anInt2870 || local35.anInt2902 == arg0.anInt8535) {
			local31 = local8.anInt7152;
		}
		return local31;
	}
}
