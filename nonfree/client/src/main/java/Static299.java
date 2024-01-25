import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "[I")
	public static int[] anIntArray502;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	public static int anInt7359;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_180 = new Class12(67, 6);

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_177 = new Class119("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_178 = new Class119("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_252 = new Class103(37, 6);

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
	public static int anInt7360 = -1;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ir;[I[IB[I)V")
	public static void method5822(@OriginalArg(0) Class25_Sub5_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(17) int local17 = arg3[local11];
			@Pc(21) int local21 = arg1[local11];
			@Pc(25) int local25 = arg2[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg0.aClass74Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg0.aClass74Array3[local27] = null;
					} else {
						@Pc(52) Class177 local52 = Static174.aClass254_1.method5670(local17);
						@Pc(55) int local55 = local52.anInt5037;
						@Pc(60) Class74 local60 = arg0.aClass74Array3[local27];
						if (local60 != null) {
							if (local60.anInt1918 == local17) {
								if (local55 == 0) {
									local60 = arg0.aClass74Array3[local27] = null;
								} else if (local55 == 1) {
									local60.anInt1917 = 1;
									local60.anInt1914 = 0;
									local60.anInt1913 = 0;
									local60.anInt1916 = 0;
									local60.anInt1915 = local25;
									Static70.method1141(local52, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, false, 0);
								} else if (local55 == 2) {
									local60.anInt1916 = 0;
								}
							} else if (local52.anInt5039 >= Static174.aClass254_1.method5670(local60.anInt1918).anInt5039) {
								local60 = arg0.aClass74Array3[local27] = null;
							}
						}
						if (local60 == null) {
							local60 = arg0.aClass74Array3[local27] = new Class74();
							local60.anInt1913 = 0;
							local60.anInt1918 = local17;
							local60.anInt1916 = 0;
							local60.anInt1914 = 0;
							local60.anInt1917 = 1;
							local60.anInt1915 = local25;
							Static70.method1141(local52, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, false, 0);
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}
}
