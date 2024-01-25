import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static int anInt6286;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt6288;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public static int anInt6289;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static int anInt6290;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_203 = new Class175("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_207 = new Class92(27, 5);

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public static int anInt6291 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLclient!wt;)V")
	public static void method4954(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2_Sub2 arg1) {
		while (true) {
			@Pc(12) Class3_Sub7 local12 = (Class3_Sub7) Static137.aClass229_23.method5328();
			if (local12 == null) {
				return;
			}
			@Pc(17) boolean local17 = false;
			for (@Pc(19) int local19 = 0; local19 < local12.anInt837; local19++) {
				if (local12.aClass190Array2[local19] != null) {
					if (local12.aClass190Array2[local19].anInt5799 == 2) {
						local12.anIntArray61[local19] = -5;
					}
					if (local12.aClass190Array2[local19].anInt5799 == 0) {
						local17 = true;
					}
				}
				if (local12.aClass190Array1[local19] != null) {
					if (local12.aClass190Array1[local19].anInt5799 == 2) {
						local12.anIntArray61[local19] = -6;
					}
					if (local12.aClass190Array1[local19].anInt5799 == 0) {
						local17 = true;
					}
				}
			}
			if (local17) {
				return;
			}
			arg1.method6058(arg0);
			arg1.method6001(0);
			@Pc(98) int local98 = arg1.anInt7620;
			arg1.method6008(local12.anInt836);
			for (@Pc(105) int local105 = 0; local105 < local12.anInt837; local105++) {
				if (local12.anIntArray61[local105] == 0) {
					try {
						@Pc(124) int local124 = local12.anIntArray59[local105];
						@Pc(136) Field local136;
						@Pc(140) int local140;
						if (local124 == 0) {
							local136 = (Field) local12.aClass190Array2[local105].anObject7;
							local140 = local136.getInt(null);
							arg1.method6001(0);
							arg1.method6008(local140);
						} else if (local124 == 1) {
							local136 = (Field) local12.aClass190Array2[local105].anObject7;
							local136.setInt(null, local12.anIntArray60[local105]);
							arg1.method6001(0);
						} else if (local124 == 2) {
							local136 = (Field) local12.aClass190Array2[local105].anObject7;
							local140 = local136.getModifiers();
							arg1.method6001(0);
							arg1.method6008(local140);
						}
						@Pc(207) Method local207;
						if (local124 == 3) {
							local207 = (Method) local12.aClass190Array1[local105].anObject7;
							@Pc(231) byte[][] local231 = local12.aByteArrayArrayArray13[local105];
							@Pc(235) Object[] local235 = new Object[local231.length];
							for (@Pc(237) int local237 = 0; local237 < local231.length; local237++) {
								@Pc(248) ObjectInputStream local248 = new ObjectInputStream(new ByteArrayInputStream(local231[local237]));
								local235[local237] = local248.readObject();
							}
							@Pc(263) Object local263 = local207.invoke(null, local235);
							if (local263 == null) {
								arg1.method6001(0);
							} else if (local263 instanceof Number) {
								arg1.method6001(1);
								arg1.method5990(((Number) local263).longValue());
							} else if (local263 instanceof String) {
								arg1.method6001(2);
								arg1.method6033((String) local263);
							} else {
								arg1.method6001(4);
							}
						} else if (local124 == 4) {
							local207 = (Method) local12.aClass190Array1[local105].anObject7;
							local140 = local207.getModifiers();
							arg1.method6001(0);
							arg1.method6008(local140);
						}
					} catch (@Pc(303) ClassNotFoundException local303) {
						arg1.method6001(-10);
					} catch (@Pc(309) InvalidClassException local309) {
						arg1.method6001(-11);
					} catch (@Pc(315) StreamCorruptedException local315) {
						arg1.method6001(-12);
					} catch (@Pc(321) OptionalDataException local321) {
						arg1.method6001(-13);
					} catch (@Pc(327) IllegalAccessException local327) {
						arg1.method6001(-14);
					} catch (@Pc(333) IllegalArgumentException local333) {
						arg1.method6001(-15);
					} catch (@Pc(339) InvocationTargetException local339) {
						arg1.method6001(-16);
					} catch (@Pc(345) SecurityException local345) {
						arg1.method6001(-17);
					} catch (@Pc(351) IOException local351) {
						arg1.method6001(-18);
					} catch (@Pc(357) NullPointerException local357) {
						arg1.method6001(-19);
					} catch (@Pc(363) Exception local363) {
						arg1.method6001(-20);
					} catch (@Pc(369) Throwable local369) {
						arg1.method6001(-21);
					}
				} else {
					arg1.method6001(local12.anIntArray61[local105]);
				}
			}
			arg1.method6029(local98);
			arg1.method5993(arg1.anInt7620 - local98);
			local12.method5987();
		}
	}
}
