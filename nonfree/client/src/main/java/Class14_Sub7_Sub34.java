import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class14_Sub7_Sub34 extends Class14_Sub7 {

	@OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
	private int anInt9729 = 0;

	@OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
	private int anInt9727 = 4096;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt9729 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt9727 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method7695(118) == 1;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(31) int[][] local31 = this.method9384(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			for (@Pc(57) int local57 = 0; local57 < Static613.anInt10114; local57++) {
				@Pc(63) int local63 = local35[local57];
				@Pc(67) int local67 = local39[local57];
				@Pc(71) int local71 = local43[local57];
				if (this.anInt9729 > local63) {
					local47[local57] = this.anInt9729;
				} else if (local63 <= this.anInt9727) {
					local47[local57] = local63;
				} else {
					local47[local57] = this.anInt9727;
				}
				if (local67 < this.anInt9729) {
					local51[local57] = this.anInt9729;
				} else if (local67 <= this.anInt9727) {
					local51[local57] = local67;
				} else {
					local51[local57] = this.anInt9727;
				}
				if (this.anInt9729 > local71) {
					local55[local57] = this.anInt9729;
				} else if (local71 <= this.anInt9727) {
					local55[local57] = local71;
				} else {
					local55[local57] = this.anInt9727;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(28) int[] local28 = this.method9379(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static613.anInt10114; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (local36 < this.anInt9729) {
					local11[local30] = this.anInt9729;
				} else if (local36 > this.anInt9727) {
					local11[local30] = this.anInt9727;
				} else {
					local11[local30] = local36;
				}
			}
		}
		return local11;
	}
}
