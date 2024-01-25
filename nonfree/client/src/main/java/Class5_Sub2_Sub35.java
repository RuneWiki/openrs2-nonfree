import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class5_Sub2_Sub35 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
	private int anInt6092 = 4096;

	@OriginalMember(owner = "client!ul", name = "P", descriptor = "Z")
	private boolean aBoolean456 = true;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6092 = arg0.method1845();
		} else if (arg1 == 1) {
			this.aBoolean456 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(33) int[] local33 = this.method5808(0, Static19.anInt547 & arg0 - 1);
			@Pc(39) int[] local39 = this.method5808(0, arg0);
			@Pc(49) int[] local49 = this.method5808(0, arg0 + 1 & Static19.anInt547);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static15.anInt493; local63++) {
				@Pc(77) int local77 = this.anInt6092 * (local49[local63] - local33[local63]);
				@Pc(97) int local97 = this.anInt6092 * (local39[Static317.anInt6151 & local63 + 1] - local39[local63 - 1 & Static317.anInt6151]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local111 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(144) int local144;
				@Pc(148) int local148;
				@Pc(140) int local140;
				if (local131 == 0) {
					local148 = 0;
					local140 = 0;
					local144 = 0;
				} else {
					local140 = 16777216 / local131;
					local144 = local97 / local131;
					local148 = local77 / local131;
				}
				if (this.aBoolean456) {
					local144 = (local144 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local148 = (local148 >> 1) + 2048;
				}
				local53[local63] = local144;
				local57[local63] = local148;
				local61[local63] = local140;
			}
		}
		return local19;
	}
}
