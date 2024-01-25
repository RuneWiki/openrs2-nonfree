import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_231 = new Class235(100, 8);

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!qs;")
	public static final Class278 aClass278_4 = new Class278();

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_77 = new Class70(31, 7);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)I")
	public static int method6093(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public static void method6094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(8, arg1);
		local8.method6594();
		local8.anInt8204 = arg2;
		local8.anInt8208 = arg0;
		local8.anInt8205 = arg3;
	}
}
