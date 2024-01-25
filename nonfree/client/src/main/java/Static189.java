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

public final class Static189 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[Lclient!bw;")
	public static Class38[] aClass38Array2;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	public static int anInt3761;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!gga;")
	public static final Class120 aClass120_3 = new Class120();

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!cda;B)V")
	public static void method3292(@OriginalArg(0) Class3_Sub7_Sub1 arg0) {
		@Pc(8) Class3_Sub3 local8 = (Class3_Sub3) Static226.aClass183_27.method4795();
		if (local8 == null) {
			return;
		}
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < local8.anInt610; local15++) {
			if (local8.aClass66Array2[local15] != null) {
				if (local8.aClass66Array2[local15].anInt2308 == 2) {
					local8.anIntArray14[local15] = -5;
				}
				if (local8.aClass66Array2[local15].anInt2308 == 0) {
					local13 = true;
				}
			}
			if (local8.aClass66Array1[local15] != null) {
				if (local8.aClass66Array1[local15].anInt2308 == 2) {
					local8.anIntArray14[local15] = -6;
				}
				if (local8.aClass66Array1[local15].anInt2308 == 0) {
					local13 = true;
				}
			}
		}
		if (local13) {
			return;
		}
		@Pc(84) int local84 = arg0.anInt7869;
		arg0.method6495(local8.anInt607);
		for (@Pc(91) int local91 = 0; local91 < local8.anInt610; local91++) {
			if (local8.anIntArray14[local91] == 0) {
				try {
					@Pc(113) int local113 = local8.anIntArray13[local91];
					@Pc(125) Field local125;
					@Pc(129) int local129;
					if (local113 == 0) {
						local125 = (Field) local8.aClass66Array2[local91].anObject4;
						local129 = local125.getInt(null);
						arg0.method6494(0);
						arg0.method6495(local129);
					} else if (local113 == 1) {
						local125 = (Field) local8.aClass66Array2[local91].anObject4;
						local125.setInt(null, local8.anIntArray12[local91]);
						arg0.method6494(0);
					} else if (local113 == 2) {
						local125 = (Field) local8.aClass66Array2[local91].anObject4;
						local129 = local125.getModifiers();
						arg0.method6494(0);
						arg0.method6495(local129);
					}
					@Pc(196) Method local196;
					if (local113 == 3) {
						local196 = (Method) local8.aClass66Array1[local91].anObject4;
						@Pc(220) byte[][] local220 = local8.aByteArrayArrayArray1[local91];
						@Pc(224) Object[] local224 = new Object[local220.length];
						for (@Pc(226) int local226 = 0; local226 < local220.length; local226++) {
							@Pc(237) ObjectInputStream local237 = new ObjectInputStream(new ByteArrayInputStream(local220[local226]));
							local224[local226] = local237.readObject();
						}
						@Pc(256) Object local256 = local196.invoke(null, local224);
						if (local256 == null) {
							arg0.method6494(0);
						} else if (local256 instanceof Number) {
							arg0.method6494(1);
							arg0.method6533(((Number) local256).longValue());
						} else if (local256 instanceof String) {
							arg0.method6494(2);
							arg0.method6516((String) local256);
						} else {
							arg0.method6494(4);
						}
					} else if (local113 == 4) {
						local196 = (Method) local8.aClass66Array1[local91].anObject4;
						local129 = local196.getModifiers();
						arg0.method6494(0);
						arg0.method6495(local129);
					}
				} catch (@Pc(296) ClassNotFoundException local296) {
					arg0.method6494(-10);
				} catch (@Pc(302) InvalidClassException local302) {
					arg0.method6494(-11);
				} catch (@Pc(308) StreamCorruptedException local308) {
					arg0.method6494(-12);
				} catch (@Pc(314) OptionalDataException local314) {
					arg0.method6494(-13);
				} catch (@Pc(320) IllegalAccessException local320) {
					arg0.method6494(-14);
				} catch (@Pc(326) IllegalArgumentException local326) {
					arg0.method6494(-15);
				} catch (@Pc(332) InvocationTargetException local332) {
					arg0.method6494(-16);
				} catch (@Pc(338) SecurityException local338) {
					arg0.method6494(-17);
				} catch (@Pc(344) IOException local344) {
					arg0.method6494(-18);
				} catch (@Pc(350) NullPointerException local350) {
					arg0.method6494(-19);
				} catch (@Pc(356) Exception local356) {
					arg0.method6494(-20);
				} catch (@Pc(362) Throwable local362) {
					arg0.method6494(-21);
				}
			} else {
				arg0.method6494(local8.anIntArray14[local91]);
			}
		}
		arg0.method6510(local84);
		local8.method8412();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI[JI[Ljava/lang/Object;)V")
	public static void method3293(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) long local25 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local25;
		@Pc(39) Object local39 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg0; local59 < arg2; local59++) {
			if (local25 + (long) (local57 & local59) > arg1[local59]) {
				@Pc(81) long local81 = arg1[local59];
				arg1[local59] = arg1[local21];
				arg1[local21] = local81;
				@Pc(95) Object local95 = arg3[local59];
				arg3[local59] = arg3[local21];
				arg3[local21++] = local95;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local25;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local39;
		method3293(arg0, arg1, local21 - 1, arg3);
		method3293(local21 + 1, arg1, arg2, arg3);
	}
}
