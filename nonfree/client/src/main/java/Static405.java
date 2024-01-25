import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array13;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!eb;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString99;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
	public static final boolean aBoolean554 = false;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method5875() {
		@Pc(7) Class235 local7 = null;
		try {
			@Pc(13) Class192 local13 = Static409.aClass221_6.method5200("3", false);
			while (local13.anInt5186 == 0) {
				Static374.method5521(1L);
			}
			if (local13.anInt5186 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class235) local13.anObject30;
			@Pc(43) byte[] local43 = new byte[(int) local7.method5483()];
			if (local43.length == 0) {
				Static113.aString36 = "";
				Static546.aString119 = "";
			} else {
				@Pc(60) int local60;
				for (@Pc(48) int local48 = 0; local48 < local43.length; local48 += local60) {
					local60 = local7.method5490(local43, local48, local43.length - local48);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(85) Class3_Sub11 local85 = new Class3_Sub11(local43);
				@Pc(91) int local91 = local85.method3118();
				if (local91 > 120) {
					throw new RuntimeException("Bad length");
				}
				local85.anInt3520 = local91 + 1;
				if (!local85.method3080()) {
					throw new RuntimeException("Invalid CRC");
				}
				local85.anInt3520 = 1;
				@Pc(124) int local124 = local85.method3118();
				if (local124 > 3) {
					throw new RuntimeException("Invalid version " + local124);
				}
				Static113.aString36 = local85.method3106();
				Static546.aString119 = local85.method3106();
				if (local124 < 1) {
					Static503.anInt8031 = Static350.anInt8128;
				} else {
					Static503.anInt8031 = local85.method3109();
				}
				if (local124 < 2) {
					Static505.aLong83 = Static513.aLong237;
				} else {
					Static505.aLong83 = local85.method3128();
				}
				if (local124 < 3) {
					Static402.aString98 = Static428.aString28;
				} else if (local85.method3118() == 1) {
					Static402.aString98 = local85.method3106();
				} else {
					Static402.aString98 = null;
				}
			}
		} catch (@Pc(206) Exception local206) {
			Static113.aString36 = "";
			Static546.aString119 = "";
		}
		try {
			if (local7 != null) {
				local7.method5488();
			}
		} catch (@Pc(217) Exception local217) {
		}
	}
}
