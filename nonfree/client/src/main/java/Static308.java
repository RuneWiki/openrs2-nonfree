import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_127 = new Class119("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "[I")
	public static final int[] anIntArray354 = new int[2048];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method4205(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg1, 2);
		local8.method2661();
		local8.aString38 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!er;ZLclient!za;I)V")
	public static void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(4) Class34 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class204 local9 = Static355.aClass263_4.method5835(arg2.anInt1800);
		if (local9.anInt5707 == -1) {
			return;
		}
		if (arg2.aBoolean207) {
			@Pc(22) int local22 = arg0 + arg2.anInt1783;
			arg0 = local22 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(38) Class6 local38 = local9.method4502(arg3, arg0, arg2.aBoolean209);
		if (local38 == null) {
			return;
		}
		@Pc(48) int local48 = arg2.anInt1810;
		@Pc(51) int local51 = arg2.anInt1803;
		if ((arg0 & 0x1) == 1) {
			local48 = arg2.anInt1803;
			local51 = arg2.anInt1810;
		}
		@Pc(67) int local67 = local38.RA();
		@Pc(70) int local70 = local38.Q();
		if (local9.aBoolean650) {
			local70 = local51 * 4;
			local67 = local48 * 4;
		}
		if (local9.anInt5704 == 0) {
			local38.method5891(arg4, arg1 + 4 - local51 * 4, local67, local70);
		} else {
			local38.ya(arg4, arg1 + 4 - local51 * 4, local67, local70, 0, local9.anInt5704 | 0xFF000000, 1);
		}
	}
}
