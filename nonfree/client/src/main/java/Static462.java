import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qfa", name = "s", descriptor = "J")
	public static long aLong226;

	@OriginalMember(owner = "client!qfa", name = "R", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!qfa", name = "W", descriptor = "I")
	public static int anInt8286;

	@OriginalMember(owner = "client!qfa", name = "z", descriptor = "Z")
	public static final boolean aBoolean662 = false;

	@OriginalMember(owner = "client!qfa", name = "E", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_149 = new Class73(42, 6);

	@OriginalMember(owner = "client!qfa", name = "S", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_93 = new Class185(65, 2);

	@OriginalMember(owner = "client!qfa", name = "V", descriptor = "J")
	public static final long aLong227 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)V")
	public static void method6943(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub39 local15 = (Class6_Sub39) Static475.aClass380_36.method8747((long) arg0);
		if (local15 != null) {
			local15.aBoolean635 = !local15.aBoolean635;
			local15.aClass62_Sub1_1.method2415(local15.aBoolean635);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
	public static void method6944() {
		@Pc(16) byte[] local16;
		if (Static427.anObject17 == null) {
			@Pc(9) Class78_Sub2_Sub2 local9 = new Class78_Sub2_Sub2();
			local16 = local9.method5047();
			Static427.anObject17 = Static591.method8149(local16);
		}
		if (Static570.anObject20 == null) {
			@Pc(31) Class78_Sub1_Sub2 local31 = new Class78_Sub1_Sub2();
			local16 = local31.method7626();
			Static570.anObject20 = Static591.method8149(local16);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6946(@OriginalArg(0) String arg0) {
		return Static21.aHashtable2.containsKey(arg0);
	}
}
