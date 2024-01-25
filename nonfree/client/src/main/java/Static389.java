import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!mfa", name = "O", descriptor = "I")
	public static int anInt7012;

	@OriginalMember(owner = "client!mfa", name = "B", descriptor = "Lclient!la;")
	public static Class220 aClass220_1;

	@OriginalMember(owner = "client!mfa", name = "A", descriptor = "Lclient!ej;")
	public static Class3_Sub4_Sub5 aClass3_Sub4_Sub5_2;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BJIIZ)Ljava/lang/String;")
	public static String method5886(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(14) char local14 = ',';
		@Pc(16) char local16 = '.';
		if (arg1 == 0) {
			local16 = ',';
			local14 = '.';
		}
		if (arg1 == 2) {
			local16 = ' ';
		}
		@Pc(34) boolean local34 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local34 = true;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg2 > 0) {
			for (local52 = 0; local52 < arg2; local52++) {
				local57 = (int) arg0;
				arg0 /= 10L;
				local48.append((char) (local57 + 48 - (int) arg0 * 10));
			}
			local48.append(local14);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg0;
			arg0 /= 10L;
			local48.append((char) (local57 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local34) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg3) {
				local52++;
				if (local52 % 3 == 0) {
					local48.append(local16);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!lb;BI)Lclient!ut;")
	public static Class3_Sub54 method5888(@OriginalArg(0) Class221 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method5077(arg1);
		return local8 == null ? null : new Class3_Sub54(local8);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BI)Lclient!ila;")
	public static Class173 method5892(@OriginalArg(1) int arg0) {
		@Pc(16) Class173 local16 = (Class173) Static628.aClass338_58.method8049((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static492.aClass221_129.method5089(arg0, 0);
		local16 = new Class173();
		if (local27 != null) {
			local16.method4243(new Class3_Sub28(local27));
		}
		local16.method4240();
		Static628.aClass338_58.method8044((long) arg0, local16);
		return local16;
	}
}
