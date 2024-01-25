import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "S")
	public static short aShort57 = 320;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "Lclient!hv;")
	public static final Class137 aClass137_6 = new Class137();

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZII)V")
	public static void method2048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg3, 4);
		local8.method776();
		local8.anInt974 = arg2;
		local8.anInt979 = arg0;
		local8.anInt972 = arg1;
	}
}
