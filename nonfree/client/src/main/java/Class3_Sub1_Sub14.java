import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
	private boolean aBoolean325 = true;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	private int anInt4421 = 4096;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt4421 = arg1.method7591();
		} else if (arg0 == 1) {
			this.aBoolean325 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(31) int[] local31 = this.method7778(0, arg0 - 1 & Static485.anInt8693);
			@Pc(37) int[] local37 = this.method7778(0, arg0);
			@Pc(47) int[] local47 = this.method7778(0, arg0 + 1 & Static485.anInt8693);
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[1];
			@Pc(59) int[] local59 = local17[2];
			for (@Pc(61) int local61 = 0; local61 < Static307.anInt4846; local61++) {
				@Pc(74) int local74 = (local47[local61] - local31[local61]) * this.anInt4421;
				@Pc(94) int local94 = (local37[Static324.anInt6207 & local61 + 1] - local37[Static324.anInt6207 & local61 - 1]) * this.anInt4421;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(139) int local139;
				@Pc(137) int local137;
				if (local128 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local137 = 16777216 / local128;
					local139 = local74 / local128;
					local135 = local94 / local128;
				}
				if (this.aBoolean325) {
					local139 = (local139 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local51[local61] = local135;
				local55[local61] = local139;
				local59[local61] = local137;
			}
		}
		return local17;
	}
}
