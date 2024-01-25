import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!tf;")
	public static Class322 aClass322_132;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!mo;")
	public static Class212 aClass212_3;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!qg;")
	public static final Class272 aClass272_10 = new Class272("LIVE", 0);

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[Lclient!qq;")
	public static final Class3_Sub42[] aClass3_Sub42Array1 = new Class3_Sub42[300];

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_16 = new Class262(12, 3);

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[8];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZLclient!gu;Lclient!gu;III)I")
	public static int method6560(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class119_Sub1 arg2, @OriginalArg(3) Class119_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static91.method1720(arg2, arg3, arg4, arg0);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(46) int local46 = Static91.method1720(arg2, arg3, arg5, arg1);
			return arg1 ? -local46 : local46;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	public static int method6561() {
		if (Static283.aClass361_8 == null) {
			if (!Static150.aBoolean254 && Static571.anInt9281 > 0) {
				if (Static505.aBoolean625 && Static140.aClass195_1.method4499(81) && Static571.anInt9281 > 2) {
					return ((Class3_Sub43) Static133.aClass112_20.aClass3_111.aClass3_285.aClass3_285).anInt7749;
				}
				return ((Class3_Sub43) Static133.aClass112_20.aClass3_111.aClass3_285).anInt7749;
			}
			@Pc(45) int local45 = Static465.aClass86_1.method7267();
			@Pc(49) int local49 = Static465.aClass86_1.method7265();
			@Pc(51) int local51 = Static211.anInt3825;
			@Pc(53) int local53 = Static538.anInt8629;
			@Pc(55) int local55 = Static520.anInt9775;
			if (local51 < local45 && local45 < local51 + local55) {
				@Pc(70) int local70 = -1;
				@Pc(90) int local90;
				for (@Pc(72) int local72 = 0; local72 < Static571.anInt9281; local72++) {
					if (Static270.aBoolean347) {
						local90 = local53 + (-local72 + (Static571.anInt9281 - 1)) * 16 + 33;
						if (local90 - 13 < local49 && local49 <= local90 + 3) {
							local70 = local72;
						}
					} else {
						local90 = (Static571.anInt9281 - local72 - 1) * 16 + local53 + 31;
						if (local49 > local90 - 13 && local49 <= local90 + 3) {
							local70 = local72;
						}
					}
				}
				if (local70 != -1) {
					local90 = 0;
					@Pc(155) Class202 local155 = new Class202(Static133.aClass112_20);
					for (@Pc(160) Class3_Sub43 local160 = (Class3_Sub43) local155.method4672(); local160 != null; local160 = (Class3_Sub43) local155.method4670()) {
						if (local90++ == local70) {
							return local160.anInt7749;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public static void method6563(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(10, arg0);
		local8.method7329();
	}
}
