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

public final class Static327 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!kja;B)V")
	public static void method5408(@OriginalArg(0) Class2_Sub8_Sub2 arg0) {
		@Pc(10) Class2_Sub4 local10 = (Class2_Sub4) Static663.aClass271_67.method7177();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt491; local17++) {
			if (local10.aClass268Array1[local17] != null) {
				if (local10.aClass268Array1[local17].anInt8008 == 2) {
					local10.anIntArray39[local17] = -5;
				}
				if (local10.aClass268Array1[local17].anInt8008 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass268Array2[local17] != null) {
				if (local10.aClass268Array2[local17].anInt8008 == 2) {
					local10.anIntArray39[local17] = -6;
				}
				if (local10.aClass268Array2[local17].anInt8008 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(91) int local91 = arg0.anInt5725;
		arg0.method5194(local10.anInt493);
		for (@Pc(98) int local98 = 0; local98 < local10.anInt491; local98++) {
			if (local10.anIntArray39[local98] == 0) {
				try {
					@Pc(119) int local119 = local10.anIntArray41[local98];
					@Pc(128) Field local128;
					@Pc(132) int local132;
					if (local119 == 0) {
						local128 = (Field) local10.aClass268Array1[local98].anObject19;
						local132 = local128.getInt((Object) null);
						arg0.method5170(0);
						arg0.method5194(local132);
					} else if (local119 == 1) {
						local128 = (Field) local10.aClass268Array1[local98].anObject19;
						local128.setInt((Object) null, local10.anIntArray40[local98]);
						arg0.method5170(0);
					} else if (local119 == 2) {
						local128 = (Field) local10.aClass268Array1[local98].anObject19;
						local132 = local128.getModifiers();
						arg0.method5170(0);
						arg0.method5194(local132);
					}
					@Pc(205) Method local205;
					if (local119 == 3) {
						local205 = (Method) local10.aClass268Array2[local98].anObject19;
						@Pc(230) byte[][] local230 = local10.aByteArrayArrayArray1[local98];
						@Pc(234) Object[] local234 = new Object[local230.length];
						for (@Pc(236) int local236 = 0; local236 < local230.length; local236++) {
							@Pc(248) ObjectInputStream local248 = new ObjectInputStream(new ByteArrayInputStream(local230[local236]));
							local234[local236] = local248.readObject();
						}
						@Pc(267) Object local267 = local205.invoke((Object) null, local234);
						if (local267 == null) {
							arg0.method5170(0);
						} else if (local267 instanceof Number) {
							arg0.method5170(1);
							arg0.method5209(((Number) local267).longValue());
						} else if (local267 instanceof String) {
							arg0.method5170(2);
							arg0.method5212((String) local267);
						} else {
							arg0.method5170(4);
						}
					} else if (local119 == 4) {
						local205 = (Method) local10.aClass268Array2[local98].anObject19;
						local132 = local205.getModifiers();
						arg0.method5170(0);
						arg0.method5194(local132);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method5170(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method5170(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method5170(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method5170(-13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method5170(-14);
				} catch (@Pc(340) IllegalArgumentException local340) {
					arg0.method5170(-15);
				} catch (@Pc(346) InvocationTargetException local346) {
					arg0.method5170(-16);
				} catch (@Pc(352) SecurityException local352) {
					arg0.method5170(-17);
				} catch (@Pc(358) IOException local358) {
					arg0.method5170(-18);
				} catch (@Pc(364) NullPointerException local364) {
					arg0.method5170(-19);
				} catch (@Pc(370) Exception local370) {
					arg0.method5170(-20);
				} catch (@Pc(376) Throwable local376) {
					arg0.method5170(-21);
				}
			} else {
				arg0.method5170(local10.anIntArray39[local98]);
			}
		}
		arg0.method5230(local91);
		local10.method9825();
	}
}
