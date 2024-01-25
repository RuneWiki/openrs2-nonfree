import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class26_Sub1_Sub2 extends Class26_Sub1 {

	@OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
	public static final int[] anIntArray280 = new int[120];

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!gda;")
	private Class51_Sub3 aClass51_Sub3_2;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "I")
	private final int anInt4666;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "I")
	private final int anInt4662;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	private final int anInt4665;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	private final int anInt4660;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_21;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	private final int anInt4661;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	private final int anInt4659;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 120; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) (Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D + (double) local17);
			local10 += local30;
			anIntArray280[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!jaa;IIIIII)V")
	public Class26_Sub1_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4666 = arg3;
		this.anInt4662 = arg1;
		this.anInt4665 = arg5;
		this.anInt4660 = arg4;
		this.aClass14_Sub3_21 = arg0;
		this.anInt4661 = arg2;
		this.anInt4659 = arg6;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lclient!gda;")
	@Override
	public Class51_Sub3 method4021() {
		if (this.aClass51_Sub3_2 == null) {
			Static486.anIntArray601[4] = this.anInt4665;
			Static486.anIntArray601[0] = this.anInt4662;
			Static486.anIntArray601[5] = this.anInt4659;
			Static486.anIntArray601[1] = this.anInt4661;
			Static486.anIntArray601[2] = this.anInt4666;
			Static486.anIntArray601[3] = this.anInt4660;
			@Pc(48) Interface4 local48 = this.aClass14_Sub3_21.anInterface4_15;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local48.method4233(Static486.anIntArray601[local54])) {
					return null;
				}
				@Pc(72) Class313 local72 = local48.method4234(Static486.anIntArray601[local54]);
				@Pc(79) int local79 = local72.aBoolean595 ? 64 : 128;
				if (local52 < local79) {
					local52 = local79;
				}
				if (local72.aByte103 > 0) {
					local50 = true;
				}
			}
			for (@Pc(104) int local104 = 0; local104 < 6; local104++) {
				Static300.anIntArrayArray48[local104] = local48.method4230(1.0F, Static486.anIntArray601[local104], local52, false, local52);
			}
			this.aClass51_Sub3_2 = new Class51_Sub3(this.aClass14_Sub3_21, 6407, local52, local50, Static300.anIntArrayArray48);
		}
		return this.aClass51_Sub3_2;
	}
}
