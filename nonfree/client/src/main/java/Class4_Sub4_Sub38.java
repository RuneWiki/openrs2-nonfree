import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class4_Sub4_Sub38 extends Class4_Sub4 {

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
	private int anInt7572 = 0;

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
	private int anInt7574 = 4096;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(27) int[] local27 = this.method6040(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static419.anInt6404; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt7572 > local35) {
					local17[local29] = this.anInt7572;
				} else if (this.anInt7574 < local35) {
					local17[local29] = this.anInt7574;
				} else {
					local17[local29] = local35;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7572 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt7574 = arg1.method5028();
		} else if (arg0 == 2) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(26) int[][] local26 = this.method6049(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static419.anInt6404; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt7572) {
					local42[local52] = this.anInt7572;
				} else if (local58 > this.anInt7574) {
					local42[local52] = this.anInt7574;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt7572) {
					local46[local52] = this.anInt7572;
				} else if (this.anInt7574 < local62) {
					local46[local52] = this.anInt7574;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt7572 > local66) {
					local50[local52] = this.anInt7572;
				} else if (this.anInt7574 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt7574;
				}
			}
		}
		return local11;
	}
}
