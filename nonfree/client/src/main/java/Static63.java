import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
	public static int anInt1182;

	@OriginalMember(owner = "client!cfa", name = "w", descriptor = "Lclient!hh;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)Z")
	public static boolean method1064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!eh;B)Lclient!maa;")
	public static Class156_Sub1 method1066(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(12) Class156 local12 = Static1.method46(arg0);
		@Pc(16) int local16 = arg0.method5974();
		return new Class156_Sub1(local12.anInt5678, local12.aClass297_8, local12.aClass58_9, local12.anInt5679, local12.anInt5680, local16);
	}
}
