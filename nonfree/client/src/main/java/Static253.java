import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!eq;")
	public static Class97 aClass97_65;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Z")
	public static boolean aBoolean399 = true;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public static final int anInt5003 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!oea;)V")
	public static void method4170(@OriginalArg(1) Class87_Sub2 arg0) {
		@Pc(14) byte[] local14;
		if (Static20.anObject1 == null) {
			@Pc(5) Class80_Sub1_Sub2 local5 = new Class80_Sub1_Sub2();
			local14 = local5.method7319();
			Static20.anObject1 = Static609.method8332(local14);
		}
		if (Static529.anObject15 == null) {
			@Pc(29) Class80_Sub2_Sub1 local29 = new Class80_Sub2_Sub1();
			local14 = local29.method7648();
			Static529.anObject15 = Static609.method8332(local14);
		}
		@Pc(51) Class323 local51 = arg0.aClass323_1;
		if (local51.method7611() && Static562.anObject17 == null) {
			local14 = Static569.method7835(4.0F, new Class256_Sub1(419684), 0.6F, 16.0F, 0.5F, 4.0F);
			Static562.anObject17 = Static609.method8332(local14);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!kca;Z)I")
	public static int method4172(@OriginalArg(0) Class187 arg0) {
		if (Static419.aClass187_11 == arg0) {
			return 6407;
		} else if (arg0 == Static524.aClass187_15) {
			return 6408;
		} else if (arg0 == Static249.aClass187_7) {
			return 6406;
		} else if (arg0 == Static232.aClass187_10) {
			return 6409;
		} else if (arg0 == Static457.aClass187_13) {
			return 6410;
		} else if (arg0 == Static215.aClass187_4) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
