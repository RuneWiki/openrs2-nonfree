import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[250][];

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_103 = new Class376(23, 3);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!fl;Z)V")
	public static void method6372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23_Sub2_Sub1_Sub2_Sub1 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static689.method8056(local6, 0, local6.length, arg0);
		Static547.method7558(arg2, arg1, local6);
	}
}
