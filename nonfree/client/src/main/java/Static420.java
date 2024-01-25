import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!ofa", name = "y", descriptor = "Lclient!uh;")
	public static Class362 aClass362_3;

	@OriginalMember(owner = "client!ofa", name = "C", descriptor = "I")
	public static int anInt7085;

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_184 = new Class381(54, 4);

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZLclient!gda;BIII)V")
	public static void method6160(@OriginalArg(1) Class126 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static38.method678(0L, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IBILclient!gda;)Lclient!pja;")
	public static Class5_Sub1_Sub16 method6161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2) {
		@Pc(14) Class5_Sub36 local14 = new Class5_Sub36(arg2.method3086(arg0, arg1));
		@Pc(54) Class5_Sub1_Sub16 local54 = new Class5_Sub1_Sub16(arg0, local14.method7281(), local14.method7281(), local14.method7268(), local14.method7268(), local14.method7291() == 1, local14.method7291(), local14.method7291());
		@Pc(58) int local58 = local14.method7291();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass20_41.method370(new Class5_Sub33(local14.method7291(), local14.method7333(), local14.method7333(), local14.method7333(), local14.method7333(), local14.method7333(), local14.method7333(), local14.method7333(), local14.method7333()));
		}
		local54.method6480();
		return local54;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)I")
	public static int method6162(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(18) int local18 = (arg0 & 0x7F) * 96 >> 7;
		if (local18 < 2) {
			local18 = 2;
		} else if (local18 > 126) {
			local18 = 126;
		}
		return (arg0 & 0xFF80) + local18;
	}
}
