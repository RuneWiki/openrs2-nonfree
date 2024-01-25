import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "Lclient!wi;")
	public static final Class376 aClass376_1 = new Class376();

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!uu;II)Lclient!bha;")
	public static Class3_Sub10 method966(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method8143(arg1);
		return local16 == null ? null : new Class3_Sub10(local16);
	}
}
