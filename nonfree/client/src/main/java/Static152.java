import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!gda", name = "D", descriptor = "I")
	public static int anInt8130;

	@OriginalMember(owner = "client!gda", name = "F", descriptor = "I")
	public static int anInt8131;

	@OriginalMember(owner = "client!gda", name = "q", descriptor = "Lclient!rp;")
	public static final Class252 aClass252_2 = new Class252();

	@OriginalMember(owner = "client!gda", name = "x", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_225 = new Class202("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!gda", name = "z", descriptor = "I")
	public static int anInt8128 = 999999;

	@OriginalMember(owner = "client!gda", name = "A", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_64 = new Class231(4);

	@OriginalMember(owner = "client!gda", name = "C", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_82 = new Class243(25, 18);

	@OriginalMember(owner = "client!gda", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!hs;IIII)V")
	public static void method6814(@OriginalArg(0) Class2_Sub27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg2 << 28 | arg1 << 14 | arg3);
		@Pc(22) Class2_Sub40 local22 = (Class2_Sub40) Static357.aClass127_36.method3205(local16);
		if (local22 == null) {
			local22 = new Class2_Sub40();
			Static357.aClass127_36.method3213(local22, local16);
			local22.aClass249_57.method6523(arg0);
			return;
		}
		@Pc(45) Class300 local45 = Static464.aClass115_1.method2970(arg0.anInt3463);
		@Pc(48) int local48 = local45.anInt8941;
		if (local45.anInt8930 == 1) {
			local48 *= arg0.anInt3461 + 1;
		}
		for (@Pc(70) Class2_Sub27 local70 = (Class2_Sub27) local22.aClass249_57.method6527(); local70 != null; local70 = (Class2_Sub27) local22.aClass249_57.method6525()) {
			local45 = Static464.aClass115_1.method2970(local70.anInt3463);
			@Pc(81) int local81 = local45.anInt8941;
			if (local45.anInt8930 == 1) {
				local81 *= local70.anInt3461 + 1;
			}
			if (local81 < local48) {
				Static270.method7136(local70, arg0);
				return;
			}
		}
		local22.aClass249_57.method6523(arg0);
	}
}
