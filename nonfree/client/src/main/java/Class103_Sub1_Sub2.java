import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class103_Sub1_Sub2 extends Class103_Sub1 {

	@OriginalMember(owner = "client!gia", name = "N", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
	public Class103_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(BIII)[B")
	public byte[] method3432() {
		this.aByteArray30 = new byte[524288];
		this.method7633();
		return this.aByteArray30;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method3428(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local7;
		@Pc(24) int local24 = local7 + 1;
		this.aByteArray30[local23] = local20;
		this.aByteArray30[local24] = local20;
	}
}
