import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	public static int anInt2270;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_90 = new Class196(96, 6);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!rv;)Lclient!gea;")
	public static Class110_Sub1 method2042(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(14) Class110 local14 = Static273.method3805(arg0);
		@Pc(18) int local18 = arg0.method3698();
		@Pc(22) int local22 = arg0.method3698();
		@Pc(26) int local26 = arg0.method3698();
		@Pc(30) int local30 = arg0.method3698();
		@Pc(34) int local34 = arg0.method3698();
		@Pc(38) int local38 = arg0.method3698();
		return new Class110_Sub1(local14.aClass112_16, local14.aClass4_11, local14.anInt8734, local14.anInt8739, local14.anInt8729, local14.anInt8731, local14.anInt8738, local14.anInt8732, local14.anInt8733, local18, local22, local26, local30, local34, local38);
	}
}
