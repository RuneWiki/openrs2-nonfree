import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class67_Sub1_Sub1 extends Class67_Sub1 {

	@OriginalMember(owner = "client!ct", name = "G", descriptor = "[I")
	public static final int[] anIntArray82 = new int[32];

	@OriginalMember(owner = "client!ct", name = "I", descriptor = "[B")
	private byte[] aByteArray23;

	static {
		@Pc(49) int local49 = 2;
		for (@Pc(51) int local51 = 0; local51 < 32; local51++) {
			anIntArray82[local51] = local49 - 1;
			local49 += local49;
		}
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	public Class67_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(IIII)[B")
	public byte[] method1474() {
		this.aByteArray23 = new byte[524288];
		this.method6687();
		return this.aByteArray23;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4402(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray23[local19] = local16;
		this.aByteArray23[local20] = local16;
	}
}
