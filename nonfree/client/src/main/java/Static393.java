import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt6147 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
	public static boolean method5548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BII)Z")
	public static boolean method5552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static437.method6235(arg0, arg1) || Static574.method8103(arg0, arg1);
	}
}
