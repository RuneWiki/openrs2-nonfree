import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class4_Sub2_Sub32 extends Class4_Sub2 {

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
	private int anInt9547;

	@OriginalMember(owner = "client!tu", name = "M", descriptor = "I")
	private int anInt9551;

	@OriginalMember(owner = "client!tu", name = "T", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!tu", name = "J", descriptor = "I")
	private int anInt9548 = -1;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub32() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(III)V")
	@Override
	public void method8211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8211(arg0, arg1);
		if (this.anInt9548 >= 0 && Static333.anInterface7_7 != null) {
			@Pc(29) int local29 = Static333.anInterface7_7.method4460(this.anInt9548).aBoolean179 ? 64 : 128;
			this.anIntArray541 = Static333.anInterface7_7.method4462(local29, false, this.anInt9548, 1.0F, local29);
			this.anInt9551 = local29;
			this.anInt9547 = local29;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
	@Override
	public int method8207() {
		return this.anInt9548;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(40) int local40 = (Static38.anInt1239 == this.anInt9547 ? arg0 : arg0 * this.anInt9547 / Static38.anInt1239) * this.anInt9551;
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (Static417.anInt5248 == this.anInt9551) {
				for (local58 = 0; local58 < Static417.anInt5248; local58++) {
					local66 = this.anIntArray541[local40++];
					local52[local58] = (local66 & 0xFF) << 4;
					local48[local58] = local66 >> 4 & 0xFF0;
					local44[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static417.anInt5248; local58++) {
					local66 = this.anInt9551 * local58 / Static417.anInt5248;
					@Pc(118) int local118 = this.anIntArray541[local66 + local40];
					local52[local58] = (local118 & 0xFF) << 4;
					local48[local58] = local118 >> 4 & 0xFF0;
					local44[local58] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9548 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	@Override
	public void method8209() {
		super.method8209();
		this.anIntArray541 = null;
	}
}
