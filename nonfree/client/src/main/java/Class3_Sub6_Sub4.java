import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub6_Sub4 extends Class3_Sub6 {

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "Z")
	private boolean aBoolean115 = true;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
	private int anInt1508 = 4096;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1508 = arg0.method6811();
		} else if (arg1 == 1) {
			this.aBoolean115 = arg0.method6814() == 1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(33) int[] local33 = this.method8001(0, arg0 - 1 & Static527.anInt10285);
			@Pc(39) int[] local39 = this.method8001(0, arg0);
			@Pc(49) int[] local49 = this.method8001(0, Static527.anInt10285 & arg0 + 1);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static481.anInt8358; local63++) {
				@Pc(77) int local77 = this.anInt1508 * (local49[local63] - local33[local63]);
				@Pc(97) int local97 = this.anInt1508 * (local39[Static325.anInt5932 & local63 + 1] - local39[Static325.anInt5932 & local63 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local111 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(148) int local148;
				@Pc(144) int local144;
				@Pc(140) int local140;
				if (local131 == 0) {
					local140 = 0;
					local148 = 0;
					local144 = 0;
				} else {
					local140 = 16777216 / local131;
					local144 = local77 / local131;
					local148 = local97 / local131;
				}
				if (this.aBoolean115) {
					local144 = (local144 >> 1) + 2048;
					local148 = (local148 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local53[local63] = local148;
				local57[local63] = local144;
				local61[local63] = local140;
			}
		}
		return local11;
	}
}
