import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public static int anInt5981;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	public static int anInt5982;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
	public static int anInt5984;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[BIB)I")
	public static int method5192(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = Class10_Sub5_Sub1.anIntArray278[(local7 ^ arg1[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
