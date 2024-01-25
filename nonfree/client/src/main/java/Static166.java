import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public static int anInt2880;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public static int anInt2883 = -1;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public static int anInt2884 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZLjava/lang/String;)V")
	public static void method2507(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static19.method267();
		if (arg0 == 0) {
			Static396.aClass145_6 = Static150.method2167(Static179.anInterface3_1, Static316.aCanvas1, 0, Static650.aClass2_Sub30_29.aClass11_Sub18_1.method4563() * 2, Static554.aClass254_136);
			if (arg2 != null) {
				Static396.aClass145_6.GA(0);
				@Pc(42) Class289 local42 = Static154.method2200(Static335.aClass254_99, Static212.anInt3397);
				@Pc(51) Class68 local51 = Static396.aClass145_6.method9707(local42, Static737.method8363(Static117.aClass254_47, Static212.anInt3397), true);
				Static475.method6832();
				Static271.method3803(arg2, true, Static396.aClass145_6, local51, local42);
			}
		} else {
			@Pc(66) Class145 local66 = null;
			@Pc(94) Class68 local94;
			if (arg2 != null) {
				local66 = Static150.method2167(Static179.anInterface3_1, Static316.aCanvas1, 0, 0, Static554.aClass254_136);
				local66.GA(0);
				@Pc(85) Class289 local85 = Static154.method2200(Static335.aClass254_99, Static212.anInt3397);
				local94 = local66.method9707(local85, Static737.method8363(Static117.aClass254_47, Static212.anInt3397), true);
				Static475.method6832();
				Static271.method3803(arg2, true, local66, local94, local85);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static396.aClass145_6 = Static150.method2167(Static179.anInterface3_1, Static316.aCanvas1, arg0, Static650.aClass2_Sub30_29.aClass11_Sub18_1.method4563() * 2, Static554.aClass254_136);
					if (arg2 != null) {
						local66.GA(0);
						@Pc(127) Class289 local127 = Static154.method2200(Static335.aClass254_99, Static212.anInt3397);
						@Pc(136) Class68 local136 = local66.method9707(local127, Static737.method8363(Static117.aClass254_47, Static212.anInt3397), true);
						Static475.method6832();
						Static271.method3803(arg2, true, local66, local136, local127);
					}
					if (Static396.aClass145_6.method9671()) {
						@Pc(150) boolean local150 = true;
						try {
							local150 = Static604.aClass2_Sub45_1.anInt7311 > 256;
						} catch (@Pc(161) Throwable local161) {
						}
						@Pc(167) Class2_Sub28 local167;
						if (local150) {
							local167 = Static396.aClass145_6.method9649(146800640);
						} else {
							local167 = Static396.aClass145_6.method9649(104857600);
						}
						Static396.aClass145_6.method9663(local167);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(178) Throwable local178) {
					@Pc(183) int local183 = Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863();
					if (local183 == 2) {
						Static344.aBoolean449 = true;
					}
					Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub20_2);
					method2507(local183, arg1, arg2);
					@Pc(204) Object local204 = null;
					var14 = false;
				} finally {
					if (var14) {
						local94 = null;
						if (local66 != null) {
							try {
								local66.method9661();
							} catch (@Pc(366) Throwable local366) {
							}
						}
					}
				}
				if (local66 != null) {
					try {
						local66.method9661();
					} catch (@Pc(346) Throwable local346) {
					}
				}
				return;
			}
			local94 = null;
			if (local66 != null) {
				try {
					local66.method9661();
				} catch (@Pc(356) Throwable local356) {
				}
			}
		}
		Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4859(!arg1);
		Static650.aClass2_Sub30_29.method2988(arg0, Static650.aClass2_Sub30_29.aClass11_Sub20_2);
		Static262.method3709();
		Static396.aClass145_6.method9718();
		Static396.aClass145_6.X(32);
		Static359.aClass86_2 = Static396.aClass145_6.method9691();
		Static390.aClass86_3 = Static396.aClass145_6.method9691();
		Static138.method2005();
		Static396.aClass145_6.method9669(Static650.aClass2_Sub30_29.lb.method958() == 1);
		if (Static396.aClass145_6.method9665()) {
			Static717.method9543(Static650.aClass2_Sub30_29.aClass11_Sub23_1.method7278() == 1);
		}
		Static660.method9035(Static396.aClass145_6, Static426.anInt6942 >> 3, Static280.anInt6752 >> 3);
		Static408.method6014();
		Static492.aBoolean688 = false;
		Static290.aClass242Array6 = null;
		Static30.aBoolean64 = true;
		Static70.method1065();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!maa;")
	public static Class5 method2508(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class5_Sub1(arg0, 15000);
	}
}
