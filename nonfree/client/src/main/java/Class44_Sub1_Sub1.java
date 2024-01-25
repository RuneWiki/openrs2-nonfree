import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class44_Sub1_Sub1 extends Class44_Sub1 {

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class44_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)[B")
	public byte[] method1254() {
		this.aByteArray13 = new byte[524288];
		this.method8024();
		return this.aByteArray13;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray13[local14] = -1;
		@Pc(21) int local21 = arg1 & 0xFF;
		this.aByteArray13[local15] = (byte) (local21 * 3 >> 5);
	}
}
