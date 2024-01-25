import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	private int anInt8039 = 4096;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
	private int anInt8040 = 0;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(29) int[] local29 = this.method8201(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static254.anInt4973; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt8040 > local37) {
					local19[local31] = this.anInt8040;
				} else if (local37 > this.anInt8039) {
					local19[local31] = this.anInt8039;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt8040 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt8039 = arg1.method4494();
		} else if (arg0 == 2) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(27) int[][] local27 = this.method8199(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static254.anInt4973; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (this.anInt8040 > local59) {
					local43[local53] = this.anInt8040;
				} else if (local59 > this.anInt8039) {
					local43[local53] = this.anInt8039;
				} else {
					local43[local53] = local59;
				}
				if (local63 < this.anInt8040) {
					local47[local53] = this.anInt8040;
				} else if (local63 <= this.anInt8039) {
					local47[local53] = local63;
				} else {
					local47[local53] = this.anInt8039;
				}
				if (local67 < this.anInt8040) {
					local51[local53] = this.anInt8040;
				} else if (local67 <= this.anInt8039) {
					local51[local53] = local67;
				} else {
					local51[local53] = this.anInt8039;
				}
			}
		}
		return local17;
	}
}
