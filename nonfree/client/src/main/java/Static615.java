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

public final class Static615 {

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
	public static int anInt10411 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I")
	public static int method8456() {
		@Pc(12) int local12 = Static91.aClass90_1.method2772();
		if (local12 < Static5.aClass90Array1.length - 1) {
			Static91.aClass90_1 = Static5.aClass90Array1[local12 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)I")
	public static int method8459() {
		return Static258.method4589(false);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLclient!bi;)V")
	public static void method8461(@OriginalArg(1) Class6_Sub8_Sub1 arg0) {
		@Pc(10) Class6_Sub26 local10 = (Class6_Sub26) Static349.aClass163_39.method4966();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt5097; local17++) {
			if (local10.aClass159Array2[local17] != null) {
				if (local10.aClass159Array2[local17].anInt5910 == 2) {
					local10.anIntArray217[local17] = -5;
				}
				if (local10.aClass159Array2[local17].anInt5910 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass159Array1[local17] != null) {
				if (local10.aClass159Array1[local17].anInt5910 == 2) {
					local10.anIntArray217[local17] = -6;
				}
				if (local10.aClass159Array1[local17].anInt5910 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(90) int local90 = arg0.anInt10061;
		arg0.method8202(local10.anInt5093);
		for (@Pc(104) int local104 = 0; local104 < local10.anInt5097; local104++) {
			if (local10.anIntArray217[local104] == 0) {
				try {
					@Pc(130) int local130 = local10.anIntArray216[local104];
					@Pc(139) Field local139;
					@Pc(143) int local143;
					if (local130 == 0) {
						local139 = (Field) local10.aClass159Array2[local104].anObject13;
						local143 = local139.getInt((Object) null);
						arg0.method8211(0);
						arg0.method8202(local143);
					} else if (local130 == 1) {
						local139 = (Field) local10.aClass159Array2[local104].anObject13;
						local139.setInt((Object) null, local10.anIntArray218[local104]);
						arg0.method8211(0);
					} else if (local130 == 2) {
						local139 = (Field) local10.aClass159Array2[local104].anObject13;
						local143 = local139.getModifiers();
						arg0.method8211(0);
						arg0.method8202(local143);
					}
					@Pc(213) Method local213;
					if (local130 == 3) {
						local213 = (Method) local10.aClass159Array1[local104].anObject13;
						@Pc(218) byte[][] local218 = local10.aByteArrayArrayArray1[local104];
						@Pc(222) Object[] local222 = new Object[local218.length];
						for (@Pc(224) int local224 = 0; local224 < local218.length; local224++) {
							@Pc(236) ObjectInputStream local236 = new ObjectInputStream(new ByteArrayInputStream(local218[local224]));
							local222[local224] = local236.readObject();
						}
						@Pc(255) Object local255 = local213.invoke((Object) null, local222);
						if (local255 == null) {
							arg0.method8211(0);
						} else if (local255 instanceof Number) {
							arg0.method8211(1);
							arg0.method8238(((Number) local255).longValue());
						} else if (local255 instanceof String) {
							arg0.method8211(2);
							arg0.method8205((String) local255);
						} else {
							arg0.method8211(4);
						}
					} else if (local130 == 4) {
						local213 = (Method) local10.aClass159Array1[local104].anObject13;
						local143 = local213.getModifiers();
						arg0.method8211(0);
						arg0.method8202(local143);
					}
				} catch (@Pc(325) ClassNotFoundException local325) {
					arg0.method8211(-10);
				} catch (@Pc(333) InvalidClassException local333) {
					arg0.method8211(-11);
				} catch (@Pc(339) StreamCorruptedException local339) {
					arg0.method8211(-12);
				} catch (@Pc(345) OptionalDataException local345) {
					arg0.method8211(-13);
				} catch (@Pc(351) IllegalAccessException local351) {
					arg0.method8211(-14);
				} catch (@Pc(359) IllegalArgumentException local359) {
					arg0.method8211(-15);
				} catch (@Pc(367) InvocationTargetException local367) {
					arg0.method8211(-16);
				} catch (@Pc(373) SecurityException local373) {
					arg0.method8211(-17);
				} catch (@Pc(379) IOException local379) {
					arg0.method8211(-18);
				} catch (@Pc(385) NullPointerException local385) {
					arg0.method8211(-19);
				} catch (@Pc(391) Exception local391) {
					arg0.method8211(-20);
				} catch (@Pc(397) Throwable local397) {
					arg0.method8211(-21);
				}
			} else {
				arg0.method8211(local10.anIntArray217[local104]);
			}
		}
		arg0.method8213(local90);
		local10.method8792();
	}
}
