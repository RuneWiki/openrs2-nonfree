import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
	private int anInt2697 = 4096;

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
	private int anInt2698 = 4096;

	@OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
	private int anInt2703 = 4096;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(21) int[][] local21 = this.method5551(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static238.anInt4221; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local57 && local57 == local61) {
					local37[local47] = local53 * this.anInt2697 >> 12;
					local41[local47] = local57 * this.anInt2698 >> 12;
					local45[local47] = this.anInt2703 * local61 >> 12;
				} else {
					local37[local47] = this.anInt2697;
					local41[local47] = this.anInt2698;
					local45[local47] = this.anInt2703;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2697 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt2698 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt2703 = arg0.method2767();
		}
	}
}
