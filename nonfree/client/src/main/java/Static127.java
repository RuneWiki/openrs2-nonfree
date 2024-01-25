import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "Lclient!gj;")
	public static Class143 aClass143_33;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!uv;Z)I")
	public static int method2230(@OriginalArg(0) Class23_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anInt10133 == 0) {
			return 0;
		}
		@Pc(61) int local61;
		@Pc(55) int local55;
		if (arg0.anInt10178 != -1) {
			@Pc(15) Class23_Sub2_Sub1_Sub2 local15 = null;
			if (arg0.anInt10178 < 32768) {
				@Pc(41) Class3_Sub11 local41 = (Class3_Sub11) Static500.aClass62_40.method1682((long) arg0.anInt10178);
				if (local41 != null) {
					local15 = local41.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				}
			} else if (arg0.anInt10178 >= 32768) {
				local15 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[arg0.anInt10178 - 32768];
			}
			if (local15 != null) {
				local55 = arg0.anInt10108 - local15.anInt10108;
				local61 = arg0.anInt10109 - local15.anInt10109;
				if (local55 != 0 || local61 != 0) {
					arg0.method8615((int) (Math.atan2((double) local55, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class23_Sub2_Sub1_Sub2_Sub1) {
			@Pc(90) Class23_Sub2_Sub1_Sub2_Sub1 local90 = (Class23_Sub2_Sub1_Sub2_Sub1) arg0;
			if (local90.anInt3262 != -1 && (local90.anInt10190 == 0 || local90.anInt10191 > 0)) {
				local90.method8615(local90.anInt3262);
				local90.anInt3262 = -1;
			}
		} else if (arg0 instanceof Class23_Sub2_Sub1_Sub2_Sub2) {
			@Pc(117) Class23_Sub2_Sub1_Sub2_Sub2 local117 = (Class23_Sub2_Sub1_Sub2_Sub2) arg0;
			if (local117.anInt10192 != -1 && (local117.anInt10190 == 0 || local117.anInt10191 > 0)) {
				local55 = local117.anInt10108 - (local117.anInt10192 - Static417.anInt7047 - Static417.anInt7047) * 256;
				local61 = local117.anInt10109 - (local117.anInt10208 - Static347.anInt7851 - Static347.anInt7851) * 256;
				if (local55 != 0 || local61 != 0) {
					local117.method8615((int) (Math.atan2((double) local55, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local117.anInt10192 = -1;
			}
		}
		return arg0.method8627();
	}
}
