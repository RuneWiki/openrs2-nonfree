import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
	protected int anInt662;

	@OriginalMember(owner = "client!dl", name = "Q", descriptor = "[I")
	protected int[] anIntArray63;

	@OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
	protected int anInt664;

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
	private int anInt658 = -1;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
	@Override
	public final void method7764() {
		super.method7764();
		this.anIntArray63 = null;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)I")
	@Override
	public final int method7762() {
		return this.anInt658;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
	protected final boolean method525() {
		if (this.anIntArray63 != null) {
			return true;
		} else if (this.anInt658 >= 0) {
			@Pc(32) Class355 local32 = Static538.anInt8449 >= 0 ? Static606.method7590(Static454.aClass246_214, Static538.anInt8449, this.anInt658) : Static606.method7597(Static454.aClass246_214, this.anInt658);
			local32.method7596();
			this.anIntArray63 = local32.method7591();
			this.anInt664 = local32.anInt9165;
			this.anInt662 = local32.anInt9162;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326 && this.method525()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = this.anInt664 * (this.anInt662 == Static245.anInt4535 ? arg0 : arg0 * this.anInt662 / Static245.anInt4535);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt664 == Static206.anInt4182) {
				for (local62 = 0; local62 < Static206.anInt4182; local62++) {
					local70 = this.anIntArray63[local52++];
					local36[local62] = (local70 & 0xFF) << 4;
					local32[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static206.anInt4182; local62++) {
					local70 = local62 * this.anInt664 / Static206.anInt4182;
					@Pc(118) int local118 = this.anIntArray63[local52 + local70];
					local36[local62] = (local118 & 0xFF) << 4;
					local32[local62] = local118 >> 4 & 0xFF0;
					local28[local62] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public final void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt658 = arg0.method3109();
		}
	}
}
