import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class3_Sub3_Sub14 extends Class3_Sub3 {

	@OriginalMember(owner = "client!fq", name = "Q", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
	private int anInt2071 = 4096;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(30) int[] local30 = this.method5733(arg0 - 1 & Static351.anInt6821, 0);
			@Pc(36) int[] local36 = this.method5733(arg0, 0);
			@Pc(46) int[] local46 = this.method5733(Static351.anInt6821 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static131.anInt2755; local60++) {
				@Pc(74) int local74 = this.anInt2071 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = this.anInt2071 * (local36[Static167.anInt3460 & local60 + 1] - local36[local60 - 1 & Static167.anInt3460]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(142) int local142;
				@Pc(138) int local138;
				@Pc(146) int local146;
				if (local129 == 0) {
					local138 = 0;
					local146 = 0;
					local142 = 0;
				} else {
					local138 = local74 / local129;
					local142 = local94 / local129;
					local146 = 16777216 / local129;
				}
				if (this.aBoolean106) {
					local138 = (local138 >> 1) + 2048;
					local146 = (local146 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
				}
				local50[local60] = local142;
				local54[local60] = local138;
				local58[local60] = local146;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2071 = arg0.method3649();
		} else if (arg1 == 1) {
			this.aBoolean106 = arg0.method3643() == 1;
		}
	}
}
