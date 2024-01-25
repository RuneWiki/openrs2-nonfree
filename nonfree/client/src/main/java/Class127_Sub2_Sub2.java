import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class127_Sub2_Sub2 extends Class127_Sub2 {

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class127_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)[B")
	public byte[] method7987() {
		this.aByteArray104 = new byte[524288];
		this.method7972();
		return this.aByteArray104;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7980(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray104[local24] = local16;
		this.aByteArray104[local25] = local16;
	}
}
