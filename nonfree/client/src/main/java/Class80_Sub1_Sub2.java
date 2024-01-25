import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class80_Sub1_Sub2 extends Class80_Sub1 {

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "[B")
	public static final byte[] aByteArray89;

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "[B")
	private byte[] aByteArray88;

	static {
		@Pc(1) int local1 = 0;
		aByteArray89 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray89[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class80_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method7314(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray88[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray88[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIII)[B")
	public byte[] method7319() {
		this.aByteArray88 = new byte[524288];
		this.method8200();
		return this.aByteArray88;
	}
}
