import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Lclient!an;")
	public static Class16 aClass16_103;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "Lclient!bea;")
	public static Class30_Sub1_Sub1_Sub1 aClass30_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_19 = new Class225(14, 0, 4, 1);

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_238 = new Class88("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
	public static int anInt8079 = -2;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[100];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	public static void method6678() {
		@Pc(14) Class308 local14 = null;
		try {
			@Pc(20) Class55 local20 = Static375.aClass71_3.method1980("3", false);
			while (local20.anInt1481 == 0) {
				Static17.method388(1L);
			}
			if (local20.anInt1481 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local14 = (Class308) local20.anObject5;
			@Pc(49) byte[] local49 = new byte[(int) local14.method7735()];
			if (local49.length == 0) {
				Static63.aString91 = "";
				Static36.aString98 = "";
			} else {
				@Pc(73) int local73;
				for (@Pc(60) int local60 = 0; local60 < local49.length; local60 += local73) {
					local73 = local14.method7737(local49, local49.length - local60, local60);
					if (local73 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(99) Class12_Sub8 local99 = new Class12_Sub8(local49);
				@Pc(103) int local103 = local99.method5216();
				if (local103 > 50) {
					throw new RuntimeException("Bad length");
				}
				local99.anInt6217 = local103 + 1;
				if (!local99.method5211()) {
					throw new RuntimeException("Invalid CRC");
				}
				local99.anInt6217 = 1;
				@Pc(132) int local132 = local99.method5216();
				if (local132 > 1) {
					throw new RuntimeException("Invalid version " + local132);
				}
				Static63.aString91 = local99.method5185();
				Static36.aString98 = local99.method5185();
				if (local132 >= 1) {
					Static362.anInt6761 = local99.method5199();
				} else {
					Static362.anInt6761 = Static423.anInt79;
				}
			}
		} catch (@Pc(169) Exception local169) {
			Static36.aString98 = "";
			Static63.aString91 = "";
		}
		try {
			if (local14 != null) {
				local14.method7739();
			}
		} catch (@Pc(180) Exception local180) {
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method6680(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(local8 + local10);
		for (@Pc(51) int local51 = 0; local51 < local8; local51++) {
			@Pc(57) char local57 = arg0.charAt(local51);
			if (local57 == '<') {
				local49.append("<lt>");
			} else if (local57 == '>') {
				local49.append("<gt>");
			} else {
				local49.append(local57);
			}
		}
		return local49.toString();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BII)Z")
	public static boolean method6681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
