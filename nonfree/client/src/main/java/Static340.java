import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!lfa", name = "t", descriptor = "J")
	public static long aLong164;

	@OriginalMember(owner = "client!lfa", name = "m", descriptor = "Lclient!gp;")
	public static final Class139 aClass139_5 = new Class139(3, 2);

	@OriginalMember(owner = "client!lfa", name = "p", descriptor = "[Lclient!mr;")
	public static final Interface16[] anInterface16Array2 = new Interface16[128];

	@OriginalMember(owner = "client!lfa", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!baa;B)V")
	public static void method5190(@OriginalArg(0) Class5_Sub6 arg0) {
		if (Static635.aClass226ArrayArrayArray3 == null) {
			return;
		}
		@Pc(12) Interface1 local12 = null;
		if (arg0.anInt554 == 0) {
			local12 = (Interface1) Static506.method7239(arg0.anInt551, arg0.anInt548, arg0.anInt547);
		}
		if (arg0.anInt554 == 1) {
			local12 = (Interface1) Static9.method8812(arg0.anInt551, arg0.anInt548, arg0.anInt547);
		}
		if (arg0.anInt554 == 2) {
			local12 = (Interface1) Static241.method3771(arg0.anInt551, arg0.anInt548, arg0.anInt547, aia.class);
		}
		if (arg0.anInt554 == 3) {
			local12 = (Interface1) Static570.method7867(arg0.anInt551, arg0.anInt548, arg0.anInt547);
		}
		if (local12 == null) {
			arg0.anInt543 = 0;
			arg0.anInt542 = 0;
			arg0.anInt552 = -1;
		} else {
			arg0.anInt552 = local12.method8986();
			arg0.anInt542 = local12.method8984();
			arg0.anInt543 = local12.method8987();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZI)V")
	public static void method5191(@OriginalArg(1) int arg0) {
		if (!Static107.method2043(arg0)) {
			return;
		}
		@Pc(17) Class345[] local17 = Static648.aClass345ArrayArray2[arg0];
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(24) Class345 local24 = local17[local19];
			if (local24 != null) {
				local24.anInt9646 = 0;
				local24.anInt9604 = 1;
				local24.anInt9658 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZIIZ)V")
	public static void method5192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static133.aClass300_10.method7188((long) arg0) != null) {
			return;
		}
		if (Static77.aBoolean84) {
			@Pc(29) Class5_Sub40 local29 = new Class5_Sub40(arg0, new Class140_Sub1(4096, Static570.aClass390_114, arg0), arg1, arg2);
			local29.aClass140_Sub1_1.method7251(Static478.aStringArray48[Static544.anInt8937]);
			Static133.aClass300_10.method7191(local29, (long) arg0);
		} else {
			Static496.method7109(arg2, arg0);
		}
	}
}
