import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
	public static int anInt2940;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_42 = new Class179(60, 4);

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_27 = new Class109();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V")
	public static void method2460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 7);
		local8.method662();
		local8.anInt823 = arg1;
	}
}
