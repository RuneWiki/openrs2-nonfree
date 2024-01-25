import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class127_Sub2_Sub1 extends Class127_Sub2 {

	@OriginalMember(owner = "client!up", name = "F", descriptor = "[B")
	private byte[] aByteArray92;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class127_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7980(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg0 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray92[local23] = local16;
		this.aByteArray92[local24] = local16;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)[B")
	public byte[] method7413() {
		this.aByteArray92 = new byte[524288];
		this.method7972();
		return this.aByteArray92;
	}
}
