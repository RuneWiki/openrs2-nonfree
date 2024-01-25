import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class2_Sub4_Sub34 extends Class2_Sub4 {

	@OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
	private int anInt8532 = 0;

	@OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
	private int anInt8537 = 4096;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(28) int[] local28 = this.method8892(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static395.anInt6816; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (local36 < this.anInt8532) {
					local16[local30] = this.anInt8532;
				} else if (this.anInt8537 < local36) {
					local16[local30] = this.anInt8537;
				} else {
					local16[local30] = local36;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(21) int[][] local21 = this.method8898(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static395.anInt6816; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt8532) {
					local37[local47] = this.anInt8532;
				} else if (local53 <= this.anInt8537) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt8537;
				}
				if (this.anInt8532 > local57) {
					local41[local47] = this.anInt8532;
				} else if (this.anInt8537 >= local57) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt8537;
				}
				if (this.anInt8532 > local61) {
					local45[local47] = this.anInt8532;
				} else if (this.anInt8537 < local61) {
					local45[local47] = this.anInt8537;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8532 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt8537 = arg0.method2825();
		} else if (arg1 == 2) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}
}
