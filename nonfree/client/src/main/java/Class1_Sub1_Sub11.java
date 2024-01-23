import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
	private int anInt1349 = 4096;

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
	private int anInt1352 = 4096;

	@OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
	private int anInt1353 = 4096;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(29) int[][] local29 = this.method3737(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[1];
			for (@Pc(55) int local55 = 0; local55 < Static157.anInt3431; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local65 == local69) {
					local45[local55] = this.anInt1349 * local61 >> 12;
					local53[local55] = this.anInt1352 * local65 >> 12;
					local49[local55] = this.anInt1353 * local69 >> 12;
				} else {
					local45[local55] = this.anInt1349;
					local53[local55] = this.anInt1352;
					local49[local55] = this.anInt1353;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1349 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt1352 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt1353 = arg0.method3805();
		}
	}
}
