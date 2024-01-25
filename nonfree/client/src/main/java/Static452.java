import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "F")
	public static float aFloat134 = 0.25F;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_12 = new Class370(2, 8);

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
	public static int anInt7483 = 0;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "Lclient!dea;")
	public static final Class85 aClass85_6 = new Class85();

	@OriginalMember(owner = "client!pia", name = "H", descriptor = "Lclient!el;")
	public static Class109 aClass109_160 = new Class109(23, -2);

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method6464(@OriginalArg(1) String[] arg0) {
		@Pc(14) String[] local14 = new String[5];
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			local14[local16] = local16 + ": ";
			if (arg0 != null && arg0[local16] != null) {
				local14[local16] = local14[local16] + arg0[local16];
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "(I)V")
	public static void method6465() {
		@Pc(7) Class98[] local7 = Class170.aClass98Array1;
		synchronized (Class170.aClass98Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class170.aClass98Array1.length; local11++) {
				Class170.aClass98Array1[local11] = new Class98();
				Static223.anIntArray208[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "(B)Lclient!iu;")
	public static Class180_Sub1 method6467() {
		return Static541.anInt9234 < Static92.aClass180_Sub1Array1.length ? Static92.aClass180_Sub1Array1[Static541.anInt9234++] : null;
	}
}
