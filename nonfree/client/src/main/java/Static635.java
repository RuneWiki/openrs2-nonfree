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

public final class Static635 {

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_15 = new Class162("", 15);

	@OriginalMember(owner = "client!vaa", name = "n", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_267 = new Class160(115, -2);

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLclient!rea;)V")
	public static void method8897(@OriginalArg(1) Class14_Sub21_Sub2 arg0) {
		@Pc(10) Class14_Sub15 local10 = (Class14_Sub15) Static79.aClass32_5.method584();
		if (local10 == null) {
			return;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local10.anInt2025; local25++) {
			if (local10.aClass230Array2[local25] != null) {
				if (local10.aClass230Array2[local25].anInt6256 == 2) {
					local10.anIntArray130[local25] = -5;
				}
				if (local10.aClass230Array2[local25].anInt6256 == 0) {
					local23 = true;
				}
			}
			if (local10.aClass230Array1[local25] != null) {
				if (local10.aClass230Array1[local25].anInt6256 == 2) {
					local10.anIntArray130[local25] = -6;
				}
				if (local10.aClass230Array1[local25].anInt6256 == 0) {
					local23 = true;
				}
			}
		}
		if (local23) {
			return;
		}
		@Pc(107) int local107 = arg0.anInt8936;
		arg0.method7730(local10.anInt2023);
		for (@Pc(114) int local114 = 0; local114 < local10.anInt2025; local114++) {
			if (local10.anIntArray130[local114] == 0) {
				try {
					@Pc(139) int local139 = local10.anIntArray129[local114];
					@Pc(151) Field local151;
					@Pc(155) int local155;
					if (local139 == 0) {
						local151 = (Field) local10.aClass230Array2[local114].anObject12;
						local155 = local151.getInt((Object) null);
						arg0.method7747(0);
						arg0.method7730(local155);
					} else if (local139 == 1) {
						local151 = (Field) local10.aClass230Array2[local114].anObject12;
						local151.setInt((Object) null, local10.anIntArray131[local114]);
						arg0.method7747(0);
					} else if (local139 == 2) {
						local151 = (Field) local10.aClass230Array2[local114].anObject12;
						local155 = local151.getModifiers();
						arg0.method7747(0);
						arg0.method7730(local155);
					}
					@Pc(232) Method local232;
					if (local139 == 3) {
						local232 = (Method) local10.aClass230Array1[local114].anObject12;
						@Pc(257) byte[][] local257 = local10.aByteArrayArrayArray9[local114];
						@Pc(261) Object[] local261 = new Object[local257.length];
						for (@Pc(263) int local263 = 0; local263 < local257.length; local263++) {
							@Pc(275) ObjectInputStream local275 = new ObjectInputStream(new ByteArrayInputStream(local257[local263]));
							local261[local263] = local275.readObject();
						}
						@Pc(290) Object local290 = local232.invoke((Object) null, local261);
						if (local290 == null) {
							arg0.method7747(0);
						} else if (local290 instanceof Number) {
							arg0.method7747(1);
							arg0.method7735(((Number) local290).longValue());
						} else if (local290 instanceof String) {
							arg0.method7747(2);
							arg0.method7690((String) local290);
						} else {
							arg0.method7747(4);
						}
					} else if (local139 == 4) {
						local232 = (Method) local10.aClass230Array1[local114].anObject12;
						local155 = local232.getModifiers();
						arg0.method7747(0);
						arg0.method7730(local155);
					}
				} catch (@Pc(343) ClassNotFoundException local343) {
					arg0.method7747(-10);
				} catch (@Pc(349) InvalidClassException local349) {
					arg0.method7747(-11);
				} catch (@Pc(355) StreamCorruptedException local355) {
					arg0.method7747(-12);
				} catch (@Pc(361) OptionalDataException local361) {
					arg0.method7747(-13);
				} catch (@Pc(367) IllegalAccessException local367) {
					arg0.method7747(-14);
				} catch (@Pc(373) IllegalArgumentException local373) {
					arg0.method7747(-15);
				} catch (@Pc(379) InvocationTargetException local379) {
					arg0.method7747(-16);
				} catch (@Pc(385) SecurityException local385) {
					arg0.method7747(-17);
				} catch (@Pc(391) IOException local391) {
					arg0.method7747(-18);
				} catch (@Pc(397) NullPointerException local397) {
					arg0.method7747(-19);
				} catch (@Pc(403) Exception local403) {
					arg0.method7747(-20);
				} catch (@Pc(409) Throwable local409) {
					arg0.method7747(-21);
				}
			} else {
				arg0.method7747(local10.anIntArray130[local114]);
			}
		}
		arg0.method7740(local107);
		local10.method9513();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIB)V")
	public static void method8898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = Static323.anInt5615;
		if (local12 == 0) {
			return;
		}
		if (local12 == 1) {
			Static321.anInt5589 = arg1;
			Static607.anInt9965 = arg3;
			Static636.anInt10412 = arg0;
			Static494.anInt8561 = arg2;
			Static323.anInt5615 = 2;
		} else if (local12 == 2) {
			if (Static494.anInt8561 < arg2) {
				Static494.anInt8561 = arg2;
			}
			if (arg1 > Static321.anInt5589) {
				Static321.anInt5589 = arg1;
			}
			if (Static607.anInt9965 > arg3) {
				Static607.anInt9965 = arg3;
			}
			if (arg0 < Static636.anInt10412) {
				Static636.anInt10412 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[SZ)[S")
	public static short[] method8899(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static691.method85(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
