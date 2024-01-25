import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class6_Sub1_Sub11 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
	private int anInt3314 = 0;

	@OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
	private int anInt3318 = 4096;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3314 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt3318 = arg1.method4999();
		} else if (arg0 == 2) {
			super.aBoolean719 = arg1.method4966() == 1;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(27) int[] local27 = this.method8165(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static289.anInt5549; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (local35 < this.anInt3314) {
					local11[local29] = this.anInt3314;
				} else if (this.anInt3318 < local35) {
					local11[local29] = this.anInt3318;
				} else {
					local11[local29] = local35;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(27) int[][] local27 = this.method8162(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static289.anInt5549; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (local59 < this.anInt3314) {
					local43[local53] = this.anInt3314;
				} else if (this.anInt3318 >= local59) {
					local43[local53] = local59;
				} else {
					local43[local53] = this.anInt3318;
				}
				if (this.anInt3314 > local63) {
					local47[local53] = this.anInt3314;
				} else if (local63 > this.anInt3318) {
					local47[local53] = this.anInt3318;
				} else {
					local47[local53] = local63;
				}
				if (local67 < this.anInt3314) {
					local51[local53] = this.anInt3314;
				} else if (local67 > this.anInt3318) {
					local51[local53] = this.anInt3318;
				} else {
					local51[local53] = local67;
				}
			}
		}
		return local17;
	}
}
