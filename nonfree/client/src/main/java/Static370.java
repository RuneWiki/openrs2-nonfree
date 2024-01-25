import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!st", name = "w", descriptor = "I")
	public static int anInt6673;

	@OriginalMember(owner = "client!st", name = "A", descriptor = "Lclient!he;")
	public static Class100 aClass100_75;

	@OriginalMember(owner = "client!st", name = "t", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!st", name = "v", descriptor = "I")
	public static int anInt6672 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BZ)V")
	public static void method5559(@OriginalArg(0) byte arg0) {
		if (Static112.aByteArrayArrayArray4 == null) {
			Static112.aByteArrayArrayArray4 = new byte[4][Static181.anInt3574][Static117.anInt2450];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static181.anInt3574; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static117.anInt2450; local27++) {
					Static112.aByteArrayArrayArray4[local19][local23][local27] = arg0;
				}
			}
		}
	}
}
