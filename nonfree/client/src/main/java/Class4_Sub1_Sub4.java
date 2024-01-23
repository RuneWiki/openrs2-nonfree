import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
	private int anInt581 = 0;

	@OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
	private int anInt588 = 4096;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt581 = arg0.method4653();
		} else if (arg1 == 1) {
			this.anInt588 = arg0.method4653();
		} else if (arg1 == 2) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(29) int[] local29 = this.method4736(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static73.anInt1626; local31++) {
				@Pc(38) int local38 = local29[local31];
				if (this.anInt581 > local38) {
					local19[local31] = this.anInt581;
				} else if (local38 > this.anInt588) {
					local19[local31] = this.anInt588;
				} else {
					local19[local31] = local38;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(22) int[][] local22 = this.method4723(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local7[0];
			@Pc(38) int[] local38 = local22[2];
			@Pc(42) int[] local42 = local7[1];
			@Pc(46) int[] local46 = local7[2];
			for (@Pc(48) int local48 = 0; local48 < Static73.anInt1626; local48++) {
				@Pc(59) int local59 = local30[local48];
				@Pc(63) int local63 = local26[local48];
				@Pc(67) int local67 = local38[local48];
				if (local63 < this.anInt581) {
					local34[local48] = this.anInt581;
				} else if (local63 <= this.anInt588) {
					local34[local48] = local63;
				} else {
					local34[local48] = this.anInt588;
				}
				if (this.anInt581 > local59) {
					local42[local48] = this.anInt581;
				} else if (this.anInt588 < local59) {
					local42[local48] = this.anInt588;
				} else {
					local42[local48] = local59;
				}
				if (this.anInt581 > local67) {
					local46[local48] = this.anInt581;
				} else if (local67 <= this.anInt588) {
					local46[local48] = local67;
				} else {
					local46[local48] = this.anInt588;
				}
			}
		}
		return local7;
	}
}
