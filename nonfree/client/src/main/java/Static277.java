import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_8 = new Class370(0, 4);

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!ib;Z)V")
	public static void method4080(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(9) int local9 = arg0.method8499();
		Static297.aClass279Array1 = new Class279[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static297.aClass279Array1[local14] = new Class279();
			Static297.aClass279Array1[local14].anInt7766 = arg0.method8499();
			Static297.aClass279Array1[local14].aString103 = arg0.method8473();
		}
		Static466.anInt7934 = arg0.method8499();
		Static463.anInt7897 = arg0.method8499();
		Static285.anInt4975 = arg0.method8499();
		Static407.aClass180_Sub1Array2 = new Class180_Sub1[Static463.anInt7897 + 1 - Static466.anInt7934];
		for (@Pc(68) int local68 = 0; local68 < Static285.anInt4975; local68++) {
			@Pc(78) int local78 = arg0.method8499();
			@Pc(86) Class180_Sub1 local86 = Static407.aClass180_Sub1Array2[local78] = new Class180_Sub1();
			local86.anInt4547 = arg0.method8529();
			local86.anInt4551 = arg0.method8527();
			local86.anInt4558 = Static466.anInt7934 + local78;
			local86.aString67 = arg0.method8473();
			local86.aString66 = arg0.method8473();
		}
		Static201.anInt3259 = arg0.method8527();
		Static537.aBoolean294 = true;
	}

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "(I)V")
	public static void method4082() {
		Static400.aBoolean530 = true;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!cn;)Ljava/lang/String;")
	public static String method4084(@OriginalArg(1) Class73 arg0) {
		if (Static81.method1252(arg0).method7132() == 0) {
			return null;
		} else if (arg0.aString21 == null || arg0.aString21.trim().length() == 0) {
			return Static206.aBoolean269 ? "Hidden-use" : null;
		} else {
			return arg0.aString21;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V")
	public static void method4085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 16);
		local9.method2687();
		local9.anInt3058 = arg1;
	}
}
