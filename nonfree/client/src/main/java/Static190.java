import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!la;")
	public static Class20 aClass20_4;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public static int anInt3989 = 503;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!jc;")
	public static final Class126 aClass126_6 = new Class126(5, 19);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BII)V")
	public static void method3096(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static248.method3707(arg0, 1);
		local12.method2957();
		local12.anInt3820 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
	public static int method3097(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(25) char local25 = arg0.charAt(local12);
			if (local25 <= '\u007f') {
				arg1[local10++] = (byte) local25;
			} else if (local25 > '\u07ff') {
				arg1[local10++] = (byte) (local25 >> 12 | 0xE0);
				arg1[local10++] = (byte) (local25 >> 6 & 0x3F | 0x80);
				arg1[local10++] = (byte) (local25 & 0x3F | 0x80);
			} else {
				arg1[local10++] = (byte) (local25 >> 6 | 0xC0);
				arg1[local10++] = (byte) (local25 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Z")
	public static boolean method3098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static432.method5784(arg0, arg1) || Static157.method2625(arg0, arg1);
	}
}
