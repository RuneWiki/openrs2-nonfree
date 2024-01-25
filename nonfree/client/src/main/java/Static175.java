import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
	public static int anInt3082;

	@OriginalMember(owner = "client!gba", name = "h", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_46 = new Class179(77, -1);

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_109 = new Class288(12, 0);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!ep;)V")
	public static void method2592(@OriginalArg(1) Class95_Sub1 arg0) {
		@Pc(16) byte[] local16;
		if (Static195.anObject7 == null) {
			@Pc(9) Class38_Sub1_Sub1 local9 = new Class38_Sub1_Sub1();
			local16 = local9.method805();
			Static195.anObject7 = Static253.method3515(local16);
		}
		if (Static319.anObject9 == null) {
			@Pc(27) Class38_Sub2_Sub1 local27 = new Class38_Sub2_Sub1();
			local16 = local27.method2501();
			Static319.anObject9 = Static253.method3515(local16);
		}
		@Pc(44) Class193 local44 = arg0.aClass193_1;
		if (local44.method4090() && Static334.anObject10 == null) {
			local16 = Static555.method7625(16.0F, 4.0F, 0.6F, 0.5F, 4.0F, new Class115_Sub1(419684));
			Static334.anObject10 = Static253.method3515(local16);
		}
	}
}
