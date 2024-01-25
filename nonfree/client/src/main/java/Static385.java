import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!qo;")
	public static final Class196 aClass196_32 = new Class196(512);

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "[I")
	public static int[] anIntArray500 = new int[2];

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_76 = new Class242(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "[I")
	public static final int[] anIntArray501 = new int[8];

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_193 = new Class186(28, 0);

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_77 = new Class242("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IFIFIILclient!ut;FFFI)[B")
	public static byte[] method4420(@OriginalArg(1) float arg0, @OriginalArg(3) float arg1, @OriginalArg(6) Class238 arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static3.method106(arg1, 0, arg3, arg4, arg0, local15, arg5, arg2);
		return local15;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)I")
	public static int method4421(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local27 >> 12) + 40960;
		return local21 * local35 >> 12;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)Z")
	public static boolean method4426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(22) Class71 local22 = Static2.aClass74_13.method1683(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local22.method1630(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!pj;I)V")
	public static void method4427(@OriginalArg(0) Class41_Sub6 arg0) {
		arg0.aClass6_1 = null;
		@Pc(17) int local17 = arg0.aClass41_Sub4Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass41_Sub4Array1[local19].aBoolean334 = false;
		}
		@Pc(37) Class27[] local37 = Class84_Sub1.aClass27Array1;
		synchronized (Class84_Sub1.aClass27Array1) {
			if (Class84_Sub1.aClass27Array1.length > local17 && Static5.anIntArray15[local17] < 200) {
				Class84_Sub1.aClass27Array1[local17].method725(arg0);
				@Pc(60) int local60 = Static5.anIntArray15[local17]++;
			}
		}
	}
}
