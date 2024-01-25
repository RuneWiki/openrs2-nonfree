import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class2_Sub7_Sub15 extends Class2_Sub7 {

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
	private int anInt3429 = 4096;

	@OriginalMember(owner = "client!hp", name = "L", descriptor = "Z")
	private boolean aBoolean266 = true;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt3429 = arg1.method5229();
		} else if (arg0 == 1) {
			this.aBoolean266 = arg1.method5170() == 1;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(30) int[] local30 = this.method7581(arg0 - 1 & Static126.anInt7690, 0);
			@Pc(36) int[] local36 = this.method7581(arg0, 0);
			@Pc(46) int[] local46 = this.method7581(Static126.anInt7690 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static352.anInt6485; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt3429;
				@Pc(94) int local94 = this.anInt3429 * (local36[local60 + 1 & Static38.anInt733] - local36[Static38.anInt733 & local60 - 1]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(138) int local138;
				@Pc(146) int local146;
				@Pc(142) int local142;
				if (local129 == 0) {
					local138 = 0;
					local146 = 0;
					local142 = 0;
				} else {
					local138 = local94 / local129;
					local142 = 16777216 / local129;
					local146 = local74 / local129;
				}
				if (this.aBoolean266) {
					local146 = (local146 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
				}
				local50[local60] = local138;
				local54[local60] = local146;
				local58[local60] = local142;
			}
		}
		return local11;
	}
}
