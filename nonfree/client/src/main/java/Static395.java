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

public final class Static395 {

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_155 = new Class338();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IC)Z")
	public static boolean method5577(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!s;)V")
	public static void method5578(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		Static121.aClass21Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!bba;I)I")
	public static int method5579(@OriginalArg(0) Class28_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt10745 == 0) {
			return 0;
		}
		@Pc(70) int local70;
		@Pc(63) int local63;
		if (arg0.anInt10743 != -1) {
			@Pc(23) Class28_Sub1_Sub1_Sub1 local23 = null;
			if (arg0.anInt10743 < 32768) {
				@Pc(49) Class3_Sub3 local49 = (Class3_Sub3) Static522.aClass83_34.method2368((long) arg0.anInt10743);
				if (local49 != null) {
					local23 = local49.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				}
			} else if (arg0.anInt10743 >= 32768) {
				local23 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt10743 - 32768];
			}
			if (local23 != null) {
				local63 = arg0.anInt10729 - local23.anInt10729;
				local70 = arg0.anInt10731 - local23.anInt10731;
				if (local63 != 0 || local70 != 0) {
					arg0.method9308((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class28_Sub1_Sub1_Sub1_Sub1) {
			@Pc(173) Class28_Sub1_Sub1_Sub1_Sub1 local173 = (Class28_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local173.anInt10520 != -1 && (local173.anInt10812 == 0 || local173.anInt10811 > 0)) {
				local173.method9308(local173.anInt10520);
				local173.anInt10520 = -1;
			}
		} else if (arg0 instanceof Class28_Sub1_Sub1_Sub1_Sub2) {
			@Pc(99) Class28_Sub1_Sub1_Sub1_Sub2 local99 = (Class28_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local99.anInt10830 != -1 && (local99.anInt10812 == 0 || local99.anInt10811 > 0)) {
				local63 = local99.anInt10729 - (local99.anInt10830 - Static287.anInt4910 - Static287.anInt4910) * 256;
				local70 = local99.anInt10731 - (local99.anInt10815 - Static72.anInt1361 - Static72.anInt1361) * 256;
				if (local63 != 0 || local70 != 0) {
					local99.method9308((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
				local99.anInt10830 = -1;
			}
		}
		return arg0.method9306();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!gaa;I)V")
	public static void method5580(@OriginalArg(0) Class3_Sub25_Sub1 arg0) {
		@Pc(10) Class3_Sub21 local10 = (Class3_Sub21) Static274.aClass338_121.method8177();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(25) int local25 = 0; local25 < local10.anInt2595; local25++) {
			if (local10.aClass81Array1[local25] != null) {
				if (local10.aClass81Array1[local25].anInt2532 == 2) {
					local10.anIntArray221[local25] = -5;
				}
				if (local10.aClass81Array1[local25].anInt2532 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass81Array2[local25] != null) {
				if (local10.aClass81Array2[local25].anInt2532 == 2) {
					local10.anIntArray221[local25] = -6;
				}
				if (local10.aClass81Array2[local25].anInt2532 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(102) int local102 = arg0.anInt9765;
		arg0.method8588(local10.anInt2594);
		for (@Pc(109) int local109 = 0; local109 < local10.anInt2595; local109++) {
			if (local10.anIntArray221[local109] == 0) {
				try {
					@Pc(133) int local133 = local10.anIntArray222[local109];
					@Pc(142) Field local142;
					@Pc(146) int local146;
					if (local133 == 0) {
						local142 = (Field) local10.aClass81Array1[local109].anObject4;
						local146 = local142.getInt((Object) null);
						arg0.method8614(0);
						arg0.method8588(local146);
					} else if (local133 == 1) {
						local142 = (Field) local10.aClass81Array1[local109].anObject4;
						local142.setInt((Object) null, local10.anIntArray223[local109]);
						arg0.method8614(0);
					} else if (local133 == 2) {
						local142 = (Field) local10.aClass81Array1[local109].anObject4;
						local146 = local142.getModifiers();
						arg0.method8614(0);
						arg0.method8588(local146);
					}
					@Pc(216) Method local216;
					if (local133 == 3) {
						local216 = (Method) local10.aClass81Array2[local109].anObject4;
						@Pc(221) byte[][] local221 = local10.aByteArrayArrayArray15[local109];
						@Pc(225) Object[] local225 = new Object[local221.length];
						for (@Pc(227) int local227 = 0; local227 < local221.length; local227++) {
							@Pc(239) ObjectInputStream local239 = new ObjectInputStream(new ByteArrayInputStream(local221[local227]));
							local225[local227] = local239.readObject();
						}
						@Pc(258) Object local258 = local216.invoke((Object) null, local225);
						if (local258 == null) {
							arg0.method8614(0);
						} else if (local258 instanceof Number) {
							arg0.method8614(1);
							arg0.method8603(((Number) local258).longValue());
						} else if (local258 instanceof String) {
							arg0.method8614(2);
							arg0.method8583((String) local258);
						} else {
							arg0.method8614(4);
						}
					} else if (local133 == 4) {
						local216 = (Method) local10.aClass81Array2[local109].anObject4;
						local146 = local216.getModifiers();
						arg0.method8614(0);
						arg0.method8588(local146);
					}
				} catch (@Pc(326) ClassNotFoundException local326) {
					arg0.method8614(-10);
				} catch (@Pc(332) InvalidClassException local332) {
					arg0.method8614(-11);
				} catch (@Pc(338) StreamCorruptedException local338) {
					arg0.method8614(-12);
				} catch (@Pc(344) OptionalDataException local344) {
					arg0.method8614(-13);
				} catch (@Pc(350) IllegalAccessException local350) {
					arg0.method8614(-14);
				} catch (@Pc(356) IllegalArgumentException local356) {
					arg0.method8614(-15);
				} catch (@Pc(362) InvocationTargetException local362) {
					arg0.method8614(-16);
				} catch (@Pc(368) SecurityException local368) {
					arg0.method8614(-17);
				} catch (@Pc(374) IOException local374) {
					arg0.method8614(-18);
				} catch (@Pc(380) NullPointerException local380) {
					arg0.method8614(-19);
				} catch (@Pc(386) Exception local386) {
					arg0.method8614(-20);
				} catch (@Pc(392) Throwable local392) {
					arg0.method8614(-21);
				}
			} else {
				arg0.method8614(local10.anIntArray221[local109]);
			}
		}
		arg0.method8594(local102);
		local10.method9380();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	public static void method5581(@OriginalArg(1) boolean arg0) {
		if (Static578.aClass193_1 == null) {
			Static201.method3623();
		}
		if (arg0) {
			Static578.aClass193_1.method4859();
		}
	}
}
