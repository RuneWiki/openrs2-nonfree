import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class4_Sub3_Sub34 extends Class4_Sub3 {

	static {
		new Class21("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(28) int[] local28 = this.method6337(0, arg0);
			@Pc(36) int[] local36 = this.method6337(1, arg0);
			@Pc(42) int[] local42 = this.method6337(2, arg0);
			for (@Pc(44) int local44 = 0; local44 < Static304.anInt5637; local44++) {
				@Pc(50) int local50 = local42[local44];
				if (local50 == 4096) {
					local18[local44] = local28[local44];
				} else if (local50 == 0) {
					local18[local44] = local36[local44];
				} else {
					local18[local44] = (4096 - local50) * local36[local44] + local28[local44] * local50 >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(26) int[] local26 = this.method6337(2, arg0);
			@Pc(32) int[][] local32 = this.method6331(arg0, 0);
			@Pc(38) int[][] local38 = this.method6331(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static304.anInt5637; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(115) int local115 = 4096 - local82;
					local42[local76] = local54[local76] * local82 + local66[local76] * local115 >> 12;
					local46[local76] = local58[local76] * local82 + local115 * local70[local76] >> 12;
					local50[local76] = local115 * local74[local76] + local62[local76] * local82 >> 12;
				}
			}
		}
		return local16;
	}
}
