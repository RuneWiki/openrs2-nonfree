import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "B")
	public static byte aByte12;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
	public static int anInt1356;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_27 = new Class37(50);

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[200];

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	public static int anInt1357 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
	public static void method1109() {
		@Pc(1) Class37 local1 = Static128.aClass37_56;
		synchronized (Static128.aClass37_56) {
			Static128.aClass37_56.method920(5);
		}
		local1 = Static53.aClass37_25;
		synchronized (Static53.aClass37_25) {
			Static53.aClass37_25.method920(5);
		}
		local1 = Static354.aClass37_112;
		synchronized (Static354.aClass37_112) {
			Static354.aClass37_112.method920(5);
		}
		local1 = Static79.aClass37_109;
		synchronized (Static79.aClass37_109) {
			Static79.aClass37_109.method920(5);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BZ)V")
	public static void method1110(@OriginalArg(1) boolean arg0) {
		Static37.method780(arg0, Static321.anInt6388, Static26.anInt476, Static129.anInt2569);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILjava/awt/Canvas;Lclient!fh;Lclient!wd;)Lclient!ii;")
	public static Class105 method1111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface2 arg3, @OriginalArg(5) Class215 arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class105_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, fh.class, Integer.TYPE, Integer.TYPE, wd.class);
			return (Class105) local57.newInstance(arg2, arg3, Integer.valueOf(arg1), new Integer(arg0), arg4);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!nj;)V")
	public static void method1112(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		if (Static8.aClass171_1 == null) {
			return;
		}
		try {
			Static8.aClass171_1.method4501(0L);
			Static8.aClass171_1.method4498(arg0, 24, arg1.aByteArray82);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method1114(@OriginalArg(0) Class163 arg0) {
		@Pc(7) Class163 local7 = Static220.method4064(arg0);
		@Pc(11) int local11;
		@Pc(13) int local13;
		if (local7 == null) {
			local11 = Static26.anInt476;
			local13 = Static321.anInt6388;
		} else {
			local11 = local7.anInt4991;
			local13 = local7.anInt4935;
		}
		Static73.method743(false, local11, arg0, local13);
		Static349.method5817(local11, local13, arg0);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method1115() {
		Static329.aClass37_105.method914();
		aClass37_27.method914();
		Static250.aClass37_82.method914();
		Static333.aClass37_106.method914();
		Static11.aClass37_95.method914();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public static void method1116() {
		if (Static54.aClass193_2 == null) {
			return;
		}
		if (Static54.aClass193_2.anInt5986 == 1) {
			Static54.aClass193_2 = null;
			return;
		}
		if (Static54.aClass193_2.anInt5986 == 2) {
			Static63.method2280(Static54.aClass215_2, Static266.aString213, 2);
			Static54.aClass193_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
	public static String method1117(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static228.anInt4755;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(26) Class70 local26 = Static350.method3753(arg0[local18]);
			if (local26.anInt1658 != -1) {
				@Pc(38) Class8 local38 = (Class8) Static11.aClass37_96.method915((long) local26.anInt1658);
				if (local38 == null) {
					@Pc(46) Class201 local46 = Static369.method5469(Static125.aClass134_55, local26.anInt1658, 0);
					if (local46 != null) {
						local38 = Static217.aClass105_5.method4238(local46);
						Static11.aClass37_96.method922((long) local26.anInt1658, local38);
					}
				}
				if (local38 != null) {
					Static67.aClass8Array4[local11] = local38;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
