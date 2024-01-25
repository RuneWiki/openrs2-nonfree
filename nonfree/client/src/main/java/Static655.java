import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!up", name = "V", descriptor = "I")
	public static int anInt10255 = 0;

	@OriginalMember(owner = "client!up", name = "O", descriptor = "Lclient!caa;")
	public static final Class52 aClass52_2 = new Class52(false);

	@OriginalMember(owner = "client!up", name = "S", descriptor = "Lclient!caa;")
	public static Class52 aClass52_3 = aClass52_2;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIBLclient!uja;)Lclient!ke;")
	public static Class64_Sub4_Sub1 method8993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class145_Sub3 arg3) {
		if (arg3.aBoolean858 || Static457.method6641(arg2) && Static457.method6641(arg1)) {
			return new Class64_Sub4_Sub1(arg3, 3553, arg0, arg2, arg1);
		} else if (arg3.aBoolean860) {
			return new Class64_Sub4_Sub1(arg3, 34037, arg0, arg2, arg1);
		} else {
			return new Class64_Sub4_Sub1(arg3, arg0, arg2, arg1, Static330.method4577(arg2), Static330.method4577(arg1));
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method8994(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(25) String local25 = arg1[arg2];
			return local25 == null ? "null" : local25.toString();
		} else {
			@Pc(39) int local39 = arg2 + arg0;
			@Pc(41) int local41 = 0;
			for (@Pc(43) int local43 = arg2; local43 < local39; local43++) {
				@Pc(49) String local49 = arg1[local43];
				if (local49 == null) {
					local41 += 4;
				} else {
					local41 += local49.length();
				}
			}
			@Pc(70) StringBuffer local70 = new StringBuffer(local41);
			for (@Pc(72) int local72 = arg2; local72 < local39; local72++) {
				@Pc(80) String local80 = arg1[local72];
				if (local80 == null) {
					local70.append("null");
				} else {
					local70.append(local80);
				}
			}
			return local70.toString();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIZ)V")
	public static void method8996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class264 local9 = Static307.aClass264ArrayArray1[arg1][arg2];
		Static511.method7246(arg0, local9 == null ? Static559.aClass264_2 : local9);
	}

	@OriginalMember(owner = "client!up", name = "h", descriptor = "(B)V")
	public static void method8998() {
		if (Static101.aClass406_8 != null) {
			Static591.aClass337_3 = new Class337();
			Static591.aClass337_3.method8091(Static101.aClass406_8, Static101.aClass406_8.aClass191_64.method4067(Static414.anInt9485), Static101.aClass406_8.anInt11029, Static335.aLong166);
			Static181.aThread4 = new Thread(Static591.aClass337_3, "");
			Static181.aThread4.start();
		}
	}
}
