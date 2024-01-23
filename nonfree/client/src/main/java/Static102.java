import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public static int anInt2345;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!db;")
	public static Class19 aClass19_9 = new Class19();

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	public static int anInt2347 = 1;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_762 = Static200.method3116("(Y");

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	public static int anInt2348 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[B)Lclient!kh;")
	public static Class60 method1755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) Class60 local5 = new Class60();
		local5.aByteArray34 = new byte[arg0];
		local5.anInt2439 = 0;
		for (@Pc(23) int local23 = arg1; local23 < arg0 + arg1; local23++) {
			if (arg2[local23] != 0) {
				local5.aByteArray34[local5.anInt2439++] = arg2[local23];
			}
		}
		return local5;
	}
}
