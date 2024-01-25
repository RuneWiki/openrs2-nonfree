import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class5_Sub1_Sub11 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
	private int anInt3252 = 4096;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3252 = arg1.method4227();
		} else if (arg0 == 1) {
			this.aBoolean212 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(33) int[] local33 = this.method7160(0, arg0 - 1 & Static160.anInt3274);
			@Pc(39) int[] local39 = this.method7160(0, arg0);
			@Pc(49) int[] local49 = this.method7160(0, Static160.anInt3274 & arg0 + 1);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static147.anInt3075; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt3252;
				@Pc(97) int local97 = this.anInt3252 * (local39[local63 + 1 & Static497.anInt9138] - local39[Static497.anInt9138 & local63 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(142) int local142;
				@Pc(140) int local140;
				@Pc(138) int local138;
				if (local131 == 0) {
					local138 = 0;
					local140 = 0;
					local142 = 0;
				} else {
					local138 = 16777216 / local131;
					local140 = local77 / local131;
					local142 = local97 / local131;
				}
				if (this.aBoolean212) {
					local138 = (local138 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local53[local63] = local142;
				local57[local63] = local140;
				local61[local63] = local138;
			}
		}
		return local19;
	}
}
