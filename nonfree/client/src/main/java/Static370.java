import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
	public static boolean aBoolean521 = false;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_67 = new Class243(45, 4);

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public static final int anInt6930 = 328;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "[Lclient!wq;")
	public static final Class317[] aClass317Array1 = new Class317[2048];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ)Lclient!tg;")
	public static Class2_Sub13_Sub15 method5893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class2_Sub13_Sub15 local15 = (Class2_Sub13_Sub15) Static4.aClass127_2.method3205((long) arg0 | (long) arg1 << 32);
		if (local15 == null) {
			local15 = new Class2_Sub13_Sub15(arg1, arg0);
			Static4.aClass127_2.method3213(local15, local15.aLong241);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5895(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(25) char local25 = arg0.charAt(local12);
			if (local25 <= '\u007f') {
				local10++;
			} else if (local25 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}
}
