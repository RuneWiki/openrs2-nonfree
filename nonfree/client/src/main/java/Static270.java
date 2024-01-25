import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "J")
	public static long aLong139;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	public static int anInt4755;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_54 = new Class303(65, 7);

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!oh;)I")
	public static int method4111(@OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub1 arg0) {
		@Pc(8) Class264 local8 = arg0.aClass264_1;
		if (local8.anIntArray443 != null) {
			local8 = local8.method5994(Static491.aClass318_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local8.anInt7143;
		@Pc(35) Class365 local35 = arg0.method7861();
		if (arg0.aBoolean739) {
			local31 = local8.anInt7156;
		} else if (local35.anInt9746 == arg0.anInt9512 || local35.anInt9727 == arg0.anInt9512 || arg0.anInt9512 == local35.anInt9733 || local35.anInt9761 == arg0.anInt9512) {
			local31 = local8.anInt7146;
		} else if (local35.anInt9747 == arg0.anInt9512 || arg0.anInt9512 == local35.anInt9730 || arg0.anInt9512 == local35.anInt9728 || arg0.anInt9512 == local35.anInt9729) {
			local31 = local8.anInt7154;
		}
		return local31;
	}
}
