import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
	public static int anInt3928;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1374 = Static151.method2243(" loggt sich ein)3");

	@OriginalMember(owner = "client!ti", name = "ab", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1375 = Static151.method2243("null");

	@OriginalMember(owner = "client!ti", name = "gb", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!pb;ZBLclient!j;Lclient!pb;)V")
	public static void method2721(@OriginalArg(0) Class71 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class2_Sub1_Sub12_Sub1_Sub1 arg2, @OriginalArg(4) Class71 arg3) {
		Static69.aBoolean61 = arg1;
		Static93.aClass71_17 = arg3;
		Static58.aClass71_12 = arg0;
		@Pc(23) int local23 = Static58.aClass71_12.method2135() - 1;
		Static77.anInt3590 = local23 * 256 + Static58.aClass71_12.method2117(local23);
		Static8.aClass2_Sub1_Sub12_Sub1_Sub1_1 = arg2;
	}
}
