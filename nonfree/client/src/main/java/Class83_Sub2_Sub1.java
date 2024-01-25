import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class83_Sub2_Sub1 extends Class83_Sub2 {

	@OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
	public static final int[] anIntArray514 = new int[4096];

	@OriginalMember(owner = "client!om", name = "m", descriptor = "Lclient!qe;")
	private Class40_Sub4 aClass40_Sub4_1;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "I")
	private final int anInt6625;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	private final int anInt6624;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "I")
	private final int anInt6620;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	private final int anInt6622;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	private final int anInt6623;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	private final int anInt6619;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_27;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray514[local6] = Static34.method7179(local6);
		}
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ok;IIIIII)V")
	public Class83_Sub2_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6625 = arg6;
		this.anInt6624 = arg4;
		this.anInt6620 = arg1;
		this.anInt6622 = arg2;
		this.anInt6623 = arg3;
		this.anInt6619 = arg5;
		this.aClass134_Sub2_27 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)Lclient!qe;")
	@Override
	public Class40_Sub4 method6437() {
		if (this.aClass40_Sub4_1 == null) {
			@Pc(17) Interface7 local17 = this.aClass134_Sub2_27.anInterface7_10;
			Static362.anIntArray325[5] = this.anInt6625;
			Static362.anIntArray325[0] = this.anInt6620;
			Static362.anIntArray325[2] = this.anInt6623;
			Static362.anIntArray325[3] = this.anInt6624;
			Static362.anIntArray325[4] = this.anInt6619;
			Static362.anIntArray325[1] = this.anInt6622;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method3871(Static362.anIntArray325[local53])) {
					return null;
				}
				@Pc(73) Class3 local73 = local17.method3874(Static362.anIntArray325[local53]);
				@Pc(80) int local80 = local73.aBoolean13 ? 64 : 128;
				if (local51 < local80) {
					local51 = local80;
				}
				if (local73.aByte4 > 0) {
					local49 = true;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static380.anIntArrayArray148[local98] = local17.method3869(local51, Static362.anIntArray325[local98], 1.0F, local51, false);
			}
			this.aClass40_Sub4_1 = new Class40_Sub4(this.aClass134_Sub2_27, 6407, local51, local49, Static380.anIntArrayArray148);
		}
		return this.aClass40_Sub4_1;
	}
}
