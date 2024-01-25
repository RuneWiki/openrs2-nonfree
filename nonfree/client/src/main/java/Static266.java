import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!it", name = "r", descriptor = "I")
	public static int anInt4302;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_99 = new Class151(103, 2);

	@OriginalMember(owner = "client!it", name = "s", descriptor = "Lclient!kja;")
	public static final Class194 aClass194_5 = new Class194();

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(B)Z")
	public static boolean method3808() {
		@Pc(7) boolean local7 = true;
		if (Static30.aClass51_1 == null) {
			if (Static368.aClass34_80.method1235(Static139.anInt10490)) {
				Static30.aClass51_1 = Static682.method1664(Static368.aClass34_80, Static139.anInt10490);
			} else {
				local7 = false;
			}
		}
		if (Static660.aClass51_3 == null) {
			if (Static368.aClass34_80.method1235(Static153.anInt2818)) {
				Static660.aClass51_3 = Static682.method1664(Static368.aClass34_80, Static153.anInt2818);
			} else {
				local7 = false;
			}
		}
		if (Static191.aClass51_2 == null) {
			if (Static368.aClass34_80.method1235(Static273.anInt4428)) {
				Static191.aClass51_2 = Static682.method1664(Static368.aClass34_80, Static273.anInt4428);
			} else {
				local7 = false;
			}
		}
		if (Static302.aClass31_3 == null) {
			if (Static305.aClass34_68.method1235(Static679.anInt10637)) {
				Static302.aClass31_3 = Static662.method8784(Static305.aClass34_68, Static679.anInt10637);
			} else {
				local7 = false;
			}
		}
		if (Static676.aClass51Array1 == null) {
			if (Static368.aClass34_80.method1235(Static679.anInt10637)) {
				Static676.aClass51Array1 = Static682.method1652(Static368.aClass34_80, Static679.anInt10637);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
