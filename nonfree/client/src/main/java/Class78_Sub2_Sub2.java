import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class78_Sub2_Sub2 extends Class78_Sub2 {

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "[I")
	public static final int[] anIntArray270 = new int[16384];

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "[I")
	public static final int[] anIntArray271 = new int[16384];

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "[B")
	private byte[] aByteArray41;

	static {
		@Pc(21) double local21 = 3.834951969714103E-4D;
		for (@Pc(23) int local23 = 0; local23 < 16384; local23++) {
			anIntArray270[local23] = (int) (Math.sin((double) local23 * local21) * 16384.0D);
			anIntArray271[local23] = (int) (Math.cos(local21 * (double) local23) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class78_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5044(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(15) int local15 = arg0 * 2;
		@Pc(18) int local18 = local15;
		@Pc(19) int local19 = local15 + 1;
		this.aByteArray41[local18] = -1;
		@Pc(25) int local25 = arg1 & 0xFF;
		this.aByteArray41[local19] = (byte) (local25 * 3 >> 5);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)[B")
	public byte[] method5047() {
		this.aByteArray41 = new byte[524288];
		this.method7619();
		return this.aByteArray41;
	}
}
