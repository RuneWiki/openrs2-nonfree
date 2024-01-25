import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "Lclient!sv;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
	public static int anInt6501;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray44;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!gh;")
	public static Class89 aClass89_13 = null;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public static int anInt6503 = 0;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "Lclient!os;")
	public static final Class182 aClass182_224 = new Class182("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!ph;II)Lclient!pn;")
	public static Class192 method5099(@OriginalArg(1) Class187 arg0, @OriginalArg(3) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4300(arg1, 0);
		return local13 == null ? null : new Class192(local13);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZIII)V")
	public static void method5100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static319.anInt5496 <= arg2 && arg2 <= Static160.anInt3220) {
			@Pc(19) int local19 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg1);
			@Pc(25) int local25 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0);
			Static212.method3266(local19, local25, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5101(@OriginalArg(0) String arg0) {
		@Pc(17) int local17 = arg0.length();
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			local19 = (local19 << 5) + Static292.method4104(arg0.charAt(local21)) - local19;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIILclient!ph;)Lclient!fj;")
	public static Class79 method5102(@OriginalArg(1) int arg0, @OriginalArg(3) Class187 arg1) {
		@Pc(9) byte[] local9 = arg1.method4300(arg0, 0);
		return local9 == null ? null : new Class79(local9);
	}
}
