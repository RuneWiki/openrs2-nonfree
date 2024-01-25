import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
	public static int anInt7873;

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "Lclient!sc;")
	public static final Class302 aClass302_11 = new Class302();

	@OriginalMember(owner = "client!pba", name = "q", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_102 = new Class71(101, 16);

	@OriginalMember(owner = "client!pba", name = "r", descriptor = "J")
	public static volatile long aLong203 = 0L;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZI)V")
	public static void method6511(@OriginalArg(1) int arg0) {
		if (Static498.method7246(arg0)) {
			Static560.method7828(-1, Static368.aClass331ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6513(@OriginalArg(0) String arg0) {
		@Pc(6) Class8_Sub31 local6 = Static409.method6472();
		local6.aClass8_Sub8_Sub2_1.method8562(Static125.aClass306_42.anInt8954);
		local6.aClass8_Sub8_Sub2_1.method8548(0);
		@Pc(21) int local21 = local6.aClass8_Sub8_Sub2_1.anInt10588;
		local6.aClass8_Sub8_Sub2_1.method8548(632);
		@Pc(30) int[] local30 = Static444.method6825(local6);
		@Pc(34) int local34 = local6.aClass8_Sub8_Sub2_1.anInt10588;
		local6.aClass8_Sub8_Sub2_1.method8582(arg0);
		local6.aClass8_Sub8_Sub2_1.method8562(Static372.anInt7083);
		local6.aClass8_Sub8_Sub2_1.anInt10588 += 7;
		local6.aClass8_Sub8_Sub2_1.method8559(local34, local30, local6.aClass8_Sub8_Sub2_1.anInt10588);
		local6.aClass8_Sub8_Sub2_1.method8533(local6.aClass8_Sub8_Sub2_1.anInt10588 - local21);
		Static262.method4604(local6);
		Static98.anInt2635 = -3;
		Static354.anInt6822 = 1;
		Static244.anInt5399 = 0;
		Static122.anInt3286 = 0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZII)I")
	public static int method6516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}
}
