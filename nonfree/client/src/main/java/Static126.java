import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public static int anInt3222;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBI)I")
	public static int method2964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 - 1 & arg0 >> 31;
		return (arg0 + (arg0 >>> 31)) % arg1 + local19;
	}
}
