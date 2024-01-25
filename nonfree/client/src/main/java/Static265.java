import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Lclient!vf;")
	public static Class257 aClass257_2;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!m;")
	public static Interface5 anInterface5_5;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public static int anInt5008;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_31 = new Class243();

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_106 = new Class119(76, 7);

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[Lclient!wg;")
	public static final Class3_Sub4_Sub16[] aClass3_Sub4_Sub16Array3 = new Class3_Sub4_Sub16[14];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!at;B)I")
	public static int method3845(@OriginalArg(0) Class7_Sub2_Sub3_Sub1 arg0) {
		@Pc(6) Class47 local6 = arg0.aClass47_1;
		if (local6.anIntArray94 != null) {
			local6 = local6.method1251(Static85.aClass49_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(29) int local29 = local6.anInt1625;
		@Pc(33) Class1 local33 = arg0.method3514();
		if (arg0.aBoolean378) {
			local29 = local6.anInt1597;
		} else if (local33.anInt14 == arg0.anInt4389 || local33.anInt48 == arg0.anInt4389 || arg0.anInt4389 == local33.anInt45 || local33.anInt43 == arg0.anInt4389) {
			local29 = local6.anInt1613;
		} else if (arg0.anInt4389 == local33.anInt11 || arg0.anInt4389 == local33.anInt9 || local33.anInt32 == arg0.anInt4389 || local33.anInt20 == arg0.anInt4389) {
			local29 = local6.anInt1618;
		}
		return local29;
	}
}
