import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1986() {
		@Pc(12) Class317 local12 = null;
		try {
			@Pc(18) Class5 local18 = Static169.aClass99_2.method1789(false, "3");
			while (local18.anInt151 == 0) {
				Static263.method3671(1L);
			}
			if (local18.anInt151 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local12 = (Class317) local18.anObject1;
			@Pc(47) byte[] local47 = new byte[(int) local12.method6334()];
			if (local47.length == 0) {
				Static394.aString91 = "";
				Static564.aString140 = "";
			} else {
				@Pc(65) int local65;
				for (@Pc(52) int local52 = 0; local52 < local47.length; local52 += local65) {
					local65 = local12.method6331(local47.length - local52, local47, local52);
					if (local65 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(86) Class2_Sub7 local86 = new Class2_Sub7(local47);
				@Pc(90) int local90 = local86.method4464();
				if (local90 > 120) {
					throw new RuntimeException("Bad length");
				}
				local86.anInt5186 = local90 + 1;
				if (!local86.method4482()) {
					throw new RuntimeException("Invalid CRC");
				}
				local86.anInt5186 = 1;
				@Pc(121) int local121 = local86.method4464();
				if (local121 > 3) {
					throw new RuntimeException("Invalid version " + local121);
				}
				Static564.aString140 = local86.method4471();
				Static394.aString91 = local86.method4471();
				if (local121 < 1) {
					Static125.anInt2098 = Static516.anInt8248;
				} else {
					Static125.anInt2098 = local86.method4518();
				}
				if (local121 < 2) {
					Static130.aLong51 = Static309.aLong139;
				} else {
					Static130.aLong51 = local86.method4514();
				}
				if (local121 < 3) {
					Static385.aString89 = Static409.aString96;
				} else if (local86.method4464() == 1) {
					Static385.aString89 = local86.method4471();
				} else {
					Static385.aString89 = null;
				}
			}
		} catch (@Pc(193) Exception local193) {
			Static564.aString140 = "";
			Static394.aString91 = "";
		}
		try {
			if (local12 != null) {
				local12.method6333();
			}
		} catch (@Pc(204) Exception local204) {
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method1988(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static225.anInt3293 >= 100) {
			Static581.method7527(Static229.aClass159_41.method2776(Static261.anInt4297));
			return;
		}
		@Pc(23) String local23 = Static273.method3974(arg0);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static225.anInt3293; local28++) {
			@Pc(36) String local36 = Static273.method3974(Static582.aStringArray44[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static581.method7527(arg0 + Static229.aClass159_42.method2776(Static261.anInt4297));
				return;
			}
			if (Static117.aStringArray13[local28] != null) {
				local67 = Static273.method3974(Static117.aStringArray13[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static581.method7527(arg0 + Static229.aClass159_42.method2776(Static261.anInt4297));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static107.anInt1861; local100++) {
			local67 = Static273.method3974(Static394.aStringArray33[local100]);
			if (local67 != null && local67.equals(local23)) {
				Static581.method7527(Static229.aClass159_47.method2776(Static261.anInt4297) + arg0 + Static229.aClass159_48.method2776(Static261.anInt4297));
				return;
			}
			if (Static197.aStringArray18[local100] != null) {
				@Pc(146) String local146 = Static273.method3974(Static197.aStringArray18[local100]);
				if (local146 != null && local146.equals(local23)) {
					Static581.method7527(Static229.aClass159_47.method2776(Static261.anInt4297) + arg0 + Static229.aClass159_48.method2776(Static261.anInt4297));
					return;
				}
			}
		}
		if (Static273.method3974(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75).equals(local23)) {
			Static581.method7527(Static229.aClass159_44.method2776(Static261.anInt4297));
			return;
		}
		@Pc(212) Class2_Sub34 local212 = Static555.method7264(Static308.aClass154_64, Static551.aClass64_2);
		local212.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(arg0) + 1);
		local212.aClass2_Sub7_Sub2_2.method4481(arg0);
		local212.aClass2_Sub7_Sub2_2.method4459(arg1 ? 1 : 0);
		Static100.method1508(local212);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method1989(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static111.aBoolean129) {
			try {
				@Pc(23) Class272 local23 = (Class272) Class.forName("Class272_Sub1").getDeclaredConstructor().newInstance();
				local23.method5786(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static111.aBoolean129 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method1990(@OriginalArg(0) String arg0) {
		if (Static311.aStringArray28 == null) {
			Static523.method6733();
		}
		Static16.aCalendar1.setTime(new Date(Static362.method5133()));
		@Pc(28) int local28 = Static16.aCalendar1.get(11);
		@Pc(32) int local32 = Static16.aCalendar1.get(12);
		@Pc(36) int local36 = Static16.aCalendar1.get(13);
		@Pc(70) String local70 = Integer.toString(local28 / 10) + local28 % 10 + ":" + local32 / 10 + local32 % 10 + ":" + local36 / 10 + local36 % 10;
		@Pc(75) String[] local75 = Static439.method5762(arg0, '\n');
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			for (@Pc(81) int local81 = Static77.anInt1385; local81 > 0; local81--) {
				Static311.aStringArray28[local81] = Static311.aStringArray28[local81 - 1];
			}
			Static311.aStringArray28[0] = local70 + ": " + local75[local77];
			if (aFileOutputStream1 != null) {
				try {
					aFileOutputStream1.write(Static165.method2187(Static311.aStringArray28[0] + "\n"));
				} catch (@Pc(127) IOException local127) {
				}
			}
			if (Static77.anInt1385 < Static311.aStringArray28.length - 1) {
				if (Static533.anInt8769 > 0) {
					Static533.anInt8769++;
				}
				Static77.anInt1385++;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
	public static void method1991(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static433.aByteArrayArrayArray15 = new byte[4][arg1][arg0];
	}
}
