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

public final class Static338 {

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "Z")
	public static final boolean aBoolean368 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZ)V")
	public static void method4529(@OriginalArg(0) boolean arg0) {
		for (@Pc(15) Class10_Sub23 local15 = (Class10_Sub23) Static418.aClass163_43.method3620(); local15 != null; local15 = (Class10_Sub23) Static418.aClass163_43.method3621()) {
			if (local15.aClass10_Sub7_Sub1_2 != null) {
				Static461.aClass10_Sub7_Sub2_5.method1841(local15.aClass10_Sub7_Sub1_2);
				local15.aClass10_Sub7_Sub1_2 = null;
			}
			if (local15.aClass10_Sub7_Sub1_3 != null) {
				Static461.aClass10_Sub7_Sub2_5.method1841(local15.aClass10_Sub7_Sub1_3);
				local15.aClass10_Sub7_Sub1_3 = null;
			}
			local15.method6033();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class10_Sub23 local54 = (Class10_Sub23) Static104.aClass163_19.method3620(); local54 != null; local54 = (Class10_Sub23) Static104.aClass163_19.method3621()) {
			if (local54.aClass10_Sub7_Sub1_2 != null) {
				Static461.aClass10_Sub7_Sub2_5.method1841(local54.aClass10_Sub7_Sub1_2);
				local54.aClass10_Sub7_Sub1_2 = null;
			}
			local54.method6033();
		}
		for (@Pc(81) Class10_Sub23 local81 = (Class10_Sub23) Static414.aClass167_32.method3702(); local81 != null; local81 = (Class10_Sub23) Static414.aClass167_32.method3708()) {
			if (local81.aClass10_Sub7_Sub1_2 != null) {
				Static461.aClass10_Sub7_Sub2_5.method1841(local81.aClass10_Sub7_Sub1_2);
				local81.aClass10_Sub7_Sub1_2 = null;
			}
			local81.method6033();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ha;I)V")
	public static void method4532(@OriginalArg(1) Class10_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(16) Class10_Sub36 local16 = (Class10_Sub36) Static115.aClass163_23.method3620();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.anInt5469; local23++) {
				if (local16.aClass270Array1[local23] != null) {
					if (local16.aClass270Array1[local23].anInt7548 == 2) {
						local16.anIntArray532[local23] = -5;
					}
					if (local16.aClass270Array1[local23].anInt7548 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass270Array2[local23] != null) {
					if (local16.aClass270Array2[local23].anInt7548 == 2) {
						local16.anIntArray532[local23] = -6;
					}
					if (local16.aClass270Array2[local23].anInt7548 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method2530(arg1);
			arg0.method2458(0);
			@Pc(100) int local100 = arg0.anInt2989;
			arg0.method2506(local16.anInt5473);
			for (@Pc(107) int local107 = 0; local107 < local16.anInt5469; local107++) {
				if (local16.anIntArray532[local107] == 0) {
					try {
						@Pc(128) int local128 = local16.anIntArray531[local107];
						@Pc(137) Field local137;
						@Pc(141) int local141;
						if (local128 == 0) {
							local137 = (Field) local16.aClass270Array1[local107].anObject9;
							local141 = local137.getInt(null);
							arg0.method2458(0);
							arg0.method2506(local141);
						} else if (local128 == 1) {
							local137 = (Field) local16.aClass270Array1[local107].anObject9;
							local137.setInt(null, local16.anIntArray533[local107]);
							arg0.method2458(0);
						} else if (local128 == 2) {
							local137 = (Field) local16.aClass270Array1[local107].anObject9;
							local141 = local137.getModifiers();
							arg0.method2458(0);
							arg0.method2506(local141);
						}
						@Pc(214) Method local214;
						if (local128 == 3) {
							local214 = (Method) local16.aClass270Array2[local107].anObject9;
							@Pc(239) byte[][] local239 = local16.aByteArrayArrayArray17[local107];
							@Pc(243) Object[] local243 = new Object[local239.length];
							for (@Pc(245) int local245 = 0; local245 < local239.length; local245++) {
								@Pc(257) ObjectInputStream local257 = new ObjectInputStream(new ByteArrayInputStream(local239[local245]));
								local243[local245] = local257.readObject();
							}
							@Pc(276) Object local276 = local214.invoke(null, local243);
							if (local276 == null) {
								arg0.method2458(0);
							} else if (local276 instanceof Number) {
								arg0.method2458(1);
								arg0.method2470(((Number) local276).longValue());
							} else if (local276 instanceof String) {
								arg0.method2458(2);
								arg0.method2465((String) local276);
							} else {
								arg0.method2458(4);
							}
						} else if (local128 == 4) {
							local214 = (Method) local16.aClass270Array2[local107].anObject9;
							local141 = local214.getModifiers();
							arg0.method2458(0);
							arg0.method2506(local141);
						}
					} catch (@Pc(319) ClassNotFoundException local319) {
						arg0.method2458(-10);
					} catch (@Pc(325) InvalidClassException local325) {
						arg0.method2458(-11);
					} catch (@Pc(331) StreamCorruptedException local331) {
						arg0.method2458(-12);
					} catch (@Pc(337) OptionalDataException local337) {
						arg0.method2458(-13);
					} catch (@Pc(343) IllegalAccessException local343) {
						arg0.method2458(-14);
					} catch (@Pc(349) IllegalArgumentException local349) {
						arg0.method2458(-15);
					} catch (@Pc(355) InvocationTargetException local355) {
						arg0.method2458(-16);
					} catch (@Pc(361) SecurityException local361) {
						arg0.method2458(-17);
					} catch (@Pc(367) IOException local367) {
						arg0.method2458(-18);
					} catch (@Pc(373) NullPointerException local373) {
						arg0.method2458(-19);
					} catch (@Pc(379) Exception local379) {
						arg0.method2458(-20);
					} catch (@Pc(385) Throwable local385) {
						arg0.method2458(-21);
					}
				} else {
					arg0.method2458(local16.anIntArray532[local107]);
				}
			}
			arg0.method2461(local100);
			arg0.method2472(arg0.anInt2989 - local100);
			local16.method6033();
		}
	}
}
