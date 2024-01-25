import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public static int anInt2195;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
	public static int anInt2196 = 0;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!hw;)Lclient!sd;")
	public static Class2_Sub2 method2042(@OriginalArg(1) Class2_Sub17 arg0) {
		arg0.method6138();
		@Pc(17) int local17 = arg0.method6138();
		@Pc(21) Class2_Sub2 local21 = Static158.method2341(local17);
		local21.anInt7759 = arg0.method6138();
		@Pc(32) int local32 = arg0.method6138();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(40) int local40 = arg0.method6138();
			local21.method6273(arg0, local40);
		}
		local21.method6262();
		return local21;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lclient!or;")
	public static Class11_Sub2 method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub2_1;
	}
}
