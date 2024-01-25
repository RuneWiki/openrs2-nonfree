import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public static int anInt8307;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_28 = new Class177(8, 7);

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Lclient!sja;")
	public static final Class325 aClass325_2 = new Class325(128);

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public static final int anInt8310 = 1401;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lclient!gt;")
	public static Class34_Sub4 method6832() {
		@Pc(8) Class34_Sub4 local8 = (Class34_Sub4) Static410.aClass317_8.method6895();
		if (local8 == null) {
			return new Class34_Sub4();
		} else {
			Static378.anInt9225--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!qba;B)V")
	public static void method6833(@OriginalArg(0) Class34_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anIntArray524 == null && arg0.anIntArray522 == null) {
			return;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray524.length; local20++) {
			@Pc(24) int local24 = -1;
			if (arg0.anIntArray524 != null) {
				local24 = arg0.anIntArray524[local20];
			}
			if (local24 != -1) {
				local18 = false;
				@Pc(80) int local80;
				@Pc(92) int local92;
				@Pc(60) int local60;
				if ((-1073741824 & local24) == -1073741824) {
					local60 = local24 & 0xFFFFFFF;
					@Pc(64) int local64 = local60 >> 14;
					@Pc(68) int local68 = local60 & 0x3FFF;
					local80 = arg0.anInt9614 - (local64 - Static534.anInt8358) * 512 - 256;
					local92 = arg0.anInt9619 - (local68 - Static402.anInt6661) * 512 - 256;
				} else if ((local24 & 0x8000) == 0) {
					@Pc(139) Class3_Sub52 local139 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local24);
					if (local139 == null) {
						arg0.method7876(-1, local20);
						continue;
					}
					@Pc(152) Class34_Sub1_Sub1_Sub2_Sub2 local152 = local139.aClass34_Sub1_Sub1_Sub2_Sub2_2;
					local80 = arg0.anInt9614 - local152.anInt9614;
					local92 = arg0.anInt9619 - local152.anInt9619;
				} else {
					local60 = local24 & 0x7FFF;
					@Pc(106) Class34_Sub1_Sub1_Sub2_Sub1 local106 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local60];
					if (local106 == null) {
						arg0.method7876(-1, local20);
						continue;
					}
					local80 = arg0.anInt9614 - local106.anInt9614;
					local92 = arg0.anInt9619 - local106.anInt9619;
				}
				if (local80 != 0 || local92 != 0) {
					arg0.method7876((int) (Math.atan2((double) local80, (double) local92) * 2607.5945876176133D) & 0x3FFF, local20);
				}
			} else if (!arg0.method7876(-1, local20)) {
				local18 = false;
			}
		}
		if (local18) {
			arg0.anIntArray524 = null;
			arg0.anIntArray522 = null;
		}
	}
}
