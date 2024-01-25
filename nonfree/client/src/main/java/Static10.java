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

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "Lclient!dp;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "Lclient!la;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_5 = new Class208(14, 16);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!mw;)V")
	public static void method240(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		@Pc(10) Class1_Sub29 local10 = (Class1_Sub29) Static379.aClass111_42.method2547();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt4322; local17++) {
			if (local10.aClass191Array1[local17] != null) {
				if (local10.aClass191Array1[local17].anInt5014 == 2) {
					local10.anIntArray221[local17] = -5;
				}
				if (local10.aClass191Array1[local17].anInt5014 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass191Array2[local17] != null) {
				if (local10.aClass191Array2[local17].anInt5014 == 2) {
					local10.anIntArray221[local17] = -6;
				}
				if (local10.aClass191Array2[local17].anInt5014 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(91) int local91 = arg0.anInt9802;
		arg0.method7936(local10.anInt4323);
		for (@Pc(98) int local98 = 0; local98 < local10.anInt4322; local98++) {
			if (local10.anIntArray221[local98] == 0) {
				try {
					@Pc(122) int local122 = local10.anIntArray222[local98];
					@Pc(134) Field local134;
					@Pc(138) int local138;
					if (local122 == 0) {
						local134 = (Field) local10.aClass191Array1[local98].anObject11;
						local138 = local134.getInt(null);
						arg0.method7917(0);
						arg0.method7936(local138);
					} else if (local122 == 1) {
						local134 = (Field) local10.aClass191Array1[local98].anObject11;
						local134.setInt(null, local10.anIntArray220[local98]);
						arg0.method7917(0);
					} else if (local122 == 2) {
						local134 = (Field) local10.aClass191Array1[local98].anObject11;
						local138 = local134.getModifiers();
						arg0.method7917(0);
						arg0.method7936(local138);
					}
					@Pc(209) Method local209;
					if (local122 == 3) {
						local209 = (Method) local10.aClass191Array2[local98].anObject11;
						@Pc(236) byte[][] local236 = local10.aByteArrayArrayArray4[local98];
						@Pc(240) Object[] local240 = new Object[local236.length];
						for (@Pc(242) int local242 = 0; local242 < local236.length; local242++) {
							@Pc(254) ObjectInputStream local254 = new ObjectInputStream(new ByteArrayInputStream(local236[local242]));
							local240[local242] = local254.readObject();
						}
						@Pc(269) Object local269 = local209.invoke(null, local240);
						if (local269 == null) {
							arg0.method7917(0);
						} else if (local269 instanceof Number) {
							arg0.method7917(1);
							arg0.method7934(((Number) local269).longValue());
						} else if (local269 instanceof String) {
							arg0.method7917(2);
							arg0.method7920((String) local269);
						} else {
							arg0.method7917(4);
						}
					} else if (local122 == 4) {
						local209 = (Method) local10.aClass191Array2[local98].anObject11;
						local138 = local209.getModifiers();
						arg0.method7917(0);
						arg0.method7936(local138);
					}
				} catch (@Pc(312) ClassNotFoundException local312) {
					arg0.method7917(-10);
				} catch (@Pc(318) InvalidClassException local318) {
					arg0.method7917(-11);
				} catch (@Pc(324) StreamCorruptedException local324) {
					arg0.method7917(-12);
				} catch (@Pc(330) OptionalDataException local330) {
					arg0.method7917(-13);
				} catch (@Pc(336) IllegalAccessException local336) {
					arg0.method7917(-14);
				} catch (@Pc(342) IllegalArgumentException local342) {
					arg0.method7917(-15);
				} catch (@Pc(348) InvocationTargetException local348) {
					arg0.method7917(-16);
				} catch (@Pc(354) SecurityException local354) {
					arg0.method7917(-17);
				} catch (@Pc(360) IOException local360) {
					arg0.method7917(-18);
				} catch (@Pc(366) NullPointerException local366) {
					arg0.method7917(-19);
				} catch (@Pc(372) Exception local372) {
					arg0.method7917(-20);
				} catch (@Pc(378) Throwable local378) {
					arg0.method7917(-21);
				}
			} else {
				arg0.method7917(local10.anIntArray221[local98]);
			}
		}
		arg0.method7944(local91);
		local10.method7908();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIB)Z")
	public static boolean method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
