import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_68 = new Class156(82, -1);

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "[Lclient!nq;")
	public static final Class5_Sub41[] aClass5_Sub41Array1 = new Class5_Sub41[300];

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt3670 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!mj;Lclient!ha;I)V")
	public static void method3364(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class100 arg1) {
		@Pc(35) boolean local35 = Static82.aClass134_1.method3197(arg0.anInt6030, arg0.anInt5990, arg0.aBoolean398 ? Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 : null, arg0.anInt5952, arg1, arg0.anInt5997 | 0xFF000000, arg0.anInt6017) == null;
		if (local35) {
			Static385.aClass20_32.method370(new Class5_Sub45(arg0.anInt5990, arg0.anInt6017, arg0.anInt6030, arg0.anInt5997 | 0xFF000000, arg0.anInt5952, arg0.aBoolean398));
			Static333.method5032(arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(JIZIB)Ljava/lang/String;")
	public static String method3367(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(14) char local14 = ',';
		@Pc(16) char local16 = '.';
		if (arg3 == 0) {
			local14 = '.';
			local16 = ',';
		}
		if (arg3 == 2) {
			local16 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local29 = true;
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg1 > 0) {
			for (local52 = 0; local52 < arg1; local52++) {
				local57 = (int) arg0;
				arg0 /= 10L;
				local45.append((char) (local57 + 48 - (int) arg0 * 10));
			}
			local45.append(local14);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg0;
			arg0 /= 10L;
			local45.append((char) (local57 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local29) {
					local45.append('-');
				}
				return local45.reverse().toString();
			}
			if (arg2) {
				local52++;
				if (local52 % 3 == 0) {
					local45.append(local16);
				}
			}
		}
	}
}
