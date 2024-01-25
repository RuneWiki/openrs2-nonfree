import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_105 = new Class274(48, -1);

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_64 = new Class269(29, 18);

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_65 = new Class269(7, 15);

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[200];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	public static void method5555(@OriginalArg(0) int arg0) {
		if (!Static164.method3053(arg0)) {
			return;
		}
		@Pc(12) Class78[] local12 = Static399.aClass78ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class78 local19 = local12[local14];
			if (local19 != null) {
				local19.anInt1973 = 1;
				local19.anInt1946 = 0;
				local19.anInt1925 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
	public static int method5558() {
		return Static223.anInt4591;
	}
}
