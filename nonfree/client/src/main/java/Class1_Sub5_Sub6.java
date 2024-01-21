import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub5_Sub6 extends Class1_Sub5 {

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!dg", name = "hb", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
	private void method734() {
		@Pc(18) double local18 = Math.cos((double) (this.anInt961 / 4096));
		this.anIntArray76[0] = (int) (Math.sin((double) (this.anInt956 / 4096)) * local18 * 4096.0D);
		this.anIntArray76[1] = (int) (Math.cos((double) (this.anInt956 / 4096)) * local18 * 4096.0D);
		this.anIntArray76[2] = (int) (Math.sin((double) (this.anInt961 / 4096)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray76[1] * this.anIntArray76[1] >> 12;
		@Pc(85) int local85 = this.anIntArray76[2] * this.anIntArray76[2] >> 12;
		@Pc(97) int local97 = this.anIntArray76[0] * this.anIntArray76[0] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local85 + local97 + local73 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray76[1] = (this.anIntArray76[1] << 12) / local111;
			this.anIntArray76[0] = (this.anIntArray76[0] << 12) / local111;
			this.anIntArray76[2] = (this.anIntArray76[2] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		this.method734();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt959 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt956 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt961 = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int[] local25 = this.method3145(0, arg0 - 1 & Static151.anInt3420);
			@Pc(33) int[] local33 = this.method3145(0, arg0);
			@Pc(43) int[] local43 = this.method3145(0, arg0 + 1 & Static151.anInt3420);
			for (@Pc(45) int local45 = 0; local45 < Static177.anInt4018; local45++) {
				@Pc(58) int local58 = (local43[local45] - local25[local45]) * this.anInt959;
				@Pc(78) int local78 = this.anInt959 * (local33[local45 + 1 & Static47.anInt1130] - local33[Static47.anInt1130 & local45 - 1]);
				@Pc(82) int local82 = local78 >> 12;
				@Pc(88) int local88 = local82 * local82 >> 12;
				@Pc(92) int local92 = local58 >> 12;
				@Pc(98) int local98 = local92 * local92 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((local98 + local88 + 4096) / 4096)) * 4096.0D);
				@Pc(124) int local124;
				@Pc(120) int local120;
				@Pc(128) int local128;
				if (local111 == 0) {
					local120 = 0;
					local128 = 0;
					local124 = 0;
				} else {
					local120 = local58 / local111;
					local124 = local78 / local111;
					local128 = 16777216 / local111;
				}
				local120 = local120 * this.anIntArray76[1] >> 12;
				local128 = this.anIntArray76[2] * local128 >> 12;
				local124 = local124 * this.anIntArray76[0] >> 12;
				local11[local45] = local128 + local124 + local120;
			}
		}
		return local11;
	}
}
