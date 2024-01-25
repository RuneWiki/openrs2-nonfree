import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_16 = new Class163();

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_31 = new Class185(70, 3);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
	public static void method2642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg1, 12);
		local8.method5179();
		local8.anInt6198 = arg0;
	}
}
