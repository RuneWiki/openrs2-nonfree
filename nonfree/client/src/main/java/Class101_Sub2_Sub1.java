import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class101_Sub2_Sub1 extends Class101_Sub2 {

	@OriginalMember(owner = "client!pda", name = "K", descriptor = "[I")
	public static final int[] anIntArray500 = new int[256];

	@OriginalMember(owner = "client!pda", name = "L", descriptor = "[B")
	private byte[] aByteArray90;

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
			anIntArray500[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	public Class101_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(BII)V")
	@Override
	protected void method7251(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(15) int local15 = local12;
		@Pc(16) int local16 = local12 + 1;
		this.aByteArray90[local15] = -1;
		@Pc(22) int local22 = arg0 & 0xFF;
		this.aByteArray90[local16] = (byte) (local22 * 3 >> 5);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIBI)[B")
	public byte[] method5710() {
		this.aByteArray90 = new byte[524288];
		this.method7243();
		return this.aByteArray90;
	}
}
