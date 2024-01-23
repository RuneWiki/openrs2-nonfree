import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_10;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_422 = null;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt1181 = 0;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean61 = true;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!hh;")
	private static Class50 aClass50_423 = Static186.method3527("Loaded fonts");

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_424 = Static186.method3527(" (X");

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_425 = aClass50_423;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_426 = Static186.method3527("mapdots");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILclient!ta;JLclient!ta;Lclient!ta;)V")
	public static void method903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(7) Class20 arg7) {
		@Pc(3) Class122 local3 = new Class122();
		local3.aClass20_9 = arg4;
		local3.anInt4284 = arg1 * 128 + 64;
		local3.anInt4286 = arg2 * 128 + 64;
		local3.anInt4285 = arg3;
		local3.aLong164 = arg5;
		local3.aClass20_7 = arg6;
		local3.aClass20_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub11 local42 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1072; local46++) {
				@Pc(52) Class94 local52 = local42.aClass94Array1[local46];
				if ((local52.aLong143 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass20_5.method3494();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt4290 = -local34;
		if (Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub11(arg0, arg1, arg2);
		}
		Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2].aClass122_1 = local3;
	}
}
