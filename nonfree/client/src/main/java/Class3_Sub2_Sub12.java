import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
	private int anInt3959 = 2048;

	@OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
	private int anInt3958 = 3072;

	@OriginalMember(owner = "client!hba", name = "D", descriptor = "I")
	private int anInt3962 = 1024;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3962 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt3958 = arg0.method4221();
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		this.anInt3959 = this.anInt3958 - this.anInt3962;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(27) int[][] local27 = this.method8595(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static491.anInt8519; local53++) {
				local43[local53] = this.anInt3962 + (this.anInt3959 * local31[local53] >> 12);
				local47[local53] = this.anInt3962 + (this.anInt3959 * local35[local53] >> 12);
				local51[local53] = (this.anInt3959 * local39[local53] >> 12) + this.anInt3962;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(27) int[] local27 = this.method8603(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static491.anInt8519; local29++) {
				local17[local29] = (this.anInt3959 * local27[local29] >> 12) + this.anInt3962;
			}
		}
		return local17;
	}
}
