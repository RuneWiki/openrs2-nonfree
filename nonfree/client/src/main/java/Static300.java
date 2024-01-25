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

public final class Static300 {

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_38 = new Class205(65, -1);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILclient!vh;)V")
	public static void method1284(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16_Sub2 arg1) {
		while (true) {
			@Pc(18) Class2_Sub35 local18 = (Class2_Sub35) Static121.aClass30_17.method694();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt4889; local25++) {
				if (local18.aClass182Array2[local25] != null) {
					if (local18.aClass182Array2[local25].anInt4498 == 2) {
						local18.anIntArray955[local25] = -5;
					}
					if (local18.aClass182Array2[local25].anInt4498 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass182Array1[local25] != null) {
					if (local18.aClass182Array1[local25].anInt4498 == 2) {
						local18.anIntArray955[local25] = -6;
					}
					if (local18.aClass182Array1[local25].anInt4498 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method5381(arg0);
			arg1.method5358(0);
			@Pc(101) int local101 = arg1.anInt6145;
			arg1.method5355(local18.anInt4888);
			for (@Pc(108) int local108 = 0; local108 < local18.anInt4889; local108++) {
				if (local18.anIntArray955[local108] == 0) {
					try {
						@Pc(132) int local132 = local18.anIntArray953[local108];
						@Pc(149) Field local149;
						@Pc(152) int local152;
						if (local132 == 0) {
							local149 = (Field) local18.aClass182Array2[local108].anObject6;
							local152 = local149.getInt(null);
							arg1.method5358(0);
							arg1.method5355(local152);
						} else if (local132 == 1) {
							local149 = (Field) local18.aClass182Array2[local108].anObject6;
							local149.setInt(null, local18.anIntArray954[local108]);
							arg1.method5358(0);
						} else if (local132 == 2) {
							local149 = (Field) local18.aClass182Array2[local108].anObject6;
							local152 = local149.getModifiers();
							arg1.method5358(0);
							arg1.method5355(local152);
						}
						@Pc(211) Method local211;
						if (local132 == 3) {
							local211 = (Method) local18.aClass182Array1[local108].anObject6;
							@Pc(216) byte[][] local216 = local18.aByteArrayArrayArray17[local108];
							@Pc(220) Object[] local220 = new Object[local216.length];
							for (@Pc(222) int local222 = 0; local222 < local216.length; local222++) {
								@Pc(234) ObjectInputStream local234 = new ObjectInputStream(new ByteArrayInputStream(local216[local222]));
								local220[local222] = local234.readObject();
							}
							@Pc(249) Object local249 = local211.invoke(null, local220);
							if (local249 == null) {
								arg1.method5358(0);
							} else if (local249 instanceof Number) {
								arg1.method5358(1);
								arg1.method5368(((Number) local249).longValue());
							} else if (local249 instanceof String) {
								arg1.method5358(2);
								arg1.method5362((String) local249);
							} else {
								arg1.method5358(4);
							}
						} else if (local132 == 4) {
							local211 = (Method) local18.aClass182Array1[local108].anObject6;
							local152 = local211.getModifiers();
							arg1.method5358(0);
							arg1.method5355(local152);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg1.method5358(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg1.method5358(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg1.method5358(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg1.method5358(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg1.method5358(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg1.method5358(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg1.method5358(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg1.method5358(-17);
					} catch (@Pc(363) IOException local363) {
						arg1.method5358(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg1.method5358(-19);
					} catch (@Pc(375) Exception local375) {
						arg1.method5358(-20);
					} catch (@Pc(381) Throwable local381) {
						arg1.method5358(-21);
					}
				} else {
					arg1.method5358(local18.anIntArray955[local108]);
				}
			}
			arg1.method5345(local101);
			arg1.method5316(arg1.anInt6145 - local101);
			local18.method5617();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBI)B")
	public static byte method1285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)J")
	public static long method1286() {
		return Static119.aClass28_1.method4246();
	}
}
