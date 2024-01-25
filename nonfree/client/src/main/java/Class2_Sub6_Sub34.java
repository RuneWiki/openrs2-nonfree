import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class2_Sub6_Sub34 extends Class2_Sub6 {

	@OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
	private int anInt9486 = 4096;

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
	private int anInt9488 = 4096;

	@OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
	private int anInt9487 = 4096;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt9486 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt9487 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt9488 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(21) int[][] local21 = this.method8465(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static51.anInt1085; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local57 && local57 == local61) {
					local37[local47] = this.anInt9486 * local53 >> 12;
					local41[local47] = this.anInt9487 * local57 >> 12;
					local45[local47] = this.anInt9488 * local61 >> 12;
				} else {
					local37[local47] = this.anInt9486;
					local41[local47] = this.anInt9487;
					local45[local47] = this.anInt9488;
				}
			}
		}
		return local11;
	}
}
