import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "F")
	public static float aFloat218;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	public static int anInt5114;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_48 = new Class236(26, 8);

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_79 = new Class40("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
	public static int anInt5115 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZII)I")
	public static int method4326(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub24 local8 = Static459.method6391(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && local8.anIntArray261.length > arg0) {
			return local8.anIntArray261[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!co;B)V")
	public static void method4327(@OriginalArg(0) Class5_Sub3 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static271.aClass149_4 != null) {
			@Pc(24) int local24;
			try {
				Static271.aClass149_4.method3481(0L);
				Static271.aClass149_4.method3480(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method4207(24, local12);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZ)V")
	public static void method4329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static429.aByteArrayArrayArray17 = new byte[4][arg0][arg1];
	}
}
