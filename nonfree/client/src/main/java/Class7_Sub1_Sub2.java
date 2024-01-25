import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class7_Sub1_Sub2 extends Class7_Sub1 {

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Lclient!lm;")
	private Class42_Sub3 aClass42_Sub3_2;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
	private final int anInt2306;

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
	private final int anInt2303;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
	private final int anInt2304;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	private final int anInt2298;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
	private final int anInt2305;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_12;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
	private final int anInt2302;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!gk;IIIIII)V")
	public Class7_Sub1_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2306 = arg4;
		this.anInt2303 = arg3;
		this.anInt2304 = arg1;
		this.anInt2298 = arg6;
		this.anInt2305 = arg5;
		this.aClass75_Sub2_12 = arg0;
		this.anInt2302 = arg2;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Lclient!lm;")
	@Override
	public Class42_Sub3 method1775() {
		if (this.aClass42_Sub3_2 == null) {
			Static424.anIntArray198[2] = this.anInt2303;
			Static424.anIntArray198[5] = this.anInt2298;
			@Pc(28) Interface7 local28 = this.aClass75_Sub2_12.anInterface7_6;
			Static424.anIntArray198[4] = this.anInt2305;
			Static424.anIntArray198[3] = this.anInt2306;
			Static424.anIntArray198[0] = this.anInt2304;
			Static424.anIntArray198[1] = this.anInt2302;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method2132(Static424.anIntArray198[local54])) {
					return null;
				}
				@Pc(72) Class62 local72 = local28.method2131(Static424.anIntArray198[local54]);
				@Pc(79) int local79 = local72.aBoolean142 ? 64 : 128;
				if (local52 < local79) {
					local52 = local79;
				}
				if (local72.aByte25 > 0) {
					local50 = 1;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static4.anIntArrayArray3[local102] = local28.method2129(1.0F, local52, local52, false, Static424.anIntArray198[local102]);
			}
			this.aClass42_Sub3_2 = new Class42_Sub3(this.aClass75_Sub2_12, 6407, local52, local50 != 0, Static4.anIntArrayArray3);
		}
		return this.aClass42_Sub3_2;
	}
}
