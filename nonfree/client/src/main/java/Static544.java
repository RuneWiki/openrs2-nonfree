import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!up", name = "b", descriptor = "Lclient!oga;")
	public static final Class253 aClass253_11 = new Class253();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method7110(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static598.method4261(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	public static void method7111() {
		@Pc(5) int local5 = 0;
		if (Static257.aClass2_Sub35_Sub1_1 != null) {
			local5 = Static257.aClass2_Sub35_Sub1_1.method6051(Static226.anInt3318);
		}
		@Pc(24) int local24;
		@Pc(33) int local33;
		if (local5 == 2) {
			local24 = Static441.anInt7086 <= 800 ? Static441.anInt7086 : 800;
			local33 = Static222.anInt3250 <= 600 ? Static222.anInt3250 : 600;
			Static8.anInt227 = (Static441.anInt7086 - local24) / 2;
			Static172.anInt2621 = local24;
			Static187.anInt8962 = local33;
			Static107.anInt1866 = 0;
		} else if (local5 == 1) {
			local24 = Static441.anInt7086 <= 1024 ? Static441.anInt7086 : 1024;
			local33 = Static222.anInt3250 > 768 ? 768 : Static222.anInt3250;
			Static172.anInt2621 = local24;
			Static8.anInt227 = (Static441.anInt7086 - local24) / 2;
			Static107.anInt1866 = 0;
			Static187.anInt8962 = local33;
		} else {
			Static172.anInt2621 = Static441.anInt7086;
			Static8.anInt227 = 0;
			Static187.anInt8962 = Static222.anInt3250;
			Static107.anInt1866 = 0;
		}
	}
}
