import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!en", name = "S", descriptor = "I")
	private int anInt1422 = 4096;

	@OriginalMember(owner = "client!en", name = "U", descriptor = "I")
	private int anInt1424 = 4096;

	@OriginalMember(owner = "client!en", name = "eb", descriptor = "I")
	private int anInt1430 = 4096;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1422 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt1430 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt1424 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(29) int[][] local29 = this.method4937(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local18[0];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local29[0];
			@Pc(49) int[] local49 = local18[1];
			@Pc(53) int[] local53 = local18[2];
			for (@Pc(55) int local55 = 0; local55 < Static114.anInt1359; local55++) {
				@Pc(66) int local66 = local45[local55];
				@Pc(70) int local70 = local41[local55];
				@Pc(74) int local74 = local33[local55];
				if (local66 == local70 && local74 == local70) {
					local37[local55] = local66 * this.anInt1422 >> 12;
					local49[local55] = this.anInt1430 * local70 >> 12;
					local53[local55] = local74 * this.anInt1424 >> 12;
				} else {
					local37[local55] = this.anInt1422;
					local49[local55] = this.anInt1430;
					local53[local55] = this.anInt1424;
				}
			}
		}
		return local18;
	}
}
