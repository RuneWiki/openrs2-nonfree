import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "Lclient!nha;")
	public static Class245 aClass245_12;

	@OriginalMember(owner = "client!pm", name = "ub", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[5];

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "(I)[Lclient!hga;")
	public static Class142[] method6625() {
		if (Static632.aClass142Array1 == null) {
			@Pc(13) Class142[] local13 = Static10.method207(Static470.aClass100_14);
			@Pc(17) Class142[] local17 = new Class142[local13.length];
			@Pc(19) int local19 = 0;
			@Pc(24) int local24 = Static97.aClass5_Sub25_8.aClass6_Sub27_1.method8027();
			@Pc(83) int local83;
			@Pc(89) Class142 local89;
			label70: for (@Pc(26) int local26 = 0; local26 < local13.length; local26++) {
				@Pc(32) Class142 local32 = local13[local26];
				if ((local32.anInt3958 <= 0 || local32.anInt3958 >= 24) && local32.anInt3955 >= 800 && local32.anInt3959 >= 600 && (local24 != 2 || local32.anInt3955 <= 800 && local32.anInt3959 <= 600) && (local24 != 1 || local32.anInt3955 <= 1024 && local32.anInt3959 <= 768)) {
					for (local83 = 0; local83 < local19; local83++) {
						local89 = local17[local83];
						if (local32.anInt3955 == local89.anInt3955 && local32.anInt3959 == local89.anInt3959) {
							if (local89.anInt3958 < local32.anInt3958) {
								local17[local83] = local32;
							}
							continue label70;
						}
					}
					local17[local19] = local32;
					local19++;
				}
			}
			Static632.aClass142Array1 = new Class142[local19];
			Static652.method4545(local17, 0, Static632.aClass142Array1, 0, local19);
			@Pc(137) int[] local137 = new int[Static632.aClass142Array1.length];
			for (local83 = 0; local83 < Static632.aClass142Array1.length; local83++) {
				local89 = Static632.aClass142Array1[local83];
				local137[local83] = local89.anInt3955 * local89.anInt3959;
			}
			Static542.method7943(local137, Static632.aClass142Array1);
		}
		return Static632.aClass142Array1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
	public static String method6630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg1 == 0) {
			local12 = '.';
			local14 = ',';
		}
		if (arg1 == 2) {
			local14 = ' ';
		}
		@Pc(30) boolean local30 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local30 = true;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg0 > 0) {
			for (local50 = 0; local50 < arg0; local50++) {
				local55 = (int) arg3;
				arg3 /= 10L;
				local46.append((char) (local55 + 48 - (int) arg3 * 10));
			}
			local46.append(local12);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg3;
			arg3 /= 10L;
			local46.append((char) (local55 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local30) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg2) {
				local50++;
				if (local50 % 3 == 0) {
					local46.append(local14);
				}
			}
		}
	}
}
