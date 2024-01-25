import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub8_Sub4 extends Class1_Sub8 {

	@OriginalMember(owner = "client!da", name = "J", descriptor = "I")
	private int anInt1829 = 4096;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	private int anInt1831 = 4096;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "I")
	private int anInt1827 = 4096;

	static {
		new Class158(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1829 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt1831 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt1827 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[][] local29 = this.method6035(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static18.anInt439; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local65 == local69) {
					local45[local55] = this.anInt1829 * local61 >> 12;
					local49[local55] = local65 * this.anInt1831 >> 12;
					local53[local55] = this.anInt1827 * local69 >> 12;
				} else {
					local45[local55] = this.anInt1829;
					local49[local55] = this.anInt1831;
					local53[local55] = this.anInt1827;
				}
			}
		}
		return local11;
	}
}
