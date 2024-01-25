import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class28_Sub1_Sub1 extends Class28_Sub1 {

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class28_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIII)[B")
	public byte[] method751() {
		this.aByteArray24 = new byte[524288];
		this.method5042();
		return this.aByteArray24;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method748(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray24[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray24[local15] = (byte) (local11 * 3 >> 5);
	}
}
