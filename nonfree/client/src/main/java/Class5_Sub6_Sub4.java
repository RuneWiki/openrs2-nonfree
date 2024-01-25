import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class5_Sub6_Sub4 extends Class5_Sub6 {

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
	private int anInt918 = -1;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt918 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(41) int local41 = this.anInt916 * (Static378.anInt6579 == this.anInt913 ? arg0 : arg0 * this.anInt913 / Static378.anInt6579);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (this.anInt916 == Static421.anInt7443) {
				for (local63 = 0; local63 < Static421.anInt7443; local63++) {
					local72 = this.anIntArray55[local41++];
					local53[local63] = (local72 & 0xFF) << 4;
					local49[local63] = local72 >> 4 & 0xFF0;
					local45[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static421.anInt7443; local63++) {
					local72 = local63 * this.anInt916 / Static421.anInt7443;
					@Pc(80) int local80 = this.anIntArray55[local41 + local72];
					local53[local63] = (local80 & 0xFF) << 4;
					local49[local63] = local80 >> 4 & 0xFF0;
					local45[local63] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(III)V")
	@Override
	public void method8125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8125(arg0, arg1);
		if (this.anInt918 >= 0 && Static90.anInterface3_1 != null) {
			@Pc(24) int local24 = Static90.anInterface3_1.method8501(this.anInt918).aBoolean659 ? 64 : 128;
			this.anIntArray55 = Static90.anInterface3_1.method8499(this.anInt918, local24, false, 1.0F, local24);
			this.anInt913 = local24;
			this.anInt916 = local24;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	@Override
	public void method8121() {
		super.method8121();
		this.anIntArray55 = null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
	@Override
	public int method8119() {
		return this.anInt918;
	}
}
