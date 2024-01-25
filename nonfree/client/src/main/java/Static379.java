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

public final class Static379 {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(IB)Z")
	public static boolean method5201(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2_Sub44 local16 = (Class2_Sub44) Static448.aClass249_63.method6527(); local16 != null; local16 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			if (Static224.method3540(local16.anInt8460) && (long) arg0 == local16.aLong215) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!no;II)V")
	public static void method5222(@OriginalArg(0) Class2_Sub29_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) Class2_Sub22 local14 = (Class2_Sub22) Static308.aClass249_30.method6527();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt2547; local21++) {
				if (local14.aClass20Array1[local21] != null) {
					if (local14.aClass20Array1[local21].anInt593 == 2) {
						local14.anIntArray327[local21] = -5;
					}
					if (local14.aClass20Array1[local21].anInt593 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass20Array2[local21] != null) {
					if (local14.aClass20Array2[local21].anInt593 == 2) {
						local14.anIntArray327[local21] = -6;
					}
					if (local14.aClass20Array2[local21].anInt593 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method5237(arg1);
			arg0.method5172(0);
			@Pc(104) int local104 = arg0.anInt6132;
			arg0.method5185(local14.anInt2549);
			for (@Pc(111) int local111 = 0; local111 < local14.anInt2547; local111++) {
				if (local14.anIntArray327[local111] == 0) {
					try {
						@Pc(134) int local134 = local14.anIntArray325[local111];
						@Pc(143) Field local143;
						@Pc(147) int local147;
						if (local134 == 0) {
							local143 = (Field) local14.aClass20Array1[local111].anObject2;
							local147 = local143.getInt(null);
							arg0.method5172(0);
							arg0.method5185(local147);
						} else if (local134 == 1) {
							local143 = (Field) local14.aClass20Array1[local111].anObject2;
							local143.setInt(null, local14.anIntArray326[local111]);
							arg0.method5172(0);
						} else if (local134 == 2) {
							local143 = (Field) local14.aClass20Array1[local111].anObject2;
							local147 = local143.getModifiers();
							arg0.method5172(0);
							arg0.method5185(local147);
						}
						@Pc(217) Method local217;
						if (local134 == 3) {
							local217 = (Method) local14.aClass20Array2[local111].anObject2;
							@Pc(222) byte[][] local222 = local14.aByteArrayArrayArray7[local111];
							@Pc(226) Object[] local226 = new Object[local222.length];
							for (@Pc(228) int local228 = 0; local228 < local222.length; local228++) {
								@Pc(240) ObjectInputStream local240 = new ObjectInputStream(new ByteArrayInputStream(local222[local228]));
								local226[local228] = local240.readObject();
							}
							@Pc(255) Object local255 = local217.invoke(null, local226);
							if (local255 == null) {
								arg0.method5172(0);
							} else if (local255 instanceof Number) {
								arg0.method5172(1);
								arg0.method5192(((Number) local255).longValue());
							} else if (local255 instanceof String) {
								arg0.method5172(2);
								arg0.method5189((String) local255);
							} else {
								arg0.method5172(4);
							}
						} else if (local134 == 4) {
							local217 = (Method) local14.aClass20Array2[local111].anObject2;
							local147 = local217.getModifiers();
							arg0.method5172(0);
							arg0.method5185(local147);
						}
					} catch (@Pc(325) ClassNotFoundException local325) {
						arg0.method5172(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method5172(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method5172(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method5172(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method5172(-14);
					} catch (@Pc(359) IllegalArgumentException local359) {
						arg0.method5172(-15);
					} catch (@Pc(365) InvocationTargetException local365) {
						arg0.method5172(-16);
					} catch (@Pc(371) SecurityException local371) {
						arg0.method5172(-17);
					} catch (@Pc(377) IOException local377) {
						arg0.method5172(-18);
					} catch (@Pc(383) NullPointerException local383) {
						arg0.method5172(-19);
					} catch (@Pc(389) Exception local389) {
						arg0.method5172(-20);
					} catch (@Pc(395) Throwable local395) {
						arg0.method5172(-21);
					}
				} else {
					arg0.method5172(local14.anIntArray327[local111]);
				}
			}
			arg0.method5174(local104);
			arg0.method5181(arg0.anInt6132 - local104);
			local14.method7802();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IJ)V")
	public static void method5233(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static174.method2895(arg0 - 1L);
			Static174.method2895(1L);
		} else {
			Static174.method2895(arg0);
		}
	}
}
