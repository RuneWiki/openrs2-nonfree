import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	public static int anInt7072;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_41 = new Class118(64);

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	public static int anInt7073 = 0;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "F")
	public static float aFloat144 = 0.0F;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[I")
	public static final int[] anIntArray504 = new int[14];

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public static int anInt7077 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ul;II)V")
	public static void method6028(@OriginalArg(0) Class350 arg0, @OriginalArg(1) int arg1) {
		if (Static158.aBoolean212) {
			Static158.aBoolean212 = false;
			arg1 = 0;
		}
		if (Static206.aClass350_1 != null && Static206.aClass350_1.method7894(arg0)) {
			return;
		}
		Static206.aClass350_1 = arg0;
		Static42.aLong161 = Static476.method6413();
		Static402.anInt6305 = arg1;
		Static329.anInt5227 = arg1;
		if (Static329.anInt5227 != 0) {
			Static507.anInt8390 = Static519.anInt8614;
			Static87.aFloat17 = Static134.aFloat23;
			Static20.aFloat7 = Static471.aFloat150;
			Static392.aFloat116 = Static137.aFloat24;
			Static308.anInt4977 = Static115.anInt2102;
			Static324.aClass12_1 = Static386.aClass12_2;
			Static474.aFloat152 = Static332.aFloat97;
			Static267.aFloat71 = Static410.aFloat117;
			Static530.aFloat192 = Static258.aFloat70;
			Static32.anInt717 = Class13_Sub1_Sub1_Sub4.lb;
			return;
		}
		Static530.method7341();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)I")
	public static int method6030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(31) double local31 = (local10 - local22) * Math.random() + local22;
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}
}
