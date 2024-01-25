import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt4862;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Lclient!l;")
	public static Class57 aClass57_16;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[Lclient!l;)V")
	public static void method4184(@OriginalArg(1) Class57[] arg0) {
		Static198.anInt4059 = arg0.length;
		Static327.anIntArray527 = new int[Static198.anInt4059 + 10];
		Static274.aClass57Array22 = new Class57[Static198.anInt4059 + 10];
		Static367.method4036(arg0, 0, Static274.aClass57Array22, 0, Static198.anInt4059);
		for (@Pc(26) int local26 = 0; local26 < Static198.anInt4059; local26++) {
			Static327.anIntArray527[local26] = Static274.aClass57Array22[local26].method5441();
		}
		for (@Pc(41) int local41 = Static198.anInt4059; local41 < Static274.aClass57Array22.length; local41++) {
			Static327.anIntArray527[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!ir;Lclient!ir;)V")
	public static void method4186(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1) {
		Static57.aClass100_21 = arg0;
		Static15.aClass100_10 = arg1;
		Static57.aClass100_21.method2309(34);
	}
}
