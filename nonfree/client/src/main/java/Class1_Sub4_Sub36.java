import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class1_Sub4_Sub36 extends Class1_Sub4 {

	@OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
	private int anInt6781 = 4096;

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
	private int anInt6783 = 4096;

	@OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
	private int anInt6784 = 4096;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(21) int[][] local21 = this.method5956(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static66.anInt1511; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local57 && local61 == local57) {
					local37[local47] = this.anInt6781 * local53 >> 12;
					local41[local47] = local57 * this.anInt6783 >> 12;
					local45[local47] = this.anInt6784 * local61 >> 12;
				} else {
					local37[local47] = this.anInt6781;
					local41[local47] = this.anInt6783;
					local45[local47] = this.anInt6784;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt6781 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt6783 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt6784 = arg1.method5362();
		}
	}
}
