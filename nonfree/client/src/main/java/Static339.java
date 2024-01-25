import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	public static int anInt5697;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!oq;")
	public static final Class193 aClass193_6 = new Class193("", 11);

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_12 = new Class106(0, 2, 2, 1);

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	public static int anInt5698 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I")
	public static int method4784(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!qq;Lclient!lt;)V")
	public static void method4786(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class158 arg1) {
		@Pc(10) Class77[] local10 = Static455.method1708(arg1, Static328.anInt5546);
		Static63.aClass12Array6 = new Class12[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static63.aClass12Array6[local16] = arg0.method3540(local10[local16]);
		}
		local10 = Static455.method1708(arg1, Static360.anInt6058);
		Static63.aClass12Array5 = new Class12[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static63.aClass12Array5[local43] = arg0.method3540(local10[local43]);
		}
		local10 = Static455.method1708(arg1, Static367.anInt7090);
		Static62.aClass12Array4 = new Class12[local10.length];
		for (@Pc(70) int local70 = 0; local70 < local10.length; local70++) {
			Static62.aClass12Array4[local70] = arg0.method3540(local10[local70]);
		}
		local10 = Static455.method1708(arg1, Static384.anInt6341);
		Static396.aClass12Array18 = new Class12[local10.length];
		for (@Pc(97) int local97 = 0; local97 < local10.length; local97++) {
			Static396.aClass12Array18[local97] = arg0.method3540(local10[local97]);
		}
		local10 = Static455.method1708(arg1, Static394.anInt6532);
		Static260.aClass12Array14 = new Class12[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static260.aClass12Array14[local128] = arg0.method3540(local10[local128]);
		}
		local10 = Static455.method1708(arg1, Static250.anInt4255);
		Static252.aClass12Array13 = new Class12[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static252.aClass12Array13[local155] = arg0.method3540(local10[local155]);
		}
		local10 = Static455.method1708(arg1, Static133.anInt2346);
		Static273.aClass12Array15 = new Class12[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static273.aClass12Array15[local186] = arg0.method3540(local10[local186]);
		}
		local10 = Static455.method1708(arg1, Static73.anInt1498);
		Static357.aClass12Array17 = new Class12[local10.length];
		for (@Pc(217) int local217 = 0; local217 < local10.length; local217++) {
			Static357.aClass12Array17[local217] = arg0.method3540(local10[local217]);
		}
		local10 = Static455.method1708(arg1, Static56.anInt1175);
		Static165.aClass12Array10 = new Class12[local10.length];
		for (@Pc(244) int local244 = 0; local244 < local10.length; local244++) {
			Static165.aClass12Array10[local244] = arg0.method3540(local10[local244]);
		}
		local10 = Static455.method1708(arg1, Static1.anInt2);
		Static344.aClass12Array16 = new Class12[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static344.aClass12Array16[local275] = arg0.method3540(local10[local275]);
		}
		local10 = Static455.method1708(arg1, Static146.anInt2652);
		Static33.aClass12Array1 = new Class12[local10.length];
		for (@Pc(306) int local306 = 0; local306 < local10.length; local306++) {
			Static33.aClass12Array1[local306] = arg0.method3540(local10[local306]);
		}
		local10 = Static455.method1708(arg1, Static363.anInt6127);
		Static205.aClass12Array3 = new Class12[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static205.aClass12Array3[local337] = arg0.method3540(local10[local337]);
		}
		Static441.aClass12_20 = arg0.method3540(Static455.method1703(arg1, Static108.anInt1930, 0));
		Static228.aClass12_10 = arg0.method3540(Static455.method1703(arg1, Static139.anInt3474, 0));
		local10 = Static455.method1708(arg1, Static376.anInt5183);
		Static139.aClass12Array11 = new Class12[local10.length];
		for (@Pc(389) int local389 = 0; local389 < local10.length; local389++) {
			Static139.aClass12Array11[local389] = arg0.method3540(local10[local389]);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIBLclient!bl;Z[B)Lclient!js;")
	public static Class40_Sub3_Sub1 method4788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class28_Sub1 arg2, @OriginalArg(7) byte[] arg3) {
		if (arg2.aBoolean47 || Static220.method3379(arg1) && Static220.method3379(arg0)) {
			return new Class40_Sub3_Sub1(arg2, 3553, 6406, arg1, arg0, false, arg3, 6406);
		} else if (arg2.aBoolean40) {
			return new Class40_Sub3_Sub1(arg2, 34037, 6406, arg1, arg0, false, arg3, 6406);
		} else {
			return new Class40_Sub3_Sub1(arg2, 6406, arg1, arg0, Static420.method5696(arg1), Static420.method5696(arg0), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!ha;)Lclient!mc;")
	public static Class114_Sub2 method4790(@OriginalArg(1) Class6_Sub15 arg0) {
		return new Class114_Sub2(arg0.method3103(), arg0.method3103(), arg0.method3103(), arg0.method3103(), arg0.method3078(), arg0.method3078(), arg0.method3111());
	}
}
