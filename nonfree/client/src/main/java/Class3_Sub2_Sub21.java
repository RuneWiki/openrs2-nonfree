import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mp", name = "D", descriptor = "[I")
	public static final int[] anIntArray404 = new int[256];

	@OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
	private int anInt6928 = 4096;

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "Z")
	private boolean aBoolean600 = true;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray404[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(32) int[] local32 = this.method8340(arg0 - 1 & Static46.anInt1029, 0);
			@Pc(38) int[] local38 = this.method8340(arg0, 0);
			@Pc(48) int[] local48 = this.method8340(Static46.anInt1029 & arg0 + 1, 0);
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[1];
			@Pc(60) int[] local60 = local11[2];
			for (@Pc(62) int local62 = 0; local62 < Static164.anInt8839; local62++) {
				@Pc(76) int local76 = this.anInt6928 * (local48[local62] - local32[local62]);
				@Pc(95) int local95 = this.anInt6928 * (local38[Static52.anInt1120 & local62 + 1] - local38[Static52.anInt1120 & local62 - 1]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local76 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local115 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(140) int local140;
				@Pc(138) int local138;
				if (local129 == 0) {
					local136 = 0;
					local138 = 0;
					local140 = 0;
				} else {
					local138 = 16777216 / local129;
					local140 = local76 / local129;
					local136 = local95 / local129;
				}
				if (this.aBoolean600) {
					local136 = (local136 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local52[local62] = local136;
				local56[local62] = local140;
				local60[local62] = local138;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt6928 = arg1.method8414();
		} else if (arg0 == 1) {
			this.aBoolean600 = arg1.method8401() == 1;
		}
	}
}
