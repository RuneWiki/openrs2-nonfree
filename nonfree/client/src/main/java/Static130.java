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

public final class Static130 {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!g;")
	public static Class83 aClass83_119;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBI)I")
	public static int method5369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ve;II)V")
	public static void method5371(@OriginalArg(0) Class2_Sub24_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) Class2_Sub28 local14 = (Class2_Sub28) Static100.aClass238_7.method5795();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt4485; local21++) {
				if (local14.aClass86Array2[local21] != null) {
					if (local14.aClass86Array2[local21].anInt2590 == 2) {
						local14.anIntArray333[local21] = -5;
					}
					if (local14.aClass86Array2[local21].anInt2590 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass86Array1[local21] != null) {
					if (local14.aClass86Array1[local21].anInt2590 == 2) {
						local14.anIntArray333[local21] = -6;
					}
					if (local14.aClass86Array1[local21].anInt2590 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method5784(arg1);
			arg0.method5746(0);
			@Pc(96) int local96 = arg0.anInt6669;
			arg0.method5734(local14.anInt4484);
			for (@Pc(103) int local103 = 0; local103 < local14.anInt4485; local103++) {
				if (local14.anIntArray333[local103] == 0) {
					try {
						@Pc(127) int local127 = local14.anIntArray334[local103];
						@Pc(139) Field local139;
						@Pc(143) int local143;
						if (local127 == 0) {
							local139 = (Field) local14.aClass86Array2[local103].anObject2;
							local143 = local139.getInt(null);
							arg0.method5746(0);
							arg0.method5734(local143);
						} else if (local127 == 1) {
							local139 = (Field) local14.aClass86Array2[local103].anObject2;
							local139.setInt(null, local14.anIntArray332[local103]);
							arg0.method5746(0);
						} else if (local127 == 2) {
							local139 = (Field) local14.aClass86Array2[local103].anObject2;
							local143 = local139.getModifiers();
							arg0.method5746(0);
							arg0.method5734(local143);
						}
						@Pc(216) Method local216;
						if (local127 == 3) {
							local216 = (Method) local14.aClass86Array1[local103].anObject2;
							@Pc(241) byte[][] local241 = local14.aByteArrayArrayArray15[local103];
							@Pc(245) Object[] local245 = new Object[local241.length];
							for (@Pc(247) int local247 = 0; local247 < local241.length; local247++) {
								@Pc(259) ObjectInputStream local259 = new ObjectInputStream(new ByteArrayInputStream(local241[local247]));
								local245[local247] = local259.readObject();
							}
							@Pc(278) Object local278 = local216.invoke(null, local245);
							if (local278 == null) {
								arg0.method5746(0);
							} else if (local278 instanceof Number) {
								arg0.method5746(1);
								arg0.method5766(((Number) local278).longValue());
							} else if (local278 instanceof String) {
								arg0.method5746(2);
								arg0.method5772((String) local278);
							} else {
								arg0.method5746(4);
							}
						} else if (local127 == 4) {
							local216 = (Method) local14.aClass86Array1[local103].anObject2;
							local143 = local216.getModifiers();
							arg0.method5746(0);
							arg0.method5734(local143);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method5746(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method5746(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method5746(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method5746(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method5746(-14);
					} catch (@Pc(353) IllegalArgumentException local353) {
						arg0.method5746(-15);
					} catch (@Pc(361) InvocationTargetException local361) {
						arg0.method5746(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method5746(-17);
					} catch (@Pc(377) IOException local377) {
						arg0.method5746(-18);
					} catch (@Pc(383) NullPointerException local383) {
						arg0.method5746(-19);
					} catch (@Pc(389) Exception local389) {
						arg0.method5746(-20);
					} catch (@Pc(395) Throwable local395) {
						arg0.method5746(-21);
					}
				} else {
					arg0.method5746(local14.anIntArray333[local103]);
				}
			}
			arg0.method5748(local96);
			arg0.method5727(arg0.anInt6669 - local96);
			local14.method6130();
		}
	}
}
