import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "[Lclient!tv;")
	public static Class238[] aClass238Array1;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "J")
	public static long aLong171 = -1L;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_74 = new Class134("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	public static int anInt5305 = 0;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_154 = new Class102(59, 18);

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public static int anInt5306 = -50;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!fk;B)Z")
	public static boolean method4222(@OriginalArg(0) Class78 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean145) {
			return false;
		} else if (!arg0.method1749(Static282.anInterface12_2)) {
			return false;
		} else if (Static431.aClass72_45.method1659((long) arg0.anInt2162) == null) {
			return Static399.aClass72_40.method1659((long) arg0.anInt2163) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)[B")
	public static byte[] method4223(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub5_Sub6 local17 = (Class2_Sub5_Sub6) Static8.aClass85_1.method1935((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static175.method2474(local52, local28);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class2_Sub5_Sub6(local22);
			Static8.aClass85_1.method1934((long) arg0, local17);
		}
		return local17.aByteArray22;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)I")
	public static int method4226(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
