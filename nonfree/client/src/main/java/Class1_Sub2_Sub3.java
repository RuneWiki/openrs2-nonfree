import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
	private int anInt521 = 4096;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
	private int anInt524 = 0;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt524 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt521 = arg0.method4498();
		} else if (arg1 == 2) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(27) int[][] local27 = this.method5867(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static410.anInt7198; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (this.anInt524 > local59) {
					local43[local53] = this.anInt524;
				} else if (local59 <= this.anInt521) {
					local43[local53] = local59;
				} else {
					local43[local53] = this.anInt521;
				}
				if (local63 < this.anInt524) {
					local47[local53] = this.anInt524;
				} else if (this.anInt521 < local63) {
					local47[local53] = this.anInt521;
				} else {
					local47[local53] = local63;
				}
				if (this.anInt524 > local67) {
					local51[local53] = this.anInt524;
				} else if (this.anInt521 < local67) {
					local51[local53] = this.anInt521;
				} else {
					local51[local53] = local67;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(26) int[] local26 = this.method5872(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static410.anInt7198; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt524) {
					local11[local28] = this.anInt524;
				} else if (local34 <= this.anInt521) {
					local11[local28] = local34;
				} else {
					local11[local28] = this.anInt521;
				}
			}
		}
		return local11;
	}
}
