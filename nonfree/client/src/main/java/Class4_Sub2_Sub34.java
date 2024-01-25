import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class4_Sub2_Sub34 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
	private int anInt7029 = 3072;

	@OriginalMember(owner = "client!uv", name = "P", descriptor = "I")
	private int anInt7033 = 1024;

	@OriginalMember(owner = "client!uv", name = "M", descriptor = "I")
	private int anInt7030 = 2048;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(21) int[][] local21 = this.method5848(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static350.anInt6330; local47++) {
				local37[local47] = this.anInt7033 + (local25[local47] * this.anInt7030 >> 12);
				local41[local47] = this.anInt7033 + (local29[local47] * this.anInt7030 >> 12);
				local45[local47] = this.anInt7033 + (local33[local47] * this.anInt7030 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(26) int[] local26 = this.method5847(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static350.anInt6330; local28++) {
				local16[local28] = this.anInt7033 + (this.anInt7030 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt7033 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt7029 = arg1.method4877();
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		this.anInt7030 = this.anInt7029 - this.anInt7033;
	}
}
