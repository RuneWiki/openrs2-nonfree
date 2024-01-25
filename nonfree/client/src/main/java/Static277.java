import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!no", name = "m", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "Lclient!os;")
	public static final Class182 aClass182_161 = new Class182("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_25 = new Class168(2, 18);

	@OriginalMember(owner = "client!no", name = "j", descriptor = "Lclient!s;")
	public static final Class217 aClass217_108 = new Class217(94, -1);

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Lclient!je;")
	public static final Class127 aClass127_14 = new Class127(8, 0, 4, 1);

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Lclient!os;")
	public static final Class182 aClass182_162 = new Class182("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!no", name = "n", descriptor = "[I")
	public static final int[] anIntArray474 = new int[25];

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	public static int anInt4825 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZ)I")
	public static int method3882(@OriginalArg(0) int arg0) {
		@Pc(19) Class10_Sub44 local19 = Static40.method555(arg0, false);
		if (local19 == null) {
			return Static293.aClass226_1.method4989(arg0).anInt3749;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray704.length; local31++) {
			if (local19.anIntArray704[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static293.aClass226_1.method4989(arg0).anInt3749 - local19.anIntArray704.length;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I")
	public static int method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static221.anIntArray414[arg0 & 0x3] : 256;
	}
}
