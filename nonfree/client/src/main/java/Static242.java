import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
	public static String method4221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[local17 + arg1] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(48) char local48 = Static422.aCharArray8[local27 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local27 = local48;
				}
				local8[local15++] = (char) local27;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIILclient!mf;)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4 arg4) {
		@Pc(4) Class276 local4 = Static417.method5977(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1810 = (arg1 << Static339.anInt6128) + Static108.anInt2068;
		arg4.anInt1806 = arg3;
		arg4.anInt1808 = (arg2 << Static339.anInt6128) + Static108.anInt2068;
		for (@Pc(28) Class267 local28 = local4.aClass267_3; local28 != null; local28 = local28.aClass267_2) {
			if (local28.aClass4_Sub1_2.aBoolean731) {
				@Pc(38) int local38 = local28.aClass4_Sub1_2.method7790();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1806 += local8;
			arg4.aBoolean131 = true;
		} else if (local4.aClass4_Sub3_2 != null) {
			arg4.anInt1806 -= local4.aClass4_Sub3_2.aShort76;
		}
		local4.aClass4_Sub4_1 = arg4;
	}
}
