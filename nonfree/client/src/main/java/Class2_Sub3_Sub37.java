import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class2_Sub3_Sub37 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	private int anInt10663 = 4;

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
	private int anInt10668 = 4;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(25) int local25 = Static222.anInt4971 / this.anInt10663;
			@Pc(30) int local30 = Static101.anInt2845 / this.anInt10668;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method9147(Static101.anInt2845 * local36 / local30, 0);
			} else {
				local46 = this.method9147(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static222.anInt4971; local80++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local80 % local25;
					local89 = Static222.anInt4971 * local95 / local25;
				}
				local70[local80] = local58[local89];
				local74[local80] = local62[local89];
				local78[local80] = local66[local89];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10663 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt10668 = arg0.method8383();
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(25) int local25 = Static222.anInt4971 / this.anInt10663;
			@Pc(30) int local30 = Static101.anInt2845 / this.anInt10668;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local49 = this.method9156(local39 * Static101.anInt2845 / local30, 0);
			} else {
				local49 = this.method9156(0, 0);
			}
			for (local39 = 0; local39 < Static222.anInt4971; local39++) {
				if (local25 <= 0) {
					local16[local39] = local49[0];
				} else {
					@Pc(75) int local75 = local39 % local25;
					local16[local39] = local49[Static222.anInt4971 * local75 / local25];
				}
			}
		}
		return local16;
	}
}
