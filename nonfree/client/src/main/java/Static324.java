import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!nm;II)Lclient!qk;")
	public static Class1_Sub26 method3673(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3235(arg2, arg1);
		return local5 == null ? null : new Class1_Sub26(new Class1_Sub13(local5));
	}
}
