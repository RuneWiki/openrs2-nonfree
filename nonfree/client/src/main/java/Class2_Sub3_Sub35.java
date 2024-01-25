import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class2_Sub3_Sub35 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
	private int anInt10518;

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "[I")
	private int[] anIntArray679;

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
	private int anInt10522;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
	private int anInt10523 = -1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(40) int local40 = this.anInt10518 * (this.anInt10522 == Static101.anInt2845 ? arg0 : this.anInt10522 * arg0 / Static101.anInt2845);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt10518 == Static222.anInt4971) {
				for (local62 = 0; local62 < Static222.anInt4971; local62++) {
					local71 = this.anIntArray679[local40++];
					local52[local62] = (local71 & 0xFF) << 4;
					local48[local62] = local71 >> 4 & 0xFF0;
					local44[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static222.anInt4971; local62++) {
					local71 = this.anInt10518 * local62 / Static222.anInt4971;
					@Pc(78) int local78 = this.anIntArray679[local71 + local40];
					local52[local62] = (local78 & 0xFF) << 4;
					local48[local62] = local78 >> 4 & 0xFF0;
					local44[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
	@Override
	public void method9153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method9153(arg0, arg1);
		if (this.anInt10523 >= 0 && Static190.anInterface4_8 != null) {
			@Pc(27) int local27 = Static190.anInterface4_8.method8048(this.anInt10523).aBoolean335 ? 64 : 128;
			this.anIntArray679 = Static190.anInterface4_8.method8050(false, this.anInt10523, 1.0F, local27, local27);
			this.anInt10522 = local27;
			this.anInt10518 = local27;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	@Override
	public void method9154() {
		super.method9154();
		this.anIntArray679 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10523 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I")
	@Override
	public int method9151() {
		return this.anInt10523;
	}
}
