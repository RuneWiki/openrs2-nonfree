import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
	public static int anInt675;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_40 = new Class137(77, 3);

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_1 = new Class166("WTI", 5);

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_27 = new Class214(66, 2);

	@OriginalMember(owner = "client!bo", name = "I", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_22 = new Class151("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
	public static final int anInt676 = 1339;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IC)C")
	public static char method580(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vl;")
	public static RuntimeException_Sub1 method581(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString66 = local12.aString66 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
