import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt768 = 0;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
	public static int anInt770 = 0;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ni;)I")
	public static int method737(@OriginalArg(1) Class9_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anInt10196 == 0) {
			return 0;
		}
		@Pc(64) int local64;
		@Pc(57) int local57;
		if (arg0.anInt10185 != -1) {
			@Pc(15) Class9_Sub2_Sub1_Sub2 local15 = null;
			if (arg0.anInt10185 < 32768) {
				@Pc(29) Class3_Sub43 local29 = (Class3_Sub43) Static545.aClass25_40.method426((long) arg0.anInt10185);
				if (local29 != null) {
					local15 = local29.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				}
			} else if (arg0.anInt10185 >= 32768) {
				local15 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[arg0.anInt10185 - 32768];
			}
			if (local15 != null) {
				local57 = arg0.anInt10152 - local15.anInt10152;
				local64 = arg0.anInt10158 - local15.anInt10158;
				if (local57 != 0 || local64 != 0) {
					arg0.method8635((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class9_Sub2_Sub1_Sub2_Sub1) {
			@Pc(170) Class9_Sub2_Sub1_Sub2_Sub1 local170 = (Class9_Sub2_Sub1_Sub2_Sub1) arg0;
			if (local170.anInt1295 != -1 && (local170.anInt10236 == 0 || local170.anInt10235 > 0)) {
				local170.method8635(local170.anInt1295);
				local170.anInt1295 = -1;
			}
		} else if (arg0 instanceof Class9_Sub2_Sub1_Sub2_Sub2) {
			@Pc(98) Class9_Sub2_Sub1_Sub2_Sub2 local98 = (Class9_Sub2_Sub1_Sub2_Sub2) arg0;
			if (local98.anInt10260 != -1 && (local98.anInt10236 == 0 || local98.anInt10235 > 0)) {
				local57 = local98.anInt10152 - (local98.anInt10260 - Static427.anInt7462 - Static427.anInt7462) * 256;
				local64 = local98.anInt10158 - (local98.anInt10256 - Static22.anInt329 - Static22.anInt329) * 256;
				if (local57 != 0 || local64 != 0) {
					local98.method8635((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
				local98.anInt10260 = -1;
			}
		}
		return arg0.method8617();
	}
}
