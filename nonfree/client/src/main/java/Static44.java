import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!mo;")
	public static Class143 aClass143_30;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Lclient!mo;")
	public static Class143 aClass143_31;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public static int anInt1104 = 0;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!rm;")
	public static final Class178 aClass178_3 = new Class178(128);

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
	public static int anInt1107 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
	public static int method1085(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(24) int local24 = (local10 >>> 2 & 0xF3333333) + (local10 & 0x33333333);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(45) int local45 = local39 + (local39 >>> 16);
		return local45 & 0xFF;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	public static void method1086() {
		Static140.anInt2984 = -1;
		Static213.anInt4250 = -1;
		Static7.anInt191 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V")
	public static void method1087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class14_Sub2_Sub13 local15 = Static1.method5711(12, arg1);
		local15.method3540();
		local15.anInt3805 = arg0;
	}
}
