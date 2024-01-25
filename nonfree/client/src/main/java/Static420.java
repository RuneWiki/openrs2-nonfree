import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_103 = new Class267("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_148 = new Class92(70, -1);

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static int anInt7505 = 0;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
	public static final int anInt7506 = 205;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_391 = new Class123(49, -1);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIILclient!uf;)V")
	public static void method6160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub4 arg4) {
		@Pc(4) Class101 local4 = Static217.method3259(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt2174 = (arg1 << Static62.anInt1705) + Static437.anInt7761;
		arg4.anInt2168 = arg3;
		arg4.anInt2173 = (arg2 << Static62.anInt1705) + Static437.anInt7761;
		for (@Pc(28) Class145 local28 = local4.aClass145_1; local28 != null; local28 = local28.aClass145_2) {
			if (local28.aClass3_Sub2_2.aBoolean460) {
				@Pc(38) int local38 = local28.aClass3_Sub2_2.method5947();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt2168 += local8;
			arg4.aBoolean148 = true;
		}
		local4.aClass3_Sub4_1 = arg4;
	}
}
