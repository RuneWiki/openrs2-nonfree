import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class5_Sub6_Sub3 extends Class5_Sub6 {

	@OriginalMember(owner = "client!bga", name = "D", descriptor = "I")
	private int anInt599 = 0;

	@OriginalMember(owner = "client!bga", name = "F", descriptor = "I")
	private int anInt601 = 4096;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt599 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt601 = arg0.method3698();
		} else if (arg1 == 2) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(29) int[] local29 = this.method8117(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static421.anInt7443; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt599 > local37) {
					local11[local31] = this.anInt599;
				} else if (local37 > this.anInt601) {
					local11[local31] = this.anInt601;
				} else {
					local11[local31] = local37;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(27) int[][] local27 = this.method8116(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static421.anInt7443; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (local59 < this.anInt599) {
					local43[local53] = this.anInt599;
				} else if (local59 > this.anInt601) {
					local43[local53] = this.anInt601;
				} else {
					local43[local53] = local59;
				}
				if (this.anInt599 > local63) {
					local47[local53] = this.anInt599;
				} else if (this.anInt601 >= local63) {
					local47[local53] = local63;
				} else {
					local47[local53] = this.anInt601;
				}
				if (this.anInt599 > local67) {
					local51[local53] = this.anInt599;
				} else if (local67 <= this.anInt601) {
					local51[local53] = local67;
				} else {
					local51[local53] = this.anInt601;
				}
			}
		}
		return local11;
	}
}
