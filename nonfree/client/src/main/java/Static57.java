import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
	public static int anInt1090;

	@OriginalMember(owner = "client!dj", name = "P", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
	public static void method864() {
		@Pc(1) Class26 local1 = Static154.aClass26_25;
		synchronized (Static154.aClass26_25) {
			Static154.aClass26_25.method328();
		}
		local1 = Static261.aClass26_47;
		synchronized (Static261.aClass26_47) {
			Static261.aClass26_47.method328();
		}
		local1 = Static174.aClass26_31;
		synchronized (Static174.aClass26_31) {
			Static174.aClass26_31.method328();
		}
		local1 = Static83.aClass26_10;
		synchronized (Static83.aClass26_10) {
			Static83.aClass26_10.method328();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ms;Lclient!uo;Z)V")
	public static void method865(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class129 arg1) {
		@Pc(30) boolean local30 = Static182.method3090(arg1, arg0.anInt4051, arg0.anInt4074, arg0.aBoolean264 ? Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2 : null, arg0.anInt4089, arg0.anInt4092 | 0xFF000000, arg0.anInt4112) == null;
		if (local30) {
			Static115.aClass16_20.method190(new Class11_Sub12(arg0.anInt4112, arg0.anInt4089, arg0.anInt4051, arg0.anInt4092 | 0xFF000000, arg0.anInt4074, arg0.aBoolean264));
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!nq;I)I")
	public static int method866(@OriginalArg(0) Class144 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3910(Static31.anInt548)) {
			local5++;
		}
		if (arg0.method3910(Static351.anInt6346)) {
			local5++;
		}
		if (arg0.method3910(Static262.anInt5360)) {
			local5++;
		}
		if (arg0.method3910(Static17.anInt284)) {
			local5++;
		}
		if (arg0.method3910(Static337.anInt6450)) {
			local5++;
		}
		if (arg0.method3910(Static35.anInt644)) {
			local5++;
		}
		if (arg0.method3910(Static30.anInt542)) {
			local5++;
		}
		if (arg0.method3910(Static292.anInt5792)) {
			local5++;
		}
		if (arg0.method3910(Static79.anInt5253)) {
			local5++;
		}
		if (arg0.method3910(Static350.anInt6676)) {
			local5++;
		}
		if (arg0.method3910(Static347.anInt6631)) {
			local5++;
		}
		if (arg0.method3910(Static212.anInt4348)) {
			local5++;
		}
		if (arg0.method3910(Static204.anInt4170)) {
			local5++;
		}
		if (arg0.method3910(Static63.anInt1163)) {
			local5++;
		}
		if (arg0.method3910(Static137.anInt2547)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
	public static void method867() {
		Static193.aClass26_37.method333();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[IJI)Ljava/lang/String;")
	public static String method868(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Static86.anInterface4_1 != null) {
			@Pc(19) String local19 = Static86.anInterface4_1.method4344(arg2, arg1, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}
}
