import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Lclient!sk;")
	public static Class312 aClass312_2;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!ni;")
	public static Class223 aClass223_74;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_122 = new Class73(72, 0);

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_69 = new Class185(81, 7);

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
	public static int anInt6970 = 0;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZLclient!kt;)I")
	public static int method5822(@OriginalArg(1) Class178 arg0) {
		if (Static457.aClass178_11 == arg0) {
			return 6407;
		} else if (Static120.aClass178_4 == arg0) {
			return 6408;
		} else if (Static268.aClass178_6 == arg0) {
			return 6406;
		} else if (Static321.aClass178_7 == arg0) {
			return 6409;
		} else if (Static137.aClass178_5 == arg0) {
			return 6410;
		} else if (arg0 == Static493.aClass178_12) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZLclient!hr;Z)V")
	public static void method5823(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub25 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt5034;
		@Pc(12) int local12 = (int) arg1.aLong278;
		arg1.method8792();
		if (arg2) {
			Static434.method8407(local8);
		}
		Static39.method1337(local8);
		@Pc(31) Class302 local31 = Static299.method5103(local12);
		if (local31 != null) {
			Static580.method8049(local31);
		}
		Static409.method6424();
		if (!arg0 && Static30.anInt830 != -1) {
			Static375.method5973(1, Static30.anInt830);
		}
		@Pc(53) Class76 local53 = new Class76(Static214.aClass380_15);
		for (@Pc(58) Class6_Sub25 local58 = (Class6_Sub25) local53.method2561(); local58 != null; local58 = (Class6_Sub25) local53.method2559()) {
			if (!local58.method8791()) {
				local58 = (Class6_Sub25) local53.method2561();
				if (local58 == null) {
					break;
				}
			}
			if (local58.anInt5035 == 3) {
				@Pc(83) int local83 = (int) local58.aLong278;
				if (local8 == local83 >>> 16) {
					method5823(arg0, local58, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/net/Socket;BI)Lclient!ida;")
	public static Class41 method5825(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class41_Sub1(arg0, 7500);
	}
}
