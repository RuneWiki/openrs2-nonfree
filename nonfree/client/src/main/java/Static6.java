import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!fv;")
	public static final Class108 aClass108_7 = new Class108();

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_111 = new Class319(47, 5);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIBII[BI[BI)V")
	public static void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg7 >> 2);
		@Pc(20) int local20 = -(arg7 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg1++;
				arg4[local31] = (byte) (arg4[local31] - arg6[arg3++]);
				@Pc(44) int local44 = arg1++;
				arg4[local44] = (byte) (arg4[local44] - arg6[arg3++]);
				@Pc(57) int local57 = arg1++;
				arg4[local57] = (byte) (arg4[local57] - arg6[arg3++]);
				@Pc(70) int local70 = arg1++;
				arg4[local70] = (byte) (arg4[local70] - arg6[arg3++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg1++;
				arg4[local31] = (byte) (arg4[local31] - arg6[arg3++]);
			}
			arg3 += arg0;
			arg1 += arg2;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lclient!lr;")
	public static Class208_Sub1 method5138() {
		Static96.anInt2042 = 0;
		return Static402.method5681();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!kt;Lclient!r;IIIBLclient!lv;Lclient!bda;)V")
	public static void method5140(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1_Sub27 arg5, @OriginalArg(7) Class27 arg6) {
		@Pc(15) int local15 = arg5.anInt5626 - arg4 / 2 - 5;
		@Pc(19) int local19 = arg3 + 2;
		if (arg0.anInt5167 != 0) {
			arg1.method6418(arg6.method849() * arg2 + arg3 + 1 - local19, local15, local19, arg4 + 10, arg0.anInt5167);
		}
		if (arg0.anInt5166 != 0) {
			arg1.method6456(local19, local15, arg3 + arg2 * arg6.method849() + 1 - local19, arg4 + 10, arg0.anInt5166);
		}
		@Pc(79) int local79 = arg0.anInt5165;
		if (arg5.aBoolean417 && arg0.anInt5161 != -1) {
			local79 = arg0.anInt5161;
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			@Pc(98) String local98 = Static461.aStringArray31[local92];
			if (arg2 - 1 > local92) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg6.method852(arg1, local98, arg5.anInt5626, arg3, local79);
			arg3 += arg6.method849();
		}
	}
}
