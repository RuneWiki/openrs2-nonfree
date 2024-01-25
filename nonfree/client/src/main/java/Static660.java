import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "Lclient!qo;")
	public static Class307 aClass307_2;

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "[Lclient!bla;")
	public static Class19_Sub1[] aClass19_Sub1Array5;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_15 = new Class409(4, 1);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "[I")
	public static final int[] anIntArray591 = new int[2048];

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
	public static int anInt10552 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method8822(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = arg1 ? 32768 : 0;
		@Pc(31) int local31 = (arg1 ? Static558.aClass233_2.anInt6397 : Static558.aClass233_2.anInt6394) + local20;
		for (@Pc(33) int local33 = local20; local33 < local31; local33++) {
			@Pc(40) Class3_Sub4_Sub6 local40 = Static558.aClass233_2.method5417(local33);
			if (local40.aBoolean236 && local40.method2546().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static453.anInt8000 = -1;
					Static121.aShortArray35 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(80) short[] local80 = new short[local11.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local13; local82++) {
						local80[local82] = local11[local82];
					}
					local11 = local80;
				}
				local11[local13++] = (short) local33;
			}
		}
		Static121.aShortArray35 = local11;
		Static453.anInt8000 = local13;
		Static367.anInt6201 = 0;
		@Pc(128) String[] local128 = new String[Static453.anInt8000];
		for (@Pc(130) int local130 = 0; local130 < Static453.anInt8000; local130++) {
			local128[local130] = Static558.aClass233_2.method5417(local11[local130]).method2546();
		}
		Static415.method6178(local128, Static121.aShortArray35);
	}
}
