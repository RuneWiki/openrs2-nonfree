import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
	public static int anInt2807 = 0;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "Lclient!ec;")
	public static Class22 aClass22_876 = Static60.method1113("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!ec;")
	public static Class22 aClass22_877 = Static60.method1113("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "Lclient!ec;")
	public static Class22 aClass22_878 = Static60.method1113("null");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method1813() {
		aClass22_878 = null;
		aClass22_876 = null;
		aClass22_877 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method1815(@OriginalArg(0) Class20 arg0) {
		Static60.aClass20_33 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BBII)Lclient!ec;")
	public static Class22 method1817(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class22 local14 = new Class22();
		local14.anInt668 = 0;
		local14.aByteArray7 = new byte[arg2];
		for (@Pc(23) int local23 = arg1; local23 < arg1 + arg2; local23++) {
			if (arg0[local23] != 0) {
				local14.aByteArray7[local14.anInt668++] = arg0[local23];
			}
		}
		return local14;
	}
}
