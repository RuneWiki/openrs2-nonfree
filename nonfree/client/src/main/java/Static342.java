import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[8];

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_120 = new Class254(21, 7);

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_121 = new Class254(79, 0);

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "F")
	public static float aFloat131 = 0.0F;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_11 = new Class117(2, 4);

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Z")
	public static boolean aBoolean472 = true;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public static int anInt6342 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(JLclient!oa;I)V")
	public static void method5385(@OriginalArg(0) long arg0, @OriginalArg(1) Class9 arg1) {
		Static92.anInt9034 = Static334.anInt6216;
		Static178.anInt3986 = 0;
		Static334.anInt6216 = 0;
		@Pc(19) long local19 = Static174.method3502();
		for (@Pc(24) Class5_Sub2 local24 = (Class5_Sub2) Static574.aClass267_8.method6544(); local24 != null; local24 = (Class5_Sub2) Static574.aClass267_8.method6543()) {
			if (local24.method3788(arg1, arg0)) {
				Static178.anInt3986++;
			}
		}
		if (Static90.aBoolean201 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static574.aClass267_8.method6541() + ", running: " + Static178.anInt3986 + ". Particles: " + Static334.anInt6216 + ". Time taken: " + (Static174.method3502() - local19) + "ms");
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lclient!ok;")
	public static Class5_Sub5 method5386(@OriginalArg(0) int arg0) {
		@Pc(7) Class267[] local7 = Class105.aClass267Array1;
		synchronized (Class105.aClass267Array1) {
			@Pc(27) Class5_Sub5 local27;
			if (Class105.aClass267Array1.length <= arg0 || Class105.aClass267Array1[arg0].method6542()) {
				local27 = new Class5_Sub5();
				local27.aClass5_Sub4Array1 = new Class5_Sub4[arg0];
				for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
					local27.aClass5_Sub4Array1[local33] = new Class5_Sub4();
				}
			} else {
				local27 = (Class5_Sub5) Class105.aClass267Array1[arg0].method6534();
				local27.method7282();
				@Pc(62) int local62 = Static284.anIntArray404[arg0]--;
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V")
	public static void method5387(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static461.aClass6_Sub4_Sub12_2 != null) {
			Static110.anInt2516 = Static461.aClass6_Sub4_Sub12_2.anInt6893;
		} else {
			Static110.anInt2516 = -1;
		}
		Static305.aClass211_44 = null;
		Static297.anInt4703 = 0;
		Static141.aClass93_9 = null;
		Static461.aClass6_Sub4_Sub12_2 = null;
		Static461.method96();
		Static461.aClass211_2.method5179();
		Static562.aClass269_13 = null;
		Static98.anInt2324 = -1;
		Static427.anInt9633 = -1;
		Static288.aClass269_7 = null;
		Static303.aClass269_8 = null;
		Static30.aClass269_3 = null;
		Static552.aClass269_11 = null;
		Static134.aClass269_12 = null;
		Static101.aClass269_4 = null;
		Static387.aClass269_9 = null;
		Static549.aClass66_38 = null;
		Static461.aClass183_2 = null;
		if (Static461.aClass42_2 != null) {
			Static461.aClass42_2.method1144();
			Static461.aClass42_2.method1149(64, 128);
		}
		if (Static461.aClass226_2 != null) {
			Static461.aClass226_2.method5642(64, 64);
		}
		if (Static461.aClass57_2 != null) {
			Static461.aClass57_2.method1472(64);
		}
		Static177.aClass171_1.method4467(64);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!iaa;I)Lclient!wo;")
	public static Class177_Sub1 method5388(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(7) Class177 local7 = Static206.method3813(arg0);
		@Pc(18) int local18 = arg0.method4953();
		return new Class177_Sub1(local7.anInt9731, local7.aClass148_11, local7.aClass49_14, local7.anInt9733, local7.anInt9729, local18);
	}
}
