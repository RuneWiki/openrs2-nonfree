import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class155 implements Interface15 {

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "[F")
	public static final float[] aFloatArray39 = new float[16384];

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[16384];

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray40[local15] = (float) Math.sin((double) local15 * local13);
			aFloatArray39[local15] = (float) Math.cos((double) local15 * local13);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!qca;BJ[I)Ljava/lang/String;")
	@Override
	public String method3858(@OriginalArg(0) Class271 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (Static558.aClass271_12 == arg0) {
			@Pc(13) Class340 local13 = Static197.aClass118_1.method3057(arg2[0]);
			return local13.method7879((int) arg1);
		} else if (Static71.aClass271_2 == arg0 || arg0 == Static496.aClass271_10) {
			@Pc(31) Class245 local31 = Static570.aClass267_2.method6597((int) arg1);
			return local31.aString72;
		} else if (Static636.aClass271_14 == arg0 || arg0 == Static414.aClass271_8 || Static240.aClass271_5 == arg0) {
			return Static197.aClass118_1.method3057(arg2[0]).method7879((int) arg1);
		} else {
			return null;
		}
	}
}
