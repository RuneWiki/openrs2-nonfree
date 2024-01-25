import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class6_Sub1_Sub35 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	private int anInt5555;

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
	private int anInt5561;

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "[I")
	private int[] anIntArray626;

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
	private int anInt5557 = -1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	@Override
	public void method5606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5606(arg0, arg1);
		if (this.anInt5557 >= 0) {
			@Pc(25) int local25 = Static137.anInterface2_3.method346(this.anInt5557).aBoolean165 ? 64 : 128;
			this.anIntArray626 = Static137.anInterface2_3.method347(local25, this.anInt5557, local25, 1.0F, false);
			this.anInt5561 = local25;
			this.anInt5555 = local25;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5557 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
	@Override
	public void method5613() {
		super.method5613();
		this.anIntArray626 = null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(36) int local36 = this.anInt5561 * (Static273.anInt6145 == this.anInt5555 ? arg0 : arg0 * this.anInt5555 / Static273.anInt6145);
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt5561 == Static299.anInt5659) {
				for (local58 = 0; local58 < Static299.anInt5659; local58++) {
					local66 = this.anIntArray626[local36++];
					local48[local58] = (local66 & 0xFF) << 4;
					local44[local58] = local66 >> 4 & 0xFF0;
					local40[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static299.anInt5659; local58++) {
					local66 = this.anInt5561 * local58 / Static299.anInt5659;
					@Pc(118) int local118 = this.anIntArray626[local66 + local36];
					local48[local58] = (local118 & 0xFF) << 4;
					local44[local58] = local118 >> 4 & 0xFF0;
					local40[local58] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(B)I")
	@Override
	public int method5615() {
		return this.anInt5557;
	}
}
