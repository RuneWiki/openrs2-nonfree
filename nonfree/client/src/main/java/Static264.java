import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!hba;")
	public static Class126 aClass126_5;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_66;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZ)V")
	public static void method4415(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static453.method6410(-1, arg3, true, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!rr;Z)Lclient!rr;")
	public static Class292 method4416(@OriginalArg(0) Class292 arg0) {
		if (arg0.anInt7901 != -1) {
			return Static367.method5505(arg0.anInt7901);
		}
		@Pc(29) int local29 = arg0.anInt7890 >>> 16;
		@Pc(34) Class255 local34 = new Class255(Static224.aClass128_23);
		for (@Pc(39) Class6_Sub11 local39 = (Class6_Sub11) local34.method5928(); local39 != null; local39 = (Class6_Sub11) local34.method5925()) {
			if (local29 == local39.anInt1216) {
				return Static367.method5505((int) local39.aLong263);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method4420(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg2 >> 2);
		@Pc(20) int local20 = -(arg2 & 0x3);
		for (@Pc(23) int local23 = -arg6; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg0++;
				arg1[local31] += arg4[arg7++];
				@Pc(43) int local43 = arg0++;
				arg1[local43] += arg4[arg7++];
				@Pc(55) int local55 = arg0++;
				arg1[local55] += arg4[arg7++];
				@Pc(67) int local67 = arg0++;
				arg1[local67] += arg4[arg7++];
			}
			for (@Pc(82) int local82 = local20; local82 < 0; local82++) {
				local31 = arg0++;
				arg1[local31] += arg4[arg7++];
			}
			arg0 += arg3;
			arg7 += arg5;
		}
	}
}
