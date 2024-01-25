import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "Lclient!ti;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "Z")
	public static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "[I")
	public static final int[] anIntArray202 = new int[2048];

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lclient!rp;")
	public static final Class3_Sub5 aClass3_Sub5_5 = new Class3_Sub5(new byte[5000]);

	@OriginalMember(owner = "client!fh", name = "R", descriptor = "Lclient!us;")
	public static final Class234 aClass234_44 = new Class234(15, 2);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!b;)V")
	public static void method1692(@OriginalArg(1) Class20 arg0) {
		Static346.aClass20_89 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!b;Ljava/lang/String;B)Lclient!nr;")
	public static Class169 method1693(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) String arg2) {
		@Pc(10) int local10 = arg1.method230(arg2);
		if (local10 == -1) {
			return new Class169(0);
		}
		@Pc(24) int[] local24 = arg1.method228(local10);
		@Pc(35) Class169 local35 = new Class169(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local35.anInt4240) {
				@Pc(55) Class3_Sub5 local55 = new Class3_Sub5(arg1.method253(local24[local39++], local10));
				@Pc(61) int local61 = local55.method2726();
				@Pc(65) int local65 = local55.method2767();
				@Pc(69) int local69 = local55.method2739();
				if (!arg0 && local69 == 1) {
					local35.anInt4240--;
				} else {
					local35.anIntArray480[local37] = local61;
					local35.anIntArray481[local37] = local65;
					local37++;
				}
			}
			return local35;
		}
	}
}
