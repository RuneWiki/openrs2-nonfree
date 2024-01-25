import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "Lclient!caa;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
	public static int anInt4327;

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
	public static int anInt4328;

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
	public static int anInt4329;

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "Lclient!ih;")
	public static final Class137 aClass137_4 = new Class137();

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean338 = true;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BIIII)V")
	public static void method4023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub37 local10 = (Class1_Sub37) Static307.aClass295_34.method7543(); local10 != null; local10 = (Class1_Sub37) Static307.aClass295_34.method7540()) {
			Static501.method8146(local10, arg1, arg3, arg0, arg2);
		}
		for (@Pc(31) Class1_Sub37 local31 = (Class1_Sub37) Static406.aClass295_44.method7543(); local31 != null; local31 = (Class1_Sub37) Static406.aClass295_44.method7540()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class299 local40 = local31.aClass20_Sub1_Sub1_Sub2_1.method7819();
			if (local31.aClass20_Sub1_Sub1_Sub2_1.aBoolean677) {
				local35 = 0;
			} else if (local40.anInt8814 == local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030 || local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030 == local40.anInt8834 || local40.anInt8817 == local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030 || local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030 == local40.anInt8843) {
				local35 = 2;
			} else if (local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030 == local40.anInt8826 || local40.anInt8844 == local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030 || local40.anInt8827 == local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030 || local40.anInt8818 == local31.aClass20_Sub1_Sub1_Sub2_1.anInt9030) {
				local35 = 3;
			}
			if (local35 != local31.anInt5964) {
				@Pc(139) int local139 = Static440.method6821(local31.aClass20_Sub1_Sub1_Sub2_1);
				if (local31.anInt5956 != local139) {
					if (local31.aClass1_Sub4_Sub1_3 != null) {
						Static475.aClass1_Sub4_Sub2_2.method3184(local31.aClass1_Sub4_Sub1_3);
						local31.aClass1_Sub4_Sub1_3 = null;
					}
					local31.anInt5956 = local139;
				}
				local31.anInt5964 = local35;
			}
			local31.anInt5962 = local31.aClass20_Sub1_Sub1_Sub2_1.anInt8954;
			local31.anInt5958 = local31.aClass20_Sub1_Sub1_Sub2_1.anInt8954 + (local31.aClass20_Sub1_Sub1_Sub2_1.method7808() << 6);
			local31.anInt5960 = local31.aClass20_Sub1_Sub1_Sub2_1.anInt8949;
			local31.anInt5959 = local31.aClass20_Sub1_Sub1_Sub2_1.anInt8949 + (local31.aClass20_Sub1_Sub1_Sub2_1.method7808() << 6);
			Static501.method8146(local31, arg1, arg3, arg0, arg2);
		}
		for (@Pc(222) Class1_Sub37 local222 = (Class1_Sub37) Static61.aClass230_11.method6137(); local222 != null; local222 = (Class1_Sub37) Static61.aClass230_11.method6140()) {
			@Pc(226) byte local226 = 1;
			@Pc(231) Class299 local231 = local222.aClass20_Sub1_Sub1_Sub1_2.method7819();
			if (local222.aClass20_Sub1_Sub1_Sub1_2.aBoolean677) {
				local226 = 0;
			} else if (local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030 == local231.anInt8814 || local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030 == local231.anInt8834 || local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030 == local231.anInt8817 || local231.anInt8843 == local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030) {
				local226 = 2;
			} else if (local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030 == local231.anInt8826 || local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030 == local231.anInt8844 || local231.anInt8827 == local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030 || local222.aClass20_Sub1_Sub1_Sub1_2.anInt9030 == local231.anInt8818) {
				local226 = 3;
			}
			if (local226 != local222.anInt5964) {
				@Pc(310) int local310 = Static209.method3848(local222.aClass20_Sub1_Sub1_Sub1_2);
				if (local310 != local222.anInt5956) {
					if (local222.aClass1_Sub4_Sub1_3 != null) {
						Static475.aClass1_Sub4_Sub2_2.method3184(local222.aClass1_Sub4_Sub1_3);
						local222.aClass1_Sub4_Sub1_3 = null;
					}
					local222.anInt5956 = local310;
				}
				local222.anInt5964 = local226;
			}
			local222.anInt5962 = local222.aClass20_Sub1_Sub1_Sub1_2.anInt8954;
			local222.anInt5958 = local222.aClass20_Sub1_Sub1_Sub1_2.anInt8954 + (local222.aClass20_Sub1_Sub1_Sub1_2.method7808() << 6);
			local222.anInt5960 = local222.aClass20_Sub1_Sub1_Sub1_2.anInt8949;
			local222.anInt5959 = local222.aClass20_Sub1_Sub1_Sub1_2.anInt8949 + (local222.aClass20_Sub1_Sub1_Sub1_2.method7808() << 6);
			Static501.method8146(local222, arg1, arg3, arg0, arg2);
		}
	}
}
