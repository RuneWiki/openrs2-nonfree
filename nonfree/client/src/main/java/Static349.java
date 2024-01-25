import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static349 {

	@OriginalMember(owner = "client!ol", name = "P", descriptor = "Lclient!uf;")
	public static Class283 aClass283_4;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
	public static int anInt6441;

	@OriginalMember(owner = "client!ol", name = "G", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_130 = new Class239(84, 3);

	@OriginalMember(owner = "client!ol", name = "O", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_190 = new Class202(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!bj;")
	public static Class25 method5499(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static201.aFloat5 == 3.0D) {
				return Static501.aClass25_7;
			}
			if ((double) Static201.aFloat5 == 4.0D) {
				return Static388.aClass25_5;
			}
			if ((double) Static201.aFloat5 == 6.0D) {
				return Static115.aClass25_2;
			}
			if ((double) Static201.aFloat5 >= 8.0D) {
				return Static531.aClass25_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static201.aFloat5 == 3.0D) {
				return Static115.aClass25_2;
			}
			if ((double) Static201.aFloat5 == 4.0D) {
				return Static531.aClass25_8;
			}
			if ((double) Static201.aFloat5 == 6.0D) {
				return Static377.aClass25_4;
			}
			if ((double) Static201.aFloat5 >= 8.0D) {
				return Static495.aClass25_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static201.aFloat5 == 3.0D) {
				return Static377.aClass25_4;
			}
			if ((double) Static201.aFloat5 == 4.0D) {
				return Static495.aClass25_6;
			}
			if ((double) Static201.aFloat5 == 6.0D) {
				return Static77.aClass25_1;
			}
			if ((double) Static201.aFloat5 >= 8.0D) {
				return Static324.aClass25_3;
			}
		}
		return null;
	}
}
