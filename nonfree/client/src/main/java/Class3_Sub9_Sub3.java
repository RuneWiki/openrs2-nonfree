import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public class Class3_Sub9_Sub3 extends Class3_Sub9 {

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
	protected int anInt9371;

	@OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
	protected int anInt9373;

	@OriginalMember(owner = "client!cm", name = "N", descriptor = "[I")
	protected int[] anIntArray808;

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
	private int anInt9376 = -1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748 && this.method8196()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(52) int local52 = this.anInt9373 * (this.anInt9371 == Static452.anInt7497 ? arg0 : arg0 * this.anInt9371 / Static452.anInt7497);
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt9373 == Static62.anInt1251) {
				for (local62 = 0; local62 < Static62.anInt1251; local62++) {
					local71 = this.anIntArray808[local52++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static62.anInt1251; local62++) {
					local71 = this.anInt9373 * local62 / Static62.anInt1251;
					@Pc(78) int local78 = this.anIntArray808[local71 + local52];
					local36[local62] = (local78 & 0xFF) << 4;
					local32[local62] = local78 >> 4 & 0xFF0;
					local28[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public final void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9376 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Z")
	protected final boolean method8196() {
		if (this.anIntArray808 != null) {
			return true;
		} else if (this.anInt9376 >= 0) {
			@Pc(36) Class97 local36 = Static355.anInt5754 < 0 ? Static682.method2751(Static641.aClass15_159, this.anInt9376) : Static682.method2754(Static641.aClass15_159, Static355.anInt5754, this.anInt9376);
			local36.method2741();
			this.anIntArray808 = local36.method2748();
			this.anInt9371 = local36.anInt2960;
			this.anInt9373 = local36.anInt2963;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I")
	@Override
	public final int method9169() {
		return this.anInt9376;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	@Override
	public final void method9171() {
		super.method9171();
		this.anIntArray808 = null;
	}
}
