import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!df", name = "F", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class10_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method1368(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local7;
		@Pc(24) int local24 = local7 + 1;
		this.aByteArray34[local23] = local16;
		this.aByteArray34[local24] = local16;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIII)[B")
	public byte[] method1372() {
		this.aByteArray34 = new byte[524288];
		this.method7696();
		return this.aByteArray34;
	}
}
