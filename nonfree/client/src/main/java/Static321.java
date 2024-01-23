import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!nm;II)Lclient!kk;")
	public static Class101 method2528(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3235(arg2, arg1);
		return local5 == null ? null : new Class101(new Class1_Sub13(local5));
	}
}
