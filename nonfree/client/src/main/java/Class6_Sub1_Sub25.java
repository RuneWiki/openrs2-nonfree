import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class6_Sub1_Sub25 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "[I")
	public static final int[] anIntArray458 = new int[256];

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
	private int anInt3914 = 0;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	private int anInt3915 = 0;

	@OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
	private int anInt3918 = 1365;

	@OriginalMember(owner = "client!nn", name = "W", descriptor = "I")
	private int anInt3924 = 20;

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
			anIntArray458[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			for (@Pc(17) int local17 = 0; local17 < Static299.anInt5659; local17++) {
				@Pc(31) int local31 = (Static18.anIntArray32[local17] << 12) / this.anInt3918 + this.anInt3914;
				@Pc(43) int local43 = this.anInt3915 + (Static273.anIntArray703[arg0] << 12) / this.anInt3918;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local57 + local63 < 16384 && local65 < this.anInt3924) {
					local51 = local43 + (local49 * local51 >> 12) * 2;
					local49 = local57 + local31 - local63;
					local65++;
					local57 = local49 * local49 >> 12;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = local65 >= this.anInt3924 - 1 ? 0 : (local65 << 12) / this.anInt3924;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3918 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt3924 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt3914 = arg0.method4021();
		} else if (arg1 == 3) {
			this.anInt3915 = arg0.method4021();
		}
	}
}
