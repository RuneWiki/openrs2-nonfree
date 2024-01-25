import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class4_Sub1_Sub15 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	private int anInt4588 = 4096;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	private int anInt4587 = 0;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4587 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt4588 = arg1.method4936();
		} else if (arg0 == 2) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(21) int[][] local21 = this.method8385(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static376.anInt7260; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt4587) {
					local37[local47] = this.anInt4587;
				} else if (this.anInt4588 < local53) {
					local37[local47] = this.anInt4588;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt4587) {
					local41[local47] = this.anInt4587;
				} else if (this.anInt4588 < local57) {
					local41[local47] = this.anInt4588;
				} else {
					local41[local47] = local57;
				}
				if (local61 < this.anInt4587) {
					local45[local47] = this.anInt4587;
				} else if (local61 > this.anInt4588) {
					local45[local47] = this.anInt4588;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(21) int[] local21 = this.method8392(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static376.anInt7260; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt4587 > local29) {
					local11[local23] = this.anInt4587;
				} else if (local29 <= this.anInt4588) {
					local11[local23] = local29;
				} else {
					local11[local23] = this.anInt4588;
				}
			}
		}
		return local11;
	}
}
