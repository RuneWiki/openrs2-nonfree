import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class221_Sub1_Sub2 extends Class221_Sub1 {

	@OriginalMember(owner = "client!rfa", name = "E", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class221_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IIII)[B")
	public byte[] method7175() {
		this.aByteArray77 = new byte[524288];
		this.method7471();
		return this.aByteArray77;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZB)V")
	@Override
	protected void method7174(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg0 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray77[local23] = local16;
		this.aByteArray77[local24] = local16;
	}
}
