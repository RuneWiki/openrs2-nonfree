import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class10_Sub2_Sub2 extends Class10_Sub2 {

	@OriginalMember(owner = "client!at", name = "R", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!at", name = "Q", descriptor = "I")
	private int anInt348 = 4096;

	static {
		new Class182("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(30) int[] local30 = this.method6041(arg0 - 1 & Static140.anInt2877, 0);
			@Pc(36) int[] local36 = this.method6041(arg0, 0);
			@Pc(46) int[] local46 = this.method6041(arg0 + 1 & Static140.anInt2877, 0);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static121.anInt2458; local60++) {
				@Pc(74) int local74 = this.anInt348 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = this.anInt348 * (local36[Static429.anInt7203 & local60 + 1] - local36[local60 - 1 & Static429.anInt7203]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(135) int local135;
				@Pc(133) int local133;
				if (local129 == 0) {
					local133 = 0;
					local135 = 0;
					local137 = 0;
				} else {
					local137 = local94 / local129;
					local133 = 16777216 / local129;
					local135 = local74 / local129;
				}
				if (this.aBoolean28) {
					local135 = (local135 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local50[local60] = local137;
				local54[local60] = local135;
				local58[local60] = local133;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt348 = arg1.method2485();
		} else if (arg0 == 1) {
			this.aBoolean28 = arg1.method2502() == 1;
		}
	}
}
