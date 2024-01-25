import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class4_Sub4_Sub17 extends Class4_Sub4 {

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
	private int anInt4234 = 4096;

	@OriginalMember(owner = "client!mt", name = "E", descriptor = "I")
	private int anInt4233 = 4096;

	@OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
	private int anInt4237 = 4096;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4237 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt4234 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt4233 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(21) int[][] local21 = this.method6049(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static419.anInt6404; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local57 == local61) {
					local37[local47] = local53 * this.anInt4237 >> 12;
					local41[local47] = local57 * this.anInt4234 >> 12;
					local45[local47] = local61 * this.anInt4233 >> 12;
				} else {
					local37[local47] = this.anInt4237;
					local41[local47] = this.anInt4234;
					local45[local47] = this.anInt4233;
				}
			}
		}
		return local11;
	}
}
