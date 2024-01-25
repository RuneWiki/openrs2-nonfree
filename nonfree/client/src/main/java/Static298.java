import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "Lclient!ef;")
	public static Class102 aClass102_38 = new Class102();

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "[[Ljava/lang/String;")
	public static String[][] aStringArrayArray3 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "Lclient!vea;")
	public static final Class368 aClass368_7 = new Class368();

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
	public static void method4397() {
		Static171.aClass391_16.method9274(50);
		Static536.aClass391_51.method9274(50);
		Static606.aClass391_58.method9274(50);
		Static276.aClass391_24.method9274(50);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZLclient!cn;)V")
	public static void method4399(@OriginalArg(1) Class73 arg0) {
		if (arg0.anInt1365 == Static140.anInt2267) {
			Static386.aBooleanArray13[arg0.anInt1359] = true;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!sg;Z)V")
	public static void method4400(@OriginalArg(0) Class5_Sub5_Sub19 arg0) {
		if (arg0 == null) {
			return;
		}
		Static199.aClass102_63.method1921(arg0);
		Static481.anInt8130++;
		@Pc(43) Class5_Sub5_Sub18 local43;
		if (arg0.aBoolean709 || "".equals(arg0.aString120)) {
			local43 = new Class5_Sub5_Sub18(arg0.aString120);
			Static220.anInt3580++;
		} else {
			@Pc(37) long local37 = arg0.aLong268;
			for (local43 = (Class5_Sub5_Sub18) Static595.aClass291_42.method6993(local37, 1); local43 != null && !local43.aString102.equals(arg0.aString120); local43 = (Class5_Sub5_Sub18) Static595.aClass291_42.method6985(-36)) {
			}
			if (local43 == null) {
				local43 = (Class5_Sub5_Sub18) Static488.aClass391_46.method9275(local37);
				if (local43 != null && !local43.aString102.equals(arg0.aString120)) {
					local43 = null;
				}
				if (local43 == null) {
					local43 = new Class5_Sub5_Sub18(arg0.aString120);
				}
				Static595.aClass291_42.method6984(local37, local43);
				Static220.anInt3580++;
			}
		}
		if (local43.method6567(arg0)) {
			Static677.method9299(local43);
		}
	}
}
