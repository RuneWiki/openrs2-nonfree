import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
	public static int anInt1727;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "Lclient!kfa;")
	public static Class168 aClass168_1;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public static void method1620(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub5_Sub19 local13 = Static348.method5721(arg0, 1);
		local13.method5174();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!ni;ZI)Lclient!mv;")
	public static Class213 method1622(@OriginalArg(0) Class223 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method5942(arg1);
		return local8 == null ? null : new Class213(local8);
	}
}
