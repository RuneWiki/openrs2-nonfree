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

public final class Static420 {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public static int anInt6622;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString78 = null;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_137 = new Class151(122, -1);

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt6625 = 0;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Z")
	public static boolean aBoolean509 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!bn;I)V")
	public static void method5764(@OriginalArg(0) Class4_Sub11_Sub1 arg0) {
		@Pc(10) Class4_Sub26 local10 = (Class4_Sub26) Static281.aClass163_25.method3639();
		if (local10 == null) {
			return;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local10.anInt4436; local25++) {
			if (local10.aClass281Array1[local25] != null) {
				if (local10.aClass281Array1[local25].anInt7338 == 2) {
					local10.anIntArray315[local25] = -5;
				}
				if (local10.aClass281Array1[local25].anInt7338 == 0) {
					local23 = true;
				}
			}
			if (local10.aClass281Array2[local25] != null) {
				if (local10.aClass281Array2[local25].anInt7338 == 2) {
					local10.anIntArray315[local25] = -6;
				}
				if (local10.aClass281Array2[local25].anInt7338 == 0) {
					local23 = true;
				}
			}
		}
		if (local23) {
			return;
		}
		@Pc(98) int local98 = arg0.anInt10466;
		arg0.method8860(local10.anInt4437);
		for (@Pc(105) int local105 = 0; local105 < local10.anInt4436; local105++) {
			if (local10.anIntArray315[local105] == 0) {
				try {
					@Pc(129) int local129 = local10.anIntArray317[local105];
					@Pc(141) Field local141;
					@Pc(145) int local145;
					if (local129 == 0) {
						local141 = (Field) local10.aClass281Array1[local105].anObject17;
						local145 = local141.getInt((Object) null);
						arg0.method8822(0);
						arg0.method8860(local145);
					} else if (local129 == 1) {
						local141 = (Field) local10.aClass281Array1[local105].anObject17;
						local141.setInt((Object) null, local10.anIntArray316[local105]);
						arg0.method8822(0);
					} else if (local129 == 2) {
						local141 = (Field) local10.aClass281Array1[local105].anObject17;
						local145 = local141.getModifiers();
						arg0.method8822(0);
						arg0.method8860(local145);
					}
					@Pc(216) Method local216;
					if (local129 == 3) {
						local216 = (Method) local10.aClass281Array2[local105].anObject17;
						@Pc(241) byte[][] local241 = local10.aByteArrayArrayArray16[local105];
						@Pc(245) Object[] local245 = new Object[local241.length];
						for (@Pc(247) int local247 = 0; local247 < local241.length; local247++) {
							@Pc(259) ObjectInputStream local259 = new ObjectInputStream(new ByteArrayInputStream(local241[local247]));
							local245[local247] = local259.readObject();
						}
						@Pc(274) Object local274 = local216.invoke((Object) null, local245);
						if (local274 == null) {
							arg0.method8822(0);
						} else if (local274 instanceof Number) {
							arg0.method8822(1);
							arg0.method8873(((Number) local274).longValue());
						} else if (local274 instanceof String) {
							arg0.method8822(2);
							arg0.method8857((String) local274);
						} else {
							arg0.method8822(4);
						}
					} else if (local129 == 4) {
						local216 = (Method) local10.aClass281Array2[local105].anObject17;
						local145 = local216.getModifiers();
						arg0.method8822(0);
						arg0.method8860(local145);
					}
				} catch (@Pc(317) ClassNotFoundException local317) {
					arg0.method8822(-10);
				} catch (@Pc(323) InvalidClassException local323) {
					arg0.method8822(-11);
				} catch (@Pc(329) StreamCorruptedException local329) {
					arg0.method8822(-12);
				} catch (@Pc(335) OptionalDataException local335) {
					arg0.method8822(-13);
				} catch (@Pc(341) IllegalAccessException local341) {
					arg0.method8822(-14);
				} catch (@Pc(347) IllegalArgumentException local347) {
					arg0.method8822(-15);
				} catch (@Pc(353) InvocationTargetException local353) {
					arg0.method8822(-16);
				} catch (@Pc(359) SecurityException local359) {
					arg0.method8822(-17);
				} catch (@Pc(365) IOException local365) {
					arg0.method8822(-18);
				} catch (@Pc(371) NullPointerException local371) {
					arg0.method8822(-19);
				} catch (@Pc(377) Exception local377) {
					arg0.method8822(-20);
				} catch (@Pc(383) Throwable local383) {
					arg0.method8822(-21);
				}
			} else {
				arg0.method8822(local10.anIntArray315[local105]);
			}
		}
		arg0.method8840(local98);
		local10.method9000();
	}
}
