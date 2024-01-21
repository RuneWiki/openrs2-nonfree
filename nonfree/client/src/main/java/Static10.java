import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!lf;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Z")
	public static boolean aBoolean6;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!dc;")
	public static Class1_Sub5 aClass1_Sub5_7 = new Class1_Sub5(8);

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public static int anInt264 = 0;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!fc;")
	private static Class25 aClass25_139 = Static78.method1313("From");

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!fc;")
	private static Class25 aClass25_142 = Static78.method1313("Loaded gamescreen");

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_140 = aClass25_142;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	public static int anInt265 = 0;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_141 = aClass25_139;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public static int anInt267 = 0;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public static int anInt268 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public static int anInt269 = 0;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public static int anInt270 = 0;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_143 = Static78.method1313("<col=ffff00>*V");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
	public static boolean method247(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method248() {
		aBigInteger1 = null;
		aClass25_140 = null;
		aClass25_139 = null;
		aClass25_143 = null;
		aClass7_1 = null;
		aClass25_141 = null;
		aClass1_Sub5_7 = null;
		aClass25_142 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ob;ILclient!fc;)Lclient!fc;")
	public static Class25 method249(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(2) Class25 arg1) {
		if (arg1.method796(Static33.aClass25_389) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(14) int local14 = arg1.method796(Static63.aClass25_643);
			if (local14 == -1) {
				while (true) {
					local14 = arg1.method796(Static127.aClass25_1420);
					if (local14 == -1) {
						while (true) {
							local14 = arg1.method796(Static7.aClass25_86);
							if (local14 == -1) {
								while (true) {
									local14 = arg1.method796(Static57.aClass25_1183);
									if (local14 == -1) {
										while (true) {
											local14 = arg1.method796(Static32.aClass25_380);
											if (local14 == -1) {
												while (true) {
													local14 = arg1.method796(Static116.aClass25_1297);
													if (local14 == -1) {
														return arg1;
													}
													@Pc(229) Class25 local229 = Static92.aClass25_985;
													if (Static88.aClass50_4 != null) {
														local229 = Static59.method1064(Static88.aClass50_4.anInt1487);
														try {
															if (Static88.aClass50_4.anObject4 != null) {
																@Pc(245) byte[] local245 = ((String) Static88.aClass50_4.anObject4).getBytes("ISO-8859-1");
																local229 = Static26.method598(0, local245, local245.length);
															}
														} catch (@Pc(256) UnsupportedEncodingException local256) {
														}
													}
													arg1 = Static116.method1859(new Class25[] { arg1.method781(0, local14), local229, arg1.method794(local14 + 4) });
												}
											}
											arg1 = Static116.method1859(new Class25[] { arg1.method781(0, local14), Static89.method412(Static98.method1967(arg0, 4)), arg1.method794(local14 + 2) });
										}
									}
									arg1 = Static116.method1859(new Class25[] { arg1.method781(0, local14), Static89.method412(Static98.method1967(arg0, 3)), arg1.method794(local14 + 2) });
								}
							}
							arg1 = Static116.method1859(new Class25[] { arg1.method781(0, local14), Static89.method412(Static98.method1967(arg0, 2)), arg1.method794(local14 + 2) });
						}
					}
					arg1 = Static116.method1859(new Class25[] { arg1.method781(0, local14), Static89.method412(Static98.method1967(arg0, 1)), arg1.method794(local14 + 2) });
				}
			}
			arg1 = Static116.method1859(new Class25[] { arg1.method781(0, local14), Static89.method412(Static98.method1967(arg0, 0)), arg1.method794(local14 + 2) });
		}
	}
}
