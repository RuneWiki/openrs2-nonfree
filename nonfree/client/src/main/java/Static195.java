import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "Lclient!dj;")
	public static Class51 aClass51_7;

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_67 = new Class154(500);

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString145 = null;

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
	public static final int anInt4211 = -14475237;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[[[Lclient!e;)V")
	public static void method3536(@OriginalArg(1) Class57[][][] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class57[][] local17 = arg0[local11];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < local17[local19].length; local23++) {
					@Pc(31) Class57 local31 = local17[local19][local23];
					if (local31 != null) {
						if (local31.aClass2_Sub5_1 instanceof Interface5) {
							((Interface5) local31.aClass2_Sub5_1).method4731();
						}
						if (local31.aClass2_Sub1_1 instanceof Interface5) {
							((Interface5) local31.aClass2_Sub1_1).method4731();
						}
						if (local31.aClass2_Sub1_2 instanceof Interface5) {
							((Interface5) local31.aClass2_Sub1_2).method4731();
						}
						if (local31.aClass2_Sub4_1 instanceof Interface5) {
							((Interface5) local31.aClass2_Sub4_1).method4731();
						}
						if (local31.aClass2_Sub4_2 instanceof Interface5) {
							((Interface5) local31.aClass2_Sub4_2).method4731();
						}
						for (@Pc(81) Class95 local81 = local31.aClass95_2; local81 != null; local81 = local81.aClass95_3) {
							@Pc(86) Class2_Sub2 local86 = local81.aClass2_Sub2_1;
							if (local86 instanceof Interface5) {
								((Interface5) local86).method4731();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIII)V")
	public static void method3537(@OriginalArg(0) boolean arg0) {
		Static288.aBoolean515 = arg0;
		Static325.anInt6399 = 2;
		Static57.anInt1232 = 22050;
	}
}
