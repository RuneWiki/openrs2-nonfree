import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_72 = new Class218(32, -1);

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "[Lclient!uca;")
	public static final Class3_Sub15[] aClass3_Sub15Array3 = new Class3_Sub15[8];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!wc;)I")
	public static int method4575(@OriginalArg(1) Class28_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt10496;
		@Pc(12) Class359 local12 = arg0.method9315();
		if (arg0.anInt10749 == -1 || arg0.aBoolean820) {
			local8 = arg0.anInt10492;
		} else if (arg0.anInt10749 == local12.anInt10008 || local12.anInt9990 == arg0.anInt10749 || local12.anInt9984 == arg0.anInt10749 || local12.anInt9986 == arg0.anInt10749) {
			local8 = arg0.anInt10511;
		} else if (local12.anInt9966 == arg0.anInt10749 || local12.anInt9974 == arg0.anInt10749 || arg0.anInt10749 == local12.anInt9976 || arg0.anInt10749 == local12.anInt9997) {
			local8 = arg0.anInt10530;
		}
		return local8;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!dia;)V")
	public static void method4577(@OriginalArg(1) Class13_Sub2 arg0) {
		@Pc(17) byte[] local17;
		if (Static224.anObject7 == null) {
			@Pc(10) Class18_Sub2_Sub1 local10 = new Class18_Sub2_Sub1();
			local17 = local10.method5646();
			Static224.anObject7 = Static540.method7762(local17);
		}
		if (Static356.anObject9 == null) {
			@Pc(32) Class18_Sub1_Sub2 local32 = new Class18_Sub1_Sub2();
			local17 = local32.method6844();
			Static356.anObject9 = Static540.method7762(local17);
		}
		@Pc(47) Class207 local47 = arg0.aClass207_1;
		if (local47.method5252() && Static592.anObject20 == null) {
			local17 = Static668.method9228(0.6F, 4.0F, 4.0F, 0.5F, 16.0F, new Class126_Sub1(419684));
			Static592.anObject20 = Static540.method7762(local17);
		}
	}
}
