import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
	private int anInt847 = 4096;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(33) int[] local33 = this.method8208(0, arg0 - 1 & Static565.anInt5164);
			@Pc(39) int[] local39 = this.method8208(0, arg0);
			@Pc(49) int[] local49 = this.method8208(0, arg0 + 1 & Static565.anInt5164);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static417.anInt5248; local63++) {
				@Pc(76) int local76 = (local49[local63] - local33[local63]) * this.anInt847;
				@Pc(96) int local96 = this.anInt847 * (local39[Static359.anInt6929 & local63 + 1] - local39[Static359.anInt6929 & local63 - 1]);
				@Pc(100) int local100 = local96 >> 12;
				@Pc(104) int local104 = local76 >> 12;
				@Pc(110) int local110 = local100 * local100 >> 12;
				@Pc(116) int local116 = local104 * local104 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local110 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(138) int local138;
				@Pc(142) int local142;
				if (local131 == 0) {
					local138 = 0;
					local140 = 0;
					local142 = 0;
				} else {
					local142 = 16777216 / local131;
					local140 = local96 / local131;
					local138 = local76 / local131;
				}
				if (this.aBoolean82) {
					local140 = (local140 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
				}
				local53[local63] = local140;
				local57[local63] = local138;
				local61[local63] = local142;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt847 = arg0.method7054();
		} else if (arg1 == 1) {
			this.aBoolean82 = arg0.method7004() == 1;
		}
	}
}
