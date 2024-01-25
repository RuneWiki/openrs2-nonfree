import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!l", name = "z", descriptor = "I")
	public static int anInt4977;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "[Lclient!ln;")
	public static Class210[] aClass210Array1;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "I")
	public static int anInt4982;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!om;")
	public static Class253 aClass253_1 = new Class253();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!hg;)I")
	public static int method4204(@OriginalArg(1) Class13_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt4563 == 0) {
			return 0;
		}
		@Pc(68) int local68;
		@Pc(61) int local61;
		if (arg0.anInt4580 != -1) {
			@Pc(23) Class13_Sub1_Sub1_Sub1 local23 = null;
			if (arg0.anInt4580 < 32768) {
				@Pc(47) Class2_Sub43 local47 = (Class2_Sub43) Static440.aClass118_41.method2595((long) arg0.anInt4580);
				if (local47 != null) {
					local23 = local47.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				}
			} else if (arg0.anInt4580 >= 32768) {
				local23 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt4580 - 32768];
			}
			if (local23 != null) {
				local61 = arg0.anInt10090 - local23.anInt10090;
				local68 = arg0.anInt10089 - local23.anInt10089;
				if (local61 != 0 || local68 != 0) {
					arg0.method3956((int) (Math.atan2((double) local61, (double) local68) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class13_Sub1_Sub1_Sub1_Sub2) {
			@Pc(97) Class13_Sub1_Sub1_Sub1_Sub2 local97 = (Class13_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local97.anInt4652 != -1 && (local97.anInt4639 == 0 || local97.anInt4640 > 0)) {
				local97.method3956(local97.anInt4652);
				local97.anInt4652 = -1;
			}
		} else if (arg0 instanceof Class13_Sub1_Sub1_Sub1_Sub1) {
			@Pc(123) Class13_Sub1_Sub1_Sub1_Sub1 local123 = (Class13_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local123.anInt535 != -1 && (local123.anInt4639 == 0 || local123.anInt4640 > 0)) {
				local61 = local123.anInt10090 - (local123.anInt535 - Static132.anInt2246 - Static132.anInt2246) * 256;
				local68 = local123.anInt10089 - (local123.anInt517 - Static123.anInt2176 - Static123.anInt2176) * 256;
				if (local61 != 0 || local68 != 0) {
					local123.method3956((int) (Math.atan2((double) local61, (double) local68) * 2607.5945876176133D) & 0x3FFF);
				}
				local123.anInt535 = -1;
			}
		}
		return arg0.method3958();
	}
}
