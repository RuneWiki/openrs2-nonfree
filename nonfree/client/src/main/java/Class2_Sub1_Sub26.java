import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
	private int anInt3593 = 4096;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
	private boolean aBoolean169 = true;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(30) int[] local30 = this.method3265(Static207.anInt4078 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method3265(arg0, 0);
			@Pc(46) int[] local46 = this.method3265(Static207.anInt4078 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[1];
			@Pc(54) int[] local54 = local16[0];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static135.anInt2897; local60++) {
				@Pc(82) int local82 = this.anInt3593 * (local36[Static201.anInt3995 & local60 + 1] - local36[Static201.anInt3995 & local60 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(98) int local98 = this.anInt3593 * (local46[local60] - local30[local60]);
				@Pc(104) int local104 = local86 * local86 >> 12;
				@Pc(108) int local108 = local98 >> 12;
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local104 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(143) int local143;
				@Pc(139) int local139;
				if (local129 == 0) {
					local143 = 0;
					local139 = 0;
					local135 = 0;
				} else {
					local135 = local82 / local129;
					local139 = 16777216 / local129;
					local143 = local98 / local129;
				}
				if (this.aBoolean169) {
					local135 = (local135 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local54[local60] = local135;
				local50[local60] = local143;
				local58[local60] = local139;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3593 = arg0.method269();
		} else if (arg1 == 1) {
			this.aBoolean169 = arg0.method260() == 1;
		}
	}
}
