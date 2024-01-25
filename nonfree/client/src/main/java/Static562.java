import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!ria", name = "C", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!ria", name = "z", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_11 = new Class390(6, 1);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!aba;Z)V")
	public static void method7336(@OriginalArg(0) Class3_Sub2_Sub1 arg0) {
		arg0.method225();
		@Pc(10) int local10 = Static574.anInt8718;
		@Pc(20) Class9_Sub1_Sub1_Sub2_Sub1 local20 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local10] = new Class9_Sub1_Sub1_Sub2_Sub1();
		local20.anInt8783 = local10;
		@Pc(28) int local28 = arg0.method216(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray644[0] = local39 - Static291.anInt4448;
		local20.anInt10694 = (local20.anIntArray644[0] << 9) + (local20.method7485() << 8);
		local20.anIntArray643[0] = local43 - Static189.anInt3243;
		local20.anInt10695 = (local20.anIntArray643[0] << 9) + (local20.method7485() << 8);
		Static723.anInt11225 = local20.aByte139 = local20.aByte140 = local33;
		if (Static574.method7435(local20.anIntArray644[0], local20.anIntArray643[0])) {
			local20.aByte140++;
		}
		if (Static718.aClass3_Sub2Array1[local10] != null) {
			local20.method473(Static718.aClass3_Sub2Array1[local10], 110);
		}
		Static607.anInt9201 = 0;
		Static384.anIntArray436[Static607.anInt9201++] = local10;
		Static257.aByteArray39[local10] = 0;
		Static431.anInt6571 = 0;
		for (@Pc(155) int local155 = 1; local155 < 2048; local155++) {
			if (local155 != local10) {
				@Pc(167) int local167 = arg0.method216(18);
				@Pc(171) int local171 = local167 >> 16;
				@Pc(177) int local177 = local167 >> 8 & 0xFF;
				@Pc(181) int local181 = local167 & 0xFF;
				@Pc(189) Class121 local189 = Static447.aClass121Array1[local155] = new Class121();
				local189.anInt3163 = -1;
				local189.aBoolean200 = false;
				local189.anInt3166 = local181 + (local177 << 14) + (local171 << 28);
				local189.anInt3164 = 0;
				local189.aBoolean198 = false;
				Static374.anIntArray423[Static431.anInt6571++] = local155;
				Static257.aByteArray39[local155] = 0;
			}
		}
		arg0.method219();
	}
}
