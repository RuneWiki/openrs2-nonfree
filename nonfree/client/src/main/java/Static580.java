import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "J")
	public static long aLong249;

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "Lclient!bia;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_167 = new Class145(38, 11);

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)V")
	public static void method8045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(13, arg0);
		local8.method925();
		local8.anInt852 = arg1;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
	public static void method8047() {
		@Pc(15) Class2_Sub7_Sub2 local15 = Static188.method3210(15, 0);
		local15.method923();
	}
}
