import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class3_Sub4_Sub28 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
	private int anInt6212 = 4096;

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
	private int anInt6214 = 4096;

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
	private int anInt6218 = 4096;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6214 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt6218 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt6212 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(21) int[][] local21 = this.method5962(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static106.anInt2356; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local57 && local57 == local61) {
					local37[local47] = this.anInt6214 * local53 >> 12;
					local41[local47] = this.anInt6218 * local57 >> 12;
					local45[local47] = local61 * this.anInt6212 >> 12;
				} else {
					local37[local47] = this.anInt6214;
					local41[local47] = this.anInt6218;
					local45[local47] = this.anInt6212;
				}
			}
		}
		return local11;
	}
}
