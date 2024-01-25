import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class44_Sub2_Sub2 extends Class44_Sub2 {

	@OriginalMember(owner = "client!uga", name = "E", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
	public Class44_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method8030(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local7;
		@Pc(24) int local24 = local7 + 1;
		this.aByteArray100[local23] = local16;
		this.aByteArray100[local24] = local16;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(IIII)[B")
	public byte[] method8035() {
		this.aByteArray100 = new byte[524288];
		this.method8024();
		return this.aByteArray100;
	}
}
