import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
	private int anInt920 = 4096;

	@OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
	private int anInt922 = 4096;

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
	private int anInt919 = 4096;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3465(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local29[2];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static76.anInt1531; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local49[local55];
				if (local61 == local69 && local65 == local69) {
					local41[local55] = this.anInt922 * local61 >> 12;
					local45[local55] = local69 * this.anInt920 >> 12;
					local53[local55] = this.anInt919 * local65 >> 12;
				} else {
					local41[local55] = this.anInt922;
					local45[local55] = this.anInt920;
					local53[local55] = this.anInt919;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt922 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt920 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt919 = arg1.method2178();
		}
	}
}
