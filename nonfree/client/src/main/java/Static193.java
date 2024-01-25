import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static193 {

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public static int anInt3508;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[1000][];

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt3514 = 1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
	public static boolean method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static512.method6691(arg0, arg1) & Static488.method6444(arg0, arg1);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)J")
	public static long method3000() {
		return Static152.aClass12_12.method8273();
	}
}
