import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class3_Sub1_Sub29 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
	private int anInt3064;

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
	private int anInt3070;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
	private int anInt3065;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Z")
	private boolean method2189() {
		if (this.anIntArray342 != null) {
			return true;
		} else if (this.anInt3065 >= 0) {
			@Pc(29) int local29 = Static136.anInterface3_2.method2817(this.anInt3065) ? 64 : 128;
			this.anIntArray342 = Static136.anInterface3_2.method2820(this.anInt3065);
			this.anInt3064 = local29;
			this.anInt3070 = local29;
			return this.anIntArray342 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87 && this.method2189()) {
			@Pc(47) int local47 = this.anInt3070 * (this.anInt3064 == Static141.anInt3259 ? arg0 : this.anInt3064 * arg0 / Static141.anInt3259);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (this.anInt3070 == Static141.anInt3261) {
				for (local65 = 0; local65 < Static141.anInt3261; local65++) {
					local73 = this.anIntArray342[local47++];
					local59[local65] = (local73 & 0xFF) << 4;
					local55[local65] = local73 >> 4 & 0xFF0;
					local51[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static141.anInt3261; local65++) {
					local73 = local65 * this.anInt3070 / Static141.anInt3261;
					@Pc(121) int local121 = this.anIntArray342[local73 + local47];
					local59[local65] = (local121 & 0xFF) << 4;
					local55[local65] = local121 >> 4 & 0xFF0;
					local51[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I")
	@Override
	public int method2915() {
		return this.anInt3065;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3065 = arg1.method208();
		}
	}
}
