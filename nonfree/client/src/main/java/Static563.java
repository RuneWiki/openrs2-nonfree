import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
	public static int[] anIntArray705 = new int[2];

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!dha;")
	public static final Class73 aClass73_11 = new Class73();

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static volatile int anInt9769 = -1;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt9771 = 0;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_166 = new Class44(66, -1);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method8115() {
		@Pc(9) int[] local9 = new int[Static175.aClass247_2.anInt7328];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static175.aClass247_2.anInt7328; local18++) {
			@Pc(25) Class27 local25 = Static175.aClass247_2.method5962(local18);
			if (local25.anInt934 >= 0 || local25.anInt910 >= 0) {
				local9[local16++] = local18;
			}
		}
		Static603.anIntArray739 = new int[local16];
		for (@Pc(49) int local49 = 0; local49 < local16; local49++) {
			Static603.anIntArray739[local49] = local9[local49];
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
