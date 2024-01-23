import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
	private int anInt3970 = 2048;

	@OriginalMember(owner = "client!sj", name = "bb", descriptor = "I")
	private int anInt3976 = 3072;

	@OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
	private int anInt3975 = 1024;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3975 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt3976 = arg1.method2178();
		} else if (arg0 == 2) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3465(arg0, 0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local19[0];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local29[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static76.anInt1531; local55++) {
				local37[local55] = (this.anInt3970 * local45[local55] >> 12) + this.anInt3975;
				local49[local55] = this.anInt3975 + (this.anInt3970 * local33[local55] >> 12);
				local53[local55] = this.anInt3975 + (this.anInt3970 * local41[local55] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(26) int[] local26 = this.method3468(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static76.anInt1531; local28++) {
				local16[local28] = this.anInt3975 + (this.anInt3970 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		this.anInt3970 = this.anInt3976 - this.anInt3975;
	}
}
