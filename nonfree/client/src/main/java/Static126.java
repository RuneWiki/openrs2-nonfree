import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "J")
	public static long aLong91;

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
	public static final int[] anIntArray220 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_63 = new Class140("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "Lclient!ik;")
	public static final Class102 aClass102_52 = new Class102("", 14);

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "Z")
	public static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
	public static final int anInt2714 = 1337;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
	public static String method2476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg2[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg1 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg0; local34 < local30; local34++) {
				@Pc(40) String local40 = arg2[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local32);
			for (@Pc(70) int local70 = arg0; local70 < local30; local70++) {
				@Pc(76) String local76 = arg2[local70];
				if (local76 == null) {
					local63.append("null");
				} else {
					local63.append(local76);
				}
			}
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Lclient!tl;")
	public static Class1_Sub5 method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class1_Sub5 local14 = local7.aClass1_Sub5_1;
			local7.aClass1_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)I")
	public static int method2484(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (arg0 * local19 >> 12) + 40960;
		return local13 * local27 >> 12;
	}
}
