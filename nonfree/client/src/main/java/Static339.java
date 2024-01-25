import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!kfa", name = "p", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lclient!lma;")
	public static final Class234 aClass234_3 = new Class234();

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_24 = new Class313(32);

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!kt;B)I")
	public static int method4851(@OriginalArg(0) Class9_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt8807 == 0) {
			return 0;
		}
		@Pc(74) int local74;
		@Pc(67) int local67;
		if (arg0.anInt8767 != -1) {
			@Pc(25) Class9_Sub1_Sub1_Sub2 local25 = null;
			if (arg0.anInt8767 < 32768) {
				@Pc(53) Class3_Sub52 local53 = (Class3_Sub52) Static94.aClass313_8.method7104((long) arg0.anInt8767);
				if (local53 != null) {
					local25 = local53.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				}
			} else if (arg0.anInt8767 >= 32768) {
				local25 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[arg0.anInt8767 - 32768];
			}
			if (local25 != null) {
				local67 = arg0.anInt10694 - local25.anInt10694;
				local74 = arg0.anInt10695 - local25.anInt10695;
				if (local67 != 0 || local74 != 0) {
					arg0.method7479((int) (Math.atan2((double) local67, (double) local74) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
			@Pc(104) Class9_Sub1_Sub1_Sub2_Sub1 local104 = (Class9_Sub1_Sub1_Sub2_Sub1) arg0;
			if (local104.anInt554 != -1 && (local104.anInt8817 == 0 || local104.anInt8814 > 0)) {
				local104.method7479(local104.anInt554);
				local104.anInt554 = -1;
			}
		} else if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
			@Pc(141) Class9_Sub1_Sub1_Sub2_Sub2 local141 = (Class9_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local141.anInt8842 != -1 && (local141.anInt8817 == 0 || local141.anInt8814 > 0)) {
				local67 = local141.anInt10694 - (local141.anInt8842 - Static291.anInt4448 - Static291.anInt4448) * 256;
				local74 = local141.anInt10695 - (local141.anInt8839 - Static189.anInt3243 - Static189.anInt3243) * 256;
				if (local67 != 0 || local74 != 0) {
					local141.method7479((int) (Math.atan2((double) local67, (double) local74) * 2607.5945876176133D) & 0x3FFF);
				}
				local141.anInt8842 = -1;
			}
		}
		return arg0.method7488();
	}
}
