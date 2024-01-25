import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "[J")
	public static final long[] aLongArray18 = new long[32];

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
	public static int anInt10158 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
	public static boolean method8306() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static398.aHashtable7.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static398.aHashtable7.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(43) Field local43 = local33.getDeclaredField("nativeLibraries");
			@Pc(53) Method local53 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local53.invoke(local43, Boolean.TRUE);
			try {
				local12 = Static398.aHashtable7.keys();
				while (local12.hasMoreElements()) {
					@Pc(72) String local72 = (String) local12.nextElement();
					try {
						@Pc(77) File local77 = (File) Static210.aHashtable4.get(local72);
						@Pc(82) Class local82 = (Class) Static398.aHashtable7.get(local72);
						@Pc(88) Vector local88 = (Vector) local43.get(local82.getClassLoader());
						for (@Pc(90) int local90 = 0; local90 < local88.size(); local90++) {
							try {
								@Pc(96) Object local96 = local88.elementAt(local90);
								@Pc(101) Field local101 = local96.getClass().getDeclaredField("name");
								local53.invoke(local101, Boolean.TRUE);
								try {
									@Pc(116) String local116 = (String) local101.get(local96);
									if (local116 != null && local116.equalsIgnoreCase(local77.getCanonicalPath())) {
										@Pc(128) Field local128 = local96.getClass().getDeclaredField("handle");
										@Pc(135) Method local135 = local96.getClass().getDeclaredMethod("finalize");
										local53.invoke(local128, Boolean.TRUE);
										local53.invoke(local135, Boolean.TRUE);
										try {
											local135.invoke(local96);
											local128.set(local96, Integer.valueOf(0));
											local9.remove(local72);
										} catch (@Pc(174) Throwable local174) {
										}
										local53.invoke(local135, Boolean.FALSE);
										local53.invoke(local128, Boolean.FALSE);
									}
								} catch (@Pc(196) Throwable local196) {
								}
								local53.invoke(local101, Boolean.FALSE);
							} catch (@Pc(208) Throwable local208) {
							}
						}
					} catch (@Pc(220) Throwable local220) {
					}
				}
			} catch (@Pc(226) Throwable local226) {
			}
			local53.invoke(local43, Boolean.FALSE);
		} catch (@Pc(238) Throwable local238) {
		}
		Static398.aHashtable7 = local9;
		return Static398.aHashtable7.isEmpty();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B[B)[B")
	public static byte[] method8307(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(12) int local12 = local8.method4905();
		@Pc(23) int local23 = local8.method4931();
		if (local23 < 0 || Static397.anInt7612 != 0 && Static397.anInt7612 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(49) byte[] local49 = new byte[local23];
			local8.method4926(local23, local49);
			return local49;
		} else {
			@Pc(61) int local61 = local8.method4931();
			if (local61 < 0 || Static397.anInt7612 != 0 && Static397.anInt7612 < local61) {
				throw new RuntimeException();
			}
			@Pc(81) byte[] local81 = new byte[local61];
			if (local12 == 1) {
				Static489.method7246(local81, local61, arg0, local23);
			} else {
				@Pc(94) Class249 local94 = Static4.aClass249_1;
				synchronized (Static4.aClass249_1) {
					Static4.aClass249_1.method6041(local8, local81);
				}
			}
			return local81;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[B)[B")
	public static byte[] method8309(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static597.method3730(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
