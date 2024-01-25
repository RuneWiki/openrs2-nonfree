import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
	public static int anInt6606;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "Lclient!bs;")
	public static final Class37 aClass37_3 = new Class37(1);

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "[S")
	public static short[] aShortArray121 = new short[256];

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)I")
	public static int method5055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static247.anIntArray459[arg1 & 0x3] : Static72.anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method5056(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class68 local8 = Static115.method1866(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray7 != null) {
			@Pc(18) Class1_Sub10 local18 = new Class1_Sub10();
			local18.anObjectArray2 = local8.anObjectArray7;
			local18.aString10 = arg1;
			local18.aClass68_3 = local8;
			local18.anInt1370 = arg3;
			Static178.method3000(local18);
		}
		if (Static170.anInt3494 != 9) {
			return;
		}
		@Pc(39) boolean local39 = true;
		if (local8.anInt2169 != 0) {
			local39 = Static199.method3191(local8);
		}
		if (!local39 || !Static55.method1059(local8).method4029(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static32.method677(Static23.aClass177_7);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 2) {
			Static32.method677(Static71.aClass177_28);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 3) {
			Static32.method677(Static188.aClass177_52);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 4) {
			Static32.method677(Static372.aClass177_98);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 5) {
			Static32.method677(Static61.aClass177_25);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 6) {
			Static32.method677(Static355.aClass177_92);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 7) {
			Static32.method677(Static260.aClass177_72);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 8) {
			Static32.method677(Static41.aClass177_17);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 9) {
			Static32.method677(Static439.aClass177_107);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
		if (arg3 == 10) {
			Static32.method677(Static407.aClass177_40);
			Static271.method4039(local8.anInt2136, arg0, arg2);
		}
	}
}
