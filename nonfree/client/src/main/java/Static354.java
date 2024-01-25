import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
	public static int anInt6589 = -50;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_33 = new Class38(16);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!nv;ILjava/lang/String;)Lclient!ln;")
	public static Class157 method5033(@OriginalArg(1) Class183 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method4140(arg2);
		}
		@Pc(46) Class157 local46;
		if (arg1 == 1) {
			try {
				Static466.method4993("openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() }, arg0.anApplet1);
				local46 = new Class157();
				local46.anInt4667 = 1;
				return local46;
			} catch (@Pc(52) Throwable local52) {
				local46 = new Class157();
				local46.anInt4667 = 2;
				return local46;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local46 = new Class157();
				local46.anInt4667 = 1;
				return local46;
			} catch (@Pc(88) Exception local88) {
				local46 = new Class157();
				local46.anInt4667 = 2;
				return local46;
			}
		} else if (arg1 == 3) {
			try {
				Static466.method4995("loggedout", arg0.anApplet1);
			} catch (@Pc(110) Throwable local110) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local46 = new Class157();
				local46.anInt4667 = 1;
				return local46;
			} catch (@Pc(132) Exception local132) {
				local46 = new Class157();
				local46.anInt4667 = 2;
				return local46;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method5034() {
		for (@Pc(4) Class1_Sub31 local4 = (Class1_Sub31) Static112.aClass203_13.method4548(); local4 != null; local4 = (Class1_Sub31) Static112.aClass203_13.method4545()) {
			if (Static67.aClass252ArrayArrayArray2 == null) {
				local4.method6178();
			} else {
				@Pc(20) int local20;
				@Pc(79) Class30_Sub4 local79;
				@Pc(92) Class30_Sub4_Sub2 local92;
				@Pc(121) Class30_Sub1 local121;
				@Pc(38) Class30_Sub2 local38;
				@Pc(159) Class30_Sub3 local159;
				@Pc(51) Class30_Sub2_Sub1 local51;
				@Pc(172) Class30_Sub3_Sub1 local172;
				if (Static187.anInt3975 >= local4.anInt5423) {
					local20 = Static461.anIntArray727[local4.anInt5434];
					if (local20 == 0) {
						local159 = Static232.method3536(local4.anInt5424, local4.anInt5419, local4.anInt5433);
						if (local159 instanceof Class30_Sub3_Sub1) {
							Static52.method976(local4.anInt5424, local4.anInt5419, local4.anInt5433);
							local172 = (Class30_Sub3_Sub1) local159;
							if (local172.aClass30_Sub3_1 != null) {
								Static454.method6164(local4.anInt5424, local4.anInt5419, local4.anInt5433, local172.aClass30_Sub3_1, null);
							}
						}
					} else if (local20 == 1) {
						local38 = Static392.method5433(local4.anInt5424, local4.anInt5419, local4.anInt5433);
						if (local38 instanceof Class30_Sub2_Sub1) {
							Static163.method2685(local4.anInt5424, local4.anInt5419, local4.anInt5433);
							local51 = (Class30_Sub2_Sub1) local38;
							if (local51.aClass30_Sub2_1 != null) {
								Static70.method1337(local4.anInt5424, local4.anInt5419, local4.anInt5433, local51.aClass30_Sub2_1, null);
							}
						}
					} else if (local20 == 2) {
						local121 = Static461.method5974(local4.anInt5424, local4.anInt5419, local4.anInt5433, jg.class);
						if (local121 instanceof Class30_Sub1_Sub5) {
							Static17.method332(local4.anInt5424, local4.anInt5419, local4.anInt5433, jg.class);
							@Pc(142) Class30_Sub1_Sub5 local142 = (Class30_Sub1_Sub5) local121;
							if (local142.aClass30_Sub1_2 != null) {
								Static193.method3130(local142.aClass30_Sub1_2, false);
							}
						}
					} else if (local20 == 3) {
						local79 = Static454.method6163(local4.anInt5424, local4.anInt5419, local4.anInt5433);
						if (local79 instanceof Class30_Sub4_Sub2) {
							Static263.method3900(local4.anInt5424, local4.anInt5419, local4.anInt5433);
							local92 = (Class30_Sub4_Sub2) local79;
							if (local92.aClass30_Sub4_1 != null) {
								Static379.method5243(local4.anInt5424, local4.anInt5419, local4.anInt5433, local92.aClass30_Sub4_1);
							}
						}
					}
					local4.method6178();
				} else if (Static187.anInt3975 == local4.anInt5420) {
					local20 = Static461.anIntArray727[local4.anInt5434];
					if (local20 == 0) {
						local159 = Static232.method3536(local4.anInt5424, local4.anInt5419, local4.anInt5433);
						if (local159 instanceof Class30_Sub3_Sub1) {
							local4.method6178();
						} else if (Static220.method3426(local4.anInt5424, local4.anInt5419, local4.anInt5433) == null) {
							local172 = new Class30_Sub3_Sub1(local4.anInt5434, local4.anInt5435, local4.anInt5431, local4.anInt5421, local4.anInt5432, local159);
							Static454.method6164(local4.anInt5424, local4.anInt5419, local4.anInt5433, local172, null);
						} else {
							local4.method6178();
						}
					} else if (local20 == 1) {
						local38 = Static392.method5433(local4.anInt5424, local4.anInt5419, local4.anInt5433);
						if (local38 instanceof Class30_Sub2_Sub1) {
							local4.method6178();
						} else if (Static268.method3979(local4.anInt5424, local4.anInt5419, local4.anInt5433) == null) {
							local51 = new Class30_Sub2_Sub1(local4.anInt5434, local4.anInt5435, local4.anInt5431, local4.anInt5421, local4.anInt5432, local38);
							Static70.method1337(local4.anInt5424, local4.anInt5419, local4.anInt5433, local51, null);
						} else {
							local4.method6178();
						}
					} else if (local20 == 2) {
						local121 = Static461.method5974(local4.anInt5424, local4.anInt5419, local4.anInt5433, jg.class);
						if (local121 instanceof Class30_Sub1_Sub5) {
							local4.method6178();
						} else {
							Static17.method332(local4.anInt5424, local4.anInt5419, local4.anInt5433, jg.class);
							@Pc(358) Class192 local358 = Static455.aClass161_4.method3628(local4.anInt5428);
							@Pc(373) int local373;
							@Pc(376) int local376;
							if (local4.anInt5435 == 1 || local4.anInt5435 == 3) {
								local376 = local358.anInt5661;
								local373 = local358.anInt5679;
							} else {
								local373 = local358.anInt5661;
								local376 = local358.anInt5679;
							}
							@Pc(416) Class30_Sub1_Sub5 local416 = new Class30_Sub1_Sub5(local4.anInt5434, local4.anInt5435, local4.anInt5424, local4.anInt5431, local4.anInt5421, local4.anInt5432, local4.anInt5419, local373 + local4.anInt5419 - 1, local4.anInt5433, local376 + local4.anInt5433 - 1, local121);
							Static193.method3130(local416, false);
						}
					} else if (local20 == 3) {
						local79 = Static454.method6163(local4.anInt5424, local4.anInt5419, local4.anInt5433);
						if (local79 instanceof Class30_Sub4_Sub2) {
							local4.method6178();
						} else {
							local92 = new Class30_Sub4_Sub2(local4.anInt5431, local4.anInt5421, local4.anInt5432, local79);
							Static379.method5243(local4.anInt5424, local4.anInt5419, local4.anInt5433, local92);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!qs;I)Lclient!ko;")
	public static Class147 method5036(@OriginalArg(2) Class211 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4758(0, arg1);
		return local9 == null ? null : new Class147(local9);
	}
}
