import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class5_Sub1_Sub28 extends Class5_Sub1 {

	@OriginalMember(owner = "client!na", name = "G", descriptor = "I")
	private int anInt4293 = 4;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "I")
	private int anInt4294 = 4;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(25) int local25 = Static148.anInt2666 / this.anInt4294;
			@Pc(30) int local30 = Static458.anInt7496 / this.anInt4293;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method5764(0, local36 * Static458.anInt7496 / local30);
			} else {
				local46 = this.method5764(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static148.anInt2666; local80++) {
				@Pc(86) int local86;
				if (local25 <= 0) {
					local86 = 0;
				} else {
					@Pc(92) int local92 = local80 % local25;
					local86 = local92 * Static148.anInt2666 / local25;
				}
				local70[local80] = local58[local86];
				local74[local80] = local62[local86];
				local78[local80] = local66[local86];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt4294 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt4293 = arg1.method5539();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(25) int local25 = Static148.anInt2666 / this.anInt4294;
			@Pc(30) int local30 = Static458.anInt7496 / this.anInt4293;
			@Pc(51) int[] local51;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local51 = this.method5772(0, Static458.anInt7496 * local39 / local30);
			} else {
				local51 = this.method5772(0, 0);
			}
			for (local39 = 0; local39 < Static148.anInt2666; local39++) {
				if (local25 > 0) {
					@Pc(69) int local69 = local39 % local25;
					local16[local39] = local51[local69 * Static148.anInt2666 / local25];
				} else {
					local16[local39] = local51[0];
				}
			}
		}
		return local16;
	}
}
