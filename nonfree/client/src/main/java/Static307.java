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

public final class Static307 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!dn;")
	public static Class69 aClass69_61;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_34 = new Class295();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	public static void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(12, arg1);
		local8.method6693();
		local8.anInt7487 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILclient!kj;)V")
	public static void method5377(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17_Sub2 arg1) {
		while (true) {
			@Pc(15) Class1_Sub33 local15 = (Class1_Sub33) Static71.aClass295_8.method7543();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt5388; local22++) {
				if (local15.aClass311Array1[local22] != null) {
					if (local15.aClass311Array1[local22].anInt9169 == 2) {
						local15.anIntArray439[local22] = -5;
					}
					if (local15.aClass311Array1[local22].anInt9169 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass311Array2[local22] != null) {
					if (local15.aClass311Array2[local22].anInt9169 == 2) {
						local15.anIntArray439[local22] = -6;
					}
					if (local15.aClass311Array2[local22].anInt9169 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method4508(arg0);
			arg1.method4451(0);
			@Pc(105) int local105 = arg1.anInt4872;
			arg1.method4489(local15.anInt5389);
			for (@Pc(112) int local112 = 0; local112 < local15.anInt5388; local112++) {
				if (local15.anIntArray439[local112] == 0) {
					try {
						@Pc(138) int local138 = local15.anIntArray441[local112];
						@Pc(158) Field local158;
						@Pc(161) int local161;
						if (local138 == 0) {
							local158 = (Field) local15.aClass311Array1[local112].anObject17;
							local161 = local158.getInt(null);
							arg1.method4451(0);
							arg1.method4489(local161);
						} else if (local138 == 1) {
							local158 = (Field) local15.aClass311Array1[local112].anObject17;
							local158.setInt(null, local15.anIntArray440[local112]);
							arg1.method4451(0);
						} else if (local138 == 2) {
							local158 = (Field) local15.aClass311Array1[local112].anObject17;
							local161 = local158.getModifiers();
							arg1.method4451(0);
							arg1.method4489(local161);
						}
						@Pc(226) Method local226;
						if (local138 == 3) {
							local226 = (Method) local15.aClass311Array2[local112].anObject17;
							@Pc(231) byte[][] local231 = local15.aByteArrayArrayArray11[local112];
							@Pc(235) Object[] local235 = new Object[local231.length];
							for (@Pc(237) int local237 = 0; local237 < local231.length; local237++) {
								@Pc(249) ObjectInputStream local249 = new ObjectInputStream(new ByteArrayInputStream(local231[local237]));
								local235[local237] = local249.readObject();
							}
							@Pc(264) Object local264 = local226.invoke(null, local235);
							if (local264 == null) {
								arg1.method4451(0);
							} else if (local264 instanceof Number) {
								arg1.method4451(1);
								arg1.method4452(((Number) local264).longValue());
							} else if (local264 instanceof String) {
								arg1.method4451(2);
								arg1.method4464((String) local264);
							} else {
								arg1.method4451(4);
							}
						} else if (local138 == 4) {
							local226 = (Method) local15.aClass311Array2[local112].anObject17;
							local161 = local226.getModifiers();
							arg1.method4451(0);
							arg1.method4489(local161);
						}
					} catch (@Pc(334) ClassNotFoundException local334) {
						arg1.method4451(-10);
					} catch (@Pc(340) InvalidClassException local340) {
						arg1.method4451(-11);
					} catch (@Pc(348) StreamCorruptedException local348) {
						arg1.method4451(-12);
					} catch (@Pc(354) OptionalDataException local354) {
						arg1.method4451(-13);
					} catch (@Pc(360) IllegalAccessException local360) {
						arg1.method4451(-14);
					} catch (@Pc(366) IllegalArgumentException local366) {
						arg1.method4451(-15);
					} catch (@Pc(372) InvocationTargetException local372) {
						arg1.method4451(-16);
					} catch (@Pc(378) SecurityException local378) {
						arg1.method4451(-17);
					} catch (@Pc(384) IOException local384) {
						arg1.method4451(-18);
					} catch (@Pc(392) NullPointerException local392) {
						arg1.method4451(-19);
					} catch (@Pc(398) Exception local398) {
						arg1.method4451(-20);
					} catch (@Pc(404) Throwable local404) {
						arg1.method4451(-21);
					}
				} else {
					arg1.method4451(local15.anIntArray439[local112]);
				}
			}
			arg1.method4443(local105);
			arg1.method4441(arg1.anInt4872 - local105);
			local15.method8239();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIIIIZ)V")
	public static void method5379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(19) long local19 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(25) Class1_Sub8 local25 = (Class1_Sub8) Static534.aClass230_49.method6144(local19);
		if (local25 == null) {
			local25 = new Class1_Sub8();
			Static534.aClass230_49.method6139(local19, local25);
		}
		if (local25.anIntArray118.length <= arg1) {
			@Pc(50) int[] local50 = new int[arg1 + 1];
			@Pc(55) int[] local55 = new int[arg1 + 1];
			for (@Pc(57) int local57 = 0; local57 < local25.anIntArray118.length; local57++) {
				local50[local57] = local25.anIntArray118[local57];
				local55[local57] = local25.anIntArray119[local57];
			}
			for (@Pc(83) int local83 = local25.anIntArray118.length; local83 < arg1; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local25.anIntArray119 = local55;
			local25.anIntArray118 = local50;
		}
		local25.anIntArray118[arg1] = arg3;
		local25.anIntArray119[arg1] = arg0;
	}
}
