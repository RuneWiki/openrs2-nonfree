import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "Lclient!ns;")
	public static Class166 aClass166_193;

	@OriginalMember(owner = "client!ns", name = "O", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_159 = new Class186(62, -2);

	@OriginalMember(owner = "client!ns", name = "P", descriptor = "[I")
	public static final int[] anIntArray439 = new int[14];

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "Lclient!er;")
	public static final Class69 aClass69_44 = new Class69(4);

	@OriginalMember(owner = "client!ns", name = "U", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[250][];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;ZIB)Z")
	public static boolean method3677(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(36) boolean local36 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local26 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local49 >= '0' && local49 <= '9') {
				local78 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local78 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local78 = local49 - 'W';
			} else {
				return false;
			}
			if (local78 >= 10) {
				return false;
			}
			if (local26) {
				local78 = -local78;
			}
			@Pc(125) int local125 = local38 * 10 + local78;
			if (local125 / 10 != local38) {
				return false;
			}
			local38 = local125;
			local36 = true;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method3690(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static31.method578(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static451.method5807(local7);
			local7 = Static179.method2607(local7, "%3a", ":");
			local7 = Static179.method2607(local7, "%40", "@");
			local7 = Static179.method2607(local7, "%26", "&");
			local7 = Static179.method2607(local7, "%23", "#");
			if (Static295.aClass114_4.anApplet1 != null) {
				@Pc(103) Class108 local103 = Static295.aClass114_4.method2350(new URL(Static295.aClass114_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static375.anInt5261 + "&u=" + Static268.aLong145 + "&v1=" + Static159.aString34 + "&v2=" + Static159.aString33 + "&e=" + local7));
				while (local103.anInt2803 == 0) {
					Static20.method1515(1L);
				}
				if (local103.anInt2803 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local103.anObject4;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)V")
	public static void method3697(@OriginalArg(1) int arg0) {
		Static98.anInt2095 = 100;
		Static158.anInt2992 = -1;
		Static129.anInt2584 = arg0;
		Static2.anInt6973 = 3;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIZ)Lclient!ap;")
	public static Class6_Sub2_Sub1 method3700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class53 local11 = Static40.aClass53ArrayArrayArray2[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class6_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class165 local27 = local11.aClass165_1; local27 != null; local27 = local27.aClass165_2) {
			@Pc(31) Class6_Sub2 local31 = local27.aClass6_Sub2_2;
			if (local31 instanceof Class6_Sub2_Sub1) {
				@Pc(37) Class6_Sub2_Sub1 local37 = (Class6_Sub2_Sub1) local31;
				@Pc(45) int local45 = local37.method4763() * 64 - 4;
				@Pc(53) int local53 = local37.anInt6062 - local45 >> 7;
				@Pc(61) int local61 = local37.anInt6061 - local45 >> 7;
				@Pc(68) int local68 = local45 + local37.anInt6062 >> 7;
				@Pc(76) int local76 = local37.anInt6061 + local45 >> 7;
				if (local53 <= arg1 && local61 <= arg0 && arg1 <= local68 && arg0 <= local76) {
					@Pc(106) int local106 = (local68 + 1 - arg1) * (-arg0 + 1 + local76);
					if (local19 < local106) {
						local17 = local37;
						local19 = local106;
					}
				}
			}
		}
		return local17;
	}
}
